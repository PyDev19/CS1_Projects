import java.util.Random;
import java.util.Scanner;

public class BetterBlackJack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            int player_total = 0;
            int dealer_total = 0;

            int player_card_1 = random.nextInt(10) + 2;
            int player_card_2 = random.nextInt(10) + 2;
            int dealer_card_1 = random.nextInt(10) + 2;

            player_total += player_card_1 + player_card_2;
            dealer_total += dealer_card_1;

            System.out.println("Your cards: " + player_card_1 + ", " + player_card_2);
            System.out.println("Dealer's card: " + dealer_card_1);

            while (true) {
                System.out.print("Do you want to hit or stay? (h/s): ");
                String choice = scanner.next();

                if (choice.equalsIgnoreCase("h")) {
                    int new_card = random.nextInt(10) + 2;
                    System.out.println("You drew: " + new_card);
                    player_total += new_card;

                    if (player_total > 21) {
                        System.out.println("Busted! Your total is over 21.");
                        break;
                    }
                } else if (choice.equalsIgnoreCase("s")) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please enter 'h' or 's'.");
                }
            }

            if (player_total > 21) {
                System.out.print("Do you want to play again? (yes/no): ");
                String play_again = scanner.next();
                if (!play_again.equalsIgnoreCase("yes")) {
                    break;
                }
            } else {
                while (dealer_total <= 14) {
                    int new_card = random.nextInt(10) + 2;
                    System.out.println("Dealer drew: " + new_card);
                    dealer_total += new_card;
                }

                System.out.println("Your total: " + player_total);
                System.out.println("Dealer's total: " + dealer_total);

                if (player_total > 21 || (dealer_total <= 21 && dealer_total >= player_total)) {
                    System.out.println("Dealer wins!");
                } else if (dealer_total > 21 || (player_total <= 21 && player_total >= dealer_total)) {
                    System.out.println("You win!");
                } else {
                    System.out.println("Tie");
                }
                System.out.print("Do you want to play again? (yes/no): ");
                String play_again = scanner.next();
                if (!play_again.equalsIgnoreCase("yes")) {
                    break;
                }
            }
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
