package hwr.oop.examples.polymorphism.subtyp;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ShapesTest {

    @Nested
    class SquareTest {
        @Test
        void square_IsPolymorphicType() {
            Shape square = new SquareImplementation(42);
            assertThat(square)
                    .isInstanceOf(Object.class)
                    .isInstanceOf(Shape.class)
                    .isInstanceOf(Quadrangle.class)
                    .isInstanceOf(RectangleImplementation.class)
                    .isInstanceOf(SquareImplementation.class);
        }

        @Test
        void squareIsRectangle_ButRectangleIsNoSquare() {
            Shape square = new SquareImplementation(42);
            Shape rectangle = new RectangleImplementation(13, 37);
            assertThat(square).isInstanceOf(RectangleImplementation.class);
            assertThat(rectangle).isNotInstanceOf(SquareImplementation.class);
        }

        @Test
        void square_GetPerimeterLength_IsFourTimesProvidedSize() {
            Shape square = new SquareImplementation(42);
            double perimeterLength = square.getPerimeterLength();
            assertThat(perimeterLength).isEqualTo(4 * 42);
        }

        @Test
        void square_GetAreaSize_IsSideLengthSquared() {
            Shape square = new SquareImplementation(42);
            double areaSize = square.getAreaSize();
            assertThat(areaSize).isEqualTo(42 * 42);
        }

        @Test
        void square_GetNumberOfSides_ReturnsFour() {
            Shape square = new SquareImplementation(42);
            int numberOfSides = square.getNumberOfSides();
            assertThat(numberOfSides).isEqualTo(4);
        }

        @Test
        void square_GetHeight(){
            Quadrangle square = new SquareImplementation(42);
            double height = square.getHeight();
            assertThat(height).isEqualTo(42);
        }
    }

    @Nested
    class RectangleTest {
        @Test
        void rectangle_IsPolymorphicType() {
            Rectangle rectangle = new RectangleImplementation(42, 1337);
            assertThat(rectangle)
                    .isInstanceOf(Object.class)
                    .isInstanceOf(Shape.class)
                    .isInstanceOf(Quadrangle.class)
                    .isInstanceOf(RectangleImplementation.class);
        }

        @Test
        void rectangle_GetPerimeterLength_IsFourTimesProvidedSize() {
            Shape rectangle = new RectangleImplementation(42, 1337);
            double perimeterLength = rectangle.getPerimeterLength();
            assertThat(perimeterLength).isEqualTo(42 + 42 + 1337 + 1337);
        }

        @Test
        void rectangle_GetAreaSize_IsSideLengthSquared() {
            Shape rectangle = new RectangleImplementation(1337, 42);
            double areaSize = rectangle.getAreaSize();
            assertThat(areaSize).isEqualTo(42 * 1337);
        }

        @Test
        void rectangle_GetNumberOfSides_ReturnsFour() {
            Shape rectangle = new RectangleImplementation(42, 1337);
            int numberOfSides = rectangle.getNumberOfSides();
            assertThat(numberOfSides).isEqualTo(4);
        }

        @Test
        void rectangle_GetHeight(){
            Quadrangle rectangle = new RectangleImplementation(42,1337);
            double height = rectangle.getHeight();
            assertThat(height).isEqualTo(1337);
        }

        @Test
        void quadrangle_comparable() {
            Comparable<Quadrangle> first = new RectangleImplementation(1, 2);
            Comparable<Quadrangle> second = new RectangleImplementation(1, 2);
        }
    }

    @Nested
    class ParallelogramTest {

        @Test
        void parallelogram_GetPerimeterLength_isFourTimesProvidedSize() {
            Shape parallelogram = new ParallelogramImplementation(2,4,60);
            double perimeterLength = parallelogram.getPerimeterLength();
            assertThat(perimeterLength).isEqualTo(2+2+4+4);
        }

        @Test
        void parallelogram_GetAreaSize() {
            Shape parallelogram = new ParallelogramImplementation(2,4,60);
            double areaSize = parallelogram.getAreaSize();
            assertThat(areaSize).isEqualTo(6.928203230275509);
        }

        @Test
        void parallelogram_GetDistinctAngles(){
            Quadrangle parallelogram = new ParallelogramImplementation(2,4,60);
            double[] distinctAngles = parallelogram.getDistinctAngles();
            assertThat(distinctAngles).isEqualTo(new double[]{60,120});
        }
        @Test
        void parallelogram_GetNumberOfSides_ReturnsFour() {
            Quadrangle parallelogram = new ParallelogramImplementation(2,4,60);
            int numberOfSides = parallelogram.getNumberOfSides();
            assertThat(numberOfSides).isEqualTo(4);
        }

        @Test
        void parallelogram_GetHeight(){
            Quadrangle parallelogram = new ParallelogramImplementation(2,4,60);
            double height = parallelogram.getHeight();
            assertThat(height).isEqualTo(1.7320508075688772);
        }
    }

    @Nested
    class RhombusTest{
        @Test
        void rhombus_GetPerimeterLength_isFourTimesProvidedSize() {
            Shape rhombus = new RhombusImplementation(2,60);
            double perimeterLength = rhombus.getPerimeterLength();
            assertThat(perimeterLength).isEqualTo(2+2+2+2);
        }

        @Test
        void rhombus_GetAreaSize() {
            Shape rhombus = new RhombusImplementation(2,60);
            double areaSize = rhombus.getAreaSize();
            assertThat(areaSize).isEqualTo(3.4641016151377544);
        }

        @Test
        void rhombus_GetDistinctAngles(){
            Quadrangle rhombus = new RhombusImplementation(2,60);
            double[] distinctAngles = rhombus.getDistinctAngles();
            assertThat(distinctAngles).isEqualTo(new double[]{60,120});
        }

        @Test
        void rhombus_GetNumberOfSides_ReturnsFour() {
            Quadrangle rhombus = new RhombusImplementation(2,60);
            int numberOfSides = rhombus.getNumberOfSides();
            assertThat(numberOfSides).isEqualTo(4);
        }
        @Test
        void rhombus_GetHeight(){
            Quadrangle rhombus = new RhombusImplementation(2,60);
            double height = rhombus.getHeight();
            assertThat(height).isEqualTo(1.7320508075688772);
        }
    }

    @Nested
    class TrapezeTest {

        @Test
        void trapeze_getPerimeterLength(){
            Shape trapeze = new TrapezeImplementation(10,5,3.17,6.124,60,70);
            double perimeterLength = trapeze.getPerimeterLength();
            assertThat(perimeterLength).isEqualTo(10+5+3.17+6.124);
        }

        @Test
        void trapeze_GetAreaSize() {
            Shape trapeze = new TrapezeImplementation(10,5,3.17,6.124,45,60);
            double areaSize = trapeze.getAreaSize();
            assertThat(areaSize).isEqualTo(28.51388641960264);
        }

        @Test
        void trapeze_getDistinctAngles(){
            Quadrangle trapeze = new TrapezeImplementation(10,5,3.17,6.124,45,60);
            double[] distinctAngles = trapeze.getDistinctAngles();
            assertThat(distinctAngles).isEqualTo(new double[]{45,60,120,135});
        }

        @Test
        void trapeze_GetNumberOfSides_ReturnsFour() {
            Quadrangle trapeze = new TrapezeImplementation(10,5,3.17,6.124,45,60);
            int numberOfSides = trapeze.getNumberOfSides();
            assertThat(numberOfSides).isEqualTo(4);
        }
        @Test
        void trapeze_GetHeight(){
            Quadrangle trapeze = new TrapezeImplementation(10,5,3.17,6.124,45,60);
            double height = trapeze.getHeight();
            assertThat(height).isEqualTo(4.330127018922193);
        }
    }
}
