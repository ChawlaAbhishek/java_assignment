package com.abhi.app.usercases;

import java.util.List;

import com.abhi.app.dao.EmployeeDao;
import com.abhi.app.dao.EmployeeDaoImpl;
import com.abhi.app.models.Employee;

public class AllEmployee {
	public static void main(String[] args) {
		
		
		EmployeeDao emp = new EmployeeDaoImpl();
		
		List<Employee> employees = emp.getAllEmployee();
		
		employees.forEach(e -> {
			System.out.println(e.getEid());
			System.out.println(e.getName());
			System.out.println(e.getAddress());
			System.out.println(e.getSalary());
		});
		
	}

}
