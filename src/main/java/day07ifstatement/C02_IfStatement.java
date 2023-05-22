package day07ifstatement;

import java.util.Scanner;

public class C02_IfStatement {

    //kullanıcı gün numarasını girsin kod gün ismini yazsın.
    // 1 ==> Pazar 2 ==> Pazartesi   5 ==> Perşembe...

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen gün numarasını giriniz....\n 1 : Pazar 2: Pazartesi 3: Salı 4: Çarşamba 5: Perşembe 6:Cuma 7: Cumartesi");
        byte gunNo = input.nextByte();

        if(gunNo==1){
            System.out.println("Pazar");
        }else if(gunNo==2){
            System.out.println("Pazartesi");
        } if(gunNo==3){
            System.out.println("Salı");
        }else if(gunNo==4){
            System.out.println("Çarşamba");
        } if(gunNo==5){
            System.out.println("Perşembe");
        }else if(gunNo==6) {
            System.out.println("Cuma");
        }else if (gunNo==7){
            System.out.println("Cumartesi");

        }else
            System.out.println("Lütfen gün numarasını giriniz....\n 1 : Pazar 2: Pazartesi 3: Salı 4: Çarşamba 5: Perşembe 6:Cuma 7: Cumartesi");
        //en son "else" yapmamızın sebebi kullanıcı bu verilen rakamlar dışında bir numara girerse hatırlatma olarak "sadece bu numaraları kullanabilirsin" diyoruz.














    }






}
