package main.graphics;

import javax.swing.*;
import java.awt.*;

public class DrawShapes extends JFrame {


    public DrawShapes() {

        this.setSize(new Dimension(410, 500));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setVisible(true);

        //etLayout( new FlowLayout() );

        JPanel p = new DynamicShapes();

        setTitle("ShapesModel");
        this.getContentPane().add(p);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String arg[]) {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                new DrawShapes();
            }
        });
    }
}
