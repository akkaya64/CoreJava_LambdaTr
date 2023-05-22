package day19listsvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_Listis {
    public static void main(String[] args) {

        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bastaki ve sondaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
         */

        List<String> databaseIsim = new ArrayList<>();
        databaseIsim.add("AYSE");
        databaseIsim.add("AHMET");
        databaseIsim.add("SERDAR");
        databaseIsim.add("OKAN");
        databaseIsim.add("BETUL");
        databaseIsim.add("MERTCAN");


        System.out.println("databaseIsim = " + databaseIsim);

        Scanner input = new Scanner(System.in);
        //1.adim kullanicidian kullanmak istedigi kullanici adini aliriz
        System.out.println("Lutfen kullanici adinizi giriniz..");
        //2. adim kullanicidan aldigim datayi database uygun ve task'in istedigi gibi bosluksuz hale getirdim
        String username = input.nextLine().toUpperCase().trim();

        //3.adim kullanici adinin kullanilabilir olup olmadigini data base ile kiyaslayacaz if ile yapicaz
        if (databaseIsim.contains(username)) {//iceriyor mu diyoruz contains methodu.
            System.out.println("Bu kullanici adi zaten alinmis");
        } else {
            System.out.println("Bu kullanici adini kullanabilirsiniz");
        }

        if (databaseIsim.contains(username)) {
            int rasgeleSayi = new Random().nextInt(10); //random() methodu bana rastgele bir sayi uret dedik 0dan 10a kadar

            username = username + "" + rasgeleSayi;
            System.out.println("Yeni kullanici adi olarak bunu kullanabilirsiniz " + username);
        } else {
            System.out.println("Yeni kullanici adi; " + username);
        }


    }
}
