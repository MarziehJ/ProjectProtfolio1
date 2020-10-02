package main.test;

import main.classes.Circle;
import main.classes.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    @Test
    void computeArea() {
        Circle circle = new Circle(new Point(1, 1), 10);
        double result = circle.computeArea();
        double expected = Math.PI * 100;
        assertEquals(expected, result);
    }

    @Test
    void computeCenter() {
        Circle circle = new Circle(new Point(1, 1), 10);
        Point result = circle.computeCenter();
        Point expected = new Point(1, 1);
        assertEquals(expected.X, result.X);
        assertEquals(expected.Y, result.Y);

    }

    @Test
    void computeCircumference() {
        Circle circle = new Circle(new Point(1, 1), 10);
        double result = circle.computeCircumference();
        double expected = 2 * Math.PI * 10;
        assertEquals(expected, result);
    }

    @Test
    void isPointInsideNotInside() {
        Circle circle = new Circle(new Point(1, 1), 10);
        Point point = new Point(1, 12);
        boolean result = circle.isPointInside(point);
        boolean expected = false;
        assertEquals(expected, result);
    }

    @Test
    void isPointInside() {
        Circle circle = new Circle(new Point(1, 1), 10);
        Point point = new Point(1, 8);
        boolean result = circle.isPointInside(point);
        boolean expected = true;
        assertEquals(expected, result);
    }


    @Test
    void getCenter() {
        Point center = new Point(1, 1);
        Circle circle = new Circle(center, 10);
        Point result = circle.getCenter();
        assertEquals(center, result);
    }

    @Test
    void getRadius() {
        double raduis = 5;
        Circle circle = new Circle(new Point(1, 1), raduis);
        double result = circle.getRadius();
        assertEquals(raduis, result);
    }

    @Test
    void moveIn2DSpace() {
        Circle circle = new Circle(new Point(1, 1), 5);
        circle.moveIn2DSpace(5, 4);
        Point result  = circle.getCenter();
        Point expected = new Point(6, 5);
        assertEquals(expected.X, result.X);
        assertEquals(expected.Y, result.Y);
    }
    @org.junit.jupiter.api.Test
    void invalidInput() {
        try {
            Circle circle = new Circle(new Point(1, 1), 0);
        }
        catch( final IllegalArgumentException e )
        {
            final String msg = "raduis should have positive value";
            assertEquals(msg, e.getMessage());
        }

    }
}