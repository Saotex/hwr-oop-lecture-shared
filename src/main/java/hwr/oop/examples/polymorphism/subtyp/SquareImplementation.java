package hwr.oop.examples.polymorphism.subtyp;

class SquareImplementation extends RectangleImplementation implements Square {

    public SquareImplementation(double sideLength) {
        super(sideLength, sideLength);
    }
}
