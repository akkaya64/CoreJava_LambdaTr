package zoomcalisma.localdate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex07 {

    // Belirli bir tarihte yılın son 2 hanesini alınız

    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();
        System.out.println(tarih);
        int a = tarih.getYear() % 100;
        System.out.println(a);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy");
        System.out.println(dtf.format(tarih));


    }
}
