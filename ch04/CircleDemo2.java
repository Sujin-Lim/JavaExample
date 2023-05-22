package ch04;

class CircleC {
    double radius;
    String color;

    public CircleC(double r, String c) {
        radius = r;
        color = c;
    }

    public CircleC(double r) {
        radius = r;
        color = "파랑";
    }

    public CircleC(String c) {
        radius = 10.0;
        color = c;
    }

    public CircleC(){
        radius = 10.0;
        color = "빨강";
    }

    }
public class CircleDemo2 {
    public static void main(String[] args) {
        CircleC c1 = new CircleC(10.0, "빨강");
        CircleC c2 = new CircleC(5.0);
        CircleC c3 = new CircleC("노랑");
        CircleC c4 = new CircleC();
    }
}

