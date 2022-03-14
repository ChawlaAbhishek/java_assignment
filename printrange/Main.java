package com.printrange;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main obj3 = new Main();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Start");
        int n1 = sc1.nextInt();
        System.out.println("Enter End");
        int n2 = sc1.nextInt();
        System.out.println("Enter Increment");
        int n3 = sc1.nextInt();


         obj3.printNumbers(n1,n2,n3);



    }
    public  void printNumbers(int n1,int n2,int n3){
        String bag = "";
        for(int i=n1;i<=n2;i=i+n3){
            bag+= i+" ";


        }
        System.out.println(bag);






    }

}
