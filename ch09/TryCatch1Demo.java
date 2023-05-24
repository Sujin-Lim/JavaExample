package ch09;

public class TryCatch1Demo {
    public static void main(String[] args) {
        int[] array = {0, 1, 2};
        try {
            System.out.println("last => " + array[3]);
            System.out.println("first => " + array[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("not exist");
        }
        System.out.println("omg");
    }
}
