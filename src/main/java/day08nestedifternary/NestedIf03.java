package day08nestedifternary;

import java.util.Scanner;

public class NestedIf03 {

    public static void main(String[] args) {
        /*
            Password'un ilk harfi buyuk harf ise
           'A' olursa gecerli password yazdirin degilse "gecersiz password" yazdirin

            Passwordun ilk harfi kucuk harf ise
           'z' olursa gecerli passworde yazdirin degilse "gecersiz password" yazdirin

        */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen paswordunuzu  giriniz...");
        String pwd = input.nextLine();//kullanıcı gircek

        char firstChar = pwd.charAt(0);//methodu yazdık çünkü charAt(0) yazdığımızda 6 kere kullanmıştık ve 6 kere String clasa gidip kullandık demek
                                       // bu da çok yavaşlatır. bir methodu bir kere kullanıp sonucu veriable içine koy daha iyi olur.
                                       //çocuk bakkal örneğinde çocuk 6 kere bakkala gidip gelmesin diye tek bir canta oluşturup içine tüm ekmekleri koyması gibi.
        if (firstChar >= 'A' && firstChar <= 'Z') {

            if (firstChar== 'A') {
                System.out.println("Geçerli Pasword");
            } else {
                System.out.println("Geçersiz Pasword çünkü büyük harf ama 'A değil...");
            }

        } else if (firstChar>= 'a' && firstChar<= 'z') {

            if (firstChar == 'z') {
                System.out.println("Geçerli Pasword...");
            } else {
                System.out.println("Geçersiz Pasword çünkü küçük harf ama 'z' değil...");
            }


        } else {
            System.out.println("Ilk karakter harf olmalı...");
        }


    }

}
