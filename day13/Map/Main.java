package day13.Map;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
       // Employee e = new Employee();

        List<Student> ls = new ArrayList<>();
        ls.add(new Student(1,"Abhishek",700));
        ls.add(new Student(2,"Bobby",1000));
        ls.add(new Student(3,"Anshul",955));
        ls.add(new Student(4,"Hareram",799));
        ls.add(new Student(5,"Mohit Pandey",900));
        
        Stream<Student> ss =ls.stream();
//                .map(student -> new Employee(student.getRoll(),student.getName(), student.getMarks())*1000)
//                .toList()

        List<Employee> e = ss.map(s -> new Employee(s.getRoll(),s.getName(),s.getMarks()*1000)).toList();
        e.forEach(System.out::println);
    }
}

