package zoomcalisma.localdate;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Ex14 {
    public static void main(String[] args) {

        //Ali 5 Şubat 2015 TRT 10:00'da İstanbul' da, Mark 5 Şubat 2015 12:00 EST' de ABD' de
        //doğmuştur. Ali'nin doğum saati ile Mark'ın doğum saati arasındaki saat cinsinden fark
        //nedir?

        ZonedDateTime ali = ZonedDateTime.of(LocalDate.of(2015, 2, 5), LocalTime.of(10, 0, 0), ZoneId.of("Europe/Istanbul"));
        ZonedDateTime mark = ZonedDateTime.of(LocalDate.of(2015, 2, 5), LocalTime.of(12, 0, 0), ZoneId.of("America/New_York"));
        System.out.println(ali);
        System.out.println(mark);

        long fark = ChronoUnit.HOURS.between(ali, mark);
        System.out.println(fark);

//        LocalDateTime ali = LocalDateTime.of(2015, 2, 5, 10, 0, 0);
//        LocalDateTime mark = LocalDateTime.of(2015, 2, 5, 12, 0, 0);
//        ZonedDateTime dogumTarihimark = mark.atZone(ZoneId.of("America/New York"));
//        ZonedDateTime dogumTarihiAli = ali.atZone(ZoneId.of("Europe/Istanbul"));

    }

}
