package packages;

import java.util.Scanner;

public class Utils {
    public static final Scanner scanner = new Scanner(System.in);

    public static void println(Object prompt) {
        System.out.println(prompt);
    }

    public static void print(Object prompt) {
        System.out.print(prompt);
    }

    public static String input(String prompt) {
        print(prompt);
        return scanner.nextLine();
    }

    public static double input_number(String prompt, boolean number) {
        double number_input;
        
        if (number) {
            while (true) {
                try {
                    number_input = Double.parseDouble(input(prompt));
                    break;
                } catch (NumberFormatException e) {
                    println("Please enter a valid number");
                }
            } 
        } else {
            number_input = Double.parseDouble(input(prompt));
        }
        
        return number_input;
    }
}