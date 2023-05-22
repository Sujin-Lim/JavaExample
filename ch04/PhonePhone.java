package ch04;

class PhoneS {
    String model;
    int value;

    void print() {
        System.out.println(value + "만 원 " + model + " 스마트폰");
    }

}
public class PhonePhone {
    public static void main(String[] args) {
//        new.PhoneS().var 치고 탭 하면 아랫 줄 생성.
        PhoneS myPhone = new PhoneS();
        myPhone.model = "갤럭시 S8";
        myPhone.value = 100;
        myPhone.print();

        PhoneS yourPhone = new PhoneS();
        yourPhone.model = "아이폰";
        yourPhone.value = 120;
        yourPhone.print();
    }
}
