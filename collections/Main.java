package com.collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Employee> employees = new TreeSet<>();

        Scanner sc = new Scanner(System.in);

        int count = 1;
        while(count<=4){
            System.out.println("Enter the details of Employee"+count++);

            System.out.println("Enter Employee id");
            int empId = sc.nextInt();

            System.out.println("Enter Emplo1yee Name");
            String empName = sc.next();

            System.out.println("Enter Employee Salary");
            int empSalary = sc.nextInt();

            Employee employee = new Employee(empId,empName,empSalary);

            employees.add(employee);



        }

            System.out.println(employees);




    }
}
