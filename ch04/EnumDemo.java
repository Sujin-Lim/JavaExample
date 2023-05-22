package ch04;

public class EnumDemo {
    public static void main(String[] args) {

        Gender gender = Gender.X;

        if (gender == Gender.MALE) {
            System.out.println(Gender.MALE + "는 병역 의무가 있다.");
        }
        if (gender == Gender.FEMALE) {
            System.out.println(Gender.FEMALE + "은 병역 의무가 없다.");
        } else {
            System.out.println(Gender.X + "는 자기 맘이다.");
        }
    }
}
enum Gender{
    MALE("남성"), FEMALE("여성"),X("엑스");
    private String s;

    Gender(String s) {
        this.s = s;
    }
    public String toString(){
        return s;
    }
}