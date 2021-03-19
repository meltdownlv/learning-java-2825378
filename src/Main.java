import java.util.Scanner;

/** This class asks user for simple input parameters to calculate annual pay. */
public class Main {
    /** Method returns annual pay based on hours per week worked, hourly rate
     * and number of vacation days used.*/
    public static double calculateAnnualPay(int hours,
                                            double hourlyRate,
                                            int vacationDays) {
        if (hours < 0) { return -1; }
        if (hourlyRate < 0) { return -1; }

        double result = hours * hourlyRate;
        double unpaidTime = vacationDays * 8 * hourlyRate;
        return (result * 52) - unpaidTime;
    }

    public static void main(String[] args) {
        int hours, vacationDays;
        double hourlyRate, grossAnnualPay;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("How many hours per week do you work? (Whole number)");
        hours = input.nextInt();
        System.out.println("What is your hourly rate? (2 decimal places) ");
        hourlyRate = input.nextDouble();
        System.out.println("How many vacation days used?");
        vacationDays = input.nextInt();
        grossAnnualPay = calculateAnnualPay(hours, hourlyRate, vacationDays);

        System.out.printf("Your total pay is $%10.2f", grossAnnualPay);

    }

}
