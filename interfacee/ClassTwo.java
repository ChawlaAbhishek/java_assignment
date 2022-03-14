package com.interfacee;

public class ClassTwo extends ClassOne{
    @Override
    public void methodOne() {
        System.out.println("Inside mehodOne of class Two");
    }

    @Override
    public void methodTwo() {
        System.out.println("Inside mehodTwo of class Two");

    }
    @Override
    public String toString(){
        return "This is classTwo Object";
    }
}
