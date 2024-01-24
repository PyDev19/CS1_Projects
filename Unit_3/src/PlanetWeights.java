import java.util.Scanner;

public class PlanetWeights {
    public static void main(String[] args) {
        final double Voltar = 0.091;
        final double Krypton = 0.720;
        final double Fertos = 0.865;
        final double Servontos = 4.612;

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your weight on Earth (in lbs): ");
        double earth_weight = scanner.nextDouble();

        System.out.println("1. Voltar\n2. Krypton\n3. Fertos\n4. Servontos");
        System.out.print("What planet are you on (use numbers from above): ");
        int planet_num = scanner.nextInt();

        double final_weight;
        switch (planet_num) {
            case 1:
                final_weight = earth_weight * Voltar;
                System.out.println("Weight on Voltar: " + final_weight + " lbs");
                break;
            case 2:
                final_weight = earth_weight * Krypton;
                System.out.println("Weight on Krypton: " + final_weight + " lbs");
                break;
            case 3: 
                final_weight = earth_weight * Fertos;
                System.out.println("Weight on Fertos: " + final_weight + " lbs");
                break;
            case 4:
                final_weight = earth_weight * Servontos;
                System.out.println("Weight on Servontos: " + final_weight + " lbs");
                break;
            default:
                System.out.println("Pick a valid planet");
                break;
        }
    }
}
