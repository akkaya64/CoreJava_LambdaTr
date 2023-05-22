package homework;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Calisma01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen iki sayı giriniz...");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if(num1>0 && num2>0){
            System.out.println(num1+num2);


        }else if(num1<0 && num2<0){
            System.out.println(num1*num2);
        }else if(num1<0 && num2>0 || num1>0 && num2<0){
            System.out.println("Farklı sayılarda işlem yapamazsın...");

        } else if (num1==0 || num2==0) {
            System.out.println("Sıfır çarpmaya göre yutan elemandır");
            
        }
        for (int i = 1; i <= 6; i++) {

            System.out.print(i + " ");

            i++;

            int arr[] = {2, 11, 0, 23, 7};



        }

    }

}




