package zoomcalisma.localdate;

import java.time.LocalTime;

public class Ex12 {
    public static void main(String[] args) {
        /*
        Eğer saat
        i) 24:00 ile 05:00 arasında ise konsola 'Uyku zamanı' yazdırınız.
        ii) 08:00 ile 16:00 arasında ise konsola 'Çalışma zamanı' yazdırınız.
        iii) 19:00 ile 22:00 arasında ise konsola 'Aile zamanı' yazdırınız.
        iv) Diğerleri için konsolda 'Kişisel zaman' yazdırınız.
         */

        LocalTime saat = LocalTime.now();

        if (saat.isAfter(LocalTime.of(23, 59, 59)) && saat.isBefore(LocalTime.of(5, 0, 0))) {
            System.out.println("Uyku zamani");
        } else if (saat.isAfter(LocalTime.of(8, 0, 0)) && saat.isBefore(LocalTime.of(16, 0, 0))) {
            System.out.println("Calisma Zamani");
        } else if (saat.isAfter(LocalTime.of(19, 0, 0)) && saat.isBefore(LocalTime.of(22, 0, 0))) {
            System.out.println("Aile Zamani");
        } else {
            System.out.println("kisisel Zaman");
        }

//        LocalTime saat=LocalTime.now();
//       int yeniSaat=saat.getHour();
//        System.out.println(yeniSaat);
//        if(yeniSaat>0 && yeniSaat<5){
//            System.out.println("Uyku Zamani");
//        } else if (yeniSaat > 8 && yeniSaat < 16) {
//            System.out.println("Calisma Zamani");
//        } else if (yeniSaat > 19 && yeniSaat < 22) {
//            System.out.println("Aile Zamani");
//        }else{
//            System.out.println("Kisisel Zaman");
//        }

    }
}
