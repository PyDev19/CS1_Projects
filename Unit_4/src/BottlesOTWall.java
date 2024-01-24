import java.util.Scanner;

public class BottlesOTWall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your age: ");
        int age = scanner.nextInt();

        String drink = new String();
        if (age > 20) {
            System.out.print("Pick one:\n1. Beer\n2. Coke\nWhich one would you like (enter the number of your choice): ");
            switch (scanner.nextInt()) {
                case 1:
                    drink = "beer";
                    break;
                case 2:
                    drink = "coke";
                    break;
                default:
                    System.out.println("Invalid choice, automatically picked coke");
                    drink = "coke";
                    break;
            }
        } else {
            drink = "coke";
        }

        System.out.println();

        int i = 99;
        while (i > 0) {
            if (i > 1) {
                System.out.println(i + " bottles of " + drink + " on the wall");
                System.out.println(i + " bottles of " + drink);
                if ((i-1) > 1) {
                    System.out.println("Take one down pass it around, " + (i-1) + " bottles of " + drink + " on the wall!");
                } else {
                    System.out.println("Take one down pass it around, " + (i-1) + " bottle of " + drink + " on the wall!");
                }
            } else {
                System.out.println(i + " bottle of " + drink + " on the wall");
                System.out.println(i + " bottle of " + drink);
                System.out.println("Take one down pass it around, zero bottles of " + drink + " on the wall!");
            }
            
            i--;
        }

        scanner.close();
    }
}
