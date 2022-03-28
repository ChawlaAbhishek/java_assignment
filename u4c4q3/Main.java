package u4c4q3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String,Employee> mp = new HashMap<>();
        mp.put("HR",new Employee("1","Abhisehk", 15500000.0));
        mp.put("Sales",new Employee("2","Bobby",1100000.00));
        mp.put("Marketing",new Employee("3","Anshul",1200000.00));
        mp.put("Accounts",new Employee("4","Hareram",1400000.00));

        Set<Map.Entry<String,Employee>> set =mp.entrySet();

        List<Map.Entry<String,Employee>> hm = new ArrayList<>(set);

        Collections.sort(hm,((o1, o2) -> {
            Employee e1 = o1.getValue();
            Employee e2 = o2.getValue();
            return e1.getSalary()>e2.getSalary() ? +1 : -1;
        }));

        for(Map.Entry<String,Employee> es:hm){
            System.out.println("Department is"+es.getKey());
            Employee em = es.getValue();
            System.out.println("employee id is"+em.getEmpId());
            System.out.println("empoyee name is "+em.getEmpName());
            System.out.println("employee salary is "+em.getSalary());
        }






    }
}
