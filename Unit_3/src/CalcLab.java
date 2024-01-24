import static packages.Utils.input;

public class CalcLab {
    public static void main(String[] args) {
        // 1
        int a = Integer.parseInt(input("Enter an integer: "));
        if (a == 9) {
            System.out.println("#1");
        }

        // 2
        int b = Integer.parseInt(input("Enter an integer: "));
        if (b == 9 || b > 20) {
            System.out.println("#2");
        }

        // 3
        int c = Integer.parseInt(input("Enter an integer: "));
        if (c == 5 || c == 6) {
            System.out.println("#3");
        }

        // 4
        int d = Integer.parseInt(input("Enter an integer: "));
        if (d != 4) {
            System.out.println("#5");
        }

        // 5
        int e = Integer.parseInt(input("Enter an integer: "));
        if (e != 7.5 && e > 2 && e < 10) {
            System.out.println("#6");
        }

        // 6
        double f = Double.parseDouble(input("Enter a double: "));
        double g = 20;
        if (f == g - 4 || f == g +4) {
            System.out.println("#7");
        }

        // 7
        System.out.println("Assign Stats to your Character (max 15 points total)");
        System.out.println("****************************************************");
        int strength = Integer.parseInt(input("Strength (1 to 10): "));
        int health = Integer.parseInt(input("Health (1 to 10): "));
        int magic = Integer.parseInt(input("Magic (1 to 10): "));

        if (strength + health + magic > 15) {
            System.out.println("Max point limit exceed! Default values assigned");
            strength = 5;
            health = 5;
            magic = 5;
        } else {
            System.out.println("Congratulations yours max point total is less than or equal to 15!");
        }

        System.out.println("Strength = " + strength + "; Health = " + health + "; Magic = " + magic);

    }
}
