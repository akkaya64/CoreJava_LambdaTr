package practice.advanceday05;

import java.util.Arrays;
import java.util.Scanner;

public class Q04_Anagram {
    public static void main(String[] args) {

        /*
        İki kelimenin "Anagram" olup olmadığını kontrol eden bir method oluşturunuz.
        - Anagram, başka bir kelimenin karakterlerinden yeni bir kelime oluşturmaktır. -
        Örn:
        * bahriyeli <> harbiyeli.
        * sızlanma <> anlamsız.
        * asya <> yasa.
        * Bursa Dağı <> su bardağı
        * kan ara <> Ankara.
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci String değeri giriniz");
        String birinici = input.nextLine();
        System.out.println("Ikinci String değeri giriniz");
        String ikinci = input.nextLine();

        anagram("bursa dağı", "su bardağı");


    }


    public static void anagram(String str1, String str2) {
        String[] arr1 = str1.toLowerCase().replaceAll(" ", "").split("");
        String[] arr2 = str2.toLowerCase().replaceAll(" ", "").split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {

            System.out.println("Anagram");

        } else {

            System.out.println("Anagram DEĞİL");
        }


    }


}
