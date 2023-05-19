package ch015;

import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;

public class SouthComponent extends JFrame {
    SouthComponent(){
        setTitle("원 넓이 구하기");

        setLayout(new BorderLayout(10, 10));
        showSouth();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 105);
        setVisible(true);
    }

    void showSouth(){
        String[] color = {"red", "blue"};

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        JButton cal = new JButton("계산");
        JComboBox<String> cb = new JComboBox<>(color);
        JButton reset = new JButton("리셋");

        panel.add(cal);
        panel.add(cb);
        panel.add(reset);

        add(panel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new SouthComponent();
    }
}
