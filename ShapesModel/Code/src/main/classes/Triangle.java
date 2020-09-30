package main.classes;


public class Triangle extends Shape
        implements GeoFiguresComputable {
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

    Point point1;
    Point point2;
    Point point3;

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }
}
