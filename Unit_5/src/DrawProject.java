// Atharva Mishra
// Jarrell 1-A
// A drawing of a destiny 2 ghost, a robotic sentient being that is used as a smart personal ai and to revive the player in game
// A drawing of the doom eternal crucible sword used by doom guy to fight the demons
// formatting automatically done by vscode

import java.util.Random;

import libs.StdDraw; // only need this line for my setup (comment it out if not done already)

public class DrawProject {
    public static void main(String[] args) {
        int width = 800; // window height
        int height = 600; // window width
        StdDraw.setCanvasSize(width, height); // setup window with width and height
        StdDraw.setXscale(0, width); // set x scale: 0-800
        StdDraw.setYscale(0, height); // set y scale: 0-600

        StdDraw.setPenColor(StdDraw.BOOK_BLUE); // backrgound color
        StdDraw.filledRectangle(400, 300, width, height); // fill the window with background color using rectangle

        // Draw stars across the background
        Random random = new Random();
        for (int i = 0; i < 200; i++) { // Draw 200 stars
            double x = random.nextDouble() * width; // Random x-coordinate
            double y = random.nextDouble() * height; // Random y-coordinate
            StdDraw.setPenColor(StdDraw.WHITE); // Set color to white for stars
            StdDraw.point(x, y); // Draw the star as a single point
        }

        draw_ghost(); // draw the ghost (destiny 2)
        draw_sword(); // draw crucible sword (doom eternal)
        
        StdDraw.setPenColor(); // change pen color back to default
        StdDraw.text(100, 500, "Made by Atharva Mishra"); // my name (credits of course)

        StdDraw.setPenColor(StdDraw.BOOK_RED); // change color of line below name label
        StdDraw.line(10, 490, 200, 490); // line below name label

        StdDraw.setPenColor(); // change pen color back to default

        StdDraw.text(600, 225, "Destiny 2 Ghost"); // label for ghost
        StdDraw.text(400, 75, "The Crucible"); // label for sword
    }

    /*
     * function used for drawing the entire ghost
     */
    public static void draw_ghost() {
        draw_ghost_internals(); // draw ghost interals first
        draw_ghost_segments(); // draw all the ghost segment polygons
        draw_ghost_triangles(); // draw all the ghost triangle polygons
    }

