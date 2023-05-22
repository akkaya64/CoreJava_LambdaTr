package day10switchloops;

import java.util.Scanner;

public class Switch02 {

    public static void main(String[] args) {
        //Ex 1: Kullanıcıdan iki sayı ve yapılacak işlemi alan ve toplama, çıkarma, çarpma, bölme , yüzde işlemlerini yapan kodu yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen iki sayı giriniz...");
        double a = input.nextDouble();
        double b = input.nextDouble();

        System.out.println("Yapılacak işlemi giriniz... +, -, *, /, % dan birini seçiniz...");
        char opr = input.next().charAt(0);//tek karakter olduğu icin ve ilk karakteri almak için işlemler, oyüzden charAt yaptık.
        switch (opr){
            case '+':
                System.out.println(a + "+" + b + "=" + (a+b));   //cift tırnağa koy toplamı öyle olur tek tırnağa toyarkan charın içinde olduğu için ascii değerini verir
                break;
            case '-':
                System.out.println(a + "-" + b + "=" + (a-b));
                break;
            case '*':
                System.out.println(a + "*" + b + "=" + (a*b));
                break;
            case '/':
                System.out.println(a + "/" + b + "=" + (a/b));
                break;
            case '%':
                System.out.println(a + "%" + b + "=" + (a*b/100));
                break;
            default:
                System.out.println("Bu işlem tanımlanmamıştır...");

        }






    }
}
