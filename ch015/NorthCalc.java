package ch015;

import javax.swing.*;
import java.awt.*;

public class NorthCalc extends JFrame {
    NorthCalc(){
        setTitle("텍스트필드");

        setLayout(new BorderLayout(10,10));
        showNorth();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(180,70);
        setVisible(true);
    }

    void showNorth(){
        JPanel panel = new JPanel();

        JTextArea area = new JTextArea(1, 30);
        area.setText("입력한 숫자 나타남");
        area.setEditable(true);
        area.setForeground(Color.WHITE);
        panel.add(area);

        add(panel, BorderLayout.CENTER);
    }

}
