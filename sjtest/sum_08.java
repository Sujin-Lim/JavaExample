package sjtest;

import java.util.Scanner;

public class sum_08 {
    public static void main(String[] args) {


        int a;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        System.out.println("각 자릿수 합:" + ((a / 100) + ((a / 10)%10) + (a % 10)));
    }
}
