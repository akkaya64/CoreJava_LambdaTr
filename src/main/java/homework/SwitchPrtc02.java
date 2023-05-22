package homework;

import java.util.Scanner;

public class SwitchPrtc02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz... 10, 100, 1000...");
        int a = input.nextInt();

        switch (a){
            case 10:
                System.out.println("İki basamaklı en küçük sayı...");
                break;
            case 100:
                System.out.println("Üç basamaklı en küçük sayı...");
                break;
            case 1000:
                System.out.println("Dört basamaklı en küçük sayı...");
                break;
            default:
                System.out.println("Girdiğin sayıyı değiştir...");


        }



    }
}
