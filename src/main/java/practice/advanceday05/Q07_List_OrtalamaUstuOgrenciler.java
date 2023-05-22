package practice.advanceday05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q07_List_OrtalamaUstuOgrenciler {
    public static void main(String[] args) {

        // Bir öğretmenden girmek istediği
        // kadar notu alınız, ve ortalamayı geçen öğrenci sayısını bulunuz.

        Scanner input = new Scanner(System.in);
        List<Integer> notlar = new ArrayList<>();
        int sayac = 0;
        String karar;

        //kullanıcıdan notları aldık
        do {
            sayac++;
            System.out.println(sayac + " notu giriniz");
            notlar.add(input.nextInt());
            System.out.println("Çıkmak icin H, Daha fazla not girmek için herhangi bir karakter giriniz");
            karar = input.next();


        } while (!karar.equalsIgnoreCase("H"));
        System.out.println("notlar = " + notlar);

        //ortalamayı hesaplıcaz
        double toplam = 0;
        for (int w : notlar) {

            toplam += w;
        }
        double ortalama = toplam / notlar.size();
        System.out.printf("ortalama = " + "%2f", ortalama);

        //Ortalama üstü not sayısını bul
        int ortalamaUstuNotSayisi = 0;
        for (Integer w : notlar) {

            if (w > ortalama) {
                ortalamaUstuNotSayisi++;

            }

        }
        System.out.println("ortalamaUstuNotSayisi = " + ortalamaUstuNotSayisi);
    }
}
