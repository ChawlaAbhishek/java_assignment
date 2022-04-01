package jdbcdao.usercases;

import java.util.Scanner;



import jdbcdao.jdbcdaoimpl;
import jdbcdao.jdbcdaointerface;
import jdbcdao.Exception.EmployeeException;
import jdbcdao.bean.Employee;

public class getemployeebyidusercase {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter employee id");
		int eid = sc.nextInt();
		
		jdbcdaointerface dao = new jdbcdaoimpl();
		
		
			try {
				Employee employee = dao.getEmployeeById(eid);
				System.out.println(employee.getId());
				System.out.println(employee.getName());
				System.out.println(employee.getAddress());
				System.out.println(employee.getSalary());
			
				
			}catch(EmployeeException e) {
				e.getMessage();
				
			}
			
	}

}
