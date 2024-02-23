import java.util.Scanner;

public class ChangeMaker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount paid: ");
        double paid = scanner.nextDouble();
        System.out.print("Enter the cost of the item: ");
        double cost = scanner.nextDouble();

        System.out.println();
        make_change(paid, cost);

        scanner.close();
    }

    public static void make_change(double paid, double cost) {
        double change = paid - cost;

        int[] bills = { 20, 10, 5, 1 };
        double[] coins = { 0.25, 0.10, 0.05, 0.01 };

        int dollars = (int) change;
        double cents = change - dollars;

        for (int bill : bills) {
            int count = dollars / bill;
            dollars %= bill;
            System.out.println("$" + bill + ": " + count);
        }

        for (double coin : coins) {
            int count = (int) (cents / coin);
            cents %= coin;
            System.out.println((int)(coin*100) + "c: " + count);
        }
    }
}
