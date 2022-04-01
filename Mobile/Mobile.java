package Mobile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Mobile {

    HashMap<String, ArrayList<String>> mobiles = new HashMap<>();

    ArrayList<String> ls = new ArrayList<>();

    public static void main(String[] args) {




        Mobile mb = new Mobile();

      String msg =  mb.addMobile("apple","iphine13");
        mb.addMobile("samsung","a12");
         mb.addMobile("vivo","v20");

        System.out.println(msg);

       ArrayList<String> ls = mb.getModels("apple");
        System.out.println(ls);




    }

    public  String addMobile(String company, String model){

        //this method will take a string as a company name and its model as an //argument.
        //ex: "apple", "Iphone13"
        //add the company as key and its model as an element of ArrayList in the above //mobiles HashMap.
        //if the company name already exists then their model should be added to the //existing list.
        //This method should return a message "Mobile added successfully" after //adding a mobile.


        String msg = null;


                ls.add("iphone");
                ls.add("a2");
                ls.add("a3");



       mobiles.put("apple",ls);
       mobiles.put("samsung",ls);
       mobiles.put("vivo",ls);

       return  msg =  "mobile added successfully";







    }

    public ArrayList<String> getModels(String company){

        //This method return the list of all the models of the supplied company
        //if we supply any invalid company name then it should return null value
        if(company.equals(mobiles.values()))

            return ls;
        else
            return null;



    }
}
