import java.util.Scanner;

public class CoinRollerProject {
    private static void print_rolls_info(double num_rolls, double loose_coins, double rolls_value, double loose_value, String type) {
        System.out.println("");
        System.out.println(type);

        type = type.toLowerCase();

        if (num_rolls <= 0)
            System.out.println("You do not have enough " + type + " to make a roll ($0)");
        else if (num_rolls > 1)
            System.out.println("You have enough " + type + " to make " + (int)num_rolls + " rolls ($" + rolls_value +")");
        else
            System.out.println("You have enough " + type + " to make a roll ($" + rolls_value + ")");

        if (loose_coins <= 0)
            System.out.println("You do not have any loose " + type + " ($0)");
        else if (loose_coins > 1)
            System.out.println("You have " + (int)loose_coins + " loose " + type + " ($" + loose_value + ")");
        else
            System.out.println("You have 1 loose" + type + " ($" + loose_value + ")");
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int PENNIES_IN_ROLL = 50;
        final int NICKELS_IN_ROLL = 40;
        final int DIMES_IN_ROLL = 50;
        final int QUARTERS_IN_ROLL = 40;

        System.out.println("Welcome to Atharva's Coin Rollers!!!");
        System.out.println("");

        System.out.print("How many quarters do you have today: ");
        int num_quarters = scanner.nextInt();

        System.out.print("How many dimes do you have today:    ");
        int num_dimes = scanner.nextInt();

        System.out.print("How many nickels do you have today:  ");
        int num_nickels = scanner.nextInt();

        System.out.print("How many pennies do you have today:  ");
        int num_pennies = scanner.nextInt();

        double quarter_rolls = num_quarters/QUARTERS_IN_ROLL;
        double loose_quarters = num_quarters % QUARTERS_IN_ROLL;
        double quarter_rolls_value = (quarter_rolls*QUARTERS_IN_ROLL) * 0.25;
        double loose_quarters_value = loose_quarters * 0.25;
        print_rolls_info(quarter_rolls, loose_quarters, quarter_rolls_value, loose_quarters_value, "Quarters");

        double dime_rolls = num_dimes/DIMES_IN_ROLL;
        double loose_dimes = num_dimes % DIMES_IN_ROLL;
        double dime_rolls_value = (dime_rolls*DIMES_IN_ROLL)/10;
        double loose_dimes_value = loose_dimes/10;
        print_rolls_info(dime_rolls, loose_dimes, dime_rolls_value, loose_dimes_value, "Dimes");

        double nickel_rolls = num_nickels/NICKELS_IN_ROLL;
        double loose_nickels = num_nickels % NICKELS_IN_ROLL;
        double nickel_rolls_value = (nickel_rolls*NICKELS_IN_ROLL) * 0.05;
        double loose_nickels_value = loose_nickels * 0.05;
        print_rolls_info(nickel_rolls, loose_nickels, nickel_rolls_value, loose_nickels_value, "Nickels");

        double penny_rolls = num_pennies/PENNIES_IN_ROLL;
        double loose_pennies = num_pennies % PENNIES_IN_ROLL;
        double penny_rolls_value = (penny_rolls*PENNIES_IN_ROLL) * 0.01;
        double loose_pennies_value = loose_pennies * 0.01;
        print_rolls_info(penny_rolls, loose_pennies, penny_rolls_value, loose_pennies_value, "Pennies");

        System.out.println();

        int total_coins = num_quarters + num_dimes + num_nickels + num_pennies;
        double total_rolls = quarter_rolls + dime_rolls + nickel_rolls + penny_rolls;
        double total_rolls_value = quarter_rolls_value + dime_rolls_value + penny_rolls_value + nickel_rolls_value;
        double total_loose_value = (double)Math.round((loose_quarters_value + loose_dimes_value + loose_pennies_value + loose_nickels_value)*100)/100.0;
        double subtotal = total_rolls_value + total_loose_value;
        double handling_fee = (double)Math.round(subtotal * 0.01 * 100)/100.0;
        double total = (double)Math.round((subtotal - handling_fee) * 100)/100.0;

        System.out.println("Total amount coins:                " + total_coins);
        System.out.println("Total rolls made:                  " + (int)total_rolls);
        System.out.println("Value of all the rolls:           $" + total_rolls_value);
        System.out.println("Value of all the loose coins:     $" + total_loose_value);
        System.out.println();
        System.out.println("Subtotal:                         $" + subtotal);
        System.out.println("Handling fee (1%%):             - $"+ handling_fee);
        System.out.println();
        System.out.println("Customer Receives:                $" + total);
        System.out.println();
        System.out.println("Thank you for choosing Atharva's Coin Rollers!");
        System.out.println("We look forward to seeing you in the future!");

        scanner.close();
    }
}