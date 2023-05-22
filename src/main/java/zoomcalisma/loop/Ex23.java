package zoomcalisma.loop;

import java.util.Scanner;

public class Ex23 {

    /*
    Asal sayı olup olmadığını kontrol etmek için kullanıcıdan bir tam sayı girmesini isteyiniz.
Örnek: kullanıcı 43 girerse çıktı “43 bir asal sayıdır”, kullanıcı 120 girerse “120 asal değildir”
olur, kullanıcı negatif tam sayılar girerse çıktı “Pozitif bir tam sayı giriniz” şeklinde kullanıcıyı
yönlendiriniz
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir tam sayi giriniz");
        int sayi = input.nextInt();

        int sayac =0;

        if (sayi>1){
            for (int i=1; i<=sayi; i++){

                if (sayi%i==0){
                    sayac++;
                }

            }
            if (sayac>2){
                System.out.println("asal sayi değildir");

            }else System.out.println("asal sayidir");



        }else System.out.println("Birden büyük bir tam sayı giriniz");






    }
}
