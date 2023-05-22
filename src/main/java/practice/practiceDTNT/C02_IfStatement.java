package practice.practiceDTNT;

import java.util.Scanner;

public class C02_IfStatement {

    public static void main(String[] args) {
        /*
        *************HESAP MAKİNESİ KODU************
        Kullanıcıdan alacağınız iki sayıyı yine kullanıcıya seçtireceğiniz dört işlemden
        biri ile işleme koyup yazdırınız.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen\n toplama yapmak için 1\n çıkarma yapmak için " +
                "2\n çarpma yapmak için 3\n bölme yapmak için 4 giriniz...");//kullanıcıya seçmesi için menü oluşturduk

        int islem = input.nextInt();
        System.out.println("Lütfen iki tam sayı giriniz...");

        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        if(islem== 1){
            System.out.println("Toplama işleminin sonucu: " + num1 + "+"+ num2 +"=" +(num1+num2));

        } else if (islem==2) {
            System.out.println("Çıkarma işleminin sonucu: " + num1 + "-"+ num2 +"=" +(num1-num2));

        } else if (islem==3) {
            System.out.println("Çarpma işleminin sonucu: " + num1 + "*"+ num2 +"=" +(num1*num2));

        } else if (islem==4) {
            System.out.println("Bölme işleminin sonucu: " + num1 + "/"+ num2 +"=" +(num1/num2));

        }else{
            System.out.println("Hatalı seçim yaptınız tekrar deneyiniz...");
        }


    }










    }













