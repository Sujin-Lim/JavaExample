package ch015;

import javax.swing.*;
import java.awt.*;

public class CenterComponent extends JFrame {
    CenterComponent(){
        setTitle("원 넓이 구하기");

        setLayout(new BorderLayout(10, 10));
        showCenter();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
    }
    void showCenter(){
        JPanel panel = new JPanel();

        JTextArea area = new JTextArea(30, 20);
        area.setText("이 영역에 원의 넓이를\n계산하는 과정이 나타남.");
        area.setEditable(false);
        area.setForeground(Color.RED);
        panel.add(area);

        add(panel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new CenterComponent();
    }
}
