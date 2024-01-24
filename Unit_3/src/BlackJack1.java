import java.util.Scanner;

public class BlackJack1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1
        System.out.print("Enter a number: ");
        double apples = scanner.nextDouble();
        if (apples > 0) {
            System.out.println("Hello World!");
        }
        
        System.out.println();
        System.out.println("**********");
        System.out.println();

        // 2
        System.out.print("Enter a number: ");
        apples = scanner.nextDouble();
        if (apples % 2 == 0) {
            System.out.println("OMG it's even!");
        } else {
            // 3
            System.out.println("Hmm that's odd!");
        }

        System.out.println();
        System.out.println("**********");
        System.out.println();

        // 4
        int voting_age = 18;
        System.out.print("Enter your age: ");
        int actual_age = scanner.nextInt();
        if (actual_age >= voting_age) {
            System.out.println("You can vote");
        } else {
            System.out.println("You can't vote");
        }

        System.out.println();
        System.out.println("**********");
        System.out.println();

        // 5
        System.out.print("Grade: ");
        double grade = scanner.nextDouble();
        char letter_grade;
        if (grade >= 90 && grade <= 100) {
            letter_grade = 'A';
        } else if (grade >= 80 && grade <= 89) {
            letter_grade = 'B';
        } else if (grade >= 70 && grade <= 79) {
            letter_grade = 'C';
        } else if (grade >= 60 && grade <= 69) {
            letter_grade = 'D';
        } else {
            letter_grade = 'F';
        }
        System.out.println("Letter Grade: " + letter_grade);

        System.out.println();
        System.out.println("**********");
        System.out.println();

        // 6
        System.out.print("Angle 1: ");
        double angle_1 = scanner.nextDouble();
        System.out.print("Angle 2: ");
        double angle_2 = scanner.nextDouble();
        System.out.print("Angle 3: ");
        String type = "";
        double angle_3 = scanner.nextDouble();
        if (angle_1 + angle_2 + angle_3 == 180) {
            if ((angle_1 != angle_2) && (angle_2 != angle_3) && (angle_1 != angle_3)) {
                type = "scalene";
            } else if ((angle_1 == angle_2) && (angle_2 == angle_3) && (angle_1 == angle_3)) {
                type = "equilateral";
            } else if ((angle_1 == angle_2) || (angle_2 == angle_3) || (angle_1 ==  angle_3)) {
                type = "isosceles";
            }
        } else {
            System.out.println("Invalid triangle, angles must add up to 180 degrees");
        }
        System.out.println("Triangle Type: " + type);

        System.out.println();
        System.out.println("**********");
        System.out.println();

        // 7
        System.out.print("Player 1, pick one of the following: 1 - paper, 2 - rock, 3 - scissors: ");
        int choice_1 = scanner.nextInt();
        System.out.print("Player 2, pick one of the following: 1 - paper, 2 - rock, 3 - scissors: ");
        int choice_2 = scanner.nextInt();
        if ((choice_1 == 1 && choice_2 == 2) || (choice_1 == 2 && choice_2 == 1)) {
            if (choice_1 == 1) {
                System.out.println("Paper covers rock, Player 1 wins");
            } else {
                System.out.println("Paper covers rock, Player 2 wins");
            }
        } else if ((choice_1 == 2 && choice_2 == 3) || (choice_1 == 3 && choice_2 == 2)) {
            if (choice_1 == 2) {
                System.out.println("Rock smashes scissors, Player 1 wins");
            } else {
                System.out.println("Rock smashes scissors, Player 2 wins");
            }
        } else if ((choice_1 == 1 && choice_2 == 3) || (choice_1 == 3 && choice_2 == 1)) {
            if (choice_1 == 3) {
                System.out.println("Scissors cut paper, Player 1 wins");
            } else {
                System.out.println("Scissors cut paper, Player 2 wins");
            }
        } else {
            System.out.println("Please pick a valid number from the above choices");
        }

        scanner.close();
    }
}