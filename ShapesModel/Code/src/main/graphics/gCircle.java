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
        Ellipse2D.Double circle = new Ellipse2D.Double(getCenter().X, getCenter().Y, getRadius(), getRadius());

        g2d.setColor(Color.DARK_GRAY);
        g2d.fill(circle);

        //Ellipse2D.Double centre = new Ellipse2D.Double( computeCenter().X ,  computeCenter().Y , 5, 5);
        //g2d.setColor(Color.RED);
        //g2d.fill(centre);
        g2d.setColor(Color.RED);
        g2d.drawString("Area: " + computeArea(), (int)getCenter().X + 20, (int)getCenter().Y + 20);
        g2d.drawString("circumference: " + computeCircumference(), (int)getCenter().X + 10, (int)getCenter().Y + 10);

    }

}