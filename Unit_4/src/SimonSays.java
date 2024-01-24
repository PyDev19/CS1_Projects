import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class SimonSays {
    public static void main(String[] args) {
        File simon_commands = new File("src/simonsays.txt");
        try {
            Scanner scanner = new Scanner(simon_commands);
            int max_num_commands = scanner.nextInt();
            int num_commands = 0;

            while (scanner.hasNextLine() && num_commands != max_num_commands) {
                String line = scanner.nextLine();
                if (line.contains("Simon says")) {
                    System.out.println(line.substring(11));
                }
                num_commands++;
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
