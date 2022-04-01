package jdbcdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import jdbcdao.Exception.EmployeeException;
import jdbcdao.bean.Employee;
import jdbcdaoutil.DButil;

public class jdbcdaoimpl implements jdbcdaointerface {

	@Override
	public String saveEmployeeDetails(Employee employee) {
		String message = "not saved";
		
		try(Connection conn = DButil.provideConnections()){
			
			PreparedStatement ps = conn.prepareStatement("insert into Employee values(?,?,?,?");
			ps.setInt(1, employee.getId());
			ps.setString(2, employee.getName());
			ps.setString(3, employee.getAddress());
			ps.setInt(4,employee.getSalary());
			
			int x = ps.executeUpdate();
			
			if(x>0)
				message = "saved";
			
			
		}catch(SQLException e) {
			e.getMessage();
			
		}
		
		
		return message;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
Employee employee = null;
		
		try(Connection conn =DButil.provideConnections() ){
			
			PreparedStatement ps = conn.prepareStatement("select * from Employee where eid=?");
			ps.setInt(1, empId);
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				
				int i = rs.getInt("eid");
				String n = rs.getString("name");
				String ad = rs.getString("address");
				int sa = rs.getInt("salary");
				
				employee = new Employee(i,n,ad,sa);
				
			}
			else {
				throw new EmployeeException("employee do not exist with id"+empId);
			}
			
		}
		catch(SQLException e) {
			throw new EmployeeException(e.getMessage());
		}
		
		
		return employee;
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		
List<Employee> employees = new ArrayList<>();
		
		try(Connection conn = DButil.provideConnections()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from employee");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt("eid");
				String name = rs.getString("name");
				String address = rs.getString("address");
				int salary = rs.getInt("salary");
				
				Employee employee = new Employee(id,name,address,salary);
				
				employees.add(employee);
			}
			
		}catch(SQLException e) {
			e.getMessage();
		}
		
		
		return employees;
	}

	@Override
	public String deleteEmployee(int empId) throws EmployeeException {
String ans = "not deleted";
		
		try(Connection conn=DButil.provideConnections()){
			PreparedStatement ps = conn.prepareStatement("delete from employee where eid = ?");
			ps.setInt(1, empId);
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				ans = "deleted";
			}
			else {
				throw new EmployeeException("employee is not in table");
			}
			
		}catch(SQLException e) {
			e.getMessage();
		}
		
		return ans;
	}

}
