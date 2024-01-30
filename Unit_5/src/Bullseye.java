import libs.StdDraw;
import java.awt.Color;

public class Bullseye {
    public static void main(String[] args) {
        int width = 800;
        int height = 600;
        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);

        int[] radii = {300, 225, 175, 100, 50};
        Color[] colors = {StdDraw.BLACK, StdDraw.WHITE, StdDraw.BLUE, StdDraw.RED, StdDraw.YELLOW};

        for (int i = 0; i < radii.length; i++) {
            StdDraw.setPenColor(colors[i]);
            StdDraw.filledCircle(400, 300, radii[i]);
        }
    }
}
