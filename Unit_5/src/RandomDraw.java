import java.util.Random;
import StdDraw.StdDraw;

public class RandomDraw {
    public static void main(String[] args) {
        Random rng = new Random();
        int width = 800;
        int height = 600;
        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);

        StdDraw.line(width / 2, 0, width / 2, height);
        StdDraw.line(0, height / 2, width, height / 2);

        //Draws 100 random points in bottom-left quadrant
        for (int i = 1; i <= 100; i++) {
                StdDraw.setPenColor(rng.nextInt(256), rng.nextInt(256), rng.nextInt(256));
                int x = rng.nextInt(width / 2);
                int y = rng.nextInt(height / 2);
                StdDraw.setPenRadius(0.006);
                StdDraw.point(x, y);
        }

        // Draws 100 random lines in top-left quadrant
        for (int i = 1; i <= 100; i++) {
            StdDraw.setPenColor(rng.nextInt(256), rng.nextInt(256), rng.nextInt(256));
            int x0 = rng.nextInt(width / 2);
            int x1 = rng.nextInt(width / 2);
            int y0 = rng.nextInt(600 - height / 2) + height/2;
            int y1 = rng.nextInt(600 - height / 2) + height/2;
            StdDraw.line(x0, y0, x1, y1);
        }

        // Draw 100 random circles in top-right quadrant
        for (int i = 1; i <= 100; i++) {
            StdDraw.setPenColor(rng.nextInt(256), rng.nextInt(256), rng.nextInt(256));
            int x = rng.nextInt(800 - width / 2) + width / 2;
            int y = rng.nextInt(600 - height / 2) + height / 2;
            int radius = rng.nextInt(60 - 15) + 15;
            StdDraw.filledCircle(x, y, radius);
        }

        // Draw 100 random squares in bottom-right quadrant
        for (int i = 1; i <= 100; i++) {
            StdDraw.setPenColor(rng.nextInt(256), rng.nextInt(256), rng.nextInt(256));
            int x = rng.nextInt(800 - width / 2) + width / 2;
            int y = rng.nextInt(height / 2);
            StdDraw.filledSquare(x, y, 6);
        }
    }
}
