import java.util.*;

public class RPSLS {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        Random random = new Random();

        double wins = 0;
        double losses = 0;
        double draws = 0;
        double total = 0;

        System.out.println("Let's play Rock Paper Scissors Lizard Spock!");
        System.out.println();

        while (true) {
            System.out.println("Pick One: ");
            System.out.println("1. Rock\n2. Paper\n3. Scissors\n4. Lizard\n5. Spock");
            System.out.print("You choice (pick number): ");
            int player_choice = scanner.nextInt();
            System.out.print("You picked ");
            switch (player_choice) {
                case 1: System.out.println("rock"); break;
                case 2: System.out.println("paper"); break;
                case 3: System.out.println("scissors"); break;
                case 4: System.out.println("lizard"); break;
                case 5: System.out.println("spock"); break;
            }

            int computer_choice = random.nextInt(5-1) + 1;
            System.out.print("Computer picked ");
            switch (computer_choice) {
                case 1: System.out.println("rock"); break;
                case 2: System.out.println("paper"); break;
                case 3: System.out.println("scissors"); break;
                case 4: System.out.println("lizard"); break;
                case 5: System.out.println("spock"); break;
            }

            if (player_choice == computer_choice) {
                switch (player_choice) {
                    case 1: System.out.println("Rock smashes Rock! nothing happens"); break;
                    case 2: System.out.println("Paper tries to cover paper! they fail"); break;
                    case 3: System.out.println("Scissors try to cut each other! nothing happens"); break;
                    case 4: System.out.println("Both lizards become friends! no one wins"); break;
                    case 5: System.out.println("Spock high fives Spock! no one wins"); break;
                }
                System.out.println("Draw");
                draws++;
                total++;
            } else if ((player_choice == 3 && computer_choice == 2) || (computer_choice == 3 && player_choice == 2)) {
                System.out.println("Scissors cuts paper");
                if (player_choice == 3) {
                    System.out.println("You win!");
                    wins++;
                    total++;
                } else {
                    System.out.println("Computer wins!");
                    losses++;
                    total++;
                }
            } else if ((player_choice == 2 && computer_choice == 1) || (computer_choice == 2 && player_choice == 1)) {
                System.out.println("Paper covers rock");
                if (player_choice == 2) {
                    System.out.println("You win!");
                    wins++;
                    total++;
                } else {
                    System.out.println("Computer wins!");
                    losses++;
                    total++;
                }
            } else if ((player_choice == 1 && computer_choice == 4) || (computer_choice == 1 && player_choice == 4)) {
                System.out.println("Rock crushes lizard");
                if (player_choice == 1) {
                    System.out.println("You win!");
                    wins++;
                    total++;
                } else {
                    System.out.println("Computer wins!");
                    losses++;
                    total++;
                }
            } else if ((player_choice == 4 && computer_choice == 5) || (computer_choice == 4 && player_choice == 5)) {
                System.out.println("Lizard poisons spock");
                if (player_choice == 4) {
                    System.out.println("You win!");
                    wins++;
                    total++;
                } else {
                    System.out.println("Computer wins!");
                    losses++;
                    total++;
                }             
            } else if ((player_choice == 5 && computer_choice == 3) || (computer_choice == 5 && player_choice == 3)) {
                System.out.println("Spock smashes scissors");
                if (player_choice == 5) {
                    System.out.println("You win!");
                    wins++;
                    total++;
                } else {
                    System.out.println("Computer wins!");
                    losses++;
                    total++;
                }
            } else if ((player_choice == 3 && computer_choice == 1) || (computer_choice == 3 && player_choice == 1)) {
                System.out.println("Rock crushes scissors");
                if (player_choice == 1) {
                    System.out.println("You win!");
                    wins++;
                    total++;
                } else {
                    System.out.println("Computer wins!");
                    losses++;
                    total++;
                }
            } else if ((player_choice == 3 && computer_choice == 4) || (computer_choice == 3 && player_choice == 4)) {
                System.out.println("Scissors decapitates lizard");
                if (player_choice == 3) {
                    System.out.println("You win!");
                    wins++;
                    total++;
                } else {
                    System.out.println("Computer wins!");
                    losses++;
                    total++;
                }
            } else if ((player_choice == 2 && computer_choice == 1) || (computer_choice == 2 && player_choice == 1)) {
                System.out.println("Paper covers rock");
                if (player_choice == 2) {
                    System.out.println("You win!");
                    wins++;
                    total++;
                } else {
                    System.out.println("Computer wins!");
                    losses++;
                    total++;
                }
            } else if ((player_choice == 5 && computer_choice == 1) || (computer_choice == 5 && player_choice == 1)) {
                System.out.println("Spock vaporizes rock");
                if (player_choice == 5) {
                    System.out.println("You win!");
                    wins++;
                    total++;
                } else {
                    System.out.println("Computer wins!");
                    losses++;
                    total++;
                }
            } else if ((player_choice == 2 && computer_choice == 5) || (computer_choice == 2 && player_choice == 5)) {
                System.out.println("Paper disproves spock");
                if (player_choice == 2) {
                    System.out.println("You win!");
                    wins++;
                    total++;
                } else {
                    System.out.println("Computer wins!");
                    losses++;
                    total++;
                }
            } else if ((player_choice == 4 && computer_choice == 2) || (computer_choice == 4 && player_choice == 2)) {
                System.out.println("Lizard eats paper");
                if (player_choice == 4) {
                    System.out.println("You win!");
                    wins++;
                    total++;
                } else {
                    System.out.println("Computer wins!");
                    losses++;
                    total++;
                }
            }
            scanner.nextLine();
            System.out.print("Do you want to play again (y/n): ");
            String play_again = scanner.nextLine();
            if (play_again.equals("y") || play_again.equals("yes")) {
                continue;
            } else if (play_again.equals("n") || play_again.equals("no")) {
                break;
            }
        }

        double win_percentage = (wins/total)*100;
        double loss_percentage = (losses/total)*100;
        double draw_percentage = (draws/total)*100;

        System.out.println("-------- SUMMARY --------");
        System.out.printf("Rounds: %-30.30s%n", (int)total);
        System.out.printf("Wins:   %-30.30s %-30.30s%n", (int)wins, win_percentage);
        System.out.printf("Losses: %-30.30s %-30.30s%n", (int)losses, loss_percentage);
        System.out.printf("Draw:   %-30.30s %-30.30s%n", (int)draws, draw_percentage);

        scanner.close();
    }
}
