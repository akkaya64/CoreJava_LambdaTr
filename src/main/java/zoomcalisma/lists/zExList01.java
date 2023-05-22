package zoomcalisma.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class zExList01 {
    public static void main(String[] args) {
        //4) Bir listedeki öğelerin azalan sırada olup olmadığını kontrol ediniz.
        //Örnek: (Yellow, Blue, Red, Green) ==> Çıktı: Azalan sırada değil
        // (Yellow, Red, Green, Blue) ==> Çıktı: Azalan sıradadır​

        List<String> renk = new ArrayList<>();//[Yellow, Blue, Red, Green]
        renk.add("D");
        renk.add("C");
        renk.add("B");
        renk.add("A");
        System.out.println(renk);//[Yellow, Blue, Red, Green]

        List<String> renkKopya = new ArrayList<>();
        renkKopya.addAll(renk);
        System.out.println(renkKopya);//[Yellow, Blue, Red, Green]​
        Collections.sort(renkKopya);
        System.out.println(renkKopya);//[Blue, Green, Red, Yellow]

        Collections.reverse(renkKopya);
        System.out.println(renkKopya);//[Yellow, Red, Green, Blue]

        if (renk.equals(renkKopya)) {
            System.out.println("azalan siradadir.");
        } else {
            System.out.println("azalan sirada degildir.");
        }

    }
}
