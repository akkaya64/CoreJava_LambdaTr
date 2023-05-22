package zoomcalisma.localdate;

import java.time.LocalDate;

public class Ex05 {

    //Veli, Ali'den 3 yıl 11 gün sonra doğmuştur.
    //Ali size doğum tarihi bilgisini 24 Kasım 2012 olarak vermiştir.
    //Veli'nin doğum tarihini hesaplamak için gerekli kodu yazınız

    public static void main(String[] args) {

        LocalDate Ali = LocalDate.of(2012, 11, 24);
        LocalDate Veli = Ali.plusYears(3).plusDays(11);
        System.out.println(Veli);


    }
}
