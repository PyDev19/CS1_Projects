import java.util.Arrays;
import libs.StdDraw;;

public class TreeGrid {
    public static void main(String[] args) {
        int width = 800;
        int height = 600;
        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);

        double x1[] = { 400, 475, 450, 500, 450, 525, 475, 550, 450, 475, 400 };
        double y[] = { 500, 400, 400, 325, 350, 250, 275, 175, 200, 175, 200 };
        double x2[] = new double[x1.length];
        double stump_x1[] = { 425, 425, 400, 400, 400 };
        double stump_x2[] = new double[stump_x1.length];
        double stump_y[] = { 192.5, 125, 125, 192.5, 200 };

        for (int i = 0; i < x1.length; i++) {
            x2[i] = 2 * 400 - x1[i];
        }
        
        for (int i = 0; i < stump_x1.length; i++) {
            stump_x2[i] = 2 * 400 - stump_x1[i];
        }

        System.out.println(Arrays.toString(x1));
        System.out.println(Arrays.toString(x2));


        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.filledPolygon(x1, y);
        StdDraw.filledPolygon(x2, y);

        StdDraw.setPenColor(83, 53, 10);
        StdDraw.filledPolygon(stump_x1, stump_y);
        StdDraw.filledPolygon(stump_x2, stump_y);
    }
}
