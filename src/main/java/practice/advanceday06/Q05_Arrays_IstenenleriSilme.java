package practice.advanceday06;

import java.util.Arrays;
import java.util.Scanner;

public class Q05_Arrays_IstenenleriSilme {

    //Bir  integer Array'de verilen bir deger
    // disindaki elamanlari  yeni bir Array olarak yazdiran bir method yaziniz.
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 5, 5}; // 2 leri silmek istiyoruz

        System.out.println(Arrays.toString(istenileniSil(arr))); //[1, 3, 4, 5, 5]
    }

    public static int[] istenileniSil(int[] arr) {
        Scanner input = new Scanner(System.in);
        System.out.println(Arrays.toString(arr)); //[1, 2, 2, 3, 4, 5, 5]
        System.out.println("Silmek istediginiz elemani giriniz");
        int silinecek = input.nextInt();

        int length = 0;

        for (int w : arr) { //arr icindeki herbir elemana bakilacak
            if (w != silinecek) {
                length++;
            }
        }
        System.out.println("length = " + length); //5, silinecek eleman disi karakter sayisi, olusturacagim yeni array length'i
        int[] arrSilinmis = new int[length];
        int idx = 0;

        for (int w : arr) {
            if (w != silinecek) {
                arrSilinmis[idx] = w;
                idx++;
            }
        }
        return arrSilinmis;
    }
}
//olmayan bir eleman girersek birebir aynisini geri verir





