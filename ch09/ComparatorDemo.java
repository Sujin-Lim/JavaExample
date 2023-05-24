package ch09;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {
        String[] strings = {"로마법", "시간금", "펜은강함"};

        Arrays.sort(strings, Comparator.comparingInt(String::length));
//        아래의 코드를 위의 람다식으로 바꿈.
//        Arrays.sort(strings, new Comparator<String>() {
//            @Override
//            public int compare(String first, String second) {
//                return first.length() - second.length();
//            }
//        });
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
