package ch04;

class CircleW {
    double radius;

    public CircleW(double radius) {
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    double findArea(){
        return 3.14 * radius * radius;
    }
        }

public class CircleArrayDemo {
    public static void main(String[] args) {
        CircleW[] circles = new CircleW[5];

        for (int i = 0; i < circles.length; i++) {
            circles[i] = new CircleW(i + 1.0);
            System.out.printf("원의 넓이(반지름: %.1f) = %.2f\n",
                    circles[i].radius, circles[i].findArea());
        }
    }
}
