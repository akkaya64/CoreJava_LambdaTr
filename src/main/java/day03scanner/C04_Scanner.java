package day03scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        //kullanıcıdan alacağınız beş basamaklı bir sayının ilk iki ve son iki basamağındaki rakamları toplamını yazdıran kodu yazınız?
        //12345 rakam
        //*****bir sayının son rakamını alabilmek için o sayıyı 10a bölün ve kalana bakın****
        //*****bir tam sayıyı bir tam sayıya bölerseniz java sonucu kesinlikle tam sayı yapar.
        //***** java sayıyı nasıl son sayı yapar? ondalık kısmı iptal eder.

        Scanner input= new Scanner(System.in);

        System.out.println("beş basamaklı sayıyı giriniz?");
        int num= input.nextInt();//12345

        int ilkIkiRkm= num/1000;
        System.out.println(ilkIkiRkm);//ilk iki rakamı görcez

        int ilkIkiTop= (ilkIkiRkm % 10)+(ilkIkiRkm/10);
        System.out.println("ilkIkiTop = " + ilkIkiTop);

        int sonIkiRkm= num%100;// kalanda 45 i görcez yani son iki basamak için oyüzden %100 yaptık
        System.out.println("sonIkiRkm = " + sonIkiRkm);

        int sonIkiRkmTop= (sonIkiRkm %10)+( sonIkiRkm/10);//45i rakamlara bölmek için kalana ihtiyaç var %10 yaptık sonra 45i rakamlara bölmek için  gene /10 yaptık bu bölümde bulunur
        System.out.println("sonIkiRkmTop=" + sonIkiRkmTop);

        int toplam= ilkIkiTop+sonIkiRkmTop;
        System.out.println("toplam= " + toplam );

















    }



}
