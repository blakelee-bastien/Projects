package mandlebrot;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class MandelbrotImage {

    private int width;
    private int height;
    private MandelbrotCalculator calculator;

    public MandelbrotImage(int width, int height, int maxIterations) {
        this.width = width;
        this.height = height;
        this.calculator = new MandelbrotCalculator(maxIterations);
    }

    public void generate(String filename) throws Exception {
        BufferedImage image = new BufferedImage(
            width, height, BufferedImage.TYPE_INT_RGB
        );

        double xMin = -2.5;
        double xMax = 1.0;
        double yMin = -1.5;
        double yMax = 1.5;

        for (int px = 0; px < width; px++) {
            for (int py = 0; py < height; py++) {

                double x = xMin + px * (xMax - xMin) / width;
                double y = yMin + py * (yMax - yMin) / height;

                int iterations = calculator.compute(x, y);
                Color color = ColorMapper.map(
                    iterations,
                    calculator.getMaxIterations()
                );

                image.setRGB(px, py, color.getRGB());
            }
        }

        ImageIO.write(image, "png", new File(filename));
    }
}