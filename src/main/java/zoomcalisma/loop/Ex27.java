package zoomcalisma.loop;

import java.util.Arrays;

public class Ex27 {
    /*
    Belirli bir arrayden, toplamı belirli bir sayı olan tüm çiftleri bulunuz.
Array {4, 6, 5, -10, 8, 5, 20} ve sayı 10 ise, çıktı 4+6=10, 5+5=10, -10+20=10 olacaktır.
     */

    public static void main(String[] args) {
        int[] arr = {4, 6, 5, -10, 8, 5, 20};

        for (int i=0; i<arr.length-1; i++){

           for (int j=i+1; j<arr.length;j++){
               if (arr[i]+arr[j]==10){
                   System.out.println(arr[i]+" + " + arr[j] + " = "+(arr[i]+arr[j]));
               }
           }
        }








    }
}
