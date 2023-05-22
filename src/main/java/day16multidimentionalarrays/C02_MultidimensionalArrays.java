package day16multidimentionalarrays;

import java.util.Arrays;

public class C02_MultidimensionalArrays {

    public static void main(String[] args) {
        //Bir tane integer multidimensional array olusturunuz
        //Bu array'deki tum sayilarin toplamini veren kodu yaziniz.

        int arr[][] = {{2, 5, 1}, {32, 75}};

        int num = 0;
        System.out.println(Arrays.deepToString(arr));//[[2, 5, 1], [32, 75]]

        for (int[] w : arr) {

            //w = [2,5,1]
            for (int k : w) {//k artık array değil, array'in içindeki int değer oyüzden [] yok

                num = num + k;
            }
        }
        System.out.println(num);//115

        /*
        1. for daire sayısını sayıyor
        2. for dairelerin içine girip bireyleri sayıyor
        */


        //Multidimensional Array'i tek katlı Array'e çevirme
        /*
        1- Once multidimensional Array'in eleman sayısını bulun
        2- Yeni bir Array almalıyım. Bu Array'in büyüklüğü ilk multidimensional Array'in eleman sayısına
           eşit büyüklükte olmalı
         */
        int brr[][] = {{2, 5, 1}, {32, 75}};//3+2=5 daire

        int toplam = 0;
        for (int[] w : brr) { // brr multidimensional Array'in içinde her bir "w" Array'ini aldık.
            toplam = toplam + w.length;
        }
        System.out.println(toplam);//5  yeni oluşturacağımız Array'in sayısını belirledik

        int idx = 0;

        int crr[] = new int[toplam];

        for (int[] w : brr) {

            for (int k : w) {//w array'inın içindeki herbir k değerini getir.

                crr[idx] = k; //yeni crr array'inin içine idx'e göre yerleştir.

                idx++;
            }
        }
        System.out.println(Arrays.toString(crr));//[2, 5, 1, 32, 75]


    }
}
