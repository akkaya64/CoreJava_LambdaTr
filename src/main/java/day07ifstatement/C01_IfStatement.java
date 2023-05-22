package day07ifstatement;

import java.util.Scanner;

public class C01_IfStatement {

    public static void main(String[] args) {

        // if it rains, I will cancel the picnic (eğer yağmur yağarsa pikniği iptal edeceğim.)
        // koşul verildiyse "if" kullan

        //Ex 1: Verilen karakter büyük harf ise ekrana "Büyük Harf" yazdıran kodu oluşturunuz.

        char ch = 'S';

        if(ch>='A'&& ch <= 'Z'){
            System.out.println("Büyük Harf");//&& ifadesini kullan doğru mu değil mi mantık operatörü
        }


        //Ex 2: verilen bir sayı çift sayı ise ekrana çift sayı yazdıran kodu oluşturunuz.
        int sayi = 6;

        if (sayi % 2 == 0 ){
            System.out.println("Çift Sayı");

        }

        //Ex 3: Verilen bir sayı 300 den küçük veya 1200den büyük ise ekrana "Harika Sayı" yazdıran kodu oluşturunuz.
        int sy = 65;
        if (sy < 300 || sy > 1200 ){
            System.out.println("Harika Sayı ");
        }

        //Ex 4: kullanıcıdan alınan sayını tek mi çift mi olduğunu ekrana yazdıran kodu yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int num = input.nextInt();

        //1. Yol; burada iki kontrol yapıldı if'lerle.
        if(num % 2 ==0){
            System.out.println("Girilen sayı cift");
        }
        if (num % 2!=0){
            System.out.println("Girilen sayı tek");
        }

        //2. Yol; burada tek kontrol yapılıyor else ile.
        if(num %2 ==0){
            System.out.println("Çift sayı");
        }else {  //else diğer tüm ihtimaller

            //burada conditional (kontrol) yok, tek kontrol var. Java'ya az iş yaptırdık.
            System.out.println("Tek sayı");
        }

        //Ex 5: verilen bir sayının negatif, pozitif ya da nötr olduğunu söyleyen kodu yazınız.
        int numara = 156;
        if(numara < 0 ){
            System.out.println("Negatif Sayı");
        }else if(numara ==0){
            System.out.println("Nötr Sayı");
        }else {
            System.out.println("Pozitif Sayı");
        }

















    }



}
