package com.abhi.app.usercases;

import java.util.Scanner;

import com.abhi.app.dao.EmployeeDao;
import com.abhi.app.dao.EmployeeDaoImpl;
import com.abhi.app.exeptions.EmployeeException;

public class GiveBonusUserCase {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employee id");
		int id = sc.nextInt();
		
		System.out.println("Enter bonus amount");
		int bonus = sc.nextInt();
		
		EmployeeDao emp = new EmployeeDaoImpl();
		try {
			String s = emp.giveBonusToEmployee(id, bonus);
			System.out.println(s);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
		     System.out.println(e.getMessage());
		}
	}

}
