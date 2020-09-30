package main.graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;

public class DynamicShapes extends JPanel {


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

    }

    private void AddButtons() {
        JButton bRec =new JButton("Draw Rectangle");
        //bRec.setBounds(0,0,80,30);
        bRec.setLocation(new Point(5, 5));
        bRec.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String shapeAmount = JOptionPane.showInputDialog(null,
                        "How many shapes?", "Random Shapes...", JOptionPane.PLAIN_MESSAGE);
            }
        });
        //JButton bTria =new JButton("Draw Triangle");
        //bRec.setBackground(Color.yellow);
        //JButton b2=new JButton("Button 2");
        //b2.setBounds(100,100,80,30);
        //b2.setBackground(Color.green);
        this.add(bRec);
        //this.add(bTria);
        //panel.add(b2);
    }

    private void drawXY(Graphics2D g) {
        Graphics2D g2d = g;
        Shape x = new Line2D.Double(200, 10, 200, 410);
        Shape y = new Line2D.Double(0, 210, 410, 210);
        g.draw(x);
        g.draw(y);

    }


}
