package main.classes;


public class Triangle extends Shape
        implements GeoFiguresComputable {
    /* computeArea() -
     * Find the area of a triangle. This function uses the 1/2 determinant
     * method. Given three points (x1, y1), (x2, y2), (x3, y3):
     *             | x1 y1 1 |
     * Area = .5 * | x2 y2 1 |
     *             | x3 y3 1 |
     */
    @Override
    public double computeArea() {
        return Math.abs((point1.X * (point2.Y - point3.Y)) +
                (point2.X * (point3.Y - point1.Y)) +
                (point3.X * (point1.Y - point2.Y))) / 2;
    }

   
    @Override
    public Point computeCenter() {
        return new Point((point1.X + point2.X + point3.X) / 3,
                (point1.Y + point2.Y + point3.Y) / 3);
    }

    @Override
    public double computeCircumference() {
        return Math.sqrt(Math.pow(point1.X - point2.X, 2) + Math.pow(point1.Y - point2.Y, 2)) +
                Math.sqrt(Math.pow(point2.X - point3.X, 2) + Math.pow(point2.Y - point3.Y, 2)) +
                Math.sqrt(Math.pow(point3.X - point1.X, 2) + Math.pow(point3.Y - point1.Y, 2));
    }

    /* IsPointInTri() -
     * Used by isPointInside(). Function takes the point and the triangle's
     * vertices. Checking on which side of the half-plane created by the edges the point is.
     *
     */
    @Override
    public boolean isPointInside(Point point) {
        double d1, d2, d3;
        boolean has_neg, has_pos;

        d1 = CoordinateHelper.sign(point, point1, point2);
        d2 = CoordinateHelper.sign(point, point2, point3);
        d3 = CoordinateHelper.sign(point, point3, point1);

        has_neg = (d1 < 0) || (d2 < 0) || (d3 < 0);
        has_pos = (d1 > 0) || (d2 > 0) || (d3 > 0);

        return !(has_neg && has_pos);
    }

    @Override
    public void moveIn2DSpace(double X, double Y) {
        point1.X += X; point1.Y += Y;
        point2.X += X; point2.Y += Y;
        point3.X += X; point3.Y += Y;
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    Point point1;
    Point point2;
    Point point3;

    public Triangle(Point point1, Point point2, Point point3) {
        if ((point1.X == point2.X && point3.X == point2.X) ||
            (point1.Y == point2.Y && point1.Y == point3.Y))
            throw new IllegalArgumentException ("Input points are not valid to create triangle");

        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public Point getPoint3() {
        return point3;
    }
}
