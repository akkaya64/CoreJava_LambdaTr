package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop03 {

    public static void main(String[] args) {

        /*
    Example 1: Asagidaki sekli cizdiren kodu yaziniz
                * * * *
                * * *
                * *
                *
 */
        Scanner input = new Scanner(System.in);
        System.out.println("Row number giriniz.");
        int row = input.nextInt();

        for(int i=row; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }





    }

}
