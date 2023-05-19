package ch0203;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        double w = 0, h = 0, area = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("직사각형 가로 길이 : ");
        w = in.nextDouble();
        System.out.print("직사각형 세로 길이 : ");
        h = in.nextDouble();
        area = w * h;
        System.out.println("넓이 : " + area);
    }
}
