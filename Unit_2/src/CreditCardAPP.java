import static packages.Utils.println;
import static packages.Utils.input_number;
import static packages.Utils.scanner;

public class CreditCardAPP {
    public static void main(String[] args) {
        println("This program assumes monthly payment required is 5% by the credit card company");
        println("");

        double total_debt = input_number("How much total debt do you have? (in dollars)", true);
        double min_payment_required = 0.05;
        double min_monthly_payment = total_debt * min_payment_required;

        println("");

        println("Total Debt: $" + total_debt);
        println("Minimum Monthly Payment (5%): $" + min_monthly_payment);

        println("");

        int num_months = (int)input_number("In how many months do you want to pay of the debt?", true);
        double monthly_payment = total_debt/num_months;

        println("Monthly Payment Required: $" + monthly_payment);
        scanner.close();
    }
}