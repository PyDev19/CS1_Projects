import java.util.Scanner;

public class WaterState {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What temperature scale do you want to use (Fahrenheit, Celsius, or Kelvin): ");
        String scale = scanner.nextLine();

        System.out.print("Temperature of water: ");
        double temperature = scanner.nextDouble();

        String state = "";

        if (scale.equals("Fahrenheit")) {
            if (temperature < 32) {
                state = "solid";
            } else if (temperature >= 32 && temperature < 212) {
                state = "liquid";
            } else {
                state = "gas";
            }
        } else if (scale.equals("Celsius")) {
            if (temperature < 0) {
                state = "solid";
            } else if (temperature >= 0 && temperature < 100) {
                state = "liquid";
            } else {
                state = "gas";
            }
        } else if (scale.equals("Kelvin")) {
            if (temperature < 273) {
                state = "solid";
            } else if (temperature >= 273 && temperature < 373) {
                state = "liquid";
            } else {
                state = "gas";
            }
        }

        if (scale.equals("Kelvin")) {
            System.out.println("Water is " + state + " at " + temperature + " " + scale);
        } else {
            System.out.println("Water is " + state + " at " + temperature + " degrees " + scale);
        }

        scanner.close();
    }
}
