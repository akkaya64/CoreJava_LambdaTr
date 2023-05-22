package day20pasbyvalueowerloading;

import java.util.Arrays;

public class C03_PassByValueArray {

    public static void main(String[] args) {

 /*
       bir array oluşturalım.
       sonra array elemanlarını  elemanDegistir methodu yazıp orada
       array elemanlarından bazılarını degiştirelim.
       method void olsun.
       main methoda döndükten sonra yeniden array'i yazdıralım
       */

        int  sayilar[] ={3,4,5,6};
        elemanDegistir(sayilar);
        System.out.println("main içinde eleman değişince sayılar[] = " + Arrays.toString(sayilar));//[10, 4, 5, 6]
        //0. index değişti eleman değişti yoksa listte array değişmedi orjinalliği duruyor

        arrayiDegistir(sayilar);
        System.out.println("main içindeki arrayi değiştir" + Arrays.toString(sayilar));//[10, 4, 5, 6] gene değişmez
        //Java array'da olsa list'te olsa eski değerini korur

    }//main

    private static void arrayiDegistir(int[] sayilar) {

        sayilar = new int [6];
        System.out.println("method içinde arrayi değiştir = " + Arrays.toString(sayilar));

    }

    private static void elemanDegistir(int[] sayilar) {
        sayilar[0] = 10;
        System.out.println("method içinde eleman değişince sayılar[] = " + Arrays.toString(sayilar));//[10, 4, 5, 6]


    }


}//class
