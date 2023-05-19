package ch0203;

public class Increment {
    public static void main(String[] args) {
        int x = 0;
        System.out.println("메서드 호출 전 x: " + x);
        increment(x);
        System.out.println("메서드 호출 후 x: " + x);
    }

//    x의 복사값이 아래 메서드의 n값으로 들어감.
//    따라서 아래 함수가 실행되어도 실제 x값은 변하지 않음.


    public static void increment(int n){
        System.out.println("메서드 시작 시 n: " + n);
        n++;
        System.out.println("메서드 끝난 후 n: " + n);
    }
}
