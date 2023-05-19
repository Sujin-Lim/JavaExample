
package ch0203;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
//        int x = in.nextInt();
//        int y = in.nextInt();
        System.out.printf("%s %s 입니다.\n", a, b, a+b);
        int remainder = 25 % 2;
        System.out.println("25 / 2의 나머지는 " + remainder + "입니다.");

        int value = 1;
        value += 1;
        System.out.println("값 = " + value);
        value -= 1;
        System.out.println("값 = " + value);
        value <<= 3;
        System.out.println("값 = " + value);
        value %= 3;
        System.out.println("값 = " + value);
    }
}
class Assign {
    public static void main(String[] args) {
        int value = 1;
        value += 1;
        System.out.println("값 = " + value);
        value -= 1;
        System.out.println("값 = " + value);
        value <<= 3;
        System.out.println("값 = " + value);
        value %= 3;
        System.out.println("값 = " + value);
    }
}