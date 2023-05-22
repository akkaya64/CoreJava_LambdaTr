package zoomcalisma.localdate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ex01 {
    //  Ali'nin kaç gün yaşadığını bulan kodu yazınız.
    //Ali'nin doğum tarihi 12 Mayıs 2002'dir

    public static void main(String[] args) {

        LocalDate aliDg = LocalDate.of(2002, 05, 12);
        LocalDate bugun = LocalDate.now();

        long yasadigiGunSayisi = ChronoUnit.DAYS.between(aliDg, bugun);
        System.out.println(yasadigiGunSayisi);
    }
}
