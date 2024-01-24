import java.util.Scanner;

public class HailstoneChallenges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1
        int i = 0;
        int sum = 0;
        do {
            System.out.print("Enter an integer (or 0 to quit): ");
            i = scanner.nextInt();
            sum += i;
        } while (i != 0);
        System.out.println("Sum of all the inputed numbers: " + sum);

        System.out.println("");

        // 2
        double initial_potency = 100.0;
        double min_effectiveness = 50.0;
        double monthly_decay = 0.12;
        int months = 0;
        double potency = initial_potency;

        while (potency >= min_effectiveness) {
            System.out.println("Month " + months + " Potency " + potency);
            months++;
            potency *= (1 - monthly_decay);
        }
        System.out.println("Month " + months + " Potency " + potency + " (DISCARD )");

        System.out.println("");

        // 3
        int pin = 2719;
        int input_pin = 0;
        int attempts = 3;
        while (true && attempts != 0) {
            System.out.print("Enter PIN: ");
            input_pin = scanner.nextInt();
            if (input_pin == pin) {
                System.out.println("Access Granted");
                break;
            } else {
                attempts--;
                System.out.println("Invalid PIN. Try Again. " + attempts + " Attempts Remaining");
            }
        }

        if (attempts == 0) {
            System.out.println("Account locked");
        }

        System.out.println("");

        // 4
        System.out.print("Enter a number between 1-1000: ");
        int num = scanner.nextInt();
        int largest_num = num;
        int steps = 0;

        System.out.println(num);
        while (num != 1) {
            if (num % 2 == 0) {
                num = num/2;
            } else {
                num = (3*num)+1;
            }

            if (num > largest_num) {
                largest_num = num;
            }

            System.out.println(num);

            steps++;
        }

        System.out.println("It took " + steps + " steps to get to 1");
        System.out.println("Largest number: " + largest_num);

        scanner.close();
    }
}