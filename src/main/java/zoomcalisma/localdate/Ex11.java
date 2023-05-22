package zoomcalisma.localdate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ex11 {
    public static void main(String[] args) {
        //İki farklı tarih için saat farkını bulunuz.

        LocalDate tarih1 = LocalDate.of(1999, 12, 15);
        LocalDate tarih2 = LocalDate.of(2000, 8, 15);

        long fark = ChronoUnit.DAYS.between(tarih1, tarih2);
        System.out.println("fark:" + (fark * 24));

    }
}
