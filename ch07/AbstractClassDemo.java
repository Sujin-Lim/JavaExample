package ch07;

public class AbstractClassDemo {
    public static void main(String[] args) {
        Circle c = new Circle(3);
        c.draw();
        System.out.printf("원의 넓이는 %.1f\n", c.findArea());

        Starfish d = new Starfish(3);
        d.draw();
        System.out.printf("스타피쉬 넓이는 %.1f\n", d.findArea());
    }
}
