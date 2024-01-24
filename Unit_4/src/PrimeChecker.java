import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1
        for (int i = 1; i < 10; i++) {
            System.out.print(i);
        }

        System.out.println();
        System.out.println();

        // 2
        for (int i = 1; i < 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        // 3
        for (int i = 2; i < 21; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        // 4
        for (int i = 20; i < 26; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        // 5
        for (int i = 10; i < 81; i += 10) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        // 6
        for (int i = 0; i > -11; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        // 7
        System.out.print("Enter a number: ");
        int num_astericks = scanner.nextInt();
        for (int i = 0; i < num_astericks; i++) {
            System.out.print("* ");
        }

        System.out.println();
        System.out.println();

        // 8
        for (int i = 1; i < 101; i++) {
            int square_root = (int) Math.sqrt(i);
            if (Math.pow(square_root, 2) == i) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println();

        // 9
        for (int i = 1; i < 10; i++) {
            if (i % 3 == 0) {
                System.out.print("? ");
            } else {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println();

        // 10
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int sum = 1;
        for (int i = 1; i <= num; i++) {
            sum *= i;
        }
        System.out.println("Factorial of " + num + ": " + sum);

        System.out.println();

        // 11
        while (true) {
            int number = 0;

            System.out.print("Enter a number (or exit to quit): ");
            String input = scanner.next();

            if (input.equals("exit")) {
                break;
            }

            try {
                number = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer or 'exit'.");
            }

            if (number <= 1) {
                System.out.println(number + " is not a prime number");
            } else {
                boolean not_prime = false;
                for (int i = 2; i <= number; i++) {
                    if (i != number) {
                        if (number % i == 0) {
                            not_prime = true;
                        }
                    }
                }

                if (not_prime) {
                    System.out.println(number + " is not a prime number");
                } else {
                    System.out.println(number + " is a prime number");
                }
            }

            System.out.print("Do you want to go again (y/n): ");
            input = scanner.next();
            if (input.equals("n")) {
                break;
            }
        }

        scanner.close();
    }
}