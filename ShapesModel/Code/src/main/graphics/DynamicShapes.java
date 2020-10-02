package main.graphics;

import main.classes.GeoFiguresComputable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DynamicShapes extends JPanel {

    java.util.List<GeoFiguresComputable> shapes = new ArrayList<>();

    public DynamicShapes() {
        setBackground(Color.WHITE);
        setSize(new Dimension(400, 400));
        AddButtons();
        repaint();
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawXY((Graphics2D) g);
        for (Object s : shapes) {
            if (s instanceof gRectangle) {
                ((gRectangle) s).draw(g);
            } else if (s instanceof gCircle) {
                ((gCircle) s).draw(g);
            }
        }

    }

    private void AddButtons() {
        JButton bRec = new JButton("Draw Rectangle");
        bRec.setLocation(new Point(5, 5));
        bRec.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                CreateRectangle();
            }
        });
        this.add(bRec);

        JButton bCircle = new JButton("Draw Circle");
        bCircle.setLocation(new Point(10, 5));
        bCircle.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                CreateCirle();
            }
        });
        this.add(bCircle);
    }

    private void CreateCirle() {
        JTextField xField1 = new JTextField(5);
        JTextField yField1 = new JTextField(5);
        JTextField rField = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("x:"));
        myPanel.add(xField1);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("y:"));
        myPanel.add(yField1);
        myPanel.add(new JLabel("radius:"));
        myPanel.add(rField);

        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "Please Enter Values", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            AddCircle(xField1.getText(),
                    yField1.getText(),
                    rField.getText());
        }
    }

    private void AddCircle(String X1, String Y1, String r) {
        try {
            gCircle cir = new gCircle(
                    new main.classes.Point(Double.parseDouble(X1), Double.parseDouble(Y1)),
                    Double.parseDouble(r));
            shapes.add(cir);
            repaint();
        } catch (Exception ex) {

        }
    }

    private void CreateRectangle() {
        JTextField xField1 = new JTextField(5);
        JTextField yField1 = new JTextField(5);
        JTextField xField2 = new JTextField(5);
        JTextField yField2 = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("x1:"));
        myPanel.add(xField1);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("y1:"));
        myPanel.add(yField1);
        myPanel.add(new JLabel("x2:"));
        myPanel.add(xField2);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("y2:"));
        myPanel.add(yField2);
        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "Please Enter Values", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            AddTraingle(xField1.getText(),
                    yField1.getText(),
                    xField2.getText(),
                    yField2.getText());
        }
    }
    private void AddTraingle(String X1, String Y1, String X2, String Y2) {
        try {
            gRectangle rec = new gRectangle(
                    new main.classes.Point(Double.parseDouble(X1), Double.parseDouble(Y1)),
                    new main.classes.Point(Double.parseDouble(X2), Double.parseDouble(Y2)));
            shapes.add(rec);
            repaint();
        } catch (Exception ex) {

        }

    }

    private void drawXY(Graphics2D g) {
        // Graphics2D g2d = g;
        //Shape x = new Line2D.Double(200, 10, 200, 410);
        //Shape y = new Line2D.Double(0, 210, 410, 210);
        //g.draw(x);
        //g.draw(y);

    }


}
