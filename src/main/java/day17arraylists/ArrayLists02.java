package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists02 {
    public static void main(String[] args) {
        //Array List olusturuken sağ tarafa (contructor) ArrayList yazmak zorundasiniz.
        //Ama sol tarafa ister ArrayList yazin ister List yazin ikisi de calisir

        // ArrayList<Character> initials = new ArrayList<>(); //bas harfler
        List<Character> initials = new ArrayList<>();

        initials.add('A');
        initials.add('B');
        initials.add('M');
        initials.add('B');

        //Bir List'te kac tane eleman oldugunu nasil anlariz
        int numOfElement = initials.size();
        System.out.println(numOfElement);//4

        //Note: Array'lerden bahsederken length() kullanin
        //List'lerden bahsederken size() kullanin


        //Bir List'ten istenen bir eleman nasil alinir.==> get() methodu
        char u = initials.get(2);//get indexi elemani getirir
        System.out.println(u);//M


        //Ex 1: Verilen bir String List'teki tum elemanlarin toplam karakter sayisini bulunuz.

        List<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");


        //1.YOL for each Recommended(tavsiye edilen)
        int sum = 0;
        for (String w : cities) {

            sum = sum + w.length();

        }
        System.out.println(sum);//26


        //2.YOL for loop
        int toplam = 0;
        for (int i = 0; i < cities.size(); i++) {


            toplam = toplam + cities.get(i).length();

        }
        System.out.println(toplam);//26


        //Bir List'teki istenen bir elemani nasil degistirebiliriz ==> set() methodu
        //set()--> yazılan indexdeki elemanı istenenle degiştirir
        cities.set(0, "New York");
        System.out.println(cities);//[New York, Istanbul, Kayseri, Almaty]

        //Ex 2: Maas List'i olusturunuz ve maaslara %20 zam yapiniz.
        List<Double> salary = new ArrayList<>();
        salary.add(19500.25);
        salary.add(8500.75);
        salary.add(32500.50);
        System.out.println(salary);//[19500.25, 8500.75, 32500.5] zamdan once

        //1.Yol for each
        /*int idx =0;
        for (Double w : salary){

            salary.set(idx,w*1.20);
            idx++;
        }
        System.out.println(salary);*/ //[23400.3, 10200.9, 39000.6] zamdan sonra

        //2.Yol for loop
        for (int i = 0; i < salary.size(); i++) {

            salary.set(i, salary.get(i) * 1.20);
        }
        System.out.println(salary);//[23400.3, 10200.9, 39000.6]

    }
}
