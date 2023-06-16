package extra;

public class FizzBuzzProcessor {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            System.out.println(Convert(i));
        }
    }

    private static String Convert(int fizzBuzz) {
        if (fizzBuzz % 15 == 0) {
            return "FizzBuzz";
        }
        if (fizzBuzz % 5 == 0) {
            return "Buzz";
        }
        if (fizzBuzz % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(fizzBuzz);
    }
    public String convert(int fizzBuzz){
        if (fizzBuzz % 15 == 0) {
            return "FizzBuzz";
        }
        if (fizzBuzz % 5 == 0) {
            return "Buzz";
        }
        if (fizzBuzz % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(fizzBuzz);
    }
}
