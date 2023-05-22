package homework;

import java.util.Scanner;

public class NestedIf03Prtc {

    public static void main(String[] args) {

        /*
            Password'un ilk harfi buyuk harf ise
           'A' olursa gecerli password yazdirin degilse "gecersiz password" yazdirin

            Passwordun ilk harfi kucuk harf ise
           'z' olursa gecerli passworde yazdirin degilse "gecersiz password" yazdirin

        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz...");
        String sifre = input.nextLine();

        char firstChar = sifre.charAt(0);

        if(firstChar>='A'&& firstChar<='Z') {

            if (firstChar == 'A') {
                System.out.println("Geçerli Şifre...");
            } else {
                System.out.println("Geçersiz Şifre çünkü 'A' değil...");
            }
        } else if (firstChar>='a'&& firstChar<='z') {

            if (firstChar =='z'){
                System.out.println("Geçerli Şifre...");
            }else {
                System.out.println("Geçersiz Şifre çünkü 'z' değil...");
            }

        }else{
            System.out.println("Geçerli şifre için lütfen harf giriniz...");
        }


    }
}
