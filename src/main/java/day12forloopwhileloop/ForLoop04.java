package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop04 {

    public static void main(String[] args) {

        /*
   Kullanicidan baslangic ve bitis degerlerini alin.
   Baslangic degerinden baslayip bitis degerine kadar aradaki tum cift tamsayilari
   ekrana yazdiriniz  //10  12  14
*/

        Scanner input = new Scanner(System.in);
        System.out.println("Başlangıç değerini giriniz..");
        int start = input.nextInt();

        System.out.println("Bitiş değerini giriniz...");
        int end = input.nextInt();

        if(start>end){//eksi girmemesi için önce
            System.out.println("başlangıç değeri bitiş değerinden büyük olamaz..");

        }else{
            for (int i=start ; i<=end; i++){

                if(i%2==0){
                    System.out.print(i + " ") ;
                }

            }
        }








    }
}
