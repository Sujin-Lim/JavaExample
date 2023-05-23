package ch07;

public class TV implements Controllable {
    @Override
    public void turnOn(){
        System.out.println("TV 켠다");
    }

    @Override
    public void turnOff() {
        System.out.println("TV 끈다");
    }
}
