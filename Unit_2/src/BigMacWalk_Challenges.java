// Atharva Mishra
// Jarrel 1A
// Program to learn different variable types, their initialization and declaration, and string concatanations

public class BigMacWalk_Challenges {
    public static void main(String[] args) {
        // 1
        int apples;

        // 2
        apples = 12;

        // 3
        int orange = 24;

        // 4
        System.out.println("You have this many apples... " + apples);
        System.out.println("You have this many orange... " + orange);
        
        // 5
        double pi;
        pi = 3.14159;
        System.out.println("Pi is equal to... " + pi);

        // 6
        String day = "Tuesday";
        
        // 7
        System.out.println("Hello! Today is... " + day);

        // 8
        int a = 10;
        int b = 20;

        // 9
        int c = b - a;
        System.out.println("b minus a equals... " + c);

        // 10
        int miles = 192;
        int gallons = 16;
        int mpg = 0;

        // 11
        mpg = miles/gallons;
        System.out.println("Miles per gallons: " + mpg);

        // 12
        double length = 12.75;
        double width = 8.65;
        System.out.println("Area of rectangle: " + length*width);

        // 13
        double base = 11.89;
        double height = 22.4;
        System.out.println("Area of triangle: " + (base*height)/2);
    }
}