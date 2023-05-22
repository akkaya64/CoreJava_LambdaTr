package day17arraylists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayLists01 {

    public static void main(String[] args) {

        /*
        1- Arraylist'ler coklu data depolamak icin kullanilir.

        2- Arraylist'ler non-primitive data tipindeki coklu datalari depolamak icin kullanilir.
           Listler non-primitive data kabul ederler, Array'ler ise primitive data veya referance kabul ederler

        3- Arraylist'leri olusturuken icine koyacaginiz eleman sayisini basta soylemeye gerek yoktur
           Arraylist'ler eleman sayisinda "flexible" dirlar ama Array'ler "flexeble" degildirler

        4- Madem Array'ler eleman sayisinda flexeble degil nicin Java Array'leri iptal etmedi?
            i) eleman sayisi belli olan datalari depolamak icin Array'ler tercih edilir
            ii) Cunku Array'ler cok hizli calisir (super fast) ve Array'ler memory'de cok az yer kaplar

         */

        //List nasil olusturulur?
        ArrayList<Integer> ages = new ArrayList<>();

        System.out.println(ages);// []

        //Listlere eleman nasil eklenir
        //add() her zaman elemani en sona ekler. (insertion order)
        //add methodu() sizin verdiginiz siraya gore elemanlari Listin icine dizer koyuyor
        //List'e eleman eklemek icin add() methodunu kullaniriz add() methodu elemanlari sizin verdiginiz sirada List'e ekler.(Insertion Order)
        ages.add(12);
        ages.add(9);
        ages.add(10);
        ages.add(1, 656);
        ages.add(3, 777);
        ages.add(888);//en sona eleman koyarken index kullanmaya gerek yok
        System.out.println(ages);//[12, 656, 9, 777, 10, 888]

        //List'e coklu eleman nasil eklenir? veya List'e baska bir List nasil eklenir
        //Bir List'e coklu eleman eklemek icin o elemanları önce bir List'in içine koymalısınız
        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);// coklu eklemek icin en sona ekler
        ages.addAll(2, newAges);// coklu eklemeyi belirli bolgeye yapmak icin
        System.out.println(ages);//[12, 656, 8, 9, 10, 9, 777, 10, 888, 8, 9, 10]

        // Bir List'teki tum elemanlari nasil silebilirim
        // ages.clear();//bir List'teki tum elemanlari siler
        // System.out.println(ages);//[]

        //Bir elemanin List'te var olup olmadigini konrol ederiz
        ages.contains(656);
        System.out.println(ages);//true

        //Bir List'in baska bir List ile ayni olup olmadigini nasil kontrol ederiz
        // iki List'in ayni olmasi icin ayni indexte ayni elemanlar olmalidir.
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");
        boolean s = names1.equals(names2);
        System.out.println(s);//false

        //Ex 1: Verilen iki Integer List'te tamamiyla ayni elemanlarin olup olmadigini kontrol eden kodu yaziniz.
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        Collections.sort(nums1);

        Collections.sort(nums2);

        boolean t = nums1.equals(nums2);
        System.out.println(t);//true

    }
}
