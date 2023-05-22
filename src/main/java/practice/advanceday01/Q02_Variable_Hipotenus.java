package practice.advanceday01;

import java.util.Scanner;

public class Q02_Variable_Hipotenus {

    public static void main(String[] args) {

        //Hipotenüs hesaplayan bir kod yazınız.
        Scanner input = new Scanner(System.in);
        System.out.println("1. dik kenari giriniz");
        int a = input.nextInt();
        System.out.println("2. dik kenari giriniz");
        int b = input.nextInt();

        double hipotenus = Math.sqrt(a*a+b*b);//Math.sqrt() methodu karekok aliyor.
        System.out.println("Hipotenus: " +hipotenus);



    }
}
