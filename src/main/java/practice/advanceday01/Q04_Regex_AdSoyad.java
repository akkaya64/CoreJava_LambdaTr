package practice.advanceday01;

import java.util.Scanner;

public class Q04_Regex_AdSoyad {
    public static void main(String[] args) {

         /*
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       Örn:
       Ad: Ali
       Soyad: Can
       */

        Scanner input = new Scanner(System.in);
        System.out.println("ad ve soyadinizi giriniz");

        String adSoyad = input.nextLine().replaceAll("[^a-zA-Z ]","").replaceAll("\\s+"," ").trim().toLowerCase();
        System.out.println("adSoyad = " + adSoyad);//adSoyad = ali can

        String ad = adSoyad.split(" ")[0];
        String soyAd = adSoyad.split(" ")[1];
        String adIlkHarf = adSoyad.substring(0,1).toUpperCase();
        String soyadIlkHarf = soyAd.substring(0,1).toUpperCase();

        String adHepsi = adIlkHarf+ad.substring(1);
        String soyadHepsi = soyadIlkHarf+soyAd.substring(1);

        System.out.println("Ad: "+adHepsi);//Ad: Ali
        System.out.println("Soyad: "+soyadHepsi);//Soyad: Can



    }
}
