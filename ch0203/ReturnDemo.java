package ch0203;

public class ReturnDemo {
    public static void main(String[] args) {
        printScore(99);
        printScore(120);
        printGauss(10,10000);
        echo("안녕",3);
    }

    public static void printScore(int score) {
        if (score < 0 || score > 100) {
            System.out.println("잘못된 점수: " + score);
            return;
        }
        System.out.println("점수: " + score);
    }

//    함수에 void, return없이 왜 돌아가는가?
    public static int printGauss(int i1, int i2) {
        int sum = 0;
        for (int i = i1; i <= i2; i++) {
            sum += i;
        }
        System.out.println("sum: " + sum);
        return sum;
    }

    public static void echo(String s, int n){
        for (int i = 0; i < n; i++) {
            System.out.println(s);

        }
    }

}

