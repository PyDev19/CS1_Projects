import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter month number: ");
        int month = scanner.nextInt();

        System.out.print("Enter date: ");
        int date = scanner.nextInt();

        String season = "";

        if ((month == 12 && date >= 16) || (month >= 1 && month <= 2) || (month == 3 && date <= 15)) {
            season = "Winter";
        } else if ((month == 3 && date >= 16) || (month >= 4 && month <= 5) || (month == 6 && date <= 15)) {
            season = "Spring";
        } else if ((month == 6 && date >= 16) || (month >= 7 && month <= 8) || (month == 9 && date <= 15)) {
            season = "Summer";
        } else if ((month == 9 && date >= 16) || (month >= 10 && month <= 11) || (month == 12 && date <= 15)) {
            season = "Fall";
        } else {
            System.out.println("Invalid Date");
            System.exit(1);
        }

        System.out.println("Season: " + season);

        scanner.close();
    }
}
