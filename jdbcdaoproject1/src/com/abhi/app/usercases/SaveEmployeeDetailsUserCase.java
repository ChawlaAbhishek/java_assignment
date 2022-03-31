package com.abhi.app.usercases;

import java.util.Scanner;

import com.abhi.app.dao.EmployeeDao;
import com.abhi.app.dao.EmployeeDaoImpl;
import com.abhi.app.models.Employee;

public class SaveEmployeeDetailsUserCase {
	
	public static void main(String[] args) {
		Scanner sce = new Scanner(System.in);
		
		System.out.println("Enter id");
		int id = sce.nextInt();
		
		System.out.println("Enter name");
		String name = sce.next();
		
		System.out.println("Enter Address");
		String address = sce.next();
		
		System.out.println("Enter Salary");
		int salary = sce.nextInt();
		
		Employee employee = new Employee(id,name,address,salary);
		
		EmployeeDao emp = new EmployeeDaoImpl();
		String message = emp.saveEmployeeDetails(employee);
		System.out.println(message);
		
		
	}

}
