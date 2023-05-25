package ch09;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchDemo {
    public static void main(String[] args) {
        String[] s = {"안녕", "하세요", "임수진", "입니다"};
        List<String> list = Arrays.asList(s);

        Collections.sort(list);
        System.out.println(list);
        int i = Collections.binarySearch(list, "안녕");
        System.out.println(i);
    }
}
