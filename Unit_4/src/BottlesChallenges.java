public class BottlesChallenges {
    public static void main(String[] args) {
        // 1
        int x = 1;
        while (x <= 9) {
            System.out.print(x);
            x++;
        }

        System.out.println();

        // 2
        x = 1;
        while (x <= 9) {
            System.out.print(x + " ");
            x++;
        }

        System.out.println();

        // 3
        int y = 1;
        while (y <= 19) {
            System.out.print(y + " ");
            y += 2;
        }

        System.out.println();

        // 4
        int z = 5;
        while (z <= 50) {
            System.out.print(z + " ");
            z += 5;
        }

        System.out.println();

        // 5
        z = 10;
        while (z > 0) {
            System.out.print(z + " ");
            z--;
        }

        System.out.println();

        // 6
        y = -4;
        while (y >= -40) {
            System.out.print(y + " ");
            y -= 4;
        }

        System.out.println();

        // 7
        int e = 1;
        while (e <= 256) {
            System.out.print(e + " ");
            e *= 2;
        }

        System.out.println();

        // 8
        int h = 1000;
        while (h >= 3) {
            System.out.print(h + " ");
            h /= 2;
        }

        System.out.println();

        // 9
        int a = 1;
        while (a <= 8) {
            System.out.print(a + " " + -a + " ");
            a++;
        }

        System.out.println();

        // 10
        int b = 0;
        while (b <= 20) {
            if (b % 2 == 0) {
                System.out.print(b + " ");
            }

            b++;
        }
    }
}
