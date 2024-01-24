import static packages.Utils.input;
import static packages.Utils.println;

public class QuadraticCalc_App {
    public static void main(String[] args) {
        println("QUADRATIC CALCULATOR");
        println("********************");

        double a = Double.parseDouble(input("Coefficient of x^2: "));
        double b = Double.parseDouble(input("Coefficient of x: "));
        double c = Double.parseDouble(input("Constant term: "));

        double discriminant = Math.sqrt(Math.pow(b, 2) - 4*(a*c));

        double root_1 = (-b + discriminant)/(2*a);
        double root_2 = (-b - discriminant)/(2*a);

        println("Root 1: " + root_1);
        println("Root 2: " + root_2);
    }
}
