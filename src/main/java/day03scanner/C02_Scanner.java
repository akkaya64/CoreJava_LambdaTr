package day03scanner;

import java.util.Arrays;
import java.util.Scanner;

public class C02_Scanner {
    //Scanner classi kullanıcı ile etkileşim kurmamızı sağlar.
    //Scanner bir class'tır Java util kütüphanesinden getirildiği için import ister.

    public static void main(String[] args) {

        /* Kullanıcıdan data almak için, sistemin içerisine dahil etmek için (System.in) yazarız eşittirden sonra
        1)Scanner class'ından obje oluşturun
        2)Kullanıcıya ne yapacağını söyle sout yaz
        3)kullanıcıdan aldığınız datayı variable içine koyun
        */

        Scanner input = new Scanner(System.in); //objenin ismi "input" yaptım çünkü bu obje kullanıcıdan alınan datayı benim kodlarımın içine koyacak.
        // Scanner scan = new Scanner(System.in);

        System.out.println("lütfen yaşınızı giriniz");
        byte age= input.nextByte();


        //Soru: kullanıcıya ad, soyad, yaş, boy, memleket, yaşadığı yeri sevip sevmediğini soran bir program yazınız?

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        String isim= scan.nextLine(); // kullanıcıdan String bir değer istedik, tüm satırı alması için nextLine seçtik
        System.out.println("memleketinizi giriniz");
        String memleket= scan.next();
        System.out.println("lütfen yaşınızı giriniz");
        byte yas= scan.nextByte();
        System.out.println("lütfen boyunuzu giriniz?");
        double boy= scan.nextDouble();


        System.out.println("*************");
        System.out.println("memleket = " + memleket);
        System.out.println("yas = " + yas);
        System.out.println("isim = " + isim);
        System.out.println("boy = " + boy);











    }

}
