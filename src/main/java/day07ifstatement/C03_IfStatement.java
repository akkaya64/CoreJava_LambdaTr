package day07ifstatement;

import java.util.Scanner;

public class C03_IfStatement {

    public static void main(String[] args) {

     /*
     İki tane String data'nın birbirine eşit olup olmadığını anlamak için "==" değil; equals() methodunu kullanırız.
     i)equal() methodu ==> büyük küçük harf önemser.
     ii) equalsIgnoreCase () ==> büyük kücük harf önemsemez aynı kabul eder.
     */

        //Ex: Kullanıcıdan gün isimlerini alınız hafta içi mi hafta sonu mu olduğunu yazdıran kodu oluşturunuz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen gün ismi giriniz?" );
        String gunIsmi= input.next();

        if(gunIsmi.equalsIgnoreCase("Cumartesi")|| gunIsmi.equalsIgnoreCase("Pazar")){
            System.out.println("Hafta sonu");
        } else if (gunIsmi.equalsIgnoreCase("Pazartesi")||
                gunIsmi.equalsIgnoreCase("Salı") ||
                gunIsmi.equalsIgnoreCase("Çarşamba")||
                gunIsmi.equalsIgnoreCase("Perşembe")|
                        gunIsmi.equalsIgnoreCase("Cuma")){
            System.out.println("Hafta içi");
        }else {

            System.out.println("Geçerli bir gün ismi giriniz");
        }

        //2.Yol:
        boolean haftaIci = gunIsmi.equalsIgnoreCase("Pazartesi")||
                gunIsmi.equalsIgnoreCase("Salı") ||
                gunIsmi.equalsIgnoreCase("Çarşamba")||
                gunIsmi.equalsIgnoreCase("Perşembe")|
                        gunIsmi.equalsIgnoreCase("Cuma");
            System.out.println("Hafta içi");

        boolean hataSonu = gunIsmi.equalsIgnoreCase("Cumartesi")|| gunIsmi.equalsIgnoreCase("Pazar");
            System.out.println("Hafta sonu");

        if (haftaIci) {

            System.out.println("Hatfa içi");

        } else if (hataSonu) {
            System.out.println("Hafta sonu");

        }else
            System.out.println("Geçerli bir gün ismi giriniz");//yanlış yazılır









    }






}
