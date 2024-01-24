import java.util.Scanner;

public class GuessingGameChallenges  {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        // 1
        System.out.print("Enter an integer: ");
        int i = scanner.nextInt();
        int j = 1;
        while (i > 0) {
            System.out.print(j + " ");
            j++;
            i--;
        }

        System.out.println();

        // 2
        System.out.print("Enter an integer: ");
        int k = i = scanner.nextInt();
        j = 0;
        while (i > 0) {
            j += i;
            i--;
        }
        System.out.println("Sum of all number from 1-" +k+ ": " + j);

        System.out.println();

        // 3
        System.out.print("Enter an integer: ");
        k = i = scanner.nextInt();
        j = 0;
        while (i > 0) {
            if (i % 2 == 0) {
                j += i;
            }
            i--;
        }
        System.out.println("Sum of all even number from 1-" +k+ ": " + j);

        System.out.println();

        // 4
        System.out.print("Enter an integer: ");
        k = i = scanner.nextInt();
        j = 0;
        while (i > 0) {
            if (i % 7 == 0) {
                j += i;
            }
            i--;
        }
        System.out.println("Sum of all multiples of 7 from 1-" +k+ ": " + j);

        System.out.println();

        // 5
        System.out.print("Enter an integer: ");
        k = i = scanner.nextInt();
        j = 0;
        while (i > 0) {
            if (i % 8 == 0 || i % 13 == 0) {
                j += i;
            }
            i--;
        }
        System.out.println("Sum of all multiples of 8 or 13 from 1-" +k+ ": " + j);

        scanner.close();
    }
}
