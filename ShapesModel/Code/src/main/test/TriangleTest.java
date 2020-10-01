package main.test;

import main.classes.Point;
import main.classes.Triangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {

    @org.junit.jupiter.api.Test
    void computeArea() {
        Triangle triangle = new Triangle(new Point(1,1),
                                    new Point(3, 1),
                                    new Point(1,4));
        double result = triangle.computeArea();
        double expected = 3;
        assertEquals(expected, result);

    }

    @org.junit.jupiter.api.Test
    void computeCenter() {
        Triangle triangle = new Triangle(new Point(5,3),
                new Point(6, 1),
                new Point(7,8));
        Point result = triangle.computeCenter();
        Point expected = new Point(6, 4);
        assertEquals(expected.X, result.X);
        assertEquals(expected.Y, result.Y);

    }

    @org.junit.jupiter.api.Test
    void computeCircumference() {
        Triangle triangle = new Triangle(new Point(1,1),
                new Point(4, 1),
                new Point(1,5));
        double result = triangle.computeCircumference();
        //expected = 4 + 3 + 5 = 12
        double expected = 12;
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void isPointInside() {
        Triangle triangle = new Triangle(new Point(1,1),
                new Point(3, 1),
                new Point(1,4));
        Point point = new Point(0, 0);
        boolean result = triangle.isPointInside(point);
        boolean expected = false;
        assertEquals(expected, result);
    }
}