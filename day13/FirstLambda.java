package day13;

import java.util.*;

public class FirstLambda {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("delhi","yamunanagar","rohtak","ambala","sonipat");
        Collections.sort(list,(s1,s2)->s2.compareTo(s1));
        System.out.println(list);



    }
}
