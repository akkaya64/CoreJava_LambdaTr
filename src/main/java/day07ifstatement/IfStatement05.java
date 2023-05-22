package day07ifstatement;

import java.util.Scanner;

public class IfStatement05 {
    public static void main(String[] args) {

        //Ex 1: Ay isimleri girilince kaçıncı ay olduğunu yazan kodu yazınız

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ay ismi giriniz...");
        String monthName = input.next();

        if(monthName.equalsIgnoreCase("Ocak")){
            System.out.println(1);
        } else if (monthName.equalsIgnoreCase("Şubat")) {
            System.out.println(2);
        }else if (monthName.equalsIgnoreCase("Mart")) {
            System.out.println(3);
        }else if (monthName.equalsIgnoreCase("Nisan")) {
            System.out.println(4);
        }else if (monthName.equalsIgnoreCase("Mayis")) {
            System.out.println(5);
        }else if (monthName.equalsIgnoreCase("Haziran")) {
            System.out.println(6);
        }else if (monthName.equalsIgnoreCase("Temmuz")) {
            System.out.println(7);
        }else if (monthName.equalsIgnoreCase("Ağustos")) {
            System.out.println(8);
        }else if (monthName.equalsIgnoreCase("Eylül")) {
            System.out.println(9);
        }else if (monthName.equalsIgnoreCase("Ekim")) {
            System.out.println(10);
        }else if (monthName.equalsIgnoreCase("Kasım")) {
            System.out.println(11);
        }else if (monthName.equalsIgnoreCase("Aralık")) {
            System.out.println(12);
        }else{
            System.out.println(" ay ismi giriniz");
        }

        //ignorCase() küçük harf büyük harf umursamadan yazarsak eğer kod çalışır.
        /*
        NOTE: String'lerin eşitliklerini kontrol ederken "==" yerine "equals()" kullanırız.
              Niye ?
              Çünkü "==" sembolü iki String'i karşılaştırırken hem adreslerine hem de değerlerine bakar
              ikisi de aynı ise size String'ler eşittir der ama biz kod yazarken genellikle String'lerin adresleri ile
              değil değerleri ile ilgileniriz. Bu yüzden String karşılaştırmalarında "==" kullanmayız.

              "equals()" methodu ise iki String'i karşılaştırırken sadece değerlerine bakar. Değerler aynı ise bu iki
              String eşittir der değerler, farklı ise bu iki String farklıdır der ki bu bizim kod yazarken ihtiyaç duyduğumuz
              şeydir.

              Stack memoryde;
              i) Primitive datalar depolanır
              ii) Non-primitivelerin adresleri (Referance) depolanır.

              Heap memoryde; Non-primitive'ler depolanır


         */

        String s = "Tom";
        String t = "Terry";
        String r = new String("Tom");
        String m = "Tom";

        System.out.println(s==t); //false çünkü adres ve değerler farklı
        System.out.println(s.equals(t));//false çünkü değerler farklı

        System.out.println(s==r);//false çünkü adresleri farklı
        System.out.println(s.equals(r));//true çünkü equals() method sadece değerlere bakar."s" ve "r"nin değerleri aynı olduğundan true verir.

        System.out.println(s==m);//

        System.out.println(s.equals(m));//true




    }






}
