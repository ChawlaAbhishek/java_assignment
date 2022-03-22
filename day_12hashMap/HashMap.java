package day_12hashMap;

import java.util.*;

public class HashMap {
    public static void main(String[] args) {
        Map<String,Student> hm = new java.util.HashMap<>();
        hm.put("Haryana",new Student(20,"abhishek",90));
        hm.put("Mumbai",new Student(50,"bobby",91));
        hm.put("Delhi",new Student(80,"valli",89));
        hm.put("Ponta Sahib",new Student(5,"Mohit pandey",95));
        hm.put("UP",new Student(10,"Sourabh Dubey",99));

        Set<Map.Entry<String,Student>> hm1 =hm.entrySet();

        List<Map.Entry<String,Student>> ls = new ArrayList<>(hm1);

        Collections.sort(ls, new CompareAccMarks());

        for(Map.Entry<String,Student> m:ls){
            System.out.println("State is "+m.getKey());
            System.out.println(m.getValue());

        }






    }



}
