package day15arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C01_Arrays {

    public static void main(String[] args) {

        //Bir ogretmenin okulundaki ogrencilerin isimlerini applicationa yuklemesini saglayan kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Kac ogrenci ismi gireceksiniz?");

        int numOfStd = input.nextInt();
        String names[] = new String[numOfStd];

        System.out.println("Cikmak istiyorsaniz lutfen Q harfine basiniz.");

        for (int i = 1; i <= numOfStd; i++) {

            System.out.println("Lutfen" + i + ". ogrencinin ismini giriniz.");
            String stdNames = input.next();
            if (stdNames.equalsIgnoreCase("Q")) {
                break;
            }


            names[i - 1] = stdNames;

        }

        System.out.println(Arrays.toString(names));//[zisan, reyyan]


    }
}
