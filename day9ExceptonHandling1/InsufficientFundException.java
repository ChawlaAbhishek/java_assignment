package day9ExceptonHandling1;

public class InsufficientFundException extends Exception {
    public InsufficientFundException(String message ){
        super(message);
    }
}
