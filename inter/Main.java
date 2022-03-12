package com.inter;

import java.util.Scanner;





public class Main {
    public  Hotel provideFood(int amount){
        if(amount >1000) {
            return new TajHotel();
        } else if(amount >200 && amount <1000) {
            return new RoadSideHotel();
        }
        else{
            return null;
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount");
        int amount = sc.nextInt();
        Hotel res = main.provideFood(amount);
        if(res==null){
            System.out.println("Enter a valid Amount");
        }
        else if(res instanceof TajHotel){
            res.chickenBiryani();
            res.masalaDosa();
            ((TajHotel) res).welcomeDrink();
        }
        else if(res instanceof RoadSideHotel){
            res.masalaDosa();
            res.chickenBiryani();
        }










    }
}
