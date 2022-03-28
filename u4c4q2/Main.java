package u4c4q2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Address add = new Address("haryana","yamunanagar","135001");

        Employee emp = new Employee("1","abhisehk",add,"chawla123@1","chawla@155");

        FileOutputStream fos = new FileOutputStream("emp.txt");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(emp);

        oos.close();

        System.out.println("Object is serialized");

        FileInputStream fis = new FileInputStream("emp.txt");

        ObjectInputStream ois = new ObjectInputStream(fis);

        Employee obj = (Employee) ois.readObject();

        System.out.println(obj);

        ois.close();

        System.out.println("Object is deserialized");


    }
}
