package ch0203;

import javax.swing.*;

//class MyFrame extends JFrame {
//    MyFrame(){
//        setTitle("개발자 임수진");
//        setSize(500, 500);
//        setVisible(true);
//    }
//}

public class JFrame1 extends JFrame {
    JFrame1() {
        setTitle("개발자 임수진");

        JButton b = new JButton("버튼");
        add(b);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JFrame1();
    }
}
