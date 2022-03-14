package com.interfacee;

public class Main {

    public static void main(String[] args) {
	// write your code here
        InterfaceThree obj1 = new ClassTwo();
        System.out.println(obj1);
        obj1.methodOne();
        obj1.methodTwo();
        obj1.mehodThree();

        InterfaceOne obj2 = new ClassTwo();
        obj2.methodOne();

        ClassTwo c1 = (ClassTwo)obj2;
        c1.methodTwo();
        c1.mehodThree();
    }
}
