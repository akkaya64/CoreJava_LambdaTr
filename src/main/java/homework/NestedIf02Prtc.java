package homework;

import java.util.Scanner;

public class NestedIf02Prtc {

    public static void main(String[] args) {

        //Kullanicidan bir ucgenin kenar uzunlugunu aliniz
        // Uc kenari birbirine esit ise "Eskenar Ucgen " yazdiriniz
        //Sadece iki kenar uzunlugu biribirine esit ise "Ikizkenar ucgen"
        //Tum kenarlari birbirinden farkli ise "Cesitkenar Ucgen" yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen üçgenin kenar uzunluklarını giriniz...");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        boolean ucgenMi = (a+b>c && c>Math.abs(a-b)) && (a+c>b && b>Math.abs(a-c)) && (b+c>a && a>Math.abs(b-c));

        if(a<=0 || b<=0 || c<=0){
            System.out.println("Üçgenin kenarı negatif olamaz tekrar giriniz...");
        } else if (ucgenMi) {
            if (a==b && b==c && a==c){
                System.out.println("Eşkenar üçgen");
            } else if (a==b || b==c || a==c) {
                System.out.println("İkiz Kenar üçgen");
            }else{
                System.out.println("Ceşit Kenar üçgen");
            }

        }else{
            System.out.println("Ücgen değil...");
        }


    }







}
