package ch09;

import java.util.Arrays;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        String[] animals1 = {"ab", "cdc", "efef", "g"};

        List<String> animals2 = Arrays.asList(animals1);
        animals2.set(1, "ij");

        for (String s : animals2) {
            System.out.print(s + " ");
        }
        System.out.println();

        animals2.sort((x, y) -> x.length() - y.length());
        String[] animals3 = animals2.toArray(new String[0]);
        for (int i = 0; i < animals3.length; i++) {
            System.out.print(animals3[i] + " ");
        }
        System.out.println();

        List<String> cars = List.of("AB", "CD", "EF", "GH");
        cars.forEach(s -> System.out.print(s + " "));
    }
}
