package ch0203;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("정수 입력: ");
        int a = in.nextInt();
        System.out.println("제곱: " + a*a);
    }
}
