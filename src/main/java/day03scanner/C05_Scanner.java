package day03scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {
        //kullanıcıdan bir dikdörtgenin en ve boyunu alan, çevresini hesaplayan kodu yazınız?

        Scanner input= new Scanner(System.in);

        System.out.println("dikdörtgenin enini kenarını giriniz?");
        int en= input.nextInt();

        System.out.println("dikdörtgenin boyunu kenarını giriniz?");
        int boy= input.nextInt();

        int alan= en*boy;
        int cevre= 2*(en+boy);

        System.out.println("cevre= " + cevre);
        System.out.println("alan= " + alan);














    }



}
