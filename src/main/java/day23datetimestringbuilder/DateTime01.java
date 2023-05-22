package day23datetimestringbuilder;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime01 {

    public static void main(String[] args) {
        //Ex 1: Time'ı formatlayınız.
        LocalTime myTime = LocalTime.now();//bulunduğun yerdeki anlık zamanı vercek
        System.out.println("myTime = " + myTime);//myTime = 21:38:31.147432100
        //hh==> 12lik saat dilimini kullanir    HH==> 24LUK SAAT SISTEMINI KULLANIRLAR
        //hh kullandiginizda am veya pm demek zorundasiniz bunu demek icin "a" yazmaniz yeterlidir Yani hh:mm a

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh-mm-ss a");
        System.out.println(dtf.format(myTime));//09-41pm


    }


}
