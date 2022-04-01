package jdbcdao;

import java.util.List;

import jdbcdao.Exception.EmployeeException;
import jdbcdao.bean.Employee;

public interface jdbcdaointerface {
	
	public String saveEmployeeDetails(Employee employee);

	public Employee getEmployeeById(int empId) throws EmployeeException;

	public List<Employee> getAllEmployees();

	public String deleteEmployee(int empId)throws EmployeeException;


}
