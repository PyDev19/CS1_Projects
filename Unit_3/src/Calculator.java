import static packages.Utils.println;
import static packages.Utils.input;

public class Calculator {
    public static void main(String[] args) {
        println("1 - Addition (+)");
        println("2 - Subtraction (-)");
        println("3 - Multiplication ()");
        println("4 - Division (/)");
        println("5 - Modulus (%)");

        println("");

        int choice = Integer.parseInt(input("What operation do you want to do (enter number from above): "));

        double num_1;
        double num_2;
        double result;

        num_1 = Double.parseDouble(input("Number 1: "));
        num_2 = Double.parseDouble(input("Number 2: "));

        if (choice == 1) {
            result = num_1 + num_2;

            println(num_1 + " + " + num_2 + " = " + result);
        } else if (choice == 2) {
            result = num_1 - num_2;
            println(num_1 + " - " + num_2 + " = " + result);
        } else if (choice == 3) {
            result = num_1 * num_2;
            println(num_1 + " * " + num_2 + " = " + result);
        } else if (choice == 4) {
            result = num_1 / num_2;
            println(num_1 + " / " + num_2 + " = " + result);
        } else if (choice == 5) {
            result = num_1 % num_2;
            println(num_1 + " % " + num_2 + " = " + result);
        }
    }
}
