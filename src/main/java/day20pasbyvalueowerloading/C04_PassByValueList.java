package day20pasbyvalueowerloading;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList {

    public static void main(String[] args) {

         /*
       bir list oluşturalım.
       sonra list elemanlarını degiştir methodu yazıp orada
       list elemanlarından bazılarını degiştirelim.
       method void olsun.
       main methoda döndükten sonra yeniden listi yazdıralım
       */
        List<String> harfler = new ArrayList<>();
        harfler.add("A");
        harfler.add("B");
        harfler.add("C");
        harfler.add("D");

        listElemanlariniDegistir(harfler);
        System.out.println("main içindeki methodtan sonra harfler = " + harfler);//main içindeki harfler = [R, B, C, D]
        //Listemizde içindeki elemanlardan bir ya da birkaçını değiştirdiğimizde listeyi değiştirmiş olmuyoruz. 
        //Pass By Value Array ve List'lerde de aynen geçerlidir değerini korur. 
        //Ama Listenin kendisini değiştirmiş olmuyoruz

        ListDegistir(harfler);
        System.out.println("Main içinde methodtan sonra harfler = " + harfler);// = [R, B, C, D]

    }//main

    private static void ListDegistir(List<String> harfler) {
        harfler = new ArrayList<>();
        System.out.println("Methodta yeni list harfler = " + harfler);//[]


    }

    private static void listElemanlariniDegistir(List<String> harfler) {

        harfler.set(0, "R");
        System.out.println("method içindeki harfler = " + harfler);//method içindeki harfler = [R, B, C, D]


    }//method


}
