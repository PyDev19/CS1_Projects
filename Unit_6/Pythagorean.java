import java.util.Scanner;

public class Pythagorean {
    public static double pythagorean_theorem(double a, double b) {
        double c = Math.sqrt(Math.pow(a, 2) +  Math.pow(b, 2));
        return c;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hieght of right triangle: ");
        double a = scanner.nextDouble();
        System.out.print("Enter base of right triangle: ");
        double b = scanner.nextDouble();

        System.out.println("Hypotenuse = " + pythagorean_theorem(a, b));
        scanner.close();
    }
}
