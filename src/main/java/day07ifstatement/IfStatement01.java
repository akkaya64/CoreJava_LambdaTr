package day07ifstatement;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {

        //Ex 1: Verilen character buyuk harf ise ekrana "Buyuk Harf" yazdiran
        // küçük harf ise ekrana "Kücük harf" yazdıran kodu olusturunuz

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz...");
        char ch = input.next().charAt(0);//char ile bana karakter vericek


        //1.Yol
        if(ch>='A' && ch<='Z') {
            System.out.println("Büyük Harf...");
        }
        if(ch>='a' && ch <='z'){
            System.out.println("Kücük Harf...");
        }


        //2.Yol
        if(ch>='A' && ch<='Z') {
            System.out.println("Büyük Harf...");
        }else if (ch>='a' && ch <='z'){
            System.out.println("Kücük Harf...");
        }else{
            System.out.println("Harf değil...");
        }











    }


}
