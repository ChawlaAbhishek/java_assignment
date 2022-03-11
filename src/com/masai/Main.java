package com.masai;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Bird b1 = new Parrot();
        b1.fly();

        Parrot p1 = (Parrot)b1;
        p1.sing();



    }
}
