import libs.StdDraw;

public class NotebookPaper {
    public static void main(String[] args) {
        int width = 800;
        int height = 600;
        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);
        
        StdDraw.setPenColor(StdDraw.BLUE);

        StdDraw.line(100, 0, 100, 800);
        
        StdDraw.setPenColor(StdDraw.RED);

        
        for (int i = 30; i <= 600; i+=30) {
            StdDraw.line(0, i, 800, i);
        }
    }
}
