package ch015;

import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;

public class ColorPick extends JFrame {
    ColorPick(){
        setTitle("색상 선택기");
        setLayout(new BorderLayout());

        showNorth();
        showCenter();
        showSouth();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 150);
        setVisible(true);
    }
    void showNorth(){
        String[] color = {"빨간색", "초록색", "파란색"};
        JPanel panel = new JPanel(new java.awt.FlowLayout());

        JComboBox<String> cb = new JComboBox<>(color);

        panel.add(cb);
        add(panel, BorderLayout.NORTH);
    }

    void showCenter(){
        String b = "배경색";
        String j = "전경색";

        JPanel panel = new JPanel(new java.awt.FlowLayout());

        JCheckBox rb1 = new JCheckBox(b);
        JCheckBox rb2 = new JCheckBox(j);

        panel.add(rb1);
        panel.add(rb2);
        add(panel, BorderLayout.CENTER);

    }

    void showSouth(){

        JPanel panel = new JPanel();

        JPanel p1 = new JPanel(new FlowLayout());
        JButton b1 = new JButton("  예  ");
        JButton b2 = new JButton("아니오");
        p1.add(b1);
        p1.add(b2);
        panel.add(p1);
        add(panel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new ColorPick();
    }

}
