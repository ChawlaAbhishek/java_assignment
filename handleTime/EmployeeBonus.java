package handleTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class EmployeeBonus  {
    public double Bonus(String joiningDate) throws InvalidAgeException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Long experience = null;
        LocalDate ld = null;
        LocalDate today = null;
        try {
            ld = LocalDate.parse(joiningDate, dtf);
            today = LocalDate.now();
            experience = ChronoUnit.YEARS.between(ld, today);
        } catch (Exception e) {
            System.out.println("Enter Valid Format");
            System.exit(0);

        }
        if (ld.isAfter(today)) {
            InvalidAgeException ef = new InvalidAgeException("Please do not enter future date");
            throw ef;

        }

        if (experience<1)
            return 5000.00;

        else if (experience>=1&&experience <=2)
            return 8000.00;
        else
            return 10000.00;



    }
}
