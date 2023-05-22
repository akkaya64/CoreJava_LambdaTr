package day07ifstatement;

import java.util.Scanner;

public class IfStatement02 {

    public static void main(String[] args) {
        //Ex 2: Kullanıcıdan alınan bir sayının tek mi çift mi olduğunu yazdıran kodu yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz...");
        int num = input.nextInt();


        //1. Yol:
        if(num % 2 == 0){
            System.out.println("Çift sayı...");
        }
        if(num % 2!= 0){
            System.out.println("Tek sayı...");//2 şart kontrol edildi

        }

        //2. Yol:
        if(num % 2 == 0){
            System.out.println("Çift sayı...");
        }else{
            System.out.println("Tek sayı...");//burda 1 şart kontrol edildi ve daha hızlı olur. bu tercih edilir
        }













    }




}
