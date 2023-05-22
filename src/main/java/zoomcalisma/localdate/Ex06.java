package zoomcalisma.localdate;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Ex06 {


    //Kendinizin ve çocuğunuzun doğum tarihi için Tarih Değerleri oluşturup, ardından farkı gün
    //olarak hesaplayınız.

    public static void main(String[] args) {

        LocalDate ali = LocalDate.of(2001, 9, 19);
        LocalDate aliCocuk = LocalDate.of(2009, 12, 02);
        long fark = ChronoUnit.DAYS.between(ali, aliCocuk);
        System.out.println(fark);

        Period diff = Period.between(ali, aliCocuk);
        System.out.println(diff);

        System.out.println(aliCocuk.compareTo(ali));

        int farkYil = ali.getYear() - aliCocuk.getYear();
        System.out.println(farkYil);


    }
}
