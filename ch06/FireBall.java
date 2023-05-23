package ch06;

public class FireBall extends Circle {
    private String color;
    public FireBall(String color){
        this.color = color;
    }
    public void findColor(){
        if (color.equals("빨간색")) {
            System.out.println("온도가 200도 이상");
        }
        else
            System.out.println("온도가 1000도 이상");
    }
}
