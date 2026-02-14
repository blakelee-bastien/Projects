package mandlebrot;

public class Main {

    public static void main(String[] args) {
        int width = 3840;
        int height = 2160;
        int maxIterations = 4000;

        MandelbrotImage mandelbrot =
            new MandelbrotImage(width, height, maxIterations);

        try {
            mandelbrot.generate("mandelbrot_4k.png");
            System.out.println("4K Mandelbrot image generated");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}