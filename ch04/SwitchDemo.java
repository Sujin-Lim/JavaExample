package ch04;

public class SwitchDemo {
    public static void main(String[] args) {
        Gender2 gender = Gender2.남성;

        String s = switch (gender) {
        case 남성 -> "은 병역 의무가 있다.";
        case 여성 -> "은 병역 의무가 없다.";
        };
        System.out.println(gender + s);
    }
}
enum Gender2 {
    남성, 여성
}
