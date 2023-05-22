package day18arraylists;

import java.util.ArrayList;
import java.util.List;

public class Lists04 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Ajda");
        names.add("Cuneyt");
        names.add("Mahsun");
        names.add("Muslum");
        names.add("Orhan");


        List<String> females = new ArrayList<>();
        females.add("Ajda");
        females.add("Emel");
        names.containsAll(females);//names listinde females listindeki her şey var mı diyoruz, namesin içinde ojda ve emel var mı diyor. varsa true yoksa false yani boolean döndürür

        // names.containsAll(females); "names" listindeki TÜM elemanların var olup olmadığını kontrol eder.
        //Tamamı varsa size "true" döndürür, herhangi biri yoksa size "false" verir.
        boolean r = names.containsAll(females);
        System.out.println(r);//false

        //NOT:  names.subList(1,4) "names" listindeki index'i 1,2 ve 3 olan elemanları bir List'in içinde size verir
        //Ikinici index olan 4 dahil değildir
        List<String> sublist = names.subList(1, 3); // 1 dahil , 4 dahil değil
        System.out.println("sublist = " + sublist);//sublist = [Cuneyt, Mahsun]

        names.retainAll(females);

        System.out.println(names);//[Ajda]
        System.out.println(females);//[Ajda, Emel]

        //Ex1: Elektronik aletler ve ev aletleri List'leriniz var
        //     elektronik ev aletlerini listeleyiniz

        List<String> electronics = new ArrayList<>();

        electronics.add("TV");
        electronics.add("Radio");
        electronics.add("Refrigerator");
        electronics.add("Mobile Phone");
        electronics.add("Notebook");

        List<String> homeGoods = new ArrayList<>();

        homeGoods.add("Carpet");
        homeGoods.add("Fork");
        homeGoods.add("Radio");
        homeGoods.add("Chair");
        homeGoods.add("TV");

        // homeGoods.retainAll(electronics); homeGoods ile electronics listlerin ortak elemanlarını homeGoods listi içinde verir
        // başka bir değişle (In other words) homeGoods listindeki ortak olmayan elemanları siler
        //kesisim kumesi
        homeGoods.retainAll(electronics);
        System.out.println(homeGoods);//[Radio, TV]

        //ısEmpty() listte hic eleman yoksa size true verir, 1 veya daha fazla eleman varsa size false verir.
        //"isEmpty()" esasında "names.size()==0" demektir.
        names.isEmpty();//listte hiç eleman yoksa true verir

        System.out.println(names.hashCode());//2041509


    }
}
