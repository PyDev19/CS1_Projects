import java.util.Scanner;

public class Salaries {
    public static void main(String[] args) {
        System.out.println("SALARY PART");
        System.out.println("");

        final double tax_rate = 0.25;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hourly Rate (in $): ");
        double hourly_rate = Double.parseDouble(scanner.nextLine());

        System.out.print("Hours Worked: ");
        double hours_worked = Double.parseDouble(scanner.nextLine());

        System.out.print("Overtime Hours: ");
        double overtime_hours = Double.parseDouble(scanner.nextLine());

        System.out.println("");

        double total_salary = hours_worked * hourly_rate;
        double overtime_pay = hourly_rate*overtime_hours*1.5;
        total_salary += overtime_pay;
        double net_salary = total_salary - (total_salary*tax_rate);

        System.out.println("Overtime Pay: $" + overtime_pay);
        System.out.println("Gross Salary (before taxes): $" + total_salary);
        System.out.println("Net Salary (after taxes): $" + net_salary);

        System.out.println("");
        System.out.println("BMI PART");
        System.out.println("");

        System.out.print("Weight (in lbs): ");
        double weight = Double.parseDouble(scanner.nextLine());

        System.out.print("Height (in inches): ");
        double height = Double.parseDouble(scanner.nextLine());

        System.out.println("");

        weight /= 2.205;
        height /= 39.37;

        double BMI = weight/Math.pow(height, 2);
        System.out.println("BMI: " + BMI + " kg/m^2");

        scanner.close();
    }
}
