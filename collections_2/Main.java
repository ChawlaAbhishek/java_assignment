package collections_2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Product> products = new TreeSet<>(new productIdCom());

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Choice of Sort");
        int choice = sc.nextInt();

        if(choice==1)
            products = new TreeSet<>(new productNameCom());

        if(choice==2)
            products = new TreeSet<>(new ProductPriceComp());

        if(choice==3)
            products = new TreeSet<>(new productIdCom());

        int count = 1;
        while(count<=4) {
            System.out.println("Enter details of product"+count++);

            System.out.println("Enter Product Id");
            int pId = sc.nextInt();

            System.out.println("Enter Product Name");
            String pName = sc.next();

            System.out.println("Enter Product Price");
            double pPrice = sc.nextDouble();

            Product product = new Product(pId, pName, pPrice);
            products.add(product);

        }




        System.out.println(products);








    }
}
