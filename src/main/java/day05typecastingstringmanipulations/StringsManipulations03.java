package day05typecastingstringmanipulations;

import java.util.Scanner;

public class StringsManipulations03 {

    public static void main(String[] args) {
        /*
           Example 1: Aşağıdaki kurallara göre kullanıcının girdiği password'u kontrol ediniz.
                      i) En az 8 karakter olsun.
                      ii) Space karakteri password'de olmasın.
                      iii) En az bir tane büyük harf olsun.
                      iv) En bir tane küçük harf olsun.
                      v) En az bir tane sembol olsun.
                      vi) En az bir tane rakam olsun.*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen passwordunuzu giriniz...");
        String pwd = input.nextLine();

        //i) En az 8 karakter olsun. (karakter sayısını length veriyor)
        boolean first = pwd.length()>7;
        System.out.println(first);

        //ii) Space karakteri password'de olmasın. ("contains" methodu kararter olup olmadığına bakar. space varsa true verir oyüzden başına ünlem işareti koyarız istemiyorsak. space karakteri içermesin anlamı olur.)
        boolean second = !pwd.contains(" "); // "!" koyunca space içermesin anlamında yani olumsuzluk anlamında.
        System.out.println(second);// boşluk girince "false" veriyor. boşluk koymayınca "true" veriyor.

        //iii) En az bir tane büyük harf olsun.
        //NOTE: Büyük harf olmayanları sil,
        //      kalan karakter sayısına bak
        //      karakter sayısı 0 ise büyük harf yok demektir,
        //      sıfırdan büyük ise büyük harf var demektir.

        boolean third = pwd.replaceAll("[^A-Z]", "").length()>0; //methodları aynı satırda yanyana kullanmaya "method chain" denir.
        System.out.println(third);

        //iv) En bir tane küçük harf olsun.
        boolean fourth = pwd.replaceAll("[^a-z]","").length()>0; // karşılaştırma operatörü olduğu için boolean true false cevabı alcaz yani.
        System.out.println(fourth);                                              // "[^a-z]" küçük harf olmayanları sil demek
                                                                                 //lenght methodu kaç tane karakter kaldığını hesaplayıp sonucun 0'dan büyük olup olmadığını hesaplıcak.

        //v) En az bir tane sembol (harf ve rakam harici her şey) olsun.
        boolean fifth = pwd.replaceAll("[a-zA-Z0-9]","").length()>0;
        System.out.println(fifth);

        //vi) En az bir tane rakam olsun.
        boolean sixth = pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println(sixth);

        System.out.println("Password gecerli mi?" +(first && second && third && fourth && fifth && sixth));





    }
}
