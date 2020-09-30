package main.classes;

public interface GeoFiguresComputable {
    public double computeArea();
    public Point computeCenter();
    public double computeCircumference();
    public boolean isPointInside(Point point);
}
