import java.util.Random;
import java.util.Scanner;

public class LuckyDice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

		System.out.println("-------- 1: FACTOR LISTER --------");

        // 1
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.print("Factors of " + number + ": ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (i == number) {
                    System.out.print(i);
                } else {
					System.out.print(i + ", ");
				}
            }
        }
        
        System.out.println();
        System.out.println();
		System.out.println("-------- 2: COOL NUMBER CHECKER --------");
		System.out.println();

        // 2
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        int cool_numbers = 0;
        for (int i = 1; i <= number; i++) {
            if ((i % 3 == 1) && (i % 4 == 1) && (i % 5 == 1) && (i % 6 == 1)) {
                cool_numbers++;
            }
        }
        System.out.println("There are " + cool_numbers + " cool numbers up to " + number);

        System.out.println();
		System.out.println("-------- 3: COOL NUMBER CHECKER (WHILE EDITION) --------");
		System.out.println();

        // 3
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        cool_numbers = 0;
        int j = 1;
        while (j <= number) {
            if ((j % 3 == 1) && (j % 4 == 1) && (j % 5 == 1) && (j % 6 == 1)) {
                cool_numbers++;
            }
            j++;
        }
        System.out.println("There are " + cool_numbers + " cool numbers up to " + number);

        System.out.println();
		System.out.println("-------- 4: PERFECT NUMBER CHECKER --------");
		System.out.println();

        // 4
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        int factor_sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                factor_sum += i;
            }
        }

        if (number == factor_sum) {
            System.out.println(number + " is a perfect number");
        } else {
            System.out.println(number + " is not a perfect number");
        }

        System.out.println();
		System.out.println("-------- 5: PERFECT NUMBER CHECK (DO WHILE EDITION) --------");
		System.out.println();

        // 5
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        j = 1;
        factor_sum = 0;
        do {
            if (number % j == 0) {
                factor_sum += j;
            }
            j++;
        } while (j < number);

        if (number == factor_sum) {
            System.out.println(number + " is a perfect number");
        } else {
            System.out.println(number + " is not a perfect number");
        }

        System.out.println();
		System.out.println("-------- 6: THE SIMULATION --------");
		System.out.println();

        // 6
        Random random = new Random();
        System.out.print("Number of faces on each die: ");
        int faces = scanner.nextInt();
        System.out.print("Number of simulations: ");
        int simulations = scanner.nextInt();
        int total_rolls = 0;

        System.out.println();

        for (int i = 1; i < simulations+1; i++) {
            int num_rolls = 0;
            int roll_sum = 0;
            while (true) {
                int roll_1 = random.nextInt(faces-1) + 1;
                int roll_2 = random.nextInt(faces-1) + 1;
                num_rolls++;
                roll_sum += roll_1 + roll_2;
                if (roll_sum >= 1000) {
                    total_rolls += num_rolls;
                    break;
                }
            }
            System.out.println("Simulation " + i + "- Number of rolls to reach 1000: " + num_rolls);
        }
        
        System.out.println();

        int average_rolls = total_rolls/simulations;
        System.out.println("The average number of rolls take to reach 1000: " + average_rolls);

        scanner.close();
    }
}