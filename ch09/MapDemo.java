package ch09;

import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
//        key,value를 바꿔봄. 귀찮아서 sout 냅둠
        Map<Integer, String > fruits = Map.of(5, "사과", 3, "바나나", 10, "포도", 1, "딸기");
        System.out.println(fruits.size() + "종류의 과일 있음");
        System.out.println(fruits);

        for (Integer key : fruits.keySet()) {
            System.out.println(key + "가 " + fruits.get(key) + "개 있음");
        }
        String key = "바나나";
        if (fruits.containsKey(key)) {
            System.out.println(key + "가 " + fruits.get(key) + "개 있음");
        }
        fruits.forEach((k, n) -> System.out.print(k + "(" + n + ")"));
    }
}
