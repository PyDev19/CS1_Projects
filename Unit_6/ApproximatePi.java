import java.util.Scanner;

public class ApproximatePi {
    public static double approximate_pi(int precision) {
        double pi = 0;
        for (double i = 1; i < precision; i++) {
            if (i % 2 == 0) {
                pi -= 1/(i*2-1);
            } else {
                pi += 1/(i*2-1);
            }
        }
        pi *= 4;
        return pi;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the precision of pi you want: ");
        int precision = scanner.nextInt();

        System.out.println(approximate_pi(precision));

        scanner.close();
    }
}
