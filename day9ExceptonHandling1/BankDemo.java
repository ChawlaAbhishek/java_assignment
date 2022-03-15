package day9ExceptonHandling1;
import java.util.Scanner;

public class BankDemo {
    public static void main(String[] args) {
        SavingAccount save = new SavingAccount();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount to be deposit");


        double amnt =  sc.nextDouble();
        save.deposit(amnt);

        System.out.println("Enter amount to be withdrawn");
        double amount = sc.nextDouble();


        try {
            double res= save.withdraw(amount);
            System.out.println("take your"+amount+"rupee");
        } catch (InsufficientFundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("ended successfully");


    }
}
