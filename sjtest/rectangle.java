package sjtest;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        double w, h;
        Scanner in = new Scanner(System.in);
        System.out.print("가로 길이: ");
        w = in.nextDouble();
        System.out.print("세로 길이: ");
        h = in.nextDouble();
        System.out.println("넓이: " + w*h);
    }
}
