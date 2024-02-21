import libs.StdDraw;

public class CheckerBoard {
    public static void main(String[] args) {
        int N = 16;
        int width = 20*N;
        int height = 20*N;
        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);

        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                int x = col * 20;
                int y = row * 20;
                StdDraw.setPenColor((row+col) % 2 == 0 ? StdDraw.RED : StdDraw.BLACK);
                StdDraw.filledSquare(x + 20 / 2.0, y + 20 / 2.0, 20 / 2.0);
            }
        }
    }
}
