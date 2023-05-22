package day22staticblocksconstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import java.util.Date;

public class DateTime01 {
    public static void main(String[] args) {
        //Date Class
        Date myDate = new Date();//date objesi olusturdum
        System.out.println(myDate);//Sat Jan 07 23:26:22 EET 2023
        System.out.println(myDate.getTime());//1673123314648==> 1Ocak 1970'den su ana kadarki mili saniye miktari
                                             //getTime() milisaniyeyi verir.
                                             //uniq bir sey mili saniye oldugu icin geciyor hep

        //Icinde bulundugumuz an nasil alinir? (currentTime)
        System.out.println(LocalDate.now());//2023-01-07 //LocalDate().nowicinde bulundugunuz simdiki an'i vericek

        System.out.println(LocalTime.now());//23:34:42.481201300 saat dk saniye nanosaniye olarak verdi LocalTime.now()

        System.out.println(LocalDateTime.now());//2023-01-07T23:36:00.226183900 bulundugun yerin tarih ve zamanini verdi

        //Dunyanin herhangi bir saat dilimindeki saati nasil aliriz?
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Vienna"))); //2023-01-07T21:46:03.823077500
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Moscow"))); //2023-01-07T23:46:03.824073500
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo")));//2023-01-08T05:44:28.821528600
                                                                                        //istedigin bolgenin saat ve tarihini ogrenmek icin
        //Ileriki bir tarihe nasil gidilir. plus(0 methodlari ile
        System.out.println(LocalDate.now().plusYears(7).plusMonths(5).plusDays(35));//2030-07-12

        //Geriki bir tarihe nasil gidilir. plus() methodlari ile
        System.out.println(LocalDate.now().minusYears(4).minusMonths(3).minusDays(2));//2018-10-05

        //Ileriki bir zamana nasil gidilir
        System.out.println(LocalTime.now().plusHours(3));

        //Geriki bir zamana nasil gidilir
        System.out.println(LocalTime.now().minusMinutes(45));//23:13:14.460986600

        //Zamanda belli bir bolumu nasil aliriz
        System.out.println(LocalTime.now().getHour() + " : " + LocalTime.now().getMinute());

        //Tarihte belli bir bolumu nasil aliriz
        System.out.println(LocalDate.now().getMonthValue() + " : " +  LocalDate.now().getDayOfMonth());//1 : 8  getmont isim olarak verir, getmontvalue sayi olarak verir


        //Example 7 : Iki cocugumuzun dogum tarihleri arasindaki farki gun olarak hesaplayan kodu yaziniz
//        LocalDate dobAli = LocalDate.of(2005,5,17);
//        LocalDate dobVeli = LocalDate.of(2013,2,8);
//
//        Long diff =  ChronoUnit.DAYS.between(dobAli, dobVeli);
//        System.out.println(diff);//2824
        //02/13/2005 - 03/01/2007

        //Iki tarih nasil karsilastirilir isBefore() - isAfter()
        boolean resault = LocalDate.of(2005,02,13).isAfter(LocalDate.of(2007,03,01));
        System.out.println("resault = " + resault);//resault = false

        //Tarihlerin formatlari nasil degistirilir
        //M ==> tek rakamla ay no'sunu yazar
        //MM==> iki rakamla ay no'sunu yazar
        //MMM==> ay isminin ilk uc harfini yazar
        //MMMM==> ay isminin tamamini yazar

        //d ==> tek rakamla gun no'sunu yazar
        //dd ==> iki rakamla gun no'sunu yazar

        //yy ==> yilin son iki rakamini yazar
        //yyyy ==> yilin tamamini yazar
        DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("dd/MM/yyyy");//2 haneli gun , 2 haneli ay, 4 haneli yil olsun tarih kalibim bu olacak diyorum
        System.out.println(dtf.format(LocalDate.now()));//08/01/2023 //simdiki tarihe formati uygula dedik



    }










}
