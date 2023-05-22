package day18arraylists;

import java.util.ArrayList;
import java.util.List;


public class ArrayLists01 {

    public static void main(String[] args) {

        // 1- Arraylist nasil olusturulur?
        List<Integer> nums = new ArrayList<>();

        // 2- ArrayListler nasil yazdirilir
        System.out.println(nums);//[]

        nums.add(37);
        nums.add(38);
        nums.add(39);
        nums.add(40);
        nums.add(41);
        nums.add(42);
        System.out.println("nums = " + nums);//nums = [37, 38, 39, 40, 41, 42]

        // 3- ArrayList'in bos olup olmadigini nasil anlariz
        boolean bosmu1 = nums.isEmpty();
        System.out.println("bosmu1 = " + bosmu1);//bosmu1 = false

        List<Integer> ages = new ArrayList<>();
        boolean bosmu2 = ages.isEmpty();
        System.out.println("bosmu2 = " + bosmu2);//bosmu2 = true cunku icine hicbir sey eklemedik yas list'inin icine


        //Example 1: nums ArrayList'indeki tum tek sayilari 11
        // artirdiktan sonra ekrana yazdiriniz
        //nums = [37, 38, 39, 40, 41, 42]

        for (int w : nums) {
            if (w % 2 != 0) {
                nums.set(nums.indexOf(w), w + 11);
            }
        }
        System.out.println("nums = " + nums);//nums = [48, 38, 50, 40, 52, 42]


        nums.add(52);
        nums.add(36);
        nums.add(52);
        // 4- List'lerden eleman nasil silinir
        // Ex: ArrayList'ten numa ArrayList'ten 52 elemaninin ilk gorunumunu siliniz
        System.out.println(nums);//[48, 38, 50, 40, 52, 42, 52, 36, 52]

        Integer sayi = 52;
        nums.remove(sayi);
        System.out.println("nums = " + nums);//nums = [48, 38, 50, 40, 42, 52, 36, 52]

        /*
         remove() methodunun icerisine tam sayi yazarsaniz Java bunu index kabul eder.
         Silinecek eleman olarak algilamaz

        tum tam sayilar aksi belirtilmedikce primitive int'dir. double falan kabul etmez
        Primitive data tipleride ArrayList'lerin elemani olamazlar oyuzden wrapper kullaniyorduk.

        Primitive data tiplerini Wrapper class'a cevirmeliyiz

       */


        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");
        System.out.println("names = " + names);//names = [Tom, Thomas, Tahsin, Trump, Taceddin]

        List<String> emekliOlacaklar = new ArrayList<>();//kimi emekli etmek istiyosan yeni list olustur
        emekliOlacaklar.add("Tom");
        emekliOlacaklar.add("Tahsin");
        emekliOlacaklar.add("Trump");
        emekliOlacaklar.add("Taceddin");
        names.removeAll(emekliOlacaklar);
        System.out.println("emekliOlacaklar = " + emekliOlacaklar);


        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
        System.out.println("a = " + a);//a = [Shoes, TV, Radio, Laptop, Shoes, Book, Shoes]
        a.remove("Shoes");
        System.out.println("a = " + a);//a = [TV, Radio, Laptop, Shoes, Book, Shoes] ilk gordugu shoes'i sildi


        //5- ArrayList'lerde coklu datanin olup olmadigini nasil gosteririz?
        //containsAll() methodu ile. bu method bir list'in icinde coklu elemanin olup olmadigini kontrol eder.
        //                           hepsi var ise==> true , en az bir tanesi yoksa ==> false verir. Yani hepsi de olmasi gerek


        List<String> myNames = new ArrayList<>();
        myNames.add("Burcu");
        myNames.add("Can");
        myNames.add("Zisan");
        myNames.add("Emre");
        myNames.add("Bilal");
        myNames.add("Gul");
        System.out.println("myNames = " + myNames);//myNames = [Burcu, Can, Zisan, Emre, Bilal, Gul]

        List<String> varMi = new ArrayList<>();//hangi isimler var mi diye yeni list olusturduk.
        // var mi yok mu diye ise boolean olusturup ilk list'ten 2. listi icine koyup replaceAll ile yazdirdik
        varMi.add("Burcu");
        varMi.add("Gul");
        varMi.add("Can");

        System.out.println("varMi = " + varMi);//varMi = [Burcu, Gul, Can]
        boolean sonuc = myNames.containsAll(varMi);
        System.out.println("sonuc = " + sonuc);//sonuc = true


    }
}
