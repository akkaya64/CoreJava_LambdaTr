package zoomcalisma.loop;

import java.util.Scanner;

public class Ex21 {
   /*
   Bir tamsayının benzersiz(tekrarsız) basamaklarının toplamını bulmak için kodu yazınız.
    Örnek:12133455 ´ 2+4=6
    */

    public static void main(String[] args) {
        int a = 12133455;

        String str = String.valueOf(a);

        int sum =0;

        for (int i=0; i<str.length();i++){

            String b = str.substring(i,i+1);
            if (str.indexOf(b)==str.lastIndexOf(b)){
                sum += Integer. valueOf(b);
            }


        }
        System.out.println("sum = " + sum);


    }









}
