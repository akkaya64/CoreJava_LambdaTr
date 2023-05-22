package practice.practiceDTNT;

import java.util.Scanner;

public class C01_IfStatement {

    public static void main(String[] args) {

        /*
        Kullanıcıdan bir gün alın eğer gün Cuma ise "Müslümanlar için mübarek gün"
        Eğer gün Cumartesi ise "Yahudiler için kutsal gün"
        Eğer gün Pazar ise "Hristiyanlar için kutsal gün" yazdıran kodu oluşturunuz.

       */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir gün ismi giriniz");
        String day = input.next().toLowerCase();//küçük harf yaptık

        if(day.equals("cuma")){
            System.out.println("Müslümanlar için mübarek gün...");//equals ile harflerin büyük küçüklüğüne ne verirse versin hepsi küçük harf yaptık yukarda komutumuz toLowerCase çünkü.

        } else if (day.equals("cumartesi")) {
            System.out.println("Yahudiler için kutsal gün...");

        } else if (day.equals("pazar")) {
            System.out.println("Hristiyanlar için kutsal gün...");


        }else{
            System.out.println("Kutsal gün değil...");
        }


    }
















}
