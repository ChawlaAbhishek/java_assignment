package com.abhi.app.usercases;

import java.util.Scanner;

import com.abhi.app.dao.EmployeeDao;
import com.abhi.app.dao.EmployeeDaoImpl;
import com.abhi.app.exeptions.EmployeeException;

public class DeleteFromEmployeeUserCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id");
		int id = sc.nextInt();
		
		EmployeeDao emp = new EmployeeDaoImpl();
		
		try {
			boolean ans = emp.deleteEmployeeById(id);
			System.out.println(ans);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
