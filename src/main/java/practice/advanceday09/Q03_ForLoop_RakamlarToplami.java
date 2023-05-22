package practice.advanceday09;

import java.util.Scanner;

public class Q03_ForLoop_RakamlarToplami {
    /*
     Kullanıcıdan alınan bir String içerisindeki rakamların toplamını hesaplayan bir method yazınız.
     Örn:
     input : J4\/4 1$ 34$¥
     output : 16
     İpucu:
     Character.isDigit()
     Integer.valueOf()
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir String giriniz");
        String str = scanner.nextLine();
        System.out.println(rakamlarToplami(str));


    }

    static double rakamlarToplami(String str) {
        int toplam = 0;
        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {
                toplam += Integer.parseInt("" + str.charAt(i));
            }

        }
        System.out.println("toplam : " + toplam);//toplam 16
        return toplam;
    }


}
