import java.util.Scanner;

import libs.StdDraw;

public class HombreIllusion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = 800;
        int height = 600;
        System.out.print("Show off? y/n: ");
        boolean show_off = (scanner.nextLine().equals("y")) ? true : false;
        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);
        
        if (show_off) {
            double r = 0;
            int num_lines = 0;
            for (int i = 0; i < 4800; i+=5) {
                num_lines++;
                r = (r < 255) ? r+0.1 : 0;
                StdDraw.setPenColor((int)r, 0, 0);
                StdDraw.line(i/5, 0, 800, i/5);
            }
            System.out.println(num_lines);
        } else {
            double r = 0;
            int num_lines = 0;
            for (int i = 0; i < 200; i+=5) {
                num_lines++;
                r = (r < 255) ? r+5 : 0;
                StdDraw.setPenColor((int)r, 0, 0);
                StdDraw.line(i*4, 0, 800, i*4);
            }
            System.out.println(num_lines);
        }
        scanner.close();
    }
}
