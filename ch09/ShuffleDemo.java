package ch09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleDemo {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        for (char c = 'ㄱ'; c <= 'ㅎ'; c++) {
            list.add(c);
        }
        System.out.println("최초: \t"+list);
        Collections.rotate(list, 3);
        System.out.println("돌린: \t" + list);
        Collections.shuffle(list);
        System.out.println("섞은: \t" + list);
    }
}
