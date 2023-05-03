import java.time.LocalDate;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.DAYS;

public class DobCalculator {


    public static void main(String[] args) throws Exception {
        long result =calculateAgeInDays(formatDOB(getDOB()));
        System.out.println("You are " + result + " days old.");
 }

    public static String getDOB() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your DOB in the format YYYY-MM-DD: ");
        String dob = scanner.next();
        scanner.close();
        return dob;
    }

    public static LocalDate formatDOB(String dob) throws Exception {
        LocalDate formattedDate = LocalDate.parse(dob);
        return formattedDate;
    }

    public static long calculateAgeInDays(LocalDate dob){
        long daysBetween = DAYS.between(dob, LocalDate.now());
        return daysBetween;
    }

}
