package main.classes;

public class Circle extends Shape
        implements GeoFiguresComputable{
    @Override
    public double computeArea() {

        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public Point computeCenter() {
        return this.center;
    }

    @Override
    public double computeCircumference() {

        return 2 * Math.PI * this.radius;
    }

    @Override
    public boolean isPointInside(Point point) {
        double distance = CoordinateHelper.computePointsDistance(point, this.center);
        return distance <= radius;
    }

    @Override
    public void moveIn2DSpace(double X, double Y) {
        center.X += X;
        center.Y += Y;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    Point center;
    double radius;

    public Circle(Point center, double radius)
    {
        if (radius <= 0)
            throw new IllegalArgumentException ("raduis should have positive value");

        this.center = center;
        this.radius = radius;

    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

}