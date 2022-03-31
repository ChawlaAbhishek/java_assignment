package com.abhi.app.usercases;

import java.util.Scanner;

import com.abhi.app.dao.EmployeeDao;
import com.abhi.app.dao.EmployeeDaoImpl;
import com.abhi.app.exeptions.EmployeeException;
import com.abhi.app.models.Employee;

public class GetEmployeeByIdUserCase {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter employee id");
		int eid = sc.nextInt();
		
		EmployeeDao  emp = new EmployeeDaoImpl();
		
		
			try {
				Employee employee = emp.getEmployeeById(eid);
				System.out.println(employee.getEid());
				System.out.println(employee.getName());
				System.out.println(employee.getAddress());
				System.out.println(employee.getSalary());
			
				
			}catch(EmployeeException e) {
				e.getMessage();
				
			}
			
	}
		
	
	
	
	

}
