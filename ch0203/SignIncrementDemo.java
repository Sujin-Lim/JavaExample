package ch0203;

public class SignIncrementDemo {
    public static void main(String[] args) {
        int plusOne = 1;
        int minusOne = -plusOne;
        System.out.println("plusOne = " + plusOne);
        System.out.println("minusOne = " + minusOne);

        int x = 1, y = 1;
        System.out.println("x=" + x + ", x=" + ++x);
        System.out.println("y=" + y + ", y=" + y++);
        System.out.println("x=" + x + ", y=" + y);

        int a = 2;
        int b;
        b = (a == 1)? 10 : 20;
        System.out.println(b);
        b = (a > 1) ? a++ : a + 20;
        System.out.println(a);
        System.out.println(b);
        System.out.println(5>3 ? "t":"f");
    }
}
