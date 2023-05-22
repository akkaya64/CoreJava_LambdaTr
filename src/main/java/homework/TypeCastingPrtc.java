package homework;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class TypeCastingPrtc {

    public static void main(String[] args) {

        // byte data type'ini int data type'ine çeviriniz?
        byte age =15;
        int ageInt = age;// AutoWidening

        // long data type'ini short data type'ine çeviriniz?
        long weight =234;
        short WeightInt = (short) weight;// ExplicitNarrowing

        // int data type'ini float data type'ine çeviriniz?
        int population = 700000;
        System.out.println(population); //700000
        float populationFloat = population;
        System.out.println(populationFloat); //700000.0 (ondalık olmasının sebebi float ondalık sayılar içindi)

        // double data type'ini short data type'ine çeviriniz?
        double num1 = 12.5;
        System.out.println(num1); //12.5

        short doubleNum1 = (short)num1;
        System.out.println(doubleNum1); //12

        //****** STRİNG MANİPULATİONS:******

        String s = "Learn Java earn money!!!!!";

        //s Stringindeki "earn" kelimesini "win" kelimesine ceviriniz.
        String newS2 = s.replace("earn","win");
        System.out.println(newS2); // Lwin Java win money

       // s Stringindeki "a" harflerini "*" a çeviriniz,
        String newS3 = s.replace("a","*");
        System.out.println(newS3);

        // s String'indeki bütün "e" harflerini siliniz.
        String newS4 = s.replaceAll("e","");
        System.out.println(newS4);

        //Example 8: "s" String'indeki tüm rakamları ve harfleri "!"a çeviriniz?
        String newS5 = s.replaceAll("[a-zA-Z0-9]","!");
        System.out.println(newS5); //!!!!! !!!! !!!! !!!!!

        //Example 9: "s" String'indeki kücük harfler dışındaki tüm karakterleri "<>"a çeviriniz?
        String newS6 = s.replaceAll("[^a-z]","<>");
        System.out.println(newS6);//<>earn<><>ava<>earn<>money

        //Example 10: "s" String'indeki tüm harfler dışındaki tüm karakterleri "+"a çeviriniz?
        String newS7 = s.replaceAll("[^a-zA-z]","+");
        System.out.println(newS7);//tüm büyük harf, tüm küçük harf dışındaki tüm karakterleri + yapıcak.

        //Example 11: "s" String'indeki space'ler dışındaki  tüm karakterleri "*"a çeviriniz?
        String newS8 = s.replaceAll("[^ ]","*");
        System.out.println(newS8);//***** **** **** **********

        //Example 12: "s" String'indeki sesli harfler  dışındaki  tüm karakterleri "&"a çeviriniz?
        String newS9 = s.replaceAll("[^aeiouAEIOU]","&");
        System.out.println(newS9);//&ea&&&&a&a&ea&&&&o&e&&&&&&

        //Example 1: Aşağıdaki kurallara göre kullanıcının girdiği password'u kontrol ediniz.
        //i) En az 8 karakter olsun.
        //ii) Space karakteri password'de olmasın.
        //iii) En az bir tane büyük harf olsun.
        // iv) En az bir tane küçük harf olsun.
       // v) En az bir tane sembol olsun.
        //vi) En az bir tane rakam olsun.*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen passwordunuzu giriniz...");
        String pwd = input.nextLine();

        //i) En az 8 karakter olsun.
        boolean first = pwd.length()>7;
        System.out.println(first);

        //ii) Space karakteri password'de olmasın.
        boolean second = !pwd.contains(" ");
        System.out.println(second);

        //iii) En az bir tane büyük harf olsun.
        boolean third = pwd.replaceAll("[^A-Z]","").length()>0;
        System.out.println(third);

        // iv) En az bir tane küçük harf olsun.
        boolean fourth = pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println(fourth);

        // v) En az bir tane sembol olsun.
        boolean fifth = pwd.replaceAll("[a-zA-Z0-9]","").length()>0;
        System.out.println(fifth);

        //vi) En az bir tane rakam olsun
        boolean sixth = pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println(sixth);

        System.out.println("Şifre geçerli mi "+ (first && second && third && fourth && fifth && sixth ));













    }
}
