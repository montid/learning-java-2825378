import java.util.Scanner;
// Input 1: nr of hours the employee works per week
// Input 2: amount of money the employee makes per hour
// Output: employee's gross yearly salary
// Bonus: Adding an input that accounts for vacation days (one vacation day = 8 hours of work)

public class SalaryCalculator {

    public static double salaryCalculator (int hoursPerWeek, double moneyPerHour, int vacationDays){

        if (hoursPerWeek < 0) {
            return -1;
        }

        if (moneyPerHour < 0) {
            return -1;
        }

        if (vacationDays < 0) {
            return -1;
        }

        int weekPerYear = 52;
        int vacationTotalHours = vacationDays * 8;
        return moneyPerHour * (hoursPerWeek  * weekPerYear - vacationTotalHours);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many working hours per week?");
        int hoursPerWeek = input.nextInt();

        System.out.println("and the wage per hour?");
        double moneyPerHour = input.nextDouble();

        System.out.println("any vacation day?");
        int vacationDay = input.nextInt();

        double result = salaryCalculator(hoursPerWeek, moneyPerHour, vacationDay);
        System.out.println("Gross Yearly Salary: " + result);
    }
}
