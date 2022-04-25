package unit5c3q1;

public class TwitterStrategy implements Strategy {
    @Override
    public void print(String name) {
        System.out.println(name+" "+"Connected via Twitter");

    }
}
