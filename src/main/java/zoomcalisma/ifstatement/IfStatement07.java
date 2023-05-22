package zoomcalisma.ifstatement;

import java.util.Scanner;

public class IfStatement07 {
    /*
    Tam isim için dilbilgisi kurallarını kontrol etmek için kodu yazınız.

    a) Kodunuz "ali Can", "Ali can", "ali can" için "Baş harflerinde hata" yazmalıdır.
    b) Kodunuz, aşağıdaki gibi tek kelimeler için "Ad veya soyadı eksik" yazmalıdır.
    c) "Ali" veya "Can" veya "ali" Kodunuz "ALI CAN" gibi tüm formatlar için "Format hatası" yazmalıdır.
    d) Kodunuz bir veya daha fazla boşluk (" " veya " " gibi karakterler) için " Isim girilmedi"
    yazmalıdır.
    e) Ad, harfler ve boşluktan başka herhangi bir karakteri içeriyorsa, kodunuz "Geçersiz Ad"
    yazmalıdır.

    Not : Kısaltmada 1'den fazla hata varsa, ilgili tüm hata mesajları çıktı olarak konsolda
    görünmelidir. Örneğin; "ali3" için kodunuz "Baş harflerinde hata", "Ad veya soyadı eksik" ve
    "Geçersiz Ad"
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Tam isminizi giriniz");
        String isim = input.nextLine();
        String str = isim.substring(isim.indexOf(" ") + 1);
        String a = isim.toUpperCase();
        String b = isim.toLowerCase();

        boolean basHarfler = (isim.charAt(0) >= 'A' && isim.charAt(0) <= 'Z') && str.charAt(0) >= 'A' && str.charAt(0) <= 'Z';


        if (!basHarfler) {
            System.out.println("Baş harflerinde hata");

        }

        if (isim.split(" ").length <= 1) {
            System.out.println("Ad veya soyadı eksik");

        }
        if (a.equals(isim) || b.equals(isim)) {
            System.out.println("Format hatası");

        }

        //    e) Ad, harfler ve boşluktan başka herhangi bir karakteri içeriyorsa, kodunuz "Geçersiz Ad"
        //    yazmalıdır.

        if (isim.replaceAll("[\\s]","").length()==0){

            System.out.println("Isim girilmedi");
        }

        if (isim.replaceAll("[a-zA-Z ]","").length()>0){
            System.out.println("Geçersiz ad");

        }


    }


}
