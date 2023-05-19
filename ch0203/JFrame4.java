package ch0203;

import javax.swing.*;

public class JFrame4 extends JFrame {
    JFrame4() {
        setTitle("개발자 임수진");

        JPanel b = new JPanel();
        JLabel i = new JLabel("개발자 임수진");
        JButton p = new JButton("버튼");
        b.add(i);
        b.add(p);
        add(b);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JFrame4();
    }
}
