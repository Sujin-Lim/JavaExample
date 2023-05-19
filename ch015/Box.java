package ch015;

import javax.swing.*;

public class Box extends JFrame {
    Box(){
        setTitle("박스 레이아웃");

        JPanel panel = new JPanel();

        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

        panel.add(new JButton("버튼 1"));
        panel.add(new JButton("버튼 2"));
        panel.add(new JButton("버튼 3"));
        panel.add(new JButton("버튼 4"));
        panel.add(new JButton("버튼 5"));

        add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(360, 60);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Box();
    }
}
