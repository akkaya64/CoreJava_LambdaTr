package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        //Ex 1: String Array oluşturun. içine 5 tane eleman ekleyin, ilk eleman ile son elemanın içerdiği karakter sayıları toplamını ekrana yazdırın.

        String arr[] = new String[5];

        arr[0] = "Math";
        arr[1] = "Science";
        arr[2] = "Music";
        arr[3] = "English";
        arr[4] = "Art"; //istenen eleman sayısından 1 eksik yazılır buraya
        System.out.println(Arrays.toString(arr));//[Math, Science, Music, English, Art]

        System.out.println(arr[0].length()+ arr[arr.length-1].length());//7

        System.out.println();


        //Ex 2: String Array oluşturun. içine 5 tane eleman ekleyin, tüm eleman içerdiği karakter sayıları toplamını ekrana yazdırın.

        String brr[]= new String[5];
        brr[0]= "Miami";
        brr[1]= "Istanbul";
        brr[2]= "Frankfurt";
        brr[3]= "Dhaka";
        brr[4]= "Athena";

       //1.YOL: for loop
        int totalChar=0;

        for (int i = 0;i<brr.length;i++){
            totalChar=totalChar +brr[i].length();
        }
        System.out.println(totalChar);//33


        //2.YOL: for-each loop (enhanced loop(zenginleştirilmiş) ) ==> başlangıç değeri, loop'un çalışma şartı ve Increment Decrement kısmını kendisi halleder.

        //       for-each loop "Array" lerde ve "Collection" larda kullanılır.
        //       Index kullanmanız gerektiğinde bazen for-each loop çaresiz kalır. Mecburen diğer loopları kullanırsınız.
        //for-each-loop==> en kullanisli loop
        //ama bazen onu kullanamayacagimiz durumlar var
        // bir arrays ile calisiyorsan ilk tercihin for-each-loop olmali

        int sum = 0;
        for (String w : brr){
            sum = sum + w.length();
        }
        System.out.println(sum);//33

    }
}
