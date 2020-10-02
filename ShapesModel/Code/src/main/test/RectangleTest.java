package main.test;

import main.classes.Point;
import main.classes.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @org.junit.jupiter.api.Test
    void computeArea() {
        Rectangle rectangle = new Rectangle(new Point(0, 1), new Point(2, 4));
        double result = rectangle.computeArea();
        double expected = 6;
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void computeCenter() {
        Rectangle rectangle = new Rectangle(new Point(0, 1), new Point(2, 4));
        Point result = rectangle.computeCenter();
        Point expected = new Point(1, 2.5);
        assertEquals(expected.X, result.X);
        assertEquals(expected.Y, result.Y);
    }

    @org.junit.jupiter.api.Test
    void computeCircumference() {
        Rectangle rectangle = new Rectangle(new Point(0, 1), new Point(2, 4));
        double result = rectangle.computeCircumference();
        double expected = 10;
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void isPointInsideNotInside() {
        Rectangle rectangle = new Rectangle(new Point(0, 1), new Point(2, 4));
        Point point = new Point(3, 4);
        boolean result = rectangle.isPointInside(point);
        boolean expected = false;
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void isPointInsideInside() {
        Rectangle rectangle = new Rectangle(new Point(0, 1), new Point(2, 4));
        Point point = new Point(1, 1);
        boolean result = rectangle.isPointInside(point);
        boolean expected = true;
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void getHeight() {
        Rectangle rectangle = new Rectangle(new Point(0, 1), new Point(2, 4));
        double result = rectangle.getHeight();
        double expected = 2;
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void getWidth() {
        Rectangle rectangle = new Rectangle(new Point(0, 1), new Point(2, 4));
        double result = rectangle.getWidth();
        double expected = 3;
        assertEquals(expected, result);
    }

    @Test
    void getPoint1() {
        Point point1 = new Point(1, 1);
        Rectangle rectangle = new Rectangle(point1, new Point(2, 4));
        Point result = rectangle.getPoint1();
        assertEquals(point1, result);
    }

    @Test
    void getPoint2() {
        Point point2 = new Point(1, 1);
        Rectangle rectangle = new Rectangle(new Point(2, 4), point2);
        Point result = rectangle.getPoint2();
        assertEquals(point2, result);
    }

    @Test
    void moveIn2DSpace() {

        Rectangle rectangle = new Rectangle(new Point(0, 1), new Point(2, 4));
        rectangle.moveIn2DSpace(5, 6);
        Point result1 = rectangle.getPoint1();
        Point result2 = rectangle.getPoint2();

        Point point1 = new Point(5, 7);
        Point point2 = new Point(7, 10);
        assertEquals(point1.X, result1.X);
        assertEquals(point1.Y, result1.Y);
        assertEquals(point2.X, result2.X);
        assertEquals(point2.Y, result2.Y);

    }

    @org.junit.jupiter.api.Test
    void invalidInput() {
        try {
            Rectangle rectangle = new Rectangle(new Point(0, 1), new Point(0, 4));
        } catch (final IllegalArgumentException e) {
            final String msg = "Input points are not valid to create rectangle";
            assertEquals(msg, e.getMessage());
        }
    }
}