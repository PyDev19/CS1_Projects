import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        File palindromes = new File("src/palindromeTester.txt");
        try {
            Scanner scanner = new Scanner(palindromes);
        
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String new_line = line.toLowerCase();
                new_line = new_line.replaceAll(" ", "");
                new_line = new_line.replaceAll("\\p{Punct}", "");

                String reversed_line = new String();

                for (int i = new_line.length()-1; i >= 0; i--) {
                    reversed_line += new_line.charAt(i);
                }

                if (reversed_line.equals(new_line)) {
                    System.out.println("Palindrom: " + line);
                } else {
                    System.out.println("Not Palindrom: " + line);
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
