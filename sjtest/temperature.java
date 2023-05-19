package sjtest;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        double c, f;
        Scanner in = new Scanner(System.in);
        System.out.print("화씨온도: ");
        f = in.nextDouble();
        c = (5.0/9.0)*(f-32);
        System.out.println("섭씨온도: " + c);

    }
}
