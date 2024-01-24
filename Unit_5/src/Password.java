import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            boolean is_safe = false;
            boolean has_min_chars = false;
            boolean has_special_char = false;
            boolean has_lowercase_char = false;
            boolean has_uppercase_char = false;
            boolean has_digit = false;
            boolean has_no_spaces = false;

            System.out.print("Enter a password: ");
            String password = scanner.nextLine();
            System.out.println();

            has_min_chars = password.length() >= 8 ? true : false;
            
            for (int i = 0; i <= password.length()-1; i++) {
                char c = password.charAt(i);
                has_digit = !has_digit ? Character.isDigit(c) : true;
                has_uppercase_char = !has_uppercase_char ? Character.isUpperCase(c) : true;
                has_lowercase_char = !has_lowercase_char ? Character.isLowerCase(c) : true;
                has_no_spaces = !has_no_spaces ? !Character.isWhitespace(c) : true;
                has_special_char = !has_special_char ? !Character.isLetterOrDigit(c) && !Character.isWhitespace(c) : true;
            }

            if (has_min_chars && has_digit && has_uppercase_char && has_lowercase_char && has_no_spaces && has_special_char) {
                is_safe = true;
            }

            if (!is_safe) {
                System.out.println("Password is not safe");
                if (!has_min_chars) {
                    System.out.println("- Password must be alteast 8 characters long");
                }
                if (!has_lowercase_char) {
                    System.out.println("- Password must have atleast one lowercase character");
                }
                if (!has_uppercase_char) {
                    System.out.println("- Password must have atleast one uppercase character");
                }
                if (!has_digit) {
                    System.out.println("- Password must have atleast one digit character");
                }
                if (!has_special_char) {
                    System.out.println("- Password must have atleast one special character");
                }
                if (!has_no_spaces) {
                    System.out.println("- Password must not have any spaces");
                }
                System.out.println();
            } else {
                System.out.println("Password approved");
                break;
            }
        }

        scanner.close();
    }
}
