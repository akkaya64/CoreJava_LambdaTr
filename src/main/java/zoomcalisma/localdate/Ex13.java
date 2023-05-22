package zoomcalisma.localdate;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Ex13 {
    public static void main(String[] args) {
        //Japonya saat dilimi ile Almanya saat dilimi arasındaki saat farkını bulmak için kodu yazınız

        LocalDateTime japonya = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime almanya = LocalDateTime.now(ZoneId.of("Europe/Berlin"));

        long fark = ChronoUnit.HOURS.between(almanya, japonya);
        System.out.println("fark : " + fark);
    }
}
