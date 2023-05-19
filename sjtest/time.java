package sjtest;

import java.util.Scanner;

public class time {
    public static void main(String[] args) {
        int a, h, m, s;
        Scanner in = new Scanner(System.in);
        System.out.print("초 입력: ");
        a = in.nextInt();
        h = a / 60 / 60;
        m = (a / 60 ) % 60;
        s = a % 60;
        System.out.println(h + "시간" + m + "분" + s + "초");
    }
}
