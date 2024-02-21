import java.util.Random;
import java.util.Scanner;

public class PiChallenges {
    static final Scanner scanner = new Scanner(System.in);
    static final Random random = new Random();
    public static void main(String[] args) {
        // is odd method
        banner("Odd Checker");
        int alpha = Integer.parseInt(input("Enter a number to check if it is odd or not: "));
        boolean is_odd = isOdd(alpha);
        System.out.println(is_odd ? "The number you entered is odd" : "The number you entered is even");

        System.out.println(); // spacer

        // get max
        banner("Which is Max?");
        alpha = Integer.parseInt(input("Enter the first number: "));
        int beta = Integer.parseInt(input("Enter the second number: "));
        System.out.println("The max of the two numbers is: " + getMax(alpha, beta));
        
        System.out.println(); // spacer
        
        // roll dice
        banner("The Dice Roll");
        alpha = Integer.parseInt(input("How many faces do you want the dice to have: "));
        System.out.println("You rolled: " + rollDice(alpha));
        
        System.out.println(); // spacer
        
        // first letter capitalizer
        banner("The Capitalizer");
        String name = input("Enter your name in lower case: ");
        System.out.println("You name with first letter capitalized: " + capitalizeFirst(name));

        System.out.println(); // spacer

        // circle area
        banner("Circle Area Calculator");
        double radius = Double.parseDouble(input("Enter radius of circle: "));
        System.out.println("Area of this circle: " + circle_area(radius));

        System.out.println(); // spacer

        // multiple checker
        banner("Multiple Checker");
        alpha = Integer.parseInt(input("Enter the first number: "));
        beta = Integer.parseInt(input("Enter the second number"));
        System.out.println(is_multiple(alpha, beta) ? beta + " is a multiple of " + alpha : beta + " is not a multiple of " + alpha);

        System.out.println(); // spacer

        // 
        
        scanner.close();
    }

    public static String input(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static void banner(String banner_text) {
        System.out.println("******** " + banner_text + " ********");
    }

    public static boolean isOdd(int alpha) {
        if (alpha % 2 == 0) {
            return false;
        }
        return true;
    }

    public static int getMax(int alpha, int beta) {
        return (alpha > beta) ? alpha : beta;
    }
    
    public static int rollDice(int num_faces) {
        return random.nextInt(num_faces - 1) + 1;
    }

    public static String capitalizeFirst(String name) {
        String first_cap = name.substring(0, 1).toUpperCase();
        return first_cap + name.substring(1);
    }

    public static double circle_area(double radius) {
        return Math.PI*Math.pow(radius, 2);
    }

    public static boolean is_multiple(int alpha, int beta) {
        return (beta % alpha == 0) ? true : false;
    }
}
