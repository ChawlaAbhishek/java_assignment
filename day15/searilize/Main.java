package day15.searilize;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Address ad = new Address("haryana","yamunanagar","135001");

        Student student = new Student(10, "Abhishek" , ad, "abhisehk@123", "chawla1234" );

        FileOutputStream fos = new FileOutputStream("student.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(student);

        oos.close();
        System.out.println("object student is serialized");

        FileInputStream fis = new FileInputStream("student.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student obj = (Student) ois.readObject();

        System.out.println(obj);
        ois.close();

    }
}
