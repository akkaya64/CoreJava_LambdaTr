package day08nestedifternary;

import java.util.Scanner;

public class NestedIf02 {

    public static void main(String[] args) {

        //Kullanicidan bir ucgenin kenar uzunlugunu aliniz
        // Uc kenari birbirine esit ise "Eskenar Ucgen " yazdiriniz
        //Sadece iki kenar uzunlugu biribirine esit ise "Ikizkenar ucgen"
        //Tum kenarlari birbirinden farkli ise "Cesitkenar Ucgen" yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen üçgenin kenarları için 3 tane uzunluk giriniz...");
        double a = input.nextDouble(); //üçgenin kenarlarını girmek için girdi methodumuz.
        double b = input.nextDouble();
        double c = input.nextDouble();
        boolean ucgenMi= (a+b>c && c>Math.abs(a-b)) && (a+c>b && b>Math.abs(a-c)) && (b+c>a && a>Math.abs(b-c));//üçgen mi değil mi incelemek için böyle yaptık

        if(a<=0 || b<=0 || c<=0){
            System.out.println("Geçerli kenar uzunluğu olamaz");
        }else if(ucgenMi){

            if(a==b && b==c && a==c){
                System.out.println("Eşkenar");

            } else if (a==b || b==c || a==c) {
                System.out.println("İkiz kenar");

            } else {
                System.out.println("Ceşit Kenar");
            }


        }else{
            System.out.println("ücgen değil...");
        }
















    }











}
