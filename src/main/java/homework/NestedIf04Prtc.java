package homework;

import java.util.Scanner;

public class NestedIf04Prtc {

    public static void main(String[] args) {

              /*
                 Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra

                 Eger calisan kadin ise;
                 60 yasindan buyukse “Emekli Olabilir “yazdirin

                 Eger calisan erkek ise;
                 65 yasindan buyukse “Emekli Olabilir” yazdiran kodu olusturunuz
             */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz Kadın, Erkek, Diğerleri...");
        String cinsiyet = input.next();
        System.out.println("Lütfen yaşınızı giriniz...");
        int yas = input.nextInt();

        if(yas<0 || yas>120 ){
            System.out.println("Lütfen geçerli bir yaş aralığı giriniz...");
        } else if (cinsiyet.equalsIgnoreCase("Kadın")) {
            if(yas>60){
                System.out.println("Emekli olabilir");
            } else{
                System.out.println("Calışabilir...");
            }


        } else if (cinsiyet.equalsIgnoreCase("Erkek")) {
            if(yas>65){
                System.out.println("Emekli olabilir...");
            }else{
                System.out.println("Çalışabilir...");
            }

        }else{
            System.out.println("Tanımlı değil...");
        }


    }











}
