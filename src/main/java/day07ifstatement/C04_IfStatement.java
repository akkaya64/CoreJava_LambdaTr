package day07ifstatement;

import java.util.Scanner;

public class C04_IfStatement {

    /*
    Ex 1: Kullanıcıdan yaş değerini alan ve yaşın yaşın hangi evrede olduğunu aşağıdaki tabloya göre yazdıran kodu oluşturunuz

    0-4 yaş ==> bebek
    5-12 yaş ==> çocuk
    13-20 yaş ==> genç
    21-30 yaş ==> yetişkin
    tanımlanmamış evre
    hata mesajı olarak "Geçerli bir yaş giriniz?" yazdırınız

    */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir yaş aralığını giriniz");
        int yas = input.nextInt();
        if (yas < 0) {
            System.out.println("geçerli bir yaş giriniz");
        }else if(yas < 4){
            System.out.println("Bebek");
        } else if (yas < 13) {
            System.out.println("Çocuk");
        } else if(yas < 21){
            System.out.println("Genc");
        }else if(yas < 31){
            System.out.println("Yetiskin");
        }else{
            System.out.println("Tanimlanmamis evre");
        }

    }






}
