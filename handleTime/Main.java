package handleTime;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeBonus obj = new EmployeeBonus();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the joining date");
        String joiningDate = sc.next();

        double getbonus = 0;
        try {
            getbonus = obj.Bonus(joiningDate);
        } catch (InvalidAgeException ef) {
            System.out.println(ef.getMessage());
        }
        System.out.println(getbonus);

    }
}
