package ch0203;

import java.util.Scanner;

public class GraduationSj {
    public static void main(String[] args) {
        int major = 0, liberal = 0, general = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("전공 학점: ");
        major = in.nextInt();
        System.out.print("교양 학점: ");
        liberal = in.nextInt();
        System.out.print("일반 학점: ");
        general = in.nextInt();

        boolean b = ((major+liberal+general)>=140) && (major >= 70) && ( (liberal >=30 && general >=30) || (liberal+general)>80 );
        System.out.println(b?"가능":"불가");

    }
}
