package main.graphics;

import javax.swing.*;

public class Coordinates {

    private JPanel panel1;

    public Coordinates() {
        {
            JFrame f = new JFrame("Panel Example");
            JPanel panel = new DynamicShapes();
            //panel.setBounds(0, 0, 400, 400);
            //panel.setBackground(Color.gray);
            //JButton b1=new JButton("Button 1");
            //b1.setBounds(50,100,80,30);
            //b1.setBackground(Color.yellow);
            //JButton b2=new JButton("Button 2");
            //b2.setBounds(100,100,80,30);
            //b2.setBackground(Color.green);
            //panel.add(b1); panel.add(b2);


            f.add(panel);
            f.setSize(400,400);
            f.setLocationRelativeTo(null);
            f.setLayout(null);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }


    }
}
