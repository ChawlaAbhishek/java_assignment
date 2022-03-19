package com.collections;


public class Employee implements Comparable<Employee> {

    private int empld;
    private String empName;
    private double salary;

    public Employee(int empld, String empName, double salary) {
        this.empld = empld;
        this.empName = empName;
        this.salary = salary;
    }

    public Employee() {
    }

    public int getEmpld() {
        return empld;
    }

    public void setEmpld(int empld) {
        this.empld = empld;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        if(this.salary>o.salary){
            return +1;
        }else{
            return -1;
        }

    }

    @Override
    public String toString() {
        return "Employee{" +
                "empld=" + empld +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
