package com.inter;

public class TajHotel implements Hotel {

    @Override
    public void chickenBiryani() {
        System.out.println("Biryani from Taj Hotel");
    }

    @Override
    public void masalaDosa() {
        System.out.println("Masala Dosa from Taj Hotel");

    }
    public void welcomeDrink(){
        System.out.println("Welcome Drink from Taj Hotel");
    }
}
