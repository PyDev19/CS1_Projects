import libs.StdDraw;

public class DrawTester {
    public static void main(String[] args) {
        int width = 800;
        int height = 700;
        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);
        StdDraw.setPenColor(StdDraw.GRAY);
        StdDraw.filledCircle(200, 500, 150);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.text(200, 325, "Atharva Mishra");
        StdDraw.square(600, 550, 150);
        StdDraw.line(600, 400, 600, 550);
        StdDraw.circle(150, 150, 150);
        for (int i = 1; i < 3; i++) {
            StdDraw.ellipse(150, 150, 150, 50 * i);
        }
        for (int i = 1; i < 3; i++) {
            StdDraw.ellipse(150, 150, 50 * i, 150);
        }
        StdDraw.square(600, 175, 150);
        StdDraw.square(500, 225, 150);
        StdDraw.line(450, 25, 350, 75);
        StdDraw.line(750, 25, 650, 75);
        StdDraw.line(450, 325, 350, 375);
        StdDraw.line(750, 325, 650, 375);
    }
}
