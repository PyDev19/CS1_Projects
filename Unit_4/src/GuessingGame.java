import java.util.*;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Let's play a game");
        System.out.println("Guess my number from 1 to 100");
        System.out.println("You have 7 attempts");
        System.out.println();

        int guesses = 7;
        int random_int = random.nextInt(100) + 1;
        boolean win = false;

        while (guesses > 0) {
            System.out.print("Enter your guess (whole number 1-100): ");
            int int_guess = scanner.nextInt();

            if (int_guess > random_int) {
                System.out.println("Too High! Guesses remaining: " + --guesses);
                System.out.println();
            }
            else if (int_guess < random_int) {
                System.out.println("Too Low! Guesses remaining: " + --guesses);
                System.out.println();
            } else {
                win = true;
                if (guesses > 2)
                    System.out.println("Congrats! You guessed the number with " + --guesses + " guesses remaining");
                else
                    System.out.println("Congrats! You guessed the number with " + --guesses + " guess remaining");
                break;
            }
        }

        if (!win) {
            System.out.println("You lost! The number is " + random_int);
        }

        System.out.println("Thank You for playing!");

        scanner.close();
    }
}
