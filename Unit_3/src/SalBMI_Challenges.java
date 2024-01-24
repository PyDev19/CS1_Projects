import java.util.Scanner;

public class SalBMI_Challenges {
    public static void main(String[] args) {
        //1 
        String hi = "hi, ";
        String mom = "mom";
        System.out.println(hi + mom);

        System.out.println("");

        //2
        String hi2 = "hi";
        String mom2 = "mom";
        System.out.println(hi2 + ", " + mom2);

        System.out.println("");

        //3
        String someName = "Bob";
        System.out.println("Hello, " + someName + "!");

        System.out.println("");

        //4
        String hello = "Hello";
        String world = "World";
        System.out.println(hello + ", " + world + "... Goodbye");

        System.out.println("");

        //5
        int a = 14;
        int b = 6;
        System.out.println("14 % 6 is " + (a % b));

        System.out.println("");

        //6
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println(num1 + 10);
        
        System.out.println("");

        //7
        System.out.print("Enter your name: ");
        String name1 = scanner.nextLine();
        System.out.println("Hello, " + name1 + "!");

        System.out.println("");

        //8
        System.out.print("Enter a double (decimal): ");
        double something = Double.parseDouble(scanner.nextLine());
        System.out.println(Math.pow(something, 2));

        System.out.println("");

        //9
        System.out.print("Enter your name: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter your age: ");
        String age = scanner.nextLine();
        System.out.println(name2 + " you are " + age + " old");

        System.out.println("");
        
        //10
        System.out.print("Enter a radius (m): ");
        double radius = Double.parseDouble(scanner.nextLine());
        System.out.println("Area of a cirlce with this radius is " + (Math.PI * Math.pow(radius, 2)) + " m");

        System.out.println("");
        
        //11
        System.out.print("Enter the number of seconds of free fall: ");
        double time = Double.parseDouble(scanner.nextLine());
        double distance = 0.5 * 32.174 * Math.pow(time, 2);
        System.out.println("Distance travelled: " + distance + " ft");

        System.out.println("");
        
        //12
        System.out.print("What is your name: ");
        name1 = scanner.nextLine();
        System.out.println(name1+name1+name1);

        scanner.close();
    }
}
