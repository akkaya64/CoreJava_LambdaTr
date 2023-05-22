package practice.advanceday02;

import java.util.Scanner;

public class Q06_ForLoop_Sekil {

    public static void main(String[] args) {

        /*
		Şekli Yazdırınız:
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        */



        for (int i=0; i<6; i++){

            char ch = 'A';
            for (int j=0; j<=i; j++ ){
                System.out.print((char)(ch +i) + " ");

            }


            System.out.println();
        }








    }
}
