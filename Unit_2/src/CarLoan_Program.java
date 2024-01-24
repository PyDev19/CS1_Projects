public class CarLoan_Program {
    public static void main(String[] args) {
        System.out.println("CAR LOAN PAYMENT PROGRAM");
        // Car: Honda CR-V EX-L AWD Hybrid
        double retail_price = 35760;
        double trade_in_value = 10000;
        double down_payment = 10000;
        double interest = 800.0/10000.0;

        System.out.println("Retail price of car $" + retail_price);
        System.out.println("\tTrade-in value  (" + trade_in_value + ")");
        System.out.println("\tDown payment    (" + down_payment + ")");

        double financed_amount = retail_price - trade_in_value - down_payment;
        System.out.println("Amount to finance   $" + financed_amount);

        double interest_paid = interest*financed_amount;
        System.out.println("\nInterest Paid         " + interest_paid);

        double total_finanaced = financed_amount+interest_paid;
        double months = 60;
        double monthly_payment = total_finanaced/months;

        System.out.println("\nMonthly Payment        " + monthly_payment);
        System.out.println("Spread out over " + (int)months + " months");
    }
}
