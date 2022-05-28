package hwr.oop.examples.polymorphism.subtyp;

import static java.lang.Math.sin;
import static java.lang.Math.toRadians;

public class ParallelogramImplementation implements Parallelogram {
    private final double height;
    private final double width;
    private final double alpha;
    public ParallelogramImplementation(double height, double width, double alpha) {
        this.height = height;
        this.width = width;
        this.alpha = alpha;
    }

    @Override
    public double getHeight() {
        return sin(toRadians(alpha))*height;
    }

    @Override
    public double[] getDistinctAngles() {
        return new double[]{alpha,180-alpha};
    }

    @Override
    public double getPerimeterLength() {
        return 2*height+2*width;
    }

    @Override
    public double getAreaSize() {
        return (sin(toRadians(alpha))*height)*width;
    }
}
