package main.test;

import main.classes.Point;
import main.classes.Rectangle;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @org.junit.jupiter.api.Test
    void computeArea() {
        Rectangle rectangle = new Rectangle(new Point(0,1), new Point(2, 4));
        double result = rectangle.computeArea();
        double expected = 6;
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void computeCenter() {
        Rectangle rectangle = new Rectangle(new Point(0,1), new Point(2, 4));
        Point result = rectangle.computeCenter();
        Point expected = new Point(1, 2.5);
        assertEquals(expected.X, result.X);
        assertEquals(expected.Y, result.Y);
    }

    @org.junit.jupiter.api.Test
    void computeCircumference() {
        Rectangle rectangle = new Rectangle(new Point(0,1), new Point(2, 4));
        double result = rectangle.computeCircumference();
        double expected = 10;
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void isPointInside() {
        Rectangle rectangle = new Rectangle(new Point(0,1), new Point(2, 4));
        Point point = new Point(3, 4);
        boolean result = rectangle.isPointInside(point);
        boolean expected = false;
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void getHeight() {
        Rectangle rectangle = new Rectangle(new Point(0,1), new Point(2, 4));
        double result = rectangle.getHeight();
        double expected = 2;
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void getWidth() {
        Rectangle rectangle = new Rectangle(new Point(0,1), new Point(2, 4));
        double result = rectangle.getWidth();
        double expected = 3;
        assertEquals(expected, result);
    }
}