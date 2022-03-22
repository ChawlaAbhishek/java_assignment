package day_12hashMap;
import java.util.*;

public class LinkhashMap {
    public static void main(String[] args) {
        Map<String,String> lhm = new LinkedHashMap<>();
        lhm.put("Haryana","Chandigarh");
        lhm.put("UttarPradesh","Lucknow");
        lhm.put("Bihar","Patna");
        lhm.put("Punjab","Chandigarh");
        lhm.put("WestBengal","Kolkata");

        Set<Map.Entry<String,String>> set =lhm.entrySet();


        for(Map.Entry<String,String> me:set){
            System.out.println(me.getKey()+"-->"+me.getValue());
        }

    }
}
