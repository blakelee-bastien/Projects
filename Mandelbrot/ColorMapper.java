package mandlebrot;

import java.awt.Color;

public class ColorMapper {

    public static Color map(int iterations, int maxIterations) {

        // Inside the Mandelbrot set → black
        if (iterations == maxIterations) {
            return Color.BLACK;
        }

        // Normalize iteration count (0.0 – 1.0)
        double t = (double) iterations / maxIterations;

        /*
         * Electric blue palette:
         * - High blue component
         * - Moderate green for cyan glow
         * - Very low red
         */
        int red   = (int) (20 + 30 * t);
        int green = (int) (100 + 155 * t);
        int blue  = (int) (180 + 75 * t);

        // Clamp values just to be safe
        red   = Math.min(255, red);
        green = Math.min(255, green);
        blue  = Math.min(255, blue);

        return new Color(red, green, blue);
    }
}