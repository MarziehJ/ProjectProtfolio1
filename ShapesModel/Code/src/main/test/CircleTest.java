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
    void isPointInside() {
        Circle circle = new Circle(new Point(1, 1), 10);
        Point point = new Point(1, 12);
        boolean result = circle.isPointInside(point);
        boolean expected = false;
        assertEquals(expected, result);
    }
}