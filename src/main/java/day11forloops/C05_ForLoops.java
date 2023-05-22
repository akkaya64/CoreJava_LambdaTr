package day11forloops;

import java.util.Scanner;

public class C05_ForLoops {

    public static void main(String[] args) {
         //5'ten 10'a kadar tam sayıların toplamını bulan kodu yazınız.
        int num = 0 ;
        for (int i = 5; i < 11; i++) {
            //num=num+i;
            num+=i;
        }
        System.out.println("5ten 10'a kadar sayıların toplamı "+  num);//45


        //6'dan 3'e kadar tam sayıların çarpımını bulan kodu yazınız.
        int sayi = 1;
        for (int i = 6; i >2 ; i--) {
            sayi*=i;
        }
        System.out.println(sayi);

        //bir tam sayının rakamlarının toplamını bulan kodu yazınız.
        //2543 ==> 2+5+4+3=14

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 4 basamaklı rakam giriniz..");
        int sayi1 = input.nextInt();
        sayi1 = Math.abs(sayi1);//kullanıcı eksi bir sayı girmesin diye, eğer girerse eksi sayı artı olarak dönüşecek.

        int sonuc = 0;//toplamada sayıyı değiştirmesin diye 0 veriyoruz.
        for (int i = sayi1; i >0 ; i= i/10) {

            sonuc = sonuc+i%10;
        }
        System.out.println(sonuc);














    }
}
