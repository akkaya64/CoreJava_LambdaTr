package day15arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays05 {

    public static void main(String[] args) {

        //Ex 1: String Array elemanlarini karakter sayisina gore kucukten buyuge siralayiniz
        //      ["Michael", "Ajda" ,"Thomas" , "Tom"] ==> [ "Tom","Ajda", "Thomas",  "Michael"]
        String arr[] = {"Michael", "Ajda", "Thomas", "Tom"};
        // System.out.println(Arrays.toString(arr)); //[Michael, Ajda, Thomas, Tom]

        Arrays.sort(arr, Comparator.comparingInt(String::length));//bir class'taki methoda ulasmak icin method referance kullanilir :: ==> bir methodu kullan demek
        System.out.println(Arrays.toString(arr));//[Tom, Ajda, Thomas, Michael]

        //Ex 2: String Array elemanlarini karakter sayisina gore buyukten kucuge siralayiniz
        //        //      ["Michael", "Ajda" ,"Thomas" , "Tom"] ==>  [, "Michael", "Thomas","Cuneyt", "Ajda", "Tom"]

        String brr[] = {"Michael", "Ajda", "Thomas", "Tom", "Cuneyt"};
        System.out.println(Arrays.toString(brr));

        Arrays.sort(brr, Comparator.comparingInt(String::length).reversed());//reversed() tersten yapar
        System.out.println(Arrays.toString(brr));//[Michael, Thomas, Cuneyt, Ajda, Tom]


        //Example 3: String Array elemanlarini character sayisina gore buyukten kucuge siralayiniz.
//           Ayni character sayisinda olanlari da alfabetik siraya koyunuz.
//          ["Michael", "Ajda", "Reyhane", "Gabriel","Thomas",  "Tom", "Ali", "Cin","Cuneyt", "Cem"]
//          [ "Gabriel", "Michael", "Reyhane", "Thomas", "Cuneyt", "Ajda", "Ali", "Cem", "Cin", "Tom"]

        String crr[] = {"Michael", "Ajda", "Reyhane", "Gabriel", "Tom", "Ali", "Cin", "Cem"};
        System.out.println(Arrays.toString(crr));

        Arrays.sort(crr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));// bu tarz kod yazmaya factıonal .... denin (lambda)
        System.out.println(Arrays.toString(crr));

        /*
        fonctional Prpgraming==> java'nin olusturdugu methodlari kullanmak, saglam yol.
        fonctional programing==lampda
        reversed==> buyukten kucuge diz
        thencomparing==> iceri gir iceriyi de duzenle
        Comparator.naturelorder==> iceride dogal siralama yap; yani alfebetik siralama yap
         hem buyukler hemde kucukler icin ayri ayri siralama yapti
         */


    }
}
