package homework;

import java.util.Scanner;

public class NestedIf01Prtc {

    public static void main(String[] args) {
        /*
        Example 1: Kullanicidan 3 tane sayi aliniz.
          Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
          Eger ucgen ise "eskenar"
          Ucgen olma durumunu
          kontrol ediniz.
          INFO :
          Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
                           herhangi iki kenar farki ucuncu kenardan kucuk olmali
           a+b>c>a-b
           a+c>b>a-c
           b+c>a>b-c
           a=b=c ise eskenar ucgen
    */


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen üçgenin kenarları için 3 sayı giriniz");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        boolean ucgenMi = (a+b>c && c>Math.abs(a-b)) && (a+c>b && b>Math.abs(a-c)) && (b+c>a && a>Math.abs(b-c));


        if(a<=0 || b<=0 || c<=0){
            System.out.println("Üçgenin kenarları negatif olamaz...");

        }else if(ucgenMi){

            if (a==b && b==c && a==c){
                System.out.println("Üçgen hem de eşkenar üçgen...");
            }else{
                System.out.println("Ücgen ama eşkenar değil...");
            }

        }else {
            System.out.println("sen üçgen değilsin...");
        }














    }
}
