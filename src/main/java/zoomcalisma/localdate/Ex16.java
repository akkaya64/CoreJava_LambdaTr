package zoomcalisma.localdate;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Ex16 {
    public static void main(String[] args) {
        //Mark 23.02.2018 tarihinde saat 15:25'te GMT ' de doğmuştur, Mark'ın Japonya'daki tam
        //doğum tarihi ve saati nedir?

//        LocalDateTime mark=LocalDateTime.of(2018,2,23,15,25,0);
//        ZonedDateTime mark1=ZonedDateTime.of(mark, ZoneId.of("GMT"));
//        ZonedDateTime mark2=ZonedDateTime.of(mark, ZoneId.of("Asia/Tokyo"));
//        System.out.println(mark1);
//        System.out.println(mark2);

        LocalDateTime dogumTrhTokyo = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dogumTrhTokyo);
        LocalDateTime dogumTrhGMT = LocalDateTime.now(ZoneId.of("GMT"));
        System.out.println(dogumTrhGMT);
        long saatFarki = ChronoUnit.HOURS.between(dogumTrhGMT, dogumTrhTokyo);
        System.out.println(saatFarki);
        LocalDateTime dogumTrhMark = LocalDateTime.of(2018, 2, 23, 15, 25, 0).minusHours(saatFarki);
        System.out.println("Tokyo daki dogum tarihi : " + dogumTrhMark);

    }
}
