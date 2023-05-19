package ch0203;

import java.util.Scanner;

public class rsp {
    public static void main(String[] args) {
        String a, b, c;
        Scanner in = new Scanner(System.in);
        System.out.print("철수: ");
        a = in.next();
        System.out.print("영희: ");
        b = in.next();

        if(a.equals("r")){
            if(b.equals("r"))
                System.out.println("무승부");
             else if (b.equals("s"))
                System.out.println("철수 승");
            else
                System.out.println("영희 승");
            }

        else if (a.equals("s")) {
            if(b.equals("r"))
                System.out.println("영희 승");
            else if (b.equals("s"))
                System.out.println("무승부");
            else
                System.out.println("철수 승");
        }

        else{
            if(b.equals("r"))
                System.out.println("철수 승");
            else if (b.equals("s"))
                System.out.println("영희 승");
            else
                System.out.println("무승부");
    }
    }
}
