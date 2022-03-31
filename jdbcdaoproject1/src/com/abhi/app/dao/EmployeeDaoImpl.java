package com.abhi.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.abhi.app.exeptions.EmployeeException;
import com.abhi.app.models.Employee;
import com.abhi.app.utility.DBUtility;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		Employee employee = null;
		
		try(Connection conn =DBUtility.provideConnections() ){
			
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
	public List<Employee> getAllEmployee() {
		List<Employee> employees = new ArrayList<>();
		
		try(Connection conn = DBUtility.provideConnections()) {
			
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
	public String saveEmployeeDetails(Employee employee) {
		String message = "not inserted";
		
		try(Connection conn = DBUtility.provideConnections()){
			
			PreparedStatement ps = conn.prepareStatement("insert into Employee values(?,?,?,?)");
			ps.setInt(1, employee.getEid());
			ps.setString(2, employee.getName());
			ps.setString(3, employee.getAddress());
			ps.setInt(4, employee.getSalary());
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				message = "inserted";
			}
			
			
		}catch(SQLException e){
			e.getMessage();
			
		}
		
		return message;
	}

	@Override
	public boolean deleteEmployeeById(int empId) throws EmployeeException {
		boolean ans = false;
		
		try(Connection conn=DBUtility.provideConnections()){
			PreparedStatement ps = conn.prepareStatement("delete from employee where eid = ?");
			ps.setInt(1, empId);
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				ans = true;
			}
			else {
				throw new EmployeeException("employee is not in table");
			}
			
		}catch(SQLException e) {
			e.getMessage();
		}
		
		return ans;
	}

	@Override
	public String giveBonusToEmployee(int empId, int amount) throws EmployeeException {
		String message = "not given";
		try(Connection conn = DBUtility.provideConnections() ){
			
			PreparedStatement ps = conn.prepareStatement("update employee set salary = salary+? where eid=?");
			ps.setInt(1, amount);
			ps.setInt(2, empId);
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				message = "bonus added";
			}else {
				EmployeeException ee =  new EmployeeException("employee does not exist");
				throw ee;
			}
			
		}catch(SQLException e) {
			throw new EmployeeException(e.getMessage());
			
			
		}
		
		return message;
	}

}
