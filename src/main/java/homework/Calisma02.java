package homework;

import java.util.Scanner;

public class Calisma02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz...");
        String character = input.nextLine();

        char ch = character.charAt(0);

        if(ch>='a' && ch<='z' || ch>='A'&& ch<='Z'){
            System.out.println("Girilen karakter harf..");

        }else {
            System.out.println("Girilen karakter harf değil..");

        }


        Scanner scan = new Scanner(System.in);
        System.out.println("100 üzerinden not giriniz");

        int point = input.nextInt();
        if(point< 50 ){
            System.out.println('D');

        } else if (point>=50 && point<60) {
            System.out.println('C');
            
        } else if (point>= 60 && point<80) {
            System.out.println('B');
            
        } else if (point>= 80 && point<=100) {
            System.out.println('A');
            
        }else System.out.println("Geçerli bir not giriniz");


    }
}
