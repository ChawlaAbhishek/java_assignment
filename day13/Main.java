package day13;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> ls = new ArrayList<>();
        ls.add(new Student(1,"Abhishek",700));
        ls.add(new Student(2,"Bobby",1000));
        ls.add(new Student(3,"Anshul",955));
        ls.add(new Student(4,"Hareram",799));
        ls.add(new Student(5,"Mohit Pandey",900));
       ls.removeIf(s->s.getMarks()<800);

        System.out.println(ls);
    }
}
