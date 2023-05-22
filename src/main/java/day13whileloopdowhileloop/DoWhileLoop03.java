package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {
    public static void main(String[] args) {

        /*
       Geçerli Username="admin"  Password="pwd123"dur
       Kullanıcıdan username ve pasword'ü alın.
       username ve pasword doğru ise konsola "Hesabınıza hoşgeldiniz!" yazdırın.
       username veya pasword yanlış ise 4 kere "Username ve pasword'unuzu giriniz" mesajı versin
       username veya pasword 4. kere yanlış girilirse "Hesabınız bloke olmuştur" mesajı vererek
       işlemi tamamlayınız
       */

        Scanner input = new Scanner(System.in);


        int counter = 0;

        do{
            if(counter==4){
                System.out.println("Hesabınız bloke olmuştur!");
                break;
            }

            System.out.println("Username'i giriniz...");
            String username = input.next();

            System.out.println("Password'ü giriniz...");
            String password = input.next();

            if(username.equals("admin") && password.equals("pwd123")){
                System.out.println("Hesabınıza hoşgeldiniz!");
                break;

            }
            counter++;

        }while (true);//while içine true yazınca sonsuz loop yaptın ve oyüzden loopun içine break yazman gerekir

    }
}
