package day15arrays;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        //Example 2: Bir Stringdeki sesli harflerin sayisini bulan kodu yaziniz
        //           a - e - i - o - u - A - E - I - O - U

        String s = "Java brings you money";

        //1.yol : replaceAll() kullan
        int vowels = s.replaceAll("[^aeiouAEOIU]", "").length();
        System.out.println(vowels);//7


        //2.yol : Array ve loop kullan
        String letters[] = s.split("");//split methodu stringi parcalamak icin kullanilir array'de. asagidaki gibi cikar sonuc.
        System.out.println(Arrays.toString(letters));//[J, a, v, a,  , b, r, i, n, g, s,  , y, o, u,  , m, o, n, e, y]

        //array'e sahip olunca for each'i kullanicaz.
        int counter = 0;
        for (String w : letters) {

            switch (w.toLowerCase()) {//ihtimal 2den fazla ise switch kullaniyoruz. toLowerCase ile harfi alip kucuk harflerle calistiricaz
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;//sessiz harflerde artmiyor seslilerde artiyor counter.

            }
        }

        System.out.println(counter);//7

    }
}
