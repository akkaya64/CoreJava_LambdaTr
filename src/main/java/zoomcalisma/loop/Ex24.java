package zoomcalisma.loop;

import java.util.Scanner;

public class Ex24 {

    /*
    Kullanıcıya kaç tane fibonacci sayısı görmek istediğini sorunuz. Ardından bu fibonacci
sayılarını yazdıran kodu yazınız.
Örnek: kullanıcı 6 girerse çıktı 1 1 2 3 5 8 olacaktır
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("kaç tane fibonacci sayısı görmek istediğinizi giriniz ");
        int n = input.nextInt();

        int a =1;
        int b =1;
        int c ;
        System.out.print(a+" "+ b + " ");

        int i=2;
        do {
            c=a+b;
            System.out.print(c + " ");
            a=b;
            b=c;
            i++;

        }while (c<n);








    }
}
