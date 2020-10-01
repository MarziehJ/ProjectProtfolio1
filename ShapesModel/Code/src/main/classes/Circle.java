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

    public Point center;
    public double radius;

    public Circle(Point center, double radius)
    {
        this.center = center;
        this.radius = radius;

    }

}