package day08nestedifternary;

import java.util.Scanner;

public class Ternary01 {

    public static void main(String[] args) {

        //Example 1: Kullanicidan iki sayi aliniz "buyuk olmayan"(kucuk veya esit olan) sayiyi yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen iki sayı giriniz...");
        double a = input.nextDouble();
        double b = input.nextDouble();

        //1.Yol if-else
        if(a<b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }

        //2.Yol: Ternary İf-els'in yaptığı işin aynısını yapar sadece söz dizimi farklı.
        //               condition   ?    condition true ise calışır    :     condition false ise çalışır    ;
        double resault = a<b         ?          a                       :              b                     ;
        System.out.println(resault);














    }






}
