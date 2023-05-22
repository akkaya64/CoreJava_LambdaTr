package zoomcalisma.localdate;

import java.time.LocalDate;

public class Ex09 {
    /*
   Belirli bir yılın "Artık yıl" olup olmadığını kontrol etmek için kodu yazınız.

   i) Bir yıl 100'e ve 400'e tam bölünüyorsa buna artık yıl denir. Örneğin; 2000 artık yıl, 1900
   değildir.
           ii) Bir yıl 100'e ve 4'e tam bölünemiyorsa artık yıl olarak adlandırılır. Örneğin; 2004 artık yıl, 2007
   değildir
   */
    public static void main(String[] args) {

        LocalDate tarih= LocalDate.of(2010,02,15);
        boolean artikYil=tarih.isLeapYear();
        System.out.println("Artik Yil : " + artikYil);
        if(artikYil){
            System.out.println("Artik yil");
        }else{
            System.out.println("Artik Yil degildir");
        }
    }
}
