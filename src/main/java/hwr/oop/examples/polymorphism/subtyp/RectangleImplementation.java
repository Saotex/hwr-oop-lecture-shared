package hwr.oop.examples.polymorphism.subtyp;

class RectangleImplementation implements Rectangle {
    private final double site_a;
    private final double site_b;

    public RectangleImplementation(double site_a, double site_b) {
        this.site_a = site_a;
        this.site_b = site_b;
    }

    @Override
    public double getPerimeterLength() {
        return 2 * site_a + 2 * site_b;
    }

    @Override
    public double getAreaSize() {
        return site_a * site_b;
    }

    @Override
    public double getHeight() {
        return site_b;
    }

    @Override
    public double[] getDistinctAngles() {
        return new double[]{90};
    }
}
