package ch0203;

public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i%2==1)
                continue;
            System.out.println(i);
        }
        char c = 'a';
        while (c <= 'z') {
            System.out.print(c++);
        }
        int j = 0;
        for (j = 0; j <3 ; ++j) {
            System.out.println(j);
        }
        System.out.println(j);
    }
}
