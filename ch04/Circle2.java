package ch04;

class Circle3 {
    double radius;
    String color;

    public Circle3(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle3(double radius) {
        this(radius, "파랑");
    }

    public Circle3(String color) {
        this(10.0, color);
    }

    public Circle3(){
        this(10.0, "빨강");
    }
}

public class Circle2 {
    public static void main(String[] args) {
        CircleC c1 = new CircleC(10.0, "빨강");
        CircleC c2 = new CircleC(5.0);
        CircleC c3 = new CircleC("노랑");
        CircleC c4 = new CircleC();
    }
}
