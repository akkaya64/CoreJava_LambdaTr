package day08nestedifternary;

import java.util.Scanner;

public class NestedIf04 {

    public static void main(String[] args) {

        /*
            Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra

            Eger calisan kadin ise;
            60 yasindan buyukse “Emekli Olabilir “yazdirin

            Eger calisan erkek ise;
            65 yasindan buyukse “Emekli Olabilir” yazdiran kodu olusturunuz
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Cinsiyetinizi giriniz. Erkek, Kadın, Diğerleri");
        String gender = input.next();

        System.out.println("Yaşınızı giriniz...");
        int age = input.nextInt();

        if(age<0 || age>120){//geçersiz değerler için methodu ilk başlara yaz
            System.out.println("Lütfen yaşı 0 ile 120 arasında giriniz");
        }else if(gender.equalsIgnoreCase("Kadın")){

            if(age>60){
                System.out.println("Emekli olabilir...");
            } else{
                System.out.println("Calışmalı...");
            }

        } else if (gender.equalsIgnoreCase("Erkek")) {

            if(age>65){
                System.out.println("Emekli olabilir...");

            }else{
                System.out.println("Kesinlikle Çalışmalı...");
            }


        }else{
            System.out.println("Tanımlı değil...");
        }


    }



}
