// TODO: 2023-05-22

package ch04;

public class LocalVariableDemo {
    public static void main(String[] args) {
        int a = 0;

//        double b;  지역변수는 초기화 하지 않으면 사용 불가능.
        double b = 0;

        System.out.println(b);
//      System.out.println(a+c);  c가 아직 선언되지 않았기 때문에 사용 불가능.

        int c = 0;

        System.out.println(a+c);
//        public double d = 0.0;  지역 변수는 public으로 지정 불가능.
        double d = 0.0;

        for (int e = 0; e < 10; e++) {
//            int a = 1;  위에서 a가 선언되었기 때문에 선언 불가능. 블록이 달라도 새로 지정할 수 없음.
            a = 1;
            System.out.print(e);
        }
//      형변환(cast) 연습
        short x = 1;
//        x.castvar 탭 해서
        int y = (int) x;
        long z = (long) x;
        double k = (double) x;
    }
}
