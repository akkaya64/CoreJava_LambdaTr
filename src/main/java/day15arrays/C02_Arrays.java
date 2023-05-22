package day15arrays;

import java.util.Arrays;

public class C02_Arrays {

    public static void main(String[] args) {

        //Bir String'teki sesli harflerin sayisini bulan kodu yaziniz.
        //    a e i o u

        String str = "Java ogrenince para kazanmak ne kolay, ogrenmeyice ne kadar zor.";

        str = str.toLowerCase();
        String harfler[] = str.split("");
        System.out.println(Arrays.toString(harfler));//[j, a, v, a,  , o, g, r, e, n, i, n, c, e,  , p, a, r, a,  ,
        // k, a, z, a, n, m, a, k,  , n, e,  , k, o, l, a, y, ,,  , o, g, r, e, n, m, e, y, i, c, e,  , n, e,  , k, a, d, a, r,  , z, o, r, .]

        int counter = 0;

        //iter yapip enter yap ==> for each loop acilir
        for (String w : harfler) {


            switch (w) {
                case "a":
                case "e":
                case "o":
                case "u":
                case "i":
                    counter++;

            }

        }

        System.out.println(counter);//23


    }
}