    /*
     * draw all the ghost segment polygons
     */
    public static void draw_ghost_segments() {
        // ghost segment 1 polygon
        StdDraw.setPenColor(StdDraw.WHITE); // color of segment 1 polygon
        double[] segment1_x = { 434, 508, 558, 524, 446 }; // x coordinates of segment 1 polygon
        double[] segment1_y = { 420, 492, 444, 408, 408 }; // y coordinates of segment 1 polygon
        StdDraw.filledPolygon(segment1_x, segment1_y); // draw segment 1 polygon with coordinates

        // ghost segment 2 polygon
        StdDraw.setPenColor(217, 217, 217); // set segment 2 polygon color
        double[] segment2_x = { 558, 508, 576, 598, 598 }; // set segment 2 polygon x-coordinates
        double[] segment2_y = { 444, 492, 560, 541, 483 }; // set segment 2 polygon y-coordinates
        StdDraw.filledPolygon(segment2_x, segment2_y); // set segment 2 polygon color

        // ghost rectangle between segment 2 and 3
        StdDraw.setPenColor(StdDraw.WHITE); // set color of rectangle
        StdDraw.filledRectangle(602, 510, 5, 30); // draw rectangle between segment 2 and 3 polygons

        // ghose segment 3 polygon
        StdDraw.setPenColor(217, 217, 217); // set segment 3 polygon color
        double[] segment3_x = { 605, 605, 622, 682, 640.4 }; // set segment 3 polygon x-coordinates
        double[] segment3_y = { 484, 540, 560, 492, 445 }; // set segment 3 polygon y-coordinates
        StdDraw.filledPolygon(segment3_x, segment3_y); // set segment 3 polygon color

        // ghost bottom segment polygon between segment 2 and 3
        StdDraw.setPenColor(151, 171, 181); // set segment polygon color
        double[] corner_segment1_x = { 558, 598, 607, 640, 600 }; // set segment polygon x-coordinates
        double[] corner_segment1_y = { 444, 483, 483, 445, 470 }; // set segment polygon y-coordinates
        StdDraw.filledPolygon(corner_segment1_x, corner_segment1_y); // draw segment polygon with coordinates

        // ghost segment 4 polygon
        StdDraw.setPenColor(StdDraw.WHITE); // set segment 4 polygon color
        double[] segment4_x = { 682, 640.4, 677, 755, 766 }; // set segment 4 polygon x-coordinates
        double[] segment4_y = { 492, 445, 409, 409, 420 }; // set segment 4 polygon y-coordinates
        StdDraw.filledPolygon(segment4_x, segment4_y); // draw segment 4 polygon with coordinates

        // ghost segment 5 polygon
        StdDraw.setPenColor(217, 217, 217); // set segment 5 polygon color
        double[] segment5_x = { 641, 678, 756, 765, 679 }; // set segment 5 polygon x-coordinates
        double[] segment5_y = { 361, 392, 392, 381, 319 }; // set segment 5 polygon y-coordinates
        StdDraw.filledPolygon(segment5_x, segment5_y); // draw segment 5 polygon with coordinates

        // ghost rectangle between segment 6 and 7
        StdDraw.setPenColor(217, 217, 217); // set rectangle color
        StdDraw.filledRectangle(602, 289, 5, 30); // draw rectangle between segment 6 and 7 polygons

        // ghost segment 6 polygon
        StdDraw.setPenColor(StdDraw.WHITE); // set segment 6 polygon color
        double[] segment6_x = { 642, 680, 622, 604, 604 }; // set segment 6 polygon x-coordinates
        double[] segment6_y = { 362, 320, 246, 262, 318 }; // set segment 6 polygon y-coordinates
        StdDraw.filledPolygon(segment6_x, segment6_y); // draw segment 6 polygon with coordinates

        // ghost segment 7 polygon
        StdDraw.setPenColor(StdDraw.WHITE); // set segment 7 polygon color
        double[] segment7_x = { 556.5, 510, 578, 597, 597 }; // set segment 7 polygon x-coordinates
        double[] segment7_y = { 361, 320, 246, 262, 318 }; // set segment 7 polygon y-coordinates
        StdDraw.filledPolygon(segment7_x, segment7_y); // draw segment 7 polygon with coordinates

        // ghost top segment polygon between segment 6 and 7
        StdDraw.setPenColor(151, 171, 181); // set segment polygon color
        double[] corner_segment2_x = { 556.5, 597, 604, 642, 604, 597 }; // set segment polygon x-coordinates
        double[] corner_segment2_y = { 361, 318, 318, 362, 338, 338 }; // set segment polygon y-coordinates
        StdDraw.filledPolygon(corner_segment2_x, corner_segment2_y); // draw segment polygon with coordinates

        // ghost segment 8 polygon (last segment)
        StdDraw.setPenColor(217, 217, 217); // set segment 8 polygon color
        double[] segment8_x = { 435, 445, 524, 556.5, 510 }; // set segment 8 polygon x-coordinates
        double[] segment8_y = { 380, 392, 392, 361, 320 }; // set segment 8 polygon y-coordinates
        StdDraw.filledPolygon(segment8_x, segment8_y); // draw segment 8 polygon with coordinates
    }

