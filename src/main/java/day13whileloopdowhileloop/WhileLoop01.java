package day13whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {
        //Ex 1: Kullanıcının verdiği sayı için carpım tablosunu oluşturup konsola yazdıran kodu yazınız.
        //       3 ==> 3*1=3  3*2=6   3*4=12...

        Scanner input = new Scanner(System.in);
        System.out.println("Carpım tablosunu görmek için bir sayı giriniz...");
        int num = input.nextInt();

        int i = 1;

        while (i<11){

            System.out.println(num + "x" + i + "=" + (num*i));

            i++;
        }

        //Ex 2: Verilen bir String'te her harfin sonrasına "*" sembolünü ekleyiniz.
        //      Java ==> J*a*v*a*

        System.out.println("Bir kelime giriniz..");
        String word = input.next();
        String newword = "";//yazılan kelimenin değişmiş halini yeni memorye koymak için bunu yaptık

        int k = 0;

        while (k<word.length()){

            newword = newword + word.charAt(k) + "*";

            k++;
        }
        System.out.println(newword);








    }
}
