package mandlebrot;

public class MandelbrotCalculator {

    private int maxIterations;

    public MandelbrotCalculator(int maxIterations) {
        this.maxIterations = maxIterations;
    }

    public int getMaxIterations() {
        return maxIterations;
    }

    public int compute(double x, double y) {
        ComplexNumber c = new ComplexNumber(x, y);
        ComplexNumber z = new ComplexNumber(0, 0);

        int iterations = 0;
        while (z.magnitudeSquared() <= 4.0 && iterations < maxIterations) {
            z = z.multiply(z).add(c);
            iterations++;
        }
        return iterations;
    }
}