package ch015;

import javax.swing.*;
import java.awt.*;

public class Radio extends JFrame {
    Radio(){
        setTitle("애완 동물");

        JPanel p1 = new JPanel();

        JRadioButton b1 = new JRadioButton("강아지");
        JRadioButton b2 = new JRadioButton("고양이");
        JRadioButton b3 = new JRadioButton("금붕어");

        ButtonGroup group = new ButtonGroup();
        group.add(b1);
        group.add(b2);
        group.add(b3);


        p1.add(b1);
        p1.add(b2);
        p1.add(b3);

        add(p1);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Radio();
    }

}