    /*
     * draw all ghost triangle polygons
     */
    public static void draw_ghost_triangles() {
        // ghost triangle corner bottom left of the segment 1
        StdDraw.setPenColor(217, 217, 217); // color of corner 1 polygon
        double[] corner_triangle1_x = { 434, 446, 434 }; // x coordinates of corner 1 polygon
        double[] corner_triangle1_y = { 420, 408, 408 }; // y coordinates of corner 1 polygon
        StdDraw.filledPolygon(corner_triangle1_x, corner_triangle1_y); // draw corner 1 polygon left of segment 1
                                                                       // polygon

        // ghost bottom right triangle next to segment 1
        StdDraw.setPenColor(151, 171, 181); // color for corner 2 polygon right of segment 1 polygon
        double[] corner_triangle2_x = { 524, 558, 535 }; // corner 2 polygon right of segment 1 polygon x-coordinates
        double[] corner_triangle2_y = { 408, 444, 408 }; // corner 2 polygon right of segment 1 polygon y-coordinates
        StdDraw.filledPolygon(corner_triangle2_x, corner_triangle2_y); // draw corner 2 polygon right of segment 1
                                                                       // polygon

        // ghost top orange triangle
        StdDraw.setPenColor(182, 131, 58); // color for top orange triangle polygon
        double[] top_triangle_x = { 598, 605, 622, 616, 584, 576 }; // top orange triangle polygon x-coordinates
        double[] top_triangle_y = { 540, 540, 560, 567, 567, 560 }; // top orange triangle polygon y-coordinates
        StdDraw.filledPolygon(top_triangle_x, top_triangle_y); // draw top orange triangle polygon

        // ghost bottom orange triangle between segment 6 and 7
        StdDraw.setPenColor(182, 131, 58); // bottom organe triangle color
        double[] bottom_triangle_x = { 604, 597, 578, 582, 617, 622 }; // bottom organe triangle x-coordinates
        double[] bottom_triangle_y = { 262, 262, 246, 240, 240, 246 }; // bottom organe triangle y-coordinates
        StdDraw.filledPolygon(bottom_triangle_x, bottom_triangle_y); // draw bottom organe triangle with coordinates

        // ghost bottom right triangle next to segment 4
        StdDraw.setPenColor(217, 217, 217); // bottom right triangle polygon next to segment 4 color
        double[] corner_triangle3_x = { 755, 766, 766 }; // bottom right triangle polygon next to segment 4
                                                         // x-coordinates
        double[] corner_triangle3_y = { 409, 420, 409 }; // bottom right triangle polygon next to segment 4
                                                         // y-coordinates
        StdDraw.filledPolygon(corner_triangle3_x, corner_triangle3_y); // draw bottom right triangle polygon next to
                                                                       // segment 4 with coordinates

        // ghost bottom left triangle next to segment 4
        StdDraw.setPenColor(151, 171, 181); // bottom left triangle polygon next to segment 4 color
        double[] corner_triangle4_x = { 640.4, 660, 677 }; // bottom left triangle polygon next to segment 4
                                                           // x-coordinates
        double[] corner_triangle4_y = { 445, 410, 409 }; // bottom left triangle polygon next to segment 4 y-coordinates
        StdDraw.filledPolygon(corner_triangle4_x, corner_triangle4_y); // draw bottom left triangle polygon next to
                                                                       // segment 4 with coordinates

        // ghost top right triangle next to segment 5
        StdDraw.setPenColor(217, 217, 217); // top right triangle polygon next to segment 5 color
        double[] corner_triangle5_x = { 756, 765, 765 }; // top right triangle polygon next to segment 5 x-coordinates
        double[] corner_triangle5_y = { 392, 381, 392 }; // top right triangle polygon next to segment 5 y-coordinates
        StdDraw.filledPolygon(corner_triangle5_x, corner_triangle5_y); // draw top right triangle polygon next to
                                                                       // segment 5 with coordinates

        // ghost top left triangle next to segment 5
        StdDraw.setPenColor(151, 171, 181); // top left triangle polygon next to segment 5 color
        double[] corner_triangle6_x = { 641, 678, 662 }; // top left triangle polygon next to segment 5 x-coordinates
        double[] corner_triangle6_y = { 361, 392, 396 }; // top left triangle polygon next to segment 5 y-coordiantes
        StdDraw.filledPolygon(corner_triangle6_x, corner_triangle6_y); // draw top left triangle polygon next to segment
                                                                       // 5 with coordiantes

        // ghost top right triangle next to segment 8
        StdDraw.setPenColor(151, 171, 181); // top right triangle polygon next to segment 8 color
        double[] corner_triangle7_x = { 524, 556.5, 535 }; // top right triangle polygon next to segment 8 x-coordinates
        double[] corner_triangle7_y = { 392, 361, 395 }; // top right triangle polygon next to segment 8 y-coordinates
        StdDraw.filledPolygon(corner_triangle7_x, corner_triangle7_y); // draw top right triangle polygon next to
                                                                       // segment 8 with coordinates

        // ghost top left triangle next to segment 8
        StdDraw.setPenColor(151, 171, 181); // top left triangle polygon next to segment 8 color
        double[] corner_triangle8_x = { 435, 445, 435 }; // top left triangle polygon next to segment 8 x-coordinates
        double[] corner_triangle8_y = { 380, 392, 392 }; // top left triangle polygon next to segment 8 y-coordinates
        StdDraw.filledPolygon(corner_triangle8_x, corner_triangle8_y); // draw top left triangle polygon next to segment
                                                                       // 8 with coordinates
    }

