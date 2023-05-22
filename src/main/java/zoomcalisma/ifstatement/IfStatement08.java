package zoomcalisma.ifstatement;

import java.util.Scanner;

public class IfStatement08 {
    /*
        ABD'deki eyalet kısaltmalarının biçimini kontrol etmek için kod yazınız.

    a) Kısaltma 2'den fazla karakter içeriyor ise kodunuz, "Eyalet kısaltmaları 2 karakterden fazla olamaz" yazmalıdır.
    b) Kısaltmada küçük harfler var ise kodunuz, "Eyalet kısaltmaları küçük harf içeremez" yapmalıdır.
    c) Kısaltmanın harflerinden farklı karakterler var ise kodunuz, "Eyalet kısaltmaları aşağıdakilerden farklı
       karakterler içeremez" yazmalıdır.

Not: Kısaltmada 1'den fazla hata varsa ilgili tüm hata mesajları yazdırılmalıdır.
örnek; "fl3" için kodunuz; "Eyalet kısaltmaları 2 karakterden fazla olamaz", "Eyalet kısaltmaları
küçük harf içeremez", ve "Eyalet kısaltmaları aşağıdakilerden farklı karakterler içeremez"
yazmalıdır.

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Eyalet kısaltmaları giriniz");
        String eyalet = input.next();

        if (eyalet.length()>2){
            System.out.println("Eyalet kısaltmaları 2 karakterden fazla olamaz");
        }
        if (eyalet.replaceAll("[A-Z\\p{Punct}]","").length()>0){
            System.out.println("Eyalet kısaltmaları küçük harf içeremez");

        }
        if (eyalet.replaceAll("[a-zA-Z]","").length()>0){
            System.out.println("Eyalet kısaltmaları aşağıdakilerden farklı\n" +
                    "       karakterler içeremez");

        }


    }
}

