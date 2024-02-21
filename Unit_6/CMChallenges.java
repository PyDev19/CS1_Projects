import java.util.Scanner;

public class CMChallenges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("********Square Board********");
        System.out.print("Enter a number side value of board: ");
        int num = scanner.nextInt();
        square_board(num);

        System.out.println();

        System.out.println("********Checker Board********");
        System.out.print("Enter a number of tiles in board: ");
        num = scanner.nextInt();
        checker_board(num);

        System.out.println();

        System.out.println("********Powers of 2********");
        System.out.print("Enter a number: ");
        num = scanner.nextInt();
        print_power_of_2(num);
    
        System.out.println();

        System.out.println("********Temperature Converter********");
        System.out.print("Enter a temperature (in celcius or farenheit): ");
        double temp = scanner.nextDouble();
        System.out.print("Is this temperature in farenheit? (y/n): ");
        boolean is_f = scanner.next().equals("y");
        System.out.println("The temperature in " + (is_f ? "celcius" : "farenheit") + " is: " + covert_temp(temp, is_f));

        System.out.println();

        System.out.println("********Armstrong Number Checker********");
        System.out.print("Enter a number: ");
        num = scanner.nextInt();
        System.out.println(is_armstrong(num) ? num + " is an armstrong number" : num + " is not an armstrong number");

        scanner.close();
    }

    public static void square_board(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public static void checker_board(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void print_power_of_2(int num) {
        System.out.println("Here are the first " + num + " powers of 2:");
        for (int i = 0; i < num; i++) {
            System.out.println(("2 ^ " + i + ": ") + (int) Math.pow(2, i));
        }
    }

    public static double covert_temp(double temp, boolean is_f) {
        if (is_f) {
            return (temp - 32) * 5/9;
        } else {
            return (temp * 9/5) + 32;
        }
    }

    public static boolean is_armstrong(int num) {
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, 3);
            temp /= 10;
        }
        return (sum == num) ? true : false;
    }
}
