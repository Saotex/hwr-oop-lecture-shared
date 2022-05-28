package hwr.oop.examples.polymorphism.subtyp;

import static java.lang.Math.sin;
import static java.lang.Math.toRadians;

public class TrapezeImplementation implements Trapeze {
    private final double site_a;
    private final double site_b;
    private final double site_c;
    private final double site_d;
    private final double alpha;
    private final double beta;

    TrapezeImplementation(double site_a, double site_b, double site_c, double site_d, double alpha, double beta){
        this.site_a = site_a;
        this.site_b = site_b;
        this.site_c = site_c;
        this.site_d = site_d;

        this.alpha = alpha;
        this.beta = beta;
    }

    @Override
    public double getHeight() {
        return site_b*sin(toRadians(beta));
    }

    @Override
    public double[] getDistinctAngles() {
        return new double[]{alpha,beta,180-beta,180-alpha};
    }

    @Override
    public double getPerimeterLength() {
        return site_a+site_b+site_c+site_d;
    }

    @Override
    public double getAreaSize() {
        return ((site_a+site_c)*(site_b*sin(toRadians(beta))))/2;
    }
}
