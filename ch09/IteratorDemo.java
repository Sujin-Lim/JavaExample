package ch09;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> list = Arrays.asList("초급", "중급", "고급", "임수진");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "-");
        }
        System.out.println();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "+");
        }
        System.out.println();

        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "→");
        }
    }
}
