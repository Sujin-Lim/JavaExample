package sjtest;

import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        int a;
        Scanner in = new Scanner(System.in);
        System.out.print("정수 입력: ");
        a = in.nextInt();
        System.out.println((a%2==1)?"odd":"even");
    }
}
