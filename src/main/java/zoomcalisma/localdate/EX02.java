package zoomcalisma.localdate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class EX02 {

    // Ali'nin kaç ay yaşadığını bulan kodu yazınız.
    //Ali'nin doğum tarihi 4 Haziran 1997'dir.

    public static void main(String[] args) {

        LocalDate aliDg = LocalDate.of(1997, 6, 4);
        LocalDate bugun = LocalDate.now();
        long yasadigiAy = ChronoUnit.MONTHS.between(aliDg, bugun);
        System.out.println(yasadigiAy);
    }
}
