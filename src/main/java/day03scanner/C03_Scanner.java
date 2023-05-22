package day03scanner;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        //kullanıcıdan sayıları alarak toplama işlemi yaptıran kodu yazınız?

        Scanner input= new Scanner(System.in);

        System.out.println("lütfen toplanacak olan ilk sayıyı giriniz?");
        double sayi1= input.nextDouble();

        System.out.println("lütfen toplanacak olan ikinci sayıyı giriniz?");
        double sayi2= input.nextDouble();

        System.out.println("toplam "+ (sayi1+sayi2));










    }



}
