package main.test;

import main.classes.Point;
import main.classes.Triangle;
import org.junit.jupiter.api.Test;

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
    void isPointInsideNotInside() {
        Triangle triangle = new Triangle(new Point(1,1),
                new Point(3, 1),
                new Point(1,4));
        Point point = new Point(0, 0);
        boolean result = triangle.isPointInside(point);
        boolean expected = false;
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void isPointInside() {
        Triangle triangle = new Triangle(new Point(1,1),
                new Point(3, 1),
                new Point(1,4));
        Point point = new Point(2, 2);
        boolean result = triangle.isPointInside(point);
        boolean expected = true;
        assertEquals(expected, result);
    }
    @Test
    void getPoint1() {
        Point point1 = new Point(1, 1);
        Triangle triangle = new Triangle(point1,
                new Point(3, 1),
                new Point(1,4));
        Point result = triangle.getPoint1();
        assertEquals(point1, result);
    }

    @Test
    void getPoint2() {
        Point point2 =  new Point(3, 1);
        Triangle triangle = new Triangle(new Point(1, 1),
               point2,
                new Point(1,4));
        Point result = triangle.getPoint2();
        assertEquals(point2, result);
    }

    @Test
    void getPoint3() {
        Point point3 =  new Point(1,4);
        Triangle triangle = new Triangle(new Point(1, 1),
                new Point(3, 1),
                point3);
        Point result = triangle.getPoint3();
        assertEquals(point3, result);
    }


    @Test
    void moveIn2DSpace() {

        Triangle triangle = new Triangle(new Point(1,1),
                new Point(4, 1),
                new Point(1,5));
        triangle.moveIn2DSpace(5,6);
        Point result1 = triangle.getPoint1();
        Point result2 = triangle.getPoint2();
        Point result3 = triangle.getPoint3();

        Point point1 = new Point(6, 7);
        Point point2 = new Point(9, 7);
        Point point3 = new Point(6, 11);
        assertEquals(point1.X, result1.X);
        assertEquals(point1.Y, result1.Y);
        assertEquals(point2.X, result2.X);
        assertEquals(point2.Y, result2.Y);
        assertEquals(point3.X, result3.X);
        assertEquals(point3.Y, result3.Y);

    }

    @org.junit.jupiter.api.Test
    void invalidInput() {
        try {
            Triangle triangle = new Triangle(new Point(1, 1),
                    new Point(1, 4),
                    new Point(1, 5));
        }
        catch( final IllegalArgumentException e )
        {
            final String msg = "Input points are not valid to create triangle";
            assertEquals(msg, e.getMessage());
        }

    }
}