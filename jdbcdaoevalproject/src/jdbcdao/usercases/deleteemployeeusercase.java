package jdbcdao.usercases;

import java.util.Scanner;


import jdbcdao.jdbcdaoimpl;
import jdbcdao.jdbcdaointerface;
import jdbcdao.Exception.EmployeeException;

public class deleteemployeeusercase {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id");
		int id = sc.nextInt();
		
		jdbcdaointerface dao = new jdbcdaoimpl();
		
		try {
			String ans = dao.deleteEmployee(id);
			System.out.println(ans);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
