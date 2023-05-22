package practice.daytime03;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class C01_StringManipulations {

    public static void main(String[] args) {
       /*

        String Class Methodlari
        1)equals(): i)Iki tane String'in ayni olup olmadigini anlamamiza yarar.
                    ii)equals() method'u "boolean" return eder.

        2)equalsIgnoreCase(): i) Iki tane String'in ayni olup olmadigini buyuk harf
                                kucuk harfe dikkat etmeden anlamamiza yarar.
                              ii) equalsIgnoreCase() method'u "boolean" return eder.

        3)toLowerCase(): i)Bir String'deki tum harfleri kucuk harfe cevirmek icin kullanilir.
                         ii) toLowerCase() method'u "String" return eder

        4)toUpperCase(): i)Bir String'deki tum harfleri buyuk harfe cevirmek icin kullanilir.
                         ii) toUpperCase() method'u "String" return eder

        5)charAt(): i) Bir String'den belli bir index'deki characteri almak icin kullanilir.
                    ii) charAt() method'u "char" return eder.

        6)length(): i) Bir String'de kac tane character kullanildigini ogrenmek icin kullanilir
                    ii) length() method'u "int" return eder.

        7)contains(): i)Bir String'de belli bir characterin veya
                        characterlerin var olup olmadigini anlamak icin
                        kullanilir
                      ii) contains() method'u "boolean" return eder.

        8)split(): i)Bir String'i istedigimiz character'den parcalamaya yarar
                   ii)split() method'u "Array" return eder.

        9)replace () i)Metin icerisindeki karakter ya da karakterlerin,
                       istenilen karakter ya da metinle degistirilmesini saglar.
                       Sonuc String'dir..

        10)replaceFirst()  i) Replace ile aynı sadece ilk bulunan karakteri değiştirir
     */


        /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
         1) \\d    ==> tum rakamlar (digit)
             \\D    ==> tum rakam disi character ler

         2) \\w   ==> A->Z        a->z         0->9    _tum buyuk, kucuk harf ve rakamlar
             \\W  ==> A->Z        a->z         0->9    _ disindaki hersey

         3) \\s   ==> space tum bosluklar
             \\S   ==> space disindaki hersey

               12) + Concat: Bir String'e diğerini ekler.
            Concatenation : Java'da + islemi yapilirken eger toplanan ifadelerden biri veya
            her ikisi String ise Java toplama degil BIRLESTIRME==YANYANA yazdirma yapar.

        ONEMLI NOT=JAVA YUKARIDAN ASAGI SOLDAN SAGA CALISIR.

         */

        //Ex 1:
        System.out.println(15 + 20+"Merhaba");//35Merhaba
        System.out.println("Merhaba"+15+20);//Merhaba1520
        System.out.println("Merhaba"+(15+20));//Merhaba35
        System.out.println("Merhaba"+(15*20));//Merhaba300

        //Kullanıcıdan ismini ve soyismini girmesini isteyin, konsola kullanıcı nasıl girerse girsin konsolda
        // büyük harfle yazılmasını saağlayın.
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen isminizi ve soyisminizi giriniz...");
        String name = input.nextLine(),soyAd = input.nextLine();//multiple declaration = çoklu tanımlama araya virgül koyulur, noktalı virgül değil
       // String soyAd = input.nextLine();
        String tamIsim = name.concat(" "+soyAd).toUpperCase();
        System.out.println(tamIsim);


        //Rakam haricindekileri silin
        String str = "45.99 $";

        str = str.replaceAll("\\D", "");
        System.out.println(str);//4599

        //Verilen bir cümleyi "*" ile gizleyin.10. karakterden sonrasını yazdırın.

        String cumle = "Her dert Java gibi olsa";
        System.out.println(cumle.replaceAll("\\w","*") + cumle.substring(10));


        // a harfi yerine "@" işareti yerleştiriniz.
        String kelime = "olaganustu";
        System.out.println(kelime.replace("a","@"));

        //txt'deki tüm a'ları e yapın
        String txt = "Merhaba Dunya";
        System.out.println(txt.replace("a","e"));

        //txt'deki ilk bulunan a'yi e yapın
        System.out.println(txt.replaceFirst("a","e"));

        //"kalem yerine "dolma" yazdırın
        String str1= "Dolma kalem ile bir dünya kalem aldık";
        System.out.println(str1.replaceAll("kalem","biber"));

        String str3 = "Bugün hava yağmurlu";
        System.out.println(str3.length());//19. length() 1 den başlar, boşluklar dahil.


        String str4 = "";
        System.out.println("str4.length() = "+ str4.length());//0

        String str5 = " ";
        System.out.println("str5.length() = "+ str5.length());//1

        //Kullanıcıdan isim ve soyisim girmesini isteyin. hangisini daha uzun olduğunu yazdıran kodu oluşturunuz.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen isim ve soyisminizi giriniz. \n isim:");
        String name1 = scanner.next();

        System.out.println("soyisim : ");
        String surName1 = scanner.next();

        boolean a = name1.length() > surName1.length();
        if(a){
            System.out.println("İsminizin uzunluğu soyisminizin uzunluğundan büyük..");

        }else if (name1.length()==surName1.length()){
            System.out.println("İsminiz ve soyisminiz aynı uzunlukta..");//== yaptık çünkü zaten karakter sayısı olduğu için eşittir olabilir, ignorCase olmaz.

        }else{
            System.out.println("Soyisminizin uzunluğu isminizin uzunluğundan büyük..");
        }
















    }



}
