package day11forloops;

import java.util.Scanner;

public class C07_NestedLoop {

    public static void main(String[] args) {

        /*
        Type code to print the following image on the console
        (Aşağıda gördüğünüz şekli yazdıran kodu oluşturunuz.)

        X X X X X
        X X X X X
        X X X X X
                */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen satır ve sütun bilgisini giriniz...");
        int satir = input.nextInt();
        int sutun = input.nextInt();

        for (int i = 1; i <= satir ; i++) {
            String str = "";
            for (int j = 1; j <= sutun ; j++) {
                str= str+"X ";

            }
            System.out.println(str);

        }









    }

}
