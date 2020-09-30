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
                (point2.X + point1.X) / 2 ,
                (point2.Y + point1.Y) / 2);
    }

    @Override
    public double computeCircumference() {
        return 2 * (getHeight() + getWidth());
    }

    @Override
    public boolean isPointInside(Point point) {
        return  (point.X <= Math.max(point1.X, point2.X)) &&
                (point.X >= Math.min(point1.X, point2.X)) &&
                (point.Y >= Math.min(point1.Y, point2.Y)) &&
                (point.Y >= Math.min(point1.Y, point2.Y));
    }

    Point point1;
    Point point2;

    public Rectangle(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public double getHeight() {
        return Math.abs(this.point2.X - this.point1.X);
    }

    public double getWidth() {
        return Math.abs(this.point2.Y - this.point1.Y);
    }

}