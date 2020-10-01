package main.test;

import main.classes.CoordinateHelper;
import main.classes.Point;
import main.classes.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoordinateHelperTest {
    private static final double DELTA = 1e-2;

    @Test
    void computePointsDistance() {
        Point point1 = new Point(3,2);
        Point point2 = new Point(7, 8);
        double result = CoordinateHelper.computePointsDistance(point1, point2);
        double expected = 7.21;
        assertEquals(expected, result, DELTA);
    }

    @Test
    void sign() {
        Point point1 = new Point(1,1);
        Point point2 = new Point(3, 1);
        Point point3 = new Point(1,4);

        double result = CoordinateHelper.sign(point1, point2, point3);
        double expected = 6;
        assertEquals(expected, result);
    }

    @Test
    void computeEuclideanDistance() {
        Rectangle rectangle1 = new Rectangle(new Point(0,0), new Point(2,2));
        Rectangle rectangle2 = new Rectangle(new Point(1,0), new Point(3,2));
        double result = CoordinateHelper.computeEuclideanDistance(rectangle1, rectangle2);
        double expected = 1;
        assertEquals(expected, result);

    }
}