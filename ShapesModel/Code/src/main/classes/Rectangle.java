package main.classes;


public class Rectangle extends Shape
        implements GeoFiguresComputable {
    @Override
    public double computeArea() {
        return getWidth() * getHeight();
    }

    @Override
    public Point computeCenter() {
        return new Point(
                (point2.X + point1.X) / 2,
                (point2.Y + point1.Y) / 2);
    }

    @Override
    public double computeCircumference() {
        return 2 * (getHeight() + getWidth());
    }

    @Override
    public boolean isPointInside(Point point) {
        return (point.X <= Math.max(point1.X, point2.X)) &&
                (point.X >= Math.min(point1.X, point2.X)) &&
                (point.Y >= Math.min(point1.Y, point2.Y)) &&
                (point.Y >= Math.min(point1.Y, point2.Y));
    }

    @Override
    public void moveIn2DSpace(double X, double Y) {
        point1.X += X;  point1.Y += Y;
        point2.X += X;  point2.Y += Y;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    Point point1;
    Point point2;

    public Rectangle(Point point1, Point point2) {
        if (point1.X == point2.X || point1.Y == point2.Y)
            throw new IllegalArgumentException ("Input points are not valid to create rectangle");
        this.point1 = point1;
        this.point2 = point2;
    }

    public double getHeight() {
        return Math.abs(this.point2.X - this.point1.X);
    }

    public double getWidth() {
        return Math.abs(this.point2.Y - this.point1.Y);
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

}