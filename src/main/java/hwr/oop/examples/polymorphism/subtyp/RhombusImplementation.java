package hwr.oop.examples.polymorphism.subtyp;

public class RhombusImplementation extends ParallelogramImplementation implements Rhombus {
    public RhombusImplementation(double site_a, double alpha) {
        super(site_a, site_a, alpha);
    }
}
