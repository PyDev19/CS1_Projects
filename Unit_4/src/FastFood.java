import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FastFood 
{
    public static void main(String[] args) 
    {
        final double hotdogPrice = 3.99;
        final double cheeseburgerPrice = 7.99;
        final double cheesePizzaPrice = 10.99;

        int hotdogNum = 0;
        int cheeseburgerNum = 0;
        int cheesePizzaNum = 0;

        double totalHotdogPrice = 0;
        double totalCheeseburgerPrice = 0;
        double totalCheesePizzaPrice = 0;

        File order = new File("src/order.txt");
        try 
        {
            Scanner scanner = new Scanner(order);

            // Opening Part
            System.out.println("--------Welcome to Atharva's CurbSide Food!--------");
            System.out.println("Menu:\nHotdog        \t$3.99\nCheeseburger\t$7.99\nCheese Pizza\t$10.99");

            // Checking order
            while (scanner.hasNextLine()) 
            {
                String line = scanner.nextLine().toLowerCase();

                // sentinal stop value
                if (line.toLowerCase() == "stop") 
                {
                    break;
                } else 
                {
                    if (line.equals("hotdog")) 
                    {
                        hotdogNum++;
                    } else if (line.equals("cheeseburger")) 
                    {
                        cheeseburgerNum++;
                    } else if (line.equals("cheese pizza")) 
                    {
                        cheesePizzaNum++;
                    }
                }
            }

            System.out.println("\nReciept\n");

            totalHotdogPrice = hotdogNum * hotdogPrice;
            totalHotdogPrice = Math.round(totalHotdogPrice * 100) / 100.0;

            totalCheeseburgerPrice = cheeseburgerNum * cheeseburgerPrice;
            totalCheesePizzaPrice = Math.round(totalCheeseburgerPrice * 100) / 100.0;

            totalCheesePizzaPrice = cheesePizzaNum * cheesePizzaPrice;
            totalCheesePizzaPrice = Math.round(totalCheesePizzaPrice * 100) / 100.0;

            if (totalHotdogPrice > 0) 
            {
                System.out.println(hotdogNum + " Hotdogs ($3.99 each):       $" + totalHotdogPrice);
            }
            if (totalCheeseburgerPrice > 0) 
            {
                System.out.println(cheeseburgerNum + " Cheeseburgers ($7.99 each): $" + totalCheeseburgerPrice);
            }
            if (totalCheesePizzaPrice > 0) 
            {
                System.out.println(cheesePizzaNum + " Cheese Pizza ($10.99 each): $" + totalCheesePizzaPrice);
            }

            double totalPrice = totalCheesePizzaPrice + totalCheeseburgerPrice + totalHotdogPrice;

            System.out.println("Order Total:                  $" + totalPrice);

            scanner.close();
        } catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }
    }
}
