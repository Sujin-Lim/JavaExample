package sjtest;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int a,b;
        int result=1;
        Scanner in = new Scanner(System.in);
        System.out.print("2가지 정수 입력: ");
        a = in.nextInt();
        b = in.nextInt();
        factorial(a,b);

//        for (int i = 1; i <= a ; i++) {
//            result *= i;
//        }

//        while (a > 0){
//            result *= a;
//            a--;
//        }

//        while(true) {
//            result *= a;
//            a--;
//            if(a==0){
//                break;
//            }
//        }
//        System.out.println(a + "!= " + result);

    }

    static int factorial(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.println(a + "!=" +result);
        return result;
    }
    static int factorial(int a, int b) {
        int result = 1;
        for (int i = a; i <= b; i++) {
            result *= i;
        }
        System.out.println("factorial("+a+","+b+")="+result);
        return result;
    }
}
