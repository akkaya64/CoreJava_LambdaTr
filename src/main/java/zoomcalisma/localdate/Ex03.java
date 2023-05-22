package zoomcalisma.localdate;

import java.time.LocalDate;

public class Ex03 {
    // Ali'nin doğum tarihi 4 Haziran 1997'dir. Ali'nin doğum tarihinden 2 yıl, 3 ay ve 12 gün
    //sonraki tam tarihi bulmak için kodu yazınız.
    public static void main(String[] args) {


        LocalDate dogumTarihi = LocalDate.of(1997, 6, 04);
        LocalDate tarih = dogumTarihi.plusDays(12).plusYears(2).plusMonths(3);
        System.out.println(tarih);


    }
}
