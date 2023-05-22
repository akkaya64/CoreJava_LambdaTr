package day15arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

    public static void main(String[] args) {

        // Ex 1: Kullanıcı ıle beraber bır Array olusturunuz

        Scanner input = new Scanner(System.in);
        System.out.println("Kac ogrenci ismi gireceksiniz?");
        int numOfElements = input.nextInt();

        System.out.println("Girrisi sonlandirmak icin Q tusuna basiniz");

        String stdNames[] = new String[numOfElements];//Array olusturduk

        for (int i = 1; i <= numOfElements; i++) {

            System.out.println("Lutfen " + i + ". ogrencini adini giriniz");

            String stdName = input.next();

            if (stdName.equalsIgnoreCase("Q")) {
                break;
            }

            stdNames[i - 1] = stdName;


        }

        System.out.println(Arrays.toString(stdNames));

    }
}
