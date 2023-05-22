package ch04;

class CircleSJ2 {
    double radius;
    static int numOfCircles = 0;
    int numCircles = 0;

    public CircleSJ2(double radius) {
        this.radius = radius;
        numOfCircles++;
        numCircles++;
    }
}
public class CircleSJ {
    public static void main(String[] args) {
        CircleSJ2 myCircle = new CircleSJ2(10.0);
        CircleSJ2 yourCircle = new CircleSJ2(5.0);

        System.out.println("원의 개수: " + CircleSJ2.numOfCircles);
        System.out.println("원의 개수: " + yourCircle.numCircles);
    }

    void print(){
        System.out.println("인스턴스 메서드");
    }
}
