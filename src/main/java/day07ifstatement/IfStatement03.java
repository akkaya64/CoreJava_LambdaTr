package day07ifstatement;

import java.util.Scanner;

public class IfStatement03 {

    public static void main(String[] args) {

        //Ex 3: Verilen bir sayının pozitif, negatif veya nötr olduğunu kontrol eden kodu yazınız.
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz...");
        int num = input.nextInt();

        if(num > 0){
            System.out.println("Pozitif");
        }else if(num < 0){
            System.out.println("Negatif");
        }else{
            System.out.println("Nötr");
        }






    }




}
