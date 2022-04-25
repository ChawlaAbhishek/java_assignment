package unit5c3q1;

public class FacebookStrategy implements Strategy {
    @Override
    public void print(String name) {
        System.out.println(name+" "+"Connected via Facebook");

    }
}
