import geometry.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestRectangle {

    @ParameterizedTest
    @CsvSource({"1, 1","2.5, 2.5", "100, 15", "0.5, 0.75","12, 6.6", "4.5, 6"})
    public void testRectangleCreation(double aSide, double bSide) {
        Rectangle rectangle = new Rectangle(aSide, bSide);
        Assertions.assertEquals(rectangle.getASide(), aSide);
        Assertions.assertEquals(rectangle.getBSide(), bSide);
    }

    @ParameterizedTest
    @CsvSource({"1, 2, 3", "1.2, 2.3, 4.5", "2.1, 3, 5", "56, 2, 1.1", "5, 4, 4", "1.4, 1.5, 1.5"})
    public void testRectangleSetASideValue(double aSide, double bSide, double aSideNewValue) {
        Rectangle rectangle = new Rectangle(aSide, bSide);
        rectangle.setASide(aSideNewValue);
        Assertions.assertEquals(rectangle.getASide(), aSideNewValue);
    }

    @ParameterizedTest
    @CsvSource({"1, 2, 3", "1.2, 2.3, 4.5", "2.1, 3, 5", "56, 2, 1.1", "5, 4, 5", "1.4, 1.5, 1.4"})
    public void testRectangleSetBSideValue(double aSide, double bSide, double bSideNewValue) {
        Rectangle rectangle = new Rectangle(aSide, bSide);
        rectangle.setBSide(bSideNewValue);
        Assertions.assertEquals(rectangle.getBSide(), bSideNewValue);
    }

    @ParameterizedTest
    @CsvSource({"2, 5", "1.5, 10.25", "3.5, 2", "4, 2.5"})
    public void testRectangleAreaCalculation(double aSide, double bSide) {
        Rectangle rectangle = new Rectangle(aSide, bSide);
        Assertions.assertEquals(rectangle.getArea(), aSide * bSide);
    }

    @ParameterizedTest
    @CsvSource({"2, 5", "1.5, 10.25", "3.5, 2", "4, 2.5"})
    public void testRectanglePerimeterCalculation(double aSide, double bSide) {
        Rectangle rectangle = new Rectangle(aSide, bSide);
        Assertions.assertEquals(rectangle.getPerimeter(), 2 * aSide + 2 * bSide);
    }
}
