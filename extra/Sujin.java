// TODO: 2023-06-02 임수진 NCS 평가

package extra;

public class Sujin {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            String out = "";
            out = fizzbuzz(i,out);
            System.out.println(out);
        }
    }

    static String fizzbuzz(int i, String out) {
        if (i%3==0) {
            out += "fizz";
        } else if (i % 5 == 0) {
            out += "buzz";
        } else {
            out += i;
        }
        return out;
    }
}
