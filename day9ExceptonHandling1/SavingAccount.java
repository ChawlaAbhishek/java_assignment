package day9ExceptonHandling1;

public class SavingAccount {
    int accountNumber = 12334455;
    double balance = 10000.00;
    public void deposit(double amnt){
        System.out.println("your"+amnt+"deposited successfully");


    }
    public double withdraw(double amount) throws InsufficientFundException{
        SavingAccount s1 = new SavingAccount();
        if(amount>balance) {
            InsufficientFundException ife = new InsufficientFundException("Insufficient Amount in the Account");
            throw ife;
        }
        else
            return amount;


    }
}
