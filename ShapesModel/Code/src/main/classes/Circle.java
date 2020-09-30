package main.classes;

public class Circle extends Shape
        implements GeoFiguresComputable{
    @Override
    public double computeArea() {
        return 0;
    }

    @Override
    public Point computeCenter() {
        return null;
    }

    @Override
    public double computeCircumference() {
        return 0;
    }

    @Override
    public boolean isPointInside(Point point) {
        return false;
    }

}