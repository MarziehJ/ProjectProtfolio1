package main.graphics;

import main.classes.Point;
import main.classes.Rectangle;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class gRectangle extends Rectangle {
    public gRectangle(Point point1, Point point2) {
        super(point1, point2);
    }


    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.GRAY);
        g2d.fillRect((int)getPoint1().X ,  (int)getPoint1().Y, (int)getHeight() , (int)getWidth() );

        Ellipse2D.Double circle = new Ellipse2D.Double( computeCenter().X ,  computeCenter().Y , 5, 5);
        g2d.setColor(Color.RED);
        g2d.fill(circle);

        g2d.drawString("Area: " + computeArea(), (int)getPoint1().X + 20, (int)getPoint2().Y + 20);
        g2d.drawString("circumference: " + computeCircumference(), (int)getPoint1().X + 10, (int)getPoint2().Y + 10);

    }
}
