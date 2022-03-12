package com.bean;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int count  =1;
        while( true) {
            System.out.println("Enter Details of Students:"+(count++));

            System.out.println("Enter name :");
            String name = sc.next();

            System.out.println("Enter roll no:");
            int roll = sc.nextInt();

            System.out.println("Enter marks :");
            int marks = sc.nextInt();

//              student student =new student(roll,name,marks);

            student student =new student();
            student.setName(name);
            student.setRoll(roll);
            student.setMarks(marks);

            System.out.println("===================================");
            System.out.println("Students Details are:");


            System.out.println("Name is "+student.getName());
            System.out.println("Roll is "+student.getRoll());
            System.out.println("Marks is "+student.getMarks());

            System.out.println("Want more(Yes/No)?");
            String choice = sc.next();

            if(choice.equalsIgnoreCase("No"))
                break;
        }
        System.out.println("Thank you !");

    }
}


