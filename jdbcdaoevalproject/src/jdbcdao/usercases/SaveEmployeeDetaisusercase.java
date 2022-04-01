package jdbcdao.usercases;

import java.util.Scanner;

import jdbcdao.jdbcdaoimpl;
import jdbcdao.jdbcdaointerface;
import jdbcdao.bean.Employee;

public class SaveEmployeeDetaisusercase {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employee id");
		int id = sc.nextInt();
		
		System.out.println("Enter employee name");
		String name = sc.next();
		
		System.out.println("Enter employee address");
		String address = sc.next();
		
		System.out.println("Enter employee salary");
		int salary = sc.nextInt();
		
		
		Employee employee = new Employee(id,name,address,salary);
		
		jdbcdaointerface dao = new jdbcdaoimpl();
		
		String message = dao.saveEmployeeDetails(employee);
		
		System.out.println(message);
	}

}
