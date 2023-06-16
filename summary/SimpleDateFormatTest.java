
// p348 06

package summary;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) {
        Date now = new Date();

        SimpleDateFormat f1 = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
        System.out.println(f1.format(now));
        SimpleDateFormat f2 = new SimpleDateFormat("오늘은 M월의 d번째 날");
        System.out.println(f2.format(now));
        SimpleDateFormat f3 = new SimpleDateFormat("오늘은 y년의 D번째 날");
        System.out.println(f3.format(now));
    }
}
