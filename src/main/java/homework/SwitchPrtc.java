package homework;

import java.util.Arrays;
import java.util.Scanner;

public class SwitchPrtc {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen S,D,E,T kısaltmalarından birini giriniz...");
        String a = input.next().toUpperCase();

        switch (a){
            case"S":
                System.out.println("Software");
                break;
            case "D":
                System.out.println("Developer");
                break;
            case"E":
                System.out.println("Engineer");
                break;
            case "T":
                System.out.println("Tester");
                break;
            default:
                System.out.println("Lütfen geçerli bir harf giriniz...");
        }




    }









    }

