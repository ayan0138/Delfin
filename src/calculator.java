import java.time.LocalDate;
import java.time.Period;

public class calculator {
    // Driver Class
        // Main Function
        public static void main(String[] args) {
            // Birthdate
            LocalDate birthdate = LocalDate.of(1997, 10, 03);

            // Current Date
            LocalDate currentDate = LocalDate.now();

            // Calculate Age
            int age = calculateAge(birthdate, currentDate);


            // Print Age
            System.out.println("Person er: " + age + " år");
        }

    public static int calculateAge(LocalDate birthdate, LocalDate currentDate) {
        // Calculate period between birthdate and current date
        Period period = Period.between(birthdate, currentDate);

        return period.getYears();
        }
}