    /*
     * draw all ghost internal parts (the black background shapes of ghost)
     */
    public static void draw_ghost_internals() {
        StdDraw.setPenColor(StdDraw.BLACK); // set internal parts color

        // internal rectangle between segment 1 and 8 polygons
        StdDraw.filledRectangle(495, 400, 50, 8); // draw internal rectangle between segment 1 and 8 polygons

        // internal center big circle
        StdDraw.filledCircle(598.5, 403, 70); // draw internal center big circle

        // internal rectangle between segment 4 and 5
        StdDraw.filledRectangle(705, 400, 50, 9); // draw internal rectangle between segment 4 and 5 polygons

        // ghost outer eye circle
        StdDraw.setPenColor(41, 41, 41); // set outer eye cirlce color
        StdDraw.filledCircle(598.5, 403, 45); // draw circle for outer eye

        // ghost inner eye circle
        StdDraw.setPenColor(43, 34, 111); // set inner eye circle color
        StdDraw.filledCircle(598.5, 403, 40); // draw circle for inner eye

        // ghost pupil circle
        StdDraw.setPenColor(129, 245, 251); // set pupil circle color and segments around pupil color
        StdDraw.filledCircle(598.5, 403, 5); // draw pupil circle

        // eye segment y coordinates (same for both)
        double[] eye_segment_y = { 379, 398, 406, 425, 412, 403, 393 }; // eye segments y-coordinates (same segment but
                                                                        // mirrored across y-axis)

        // ghost eye left segment
        double[] eye_segment_left_x = { 597, 578, 578, 597, 597, 588, 597 }; // eye segment polygon 1 (left)
                                                                             // x-coordinates
        StdDraw.filledPolygon(eye_segment_left_x, eye_segment_y); // draw eye segment left polygon with coordiantes

        // ghost eye right segment
        double[] eye_segment_right_x = { 600, 619, 619, 600, 600, 608, 600 }; // eye segment polygon right x-coordinates
        StdDraw.filledPolygon(eye_segment_right_x, eye_segment_y); // draw eye segment polygon right with coordinates
    }

