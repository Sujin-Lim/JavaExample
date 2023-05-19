package ch16;

import javax.swing.*;

public class AdjustmentListenerDemo extends JFrame {
    AdjustmentListenerDemo(){
        setTitle("개발자 임수진");

        JLabel label = new JLabel("", JLabel.CENTER);

        JScrollBar bar = new JScrollBar(JScrollBar.VERTICAL);
        bar.setValues(50, 10, 0, 500);
        bar.addAdjustmentListener(e -> {
            int v = e.getValue();
            label.setText("위치: " + v);
        });

        add("North", label);
        add("Center", bar);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(50, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AdjustmentListenerDemo();
    }
}
