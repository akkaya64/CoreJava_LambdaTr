package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop02 {
    public static void main(String[] args) {

        /*
        Kullanıcıdan bir tam sayı alınız
        Tam sayı 100'den küçük ise kullanıcıya "Kaybettiniz!" mesajı
        vererek oyunu sonlandırınız.
        Tam sayı 100 ve 100'den büyük ise "Kazandınız!" mesajı vererek
        oyuna devam ettiriniz.

         */

        Scanner input = new Scanner(System.in);

        int num =0;

        do {
            System.out.println("Bir sayı giriniz");
            num = input.nextInt();

            if(num>=100){
                System.out.println("Kazandınız!");

            }

            /*
                scope== curly braces icinde kullanilan degerler body'nin disinda kullanilinca hata verir
                (kirmizi renk olur)
                dolayisiyla do'nun body'sinddeki num bodynin disinkdaki while'da hata verir
            */

        }while (num>=100);

        System.out.println("Kaybettiniz!");




    }
}
