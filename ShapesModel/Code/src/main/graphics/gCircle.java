package main.graphics;

import main.classes.Circle;
import main.classes.Point;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class gCircle extends Circle {


    public gCircle(Point center, double radius) {
        super(center, radius);
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Ellipse2D.Double circle = new Ellipse2D.Double(center.X, center.Y, 50, 50);

        g2d.setColor(Color.GRAY);
        g2d.fill(circle);
    }

}