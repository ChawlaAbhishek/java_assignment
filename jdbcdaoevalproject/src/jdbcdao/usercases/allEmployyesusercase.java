package jdbcdao.usercases;

import java.util.List;

import jdbcdao.jdbcdaoimpl;
import jdbcdao.jdbcdaointerface;
import jdbcdao.bean.Employee;



public class allEmployyesusercase {
	public static void main(String[] args) {
		
			
			
			jdbcdaointerface dao = new jdbcdaoimpl();
			
			List<Employee> employees = dao.getAllEmployees();
			
			employees.forEach(e -> {
				System.out.println(e.getId());
				System.out.println(e.getName());
				System.out.println(e.getAddress());
				System.out.println(e.getSalary());
			});
			
		}
	}