    /*
     * draw the crucible sword from doom eternal
     */
    public static void draw_sword() {
        // hilt grip
        StdDraw.setPenColor(163, 135, 104); // hilt grip color
        StdDraw.filledRectangle(605, 147.5, 70, 10); // draw hilt grip rectangle

        // Draw forward slanted lines to create grip texture
        StdDraw.setPenColor(100, 100, 100);
        for (int i = 0; i < 40; i++) {
            StdDraw.line(535 + (i * 4), 137.5, 535 + (i * 4) + 10, 157.5); // draw hilt grop texture lines
        }

        // Draw backwards slanted lines to create grip texture
        for (int i = 0; i < 40; i++) {
            StdDraw.line(535 + (i * 4) + 10, 137.5, 535 + (i * 4), 157.5); // draw hilt grop texture lines
        }

        // hilt bottom circle
        StdDraw.setPenColor(81, 82, 75); // hilt bottom circle color
        StdDraw.filledCircle(690, 147.5, 20); // draw hilt bottom circle

        // hilt bottom circle engraving (arc)
        StdDraw.setPenColor(43, 48, 45); // arc color
        StdDraw.setPenRadius(0.01); // set arc thickness
        StdDraw.arc(690, 147.5, 12.5, -90, -270); // draw arc with radius 15 in the middle of hilt circle

        // blade polygon
        StdDraw.setPenColor(191, 82, 121); // blade polygon color
        double[] blade_x = { 474, 468, 438, 428, 425, 396, 385, 379, 351.5, 341.5, 337, 126, 124, 123, 122, 120, 117,
                114, 111, 106, 95, 92, 84, 92, 97, 106, 114, 119, 122, 125, 338, 342, 352, 379, 386, 397, 426, 428.5,
                439, 468, 474 }; // blade polygon x coordinates
        double[] blade_y = { 136, 117, 118, 110, 119, 121, 112.5, 122, 123.5, 114.5, 124.5, 134, 133.5, 133.2, 132.8,
                131, 123, 114, 105, 77, 115, 144, 150, 156, 195, 224, 186, 169, 166, 165, 174, 184, 175, 176, 186, 177,
                179, 188, 179, 180, 162 }; // blade polygon y coordinates
        StdDraw.filledPolygon(blade_x, blade_y); // draw blade polygon with coordinates

        // blade hole polygon
        StdDraw.setPenColor(StdDraw.BOOK_BLUE); // blade hole polygon color (match background color for transparency)
        double[] blade_hole_x = { 446, 441, 435, 429, 420, 375.5, 370, 376.5, 420, 429, 435, 441, 446 }; // blade hole
                                                                                                         // polygon
                                                                                                         // x-coordinates
        double[] blade_hole_y = { 145, 141, 143, 144, 145, 146.5, 149, 152, 153, 154, 155, 156.5, 152.5 }; // blade hole
                                                                                                           // polygon
                                                                                                           // y-coordinates
        StdDraw.filledPolygon(blade_hole_x, blade_hole_y); // draw blade polygon with coordinates

        // blade hand guard polygon
        StdDraw.setPenColor(74, 76, 74); // blade hand guard polygon color
        double[] blade_holder_x = { 527, 518.5, 512, 500, 496, 489, 493, 501, 510, 477, 494, 478, 465, 460, 457, 455,
                453.5, 432, 446, 448, 448, 450, 450.5, 450, 451, 453, 438.5, 453, 447, 432, 435, 454, 460, 464.5, 478,
                493, 476, 512, 505, 496, 492, 497, 499, 510, 519.25, 528 }; // blade hand guard polygon x-coordinates
        double[] blade_holder_y = { 130, 112, 130, 132, 135, 135, 122.5, 120.5, 90, 96.5, 99, 125, 130, 137, 134, 134,
                132.5, 136, 136, 137, 139, 139, 139.5, 140.5, 140, 142.5, 149, 155, 162, 162, 163.5, 165, 160, 168, 172,
                198, 201, 209, 175, 172, 162, 163, 166, 167, 185.5, 167 }; // blade hand guard polygon y-coordinates
        StdDraw.filledPolygon(blade_holder_x, blade_holder_y); // draw blade hand guard polygon with coordinates

        // hilt top circle
        StdDraw.setPenColor(34, 38, 35); // hilt top circle color
        StdDraw.filledCircle(522.5, 147.5, 20); // draw hilt top circle

        // hilt top circle engraving (arc)
        StdDraw.setPenColor(43, 48, 45); // arc color
        StdDraw.setPenRadius(0.01); // set arc thickness
        StdDraw.arc(522.5, 147.5, 12.5, 90, 270); // draw arc with radius 15 in the middle of hilt circle
    }
}
