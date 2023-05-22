package day32collections;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet01 {
    public static void main(String[] args) {


        long one = System.nanoTime();
        TreeSet<Integer> ts = new TreeSet<>();//bu method çalıştırdığınız milisecond'i söyleyecek
        ts.add(12);
        ts.add(25);
        ts.add(8);
        ts.add(32);
        ts.add(3);
        System.out.println(ts);//[3, 8, 12, 25, 32]
        long two = System.nanoTime();

        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(25);
        hs.add(8);
        hs.add(32);
        hs.add(3);
        TreeSet<Integer> hts = new TreeSet<>(hs);//parantezin iiçine hashset'i koyduk
        // Elemanlari ekleme de HashSet kullanicaz, sonrasinda TreeSet' e ceviricez.

        System.out.println(hts);//[3, 8, 12, 25, 32]

        long three = System.nanoTime();

        System.out.println("TreeSet'in uygulama süresi: " + (two - one));
        System.out.println("HashSet'in uygulama süresi: " + (three - two));

        //NOT: Treeset eleman ekleme de çok yavaştır. hash set ise çok hızlıdır.
        //Treeset'in bu negatif yönünden kurtulmak için; HashSet oluşturur elemanları ekler ve sonra HashSet'i TreeSet'e
        //çeviririz.

        int first = ts.first();//ilk elemanı yazdırır
        System.out.println("first = " + first);//first = 3

        int last = ts.last();//son elemanı yazdırır
        System.out.println("last = " + last);//last = 32

        int floor = ts.floor(15);//verdiğiniz değerin bir küçüğünü verir. 15 eleman değil oyüzden 15ten bbir önceki eleman yazdırıldı
        System.out.println("floor = " + floor);//floor = 12

        //floor() methodunda kullanabileceğiniz sayı en küçük elemandan az olamaz.
        int floor2 = ts.floor(12);//12 elemanlardan biri oyüzden 12 direkt yazdırıldı
        System.out.println("floor2 = " + floor2);//12

        int ceiling1 = ts.ceiling(15);
        System.out.println("ceiling1 = " + ceiling1);//ceiling1 = 25 15 elemanlardan biri değil oyüzden 15 den bir sonraki elemanı yazdırdı

        int ceiling2 = ts.ceiling(25);
        System.out.println("ceiling2 = " + ceiling2);//ceiling2 = 25 elemanlardan biri oyüzden 25 direkt yazdırıldı

        //ceiling methodunda kullanabileceğiniz sayı en büyük elemandan büyük olamaz
        //int ceiling3 = ts.ceiling(125);
        //System.out.println("ceiling3 = " + ceiling3);

        SortedSet<Integer> tailSet1 = ts.tailSet(12);
        System.out.println("tailSet1 = " + tailSet1);//tailSet1 = [12, 25, 32] 12 elemanlardan biri oyüzden 12 ve sonraki elemanlar bir set içinde yazdırıldı

        SortedSet<Integer> tailSet2 = ts.tailSet(15);//sizin verdiğiniz sayı set'in içinde yoksa onun büyüklerini verir
        System.out.println("tailSet2 = " + tailSet2);//tailSet2 = [25, 32] 15 elemanlardan biri değil oyüzden 15den sonraki elemanlar bir set içinde yazdırıldı

        NavigableSet<Integer>  tailSet3  = ts.tailSet(12,false);
        System.out.println("tailSet3 = " + tailSet3);//tailSet3 = [25, 32] 12 elemanlardan biri normalde 12 ve sonraki elemanlar bir set içinde yazdırıldı
        //ama ikinci parametre'de "false" kullandığım için 12 hariç tutuldu.

        SortedSet<Integer> headSeat1 = ts.headSet(12);
        System.out.println("headSeat1 = " + headSeat1);//headSeat1 = [3, 8] 12 elemanlardan biri önceki elemanlar bir set içinde yazdırıldı, 12 yazdırılmadı

        SortedSet<Integer> headSeat2 = ts.headSet(12,true);
        System.out.println("headSeat2 = " + headSeat2);//headSeat2 = [3, 8, 12]

       //Generic Method: Normal method'lar parametrelerde belirtilen data type'ları ile çalışırlar.
        //               Generic Method'lar ise verilen her türlü data type ile çalışma becerisine sahiptirler.
        Integer higher = ts.higher(12);//12den bir sonraki elemanı verir
        System.out.println("higher = " + higher);//higher = 25

        Integer lover1 = ts.lower(12);
        System.out.println("lover1 = " + lover1);//lover1 = 8 12den bir önceki elemanı verir


    }
}
