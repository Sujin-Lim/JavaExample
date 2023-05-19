package sjtest;

import java.util.Scanner;

public class cylinder {
    public static void main(String[] args) {
        double r, h, v;
        final double PI = 3.141592;
        Scanner in = new Scanner(System.in);
        System.out.print("반지름: ");
        r = in.nextInt();
        System.out.print("높이: ");
        h = in.nextInt();
        v = PI * r * r * h;
        System.out.println("부피: " + v);
    }
}
