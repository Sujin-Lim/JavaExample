package ch06;

class Girl{
    protected String name;
    void show(){
        System.out.println(name + "는 자바 초보자이다.");
    }

    Girl(String name){
        this.name = name;
    }

}
class GoodGirl extends Girl{
    void show(){
        System.out.println(name + "는 자바를 잘 안다.");
    }
    GoodGirl(String name){
        super(name);
    }
}
class BestGirl extends GoodGirl{
    void show(){
        System.out.println(name +"는 자바를 무지하게 잘 안다.");
    }
    BestGirl(String name){
        super(name);
    }
}
public class GirlTest {
    public static void main(String[] args) {
//        Girl g1 = new Girl("갑순이");
//        Girl g2 = new GoodGirl("콩쥐");
//        GoodGirl gg= new BestGirl("황진이");

//        g2.show();
//        gg.show();

        Girl[] girls = {new Girl("갑순이"), new GoodGirl("콩쥐"), new BestGirl("황진이")};

        for (Girl g :girls)
            g.show();

    }
}
