public class BasicallySpeaking {
    public static void main(String[] args) {
        System.out.printf("%-15.15s  %-15.15s  %-15.15s  %-15.15s  %-15.15s%n", "Decimal", "Binary", "Octal", "Hex", "Character");
        for (int i = 65; i <=90; i++) {
            String binary = Integer.toBinaryString(i);
            String octal = Integer.toOctalString(i);
            String hex = Integer.toHexString(i);
            char character = (char)i;
            System.out.printf("%-15.15s  %-15.15s  %-15.15s  %-15.15s  %-15.15s%n", i, binary, octal, hex, character);
        }
    }
}