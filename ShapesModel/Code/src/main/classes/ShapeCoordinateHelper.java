package main.classes;

public class ShapeCoordinateHelper {
    public double computeEuclideanDistance(
            GeoFiguresComputable shape1,
            GeoFiguresComputable shape2) {
        return CoordinateHelper.computePointsDistance(shape1.computeCenter(), shape2.computeCenter());
    }

}
