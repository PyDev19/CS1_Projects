import java.util.Scanner;

public class ClockEnergy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a clock time: ");
        String clock_time = scanner.nextLine();

        int energy_used = 0;
        for (int i = 0; i <= clock_time.length()-1; i++) {
            char c = clock_time.charAt(i);
            switch (c) {
                case '1': energy_used += 15*2; break;
                case '2': case '3': case '5': energy_used += 15*5; break;
                case '4': energy_used += 15*4; break;
                case '7': energy_used += 15*3; break;
                case '8': energy_used += 15*7; break;
                case '6': case '9': case '0': energy_used += 15*6; break;
                case ':': energy_used += 20;
            }
        }

        System.out.println("Energy used by clock (in milliamps): " + energy_used);

        scanner.close();
    }    
}
