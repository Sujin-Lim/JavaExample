package ch0203;

public class DoWhile {
    public static void main(String[] args) {
        int row = 1;
        do{
            int column = 1;
            do{
                System.out.printf("%-2d X %2d = %3d\n", row, column, row * column);
                column++;
            } while (column < 20);
            row++;
        } while (row < 20);

    }
}
