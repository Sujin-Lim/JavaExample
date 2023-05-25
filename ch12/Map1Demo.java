package ch12;

import java.util.stream.Stream;

public class Map1Demo {
    public static void main(String[] args) {
        Stream.of("a1", "b1", "b2", "c1", "c2").map(String::toUpperCase).forEach(Util::print);
        System.out.println();

        Stream.of(1, 2, 1, 3, 3, 2, 4).map(i -> i * 2).forEach(Util::print);
        System.out.println();

        Stream.of("a1", "a2", "a3").map(s -> s.substring(1)).mapToInt(Integer::parseInt).mapToObj(i -> "b" + i).forEach(Util::print);
    }
}
