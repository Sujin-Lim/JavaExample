package ch0203;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int a = 0;
        int r = 0;
        String result;
        Scanner in = new Scanner(System.in);
        System.out.print("정수 입력: ");
        a = in.nextInt();
        r = a % 2 ;
        result = (r==0) ? "even" : "odd";
        System.out.println(result + "입니다");
    }
}
