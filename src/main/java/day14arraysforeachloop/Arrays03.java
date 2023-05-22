package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //Ex 1: String bir array oluşturunuz, 6 tane eleman yerleştiriniz
        //      karakter sayısı 5'ten çok olan elemanları siliniz.

        String colors [] = new String[6];

        colors[0]= "Red";
        colors[1]= "Orange";
        colors[2]= "Blue";
        colors[3]= "Yellow";
        colors[4]= "Green";
        colors[5]= "Brown";

        System.out.println(Arrays.toString(colors));//[Red, Orange, Blue, Yellow, Green, Brown]

        //Logic: yeni bir array oluşturup karakter sayısı 5 ve 5 ten küçük olan elemanları
        //       yeni array'a transfer edeceğiz. böylelikle yeni array'de karakter sayısı
        //       5'ten büyük olan hiçbir eleman olmayacak.

        //Soru: Array oluşturmak için iki şey belirlenmelidir.
        //     1- Elemanların data tipi
        //     2- yeni array'de kaç tane eleman olacak.


        // Verilen Array'de eleman sayısı 5 ve 5'ten küçük olan kaç eleman var bulmalıyız.
        int counter = 0;

        for (String w : colors){
            if(w.length()<=5){
                counter++;
            }

        }
        System.out.println(counter);

        //Yeni array oluştur
        String newColors[] = new String[counter];

        //karakter sayısı 5 ve 5ten küçük olanları yeni array'e transfer et
        int idx = 0;
                                    //Red  orange  blue  yellow  green  brown
        for (String w : colors){
            if (w.length()<=5){
                newColors[idx] = w;

                idx++;
            }
        }
        System.out.println(Arrays.toString(newColors));//[Red, Blue, Green, Brown]


    }
}
