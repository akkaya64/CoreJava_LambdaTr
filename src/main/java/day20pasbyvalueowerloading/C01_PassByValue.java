package day20pasbyvalueowerloading;

public class C01_PassByValue {

    public static void main(String[] args) {

        /*
        Pass By Value: Methoda value'nin değerinin bir kopyasını gönder demektir.
        Bu nedenle Pass By Value'da orjinal parametre değişmez

        Java Pass By Value kullanır. Neden?
        1) Java variable'nin orjinal değerini korumak ister
        2) Java variable'nin içindeki değeri kopyalar ve methodun içerisine kopya değeri gönderir.
        Değer üzerinde yapılan değişiklikler orjinal parametreyi etkilemez.

        Pass By Referance'de ise referance kopyalanır ve methodta kullanılır.
        Yapılan değişiklik orjinal parametreyi etkiler.
        Bu tarz programlar değeri korumak istiyorsa işi developer'a bırakmıştır.
        Kendisi değeri değiştir
         */

        int gomlek = 100;
        System.out.println("gomlek = " + gomlek);//100

        // ogrenciIndirimi(gomlek);
        System.out.println("gomlek = " + gomlek);//100

        //atama yaparak indirimli şekilde yazdırdık
        gomlek = ogrenciIndirimi(gomlek);
        System.out.println("atamadan sonra main'deki gomlek = " + gomlek);//atamadan sonra main'deki gomlek = 90



    }//main

    private static int ogrenciIndirimi(int gomlek) {
        int ogrenciGomlegi = gomlek - 10;
        System.out.println("ogrenciGomlegi = " + ogrenciGomlegi);//ogrenciGomlegi = 90
        return ogrenciGomlegi;

    }//öğrenciIndirimi Methodu


}
