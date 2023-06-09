package ch16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseMotionAdapterDemo extends JFrame {
    MouseMotionAdapterDemo(){
        setTitle("임수진");

        JLabel label = new JLabel("움직이는 레이블");
        label.setForeground(Color.RED);
        add(label);

        addMouseMotionListener(new MyMouseMotionAdapter(label));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 120);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MouseMotionAdapterDemo();
    }
}
class MyMouseMotionAdapter extends MouseMotionAdapter {
    JLabel label;

    public MyMouseMotionAdapter(JLabel label) {
        this.label = label;
    }

    public void mouseMoved(MouseEvent e) {
        label.setLocation(e.getX(), e.getY() - 50);

    }
}
