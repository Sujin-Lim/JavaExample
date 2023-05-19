
// TODO: 2023-05-16 Sujin-Lim

package ch0203;

public class While2 {
    public static void main(String[] args) {
        int row = 1;

        while (row < 20){
            int column = 1;
            while (column < 20) {
                System.out.printf("%-2d X %2d = %3d\n", row, column, row * column);
                column++;
            }
            row++;
            }

        }
    }

