// Atharva Mishra
// Jarrel 1A
// Program for calculating number of miles walked inorder to burn calories based on how much fries, drinks, and big macs eaten

import java.util.Scanner;

public class BigMacWalk_Program {
    private static Scanner scanner;

    private static void println(String prompt) {
        System.out.println(prompt);
    }

    private static String input(String prompt) {
        println(prompt);
        return scanner.nextLine();
    }

    private static String serving_size_input() {
        String serving_size;
        while (true) {
            serving_size = input("Large, medium, or small?").toLowerCase();
            if (serving_size.equals("large") || serving_size.equals("medium") || serving_size.equals("small")) {
                break;
            } else {
                println("Invalid input. Please enter 'large,' 'medium,' or 'small.'");
            }
        }
        return serving_size;
    }

    private static double serving_input(String prompt) {
        double servings;
        while (true) {
            try {
                servings = Double.parseDouble(input(prompt));
                break;
            } catch (NumberFormatException e) {
                println("Please enter a valid number");
            }
        }
        return servings;
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        final int BIG_MAC_CALORIES = 590;

        final int CAL_PER_MILES = 94;

        final int SMALL_FRIES_CALORIES = 222;
        final int MEDIUM_FRIES_CALORIES = 365;
        final int LARGE_FRIES_CALORIES = 480;

        final int SMALL_DRINK_CALORIES = 130;
        final int MEDIUM_DRINK_CALORIES = 182;
        final int LARGE_DRINK_CALORIES = 271;

        double bigmac_num = serving_input("How many big macs did you have?");

        println("");

        double fries_num = serving_input("How many servings of fries did you have?");
        String fries_serving_size = "";
        if (fries_num > 0) {
            fries_serving_size = serving_size_input().toLowerCase();
        }

        println("");

        double drinks_num = serving_input("How many drinks did you have?");
        String drinks_serving_size = "";
        if (drinks_num > 0) {
            drinks_serving_size = serving_size_input();
        }

        println("");

        scanner.close();

        int bigmac_calories = (int)(bigmac_num * BIG_MAC_CALORIES);

        int fries_calories = 0;
        if (fries_num > 0) {
            switch (fries_serving_size) {
                case "small":
                    fries_calories = (int)(fries_num * SMALL_FRIES_CALORIES);
                    break;
                case "medium":
                    fries_calories = (int)(fries_num * MEDIUM_FRIES_CALORIES);
                    break;
                case "large":
                    fries_calories = (int)(fries_num * LARGE_FRIES_CALORIES);
                    break;
            }
        }

        int drinks_calories = 0;
        if (drinks_num > 0) {
            switch (drinks_serving_size) {
                case "small":
                    drinks_calories = (int)(drinks_num * SMALL_DRINK_CALORIES);
                    break;
                case "medium":
                    drinks_calories = (int)(drinks_num * MEDIUM_DRINK_CALORIES);
                    break;
                case "large":
                    drinks_calories = (int)(drinks_num * LARGE_DRINK_CALORIES);
                    break;
            }
        }

        println("You consumed " + bigmac_calories + " calories from the big macs");
        if (fries_calories > 0) {
            println("You consumed " + fries_calories + " calories from the fries");
        }
        if (drinks_calories > 0) {
            println("You consumed " + drinks_calories + " calories from the drinks");
        }

        println("");

        int total_calories = bigmac_calories + fries_calories + drinks_calories;
        int miles_needed = total_calories / CAL_PER_MILES;

        println("You consumed " + total_calories + " calories in total");
        println("You need to walk " + miles_needed + " miles to burn off all those calories");
    }
}