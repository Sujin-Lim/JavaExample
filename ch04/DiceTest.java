package ch04;

class Dice{
//    face: 면, roll: 굴리는 동작.
//    int face 는 사용되지 않는데 지워도 되는거 아닌가?
    int face;
    double roll;

    int roll() {
//        Math.random() 0.0이상 1.0미만의 double 타입 무작위 실수 반환.
//        int 로 강제 형변환 했으니 *6의 값은 0~5가 나오게 됨. 따라서 +1을 해야 1~6으로 주사위 눈이 나오게 됨.
        return (int) (Math.random() * 6) + 1;
    }
}

public class DiceTest {
    public static void main(String[] args) {
        Dice d = new Dice();
        System.out.println("주사위 숫자: " + d.roll());

    }
}
