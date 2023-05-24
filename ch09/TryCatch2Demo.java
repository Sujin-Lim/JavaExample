package ch09;

public class TryCatch2Demo {
    public static void main(String[] args) {
        int dividend = 10;
        try {
            int divisor = Integer.parseInt(args[0]);
            System.out.println(dividend / divisor);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("원소 존재 안함");
        } catch (NumberFormatException e) {
            System.out.println("숫자 아님");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누기 불가");
        } finally {
            System.out.println("항상 실행");
        }
        System.out.println("종료");
    }
}
