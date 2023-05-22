package day05typecastingstringmanipulations;

public class StringManipulations01 {

    //String bir non primitive data type'idir ve aynı zamanda bir class'dır.

    public static void main(String[] args) {

        String s = "Java is easy";

        //Example1: "s" Stringindeki tüm karakterleri büyük harf yapınız?
        String sUpper= s.toUpperCase();
        System.out.println(sUpper);// JAVA IS EASY

        //Example2; "s" Stringindeki tüm karakterleri küçük harf yapınız?
        String sLower = s.toLowerCase();
        System.out.println(sLower);//java is easy

        //Example3: "s" Stringindeki ilk karakteri alınız?
        char firtChar = s.charAt(0);
        System.out.println(firtChar);

        //Example4: "s" Stringindeki ikinci ve sondan ikinci karakteri alınız ve ekrana yan yana yazdırınız?
        char secondChar = s.charAt(1);
        System.out.println(secondChar);//a

        char secondLastChar = s.charAt(10);//s
        System.out.println(secondLastChar);

        //1.Yol: Aynı satırda yazdırmak için ilkine "ln" yazma
        System.out.print(secondChar);
        System.out.println(secondLastChar);

        //2.Yol: Aynı satırda yazdırmak için
        System.out.println(""+ secondChar + secondLastChar );

        //Example5: "s" Stringinde kullanılan karakter sayısını bulunuz? (harfleri sayarken  1 den saymaya başlarsın soldan. index sayarken 0 dan başlarsın)
        int sLength = s.length();
        System.out.println(sLength); //12

        //Example6: "s" Stringindeki ilk 4 karakteri alınız?
        //substring(0,4) ===> "0" yani ilk index dahil, "4" yani ikinci index hariçdir.[0,4)
        String sub1 = s.substring(0,4);
        System.out.println(sub1);

        //Example7: "s" Stringindeki "is" kelimesini  alınız?
        String sub2 = s.substring(5,7);
        System.out.println(sub2);

        //Example8: "s" Stringindeki "easy" kelimesini  alınız?
        String sub3 = s.substring(8,12);
        System.out.println(sub3);

        //NOTE: Bir karakterden başlayıp Stringin sonuna kadar almak isterseniz, ikinci indexi yazmayınız
        String sub4 = s.substring(8); //bir stringin bir bölümünü parcasını alırız bu methodta
        System.out.println(sub4);

        //Example9: "s" Stringinde "money" olup olmadığını kontrol ediniz?
        boolean isExist= s.contains("Java"); //bu method hiç bir şey yazmazsan da kullanılır, tek karakter girince de çalışır
        System.out.println(isExist);

        /*
        Bir methodu öğrenirken 3 şeyi mutlaka öğrenin;
        1) bu method ne iş yapar?
        2) bu methodun farklı kullanımları nasıldır?
        3) bu method size ne return (sonuç) eder?
         */

        //Example10: "s" Stringinin belli bir harfle başlayıp başlamadığını kontrol ediniz?
        boolean isStart = s.startsWith("Java");//benim string Java kelimesi ile başlar diyor. Start within içine ister 1 ister çoklu karakter koy çalışır.
        System.out.println(isStart);//true

        //Example11: "s" Stringinin 6. characterden itibaren belli bir harfle başlayıp başlamadığını kontrol ediniz? (karakter diyosa 1den başla, index diyorsa 0dan)
        boolean isBegin = s.startsWith("i",5);// burda 5 dediğimiz stringdeki ilk 5 karakteri çöpe atıyor geriye kalanı kullanıyor. bunların arasından  "i" ile başlıyor mi diye bakıyor.
        System.out.println(isBegin);


















    }
}
