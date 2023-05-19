package ch0203;

public class Switch {
    public static void main(String[] args) {
        int number = 3;
        switch (number) {
            case 3:
                System.out.println("*");
            case 2:
                System.out.println("*");
            case 1:
                System.out.println("*");
        }
        whoIsIt("호랑이");
        whoIsIt("참새");
        whoIsIt("고등어");
        whoIsIt("곰팡이");

    }
    static void whoIsIt(String bio){
        String kind = "";
        switch (bio) {
            case "호랑이":
            case "사자":
                kind = "포유류";
                break;
            case "독수리":
            case "참새":
                kind = "조류";
                break;
            case "고등어":
            case "연어":
                kind = "어류";
                break;
            default:
                System.out.print("어이쿠! ");
                kind = "...";
        }
        System.out.println(bio + "는 "+ kind +"이다");
    }
}
