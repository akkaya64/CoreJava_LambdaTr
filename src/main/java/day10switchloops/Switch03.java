package day10switchloops;

import java.util.Scanner;

public class Switch03 {

    public static void main(String[] args) {

        /*
         Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
            Type code to print abbreviation of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"
            Kullanicidan bir ulke ismi aliniz.Alinan ulke adina gore kisaltmalari yazdiriniz

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ülke ismi giriniz");
        String countryName = input.nextLine();//toLowerCase; burda da kullanabiliriz burda kullan özellikle

        switch (countryName.toLowerCase()){ // ülke ismini aldıktan sonra toLowerCase yap, ülke ismini küçük harf yapmış olursun. küçük harf büyük harf duyarlılığı kaldırdık
            case "amerika":
                System.out.println("US");
                break;
            case "england":
                System.out.println("UK");
                break;
            case "germany":
                System.out.println("DE");
                break;
            case "turkey":
                System.out.println("TR");
                break;
            case "ındia":
                System.out.println("IN");
                break;
            case "peru":
                System.out.println("PE");
                break;
            case "spain":
                System.out.println("ES");
                break;
            case "albania":
                System.out.println("AL");
                break;
            case "france":
                System.out.println("FR");
                break;
            case "bulgaria":
                System.out.println("BG");
                break;
            default:
                System.out.println("Lütfen geçerli bir ülke ismi giriniz...");




        }







    }
}
