package ch015;

import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;

public class Calc extends JFrame {
    Calc(){
        setTitle("계산기");

        setLayout(new BorderLayout(10, 10));

        showCenter();
        showNorth();


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 300);
        setVisible(true);
    }

    void showNorth(){
        JPanel p1 = new JPanel();
        JPanel panel = new JPanel(new GridLayout(1, 0));

        JTextField t1 = new JTextField(15);
        p1.add(t1);
        panel.add(p1);

        add(panel, BorderLayout.NORTH);
    }


    void showCenter(){

        JPanel panel = new JPanel(new BorderLayout());

        JPanel p1 = new JPanel(new FlowLayout());
        JButton b1 = new JButton("on");
        JButton b2 = new JButton("off");
        p1.add(b1);
        p1.add(b2);
        panel.add(p1,BorderLayout.NORTH);


        JPanel p2 = new JPanel(new GridLayout(4,4,10,10));

        p2.add(new JButton("7"));
        p2.add(new JButton("8"));
        p2.add(new JButton("9"));
        p2.add(new JButton("+"));
        p2.add(new JButton("4"));
        p2.add(new JButton("5"));
        p2.add(new JButton("6"));
        p2.add(new JButton("-"));
        p2.add(new JButton("1"));
        p2.add(new JButton("2"));
        p2.add(new JButton("3"));
        p2.add(new JButton("x"));
        p2.add(new JButton("0"));
        p2.add(new JButton("."));
        p2.add(new JButton("="));
        p2.add(new JButton("/"));
        panel.add(p2,BorderLayout.CENTER);

        add(panel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new Calc();
    }
}
