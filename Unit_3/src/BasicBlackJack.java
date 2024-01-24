import java.util.Scanner;

public class BasicBlackJack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Player 1 hand value: ");
        int hand_1 = scanner.nextInt();

        System.out.print("Player 2 hand value: ");
        int hand_2 = scanner.nextInt();

        if (hand_2 <= 21 && hand_1 <= 21) {
            if (hand_1 == hand_2) {
                System.out.println("TIE");
            } else if (hand_1 > hand_2) {
                System.out.println("Player 1 wins");
            } else {
                System.out.println("Player 2 wins");
            }
        } else {
            System.out.println("Both players bust");
        }

        scanner.close();
    }
}
