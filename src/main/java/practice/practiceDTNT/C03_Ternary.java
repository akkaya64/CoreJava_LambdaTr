package practice.practiceDTNT;

import java.util.Scanner;

public class C03_Ternary {

    public static void main(String[] args) {

        /*
        Kullanıcıdan  0 dan büyük pozitif bir tam sayı girmesini isteyiniz
        Girilen pozitif tam sayı üç basamaklı ise ekrana "üç basamaklı" yazdırın
        Üç basamaklı değilse çift olup olmadığını kontrol edin.
        Çift ise "3 basamaklı olmayan çitf sayı" yazdırın
        Cift değilse "3 basamaklı olmayan tek sayı" yazdırın.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen pozitif tam sayı girin...");
        int sayi = input.nextInt();

        //if ile çözümü:
        if(sayi>0){

            boolean sifirdanBuyukUcBas = sayi>99 && sayi<1000;
            boolean sifirdanBuyukUcBasOlmayanCift = !(sayi>99 && sayi<1000) && sayi %2==0;

            if(sifirdanBuyukUcBas){
                System.out.println("Üç basamaklı sayı");
            }else if(sifirdanBuyukUcBasOlmayanCift){
                System.out.println("Üç basamaklı olmayan pozitif çift sayı");

            }else{
                System.out.println("Üç basamaklı olmayan pozitif tek sayı");
            }

        }else{
            System.out.println("Lütfen pozitif bir tam sayı giriniz");
        }

        //Ternary ile çözümü:

        boolean sifirdanBuyukUcBasTer = sayi>99 && sayi<1000;
        boolean sifirdanBuyukUcBasOlmayanCiftTer = !(sayi>99 && sayi<1000) && sayi %2==0;

        //şart       ?     true action      : false action  ;

        String sonuc = sayi>0  ? sifirdanBuyukUcBasTer ? ("Üç basamaklı sayı") : sifirdanBuyukUcBasOlmayanCiftTer ? ("Üç basamaklı olmayan çitf sayı"): ("Üç basamaklı olman tek sayı")
                : ("Lütfen pozitif bir tam sayı giriniz");
        System.out.println(sonuc);















    }






}
