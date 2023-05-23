package ch07;

class Starfish extends Shape{
    int a;

    public Starfish(int a) {
        this.a = a;
    }
    public void draw(){
        System.out.println("불가사리.. 그리다.");
    }
    public double findArea(){
        return pi * a;
    }

}

