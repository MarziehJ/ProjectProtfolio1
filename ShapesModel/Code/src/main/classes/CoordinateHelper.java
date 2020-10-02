package main.classes;

public class CoordinateHelper {
    public static double computePointsDistance(Point p1, Point p2)
    {

        return Math.hypot(p1.X-p2.X, p1.Y-p2.Y);
    }

    public static double sign(Point p1, Point p2, Point p3)
    {
        return (p1.X - p3.X) * (p2.Y - p3.Y) - (p2.X - p3.X) * (p1.Y - p3.Y);
    }

    public static double computeEuclideanDistance(
            GeoFiguresComputable shape1,
            GeoFiguresComputable shape2) {
        return CoordinateHelper.computePointsDistance(shape1.computeCenter(), shape2.computeCenter());
    }
}
