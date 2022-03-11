package com.masai;

import com.masai.Bird;

public class Parrot extends Bird {
    @Override
    void fly() {
        System.out.println("I am flying");

    }
    public void sing(){
        System.out.println("I am singing");
    }
}
