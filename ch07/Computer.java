package ch07;

public class Computer implements Controllable {
    @Override
    public void turnOn(){
        System.out.println("컴퓨터 켠다");
    }

    @Override
    public void turnOff() {
        System.out.println("컴퓨터 끈다");
    }
}
