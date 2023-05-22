package day22staticblocksconstructors;

public class StaticBlocks01 {

    //Bir variable olusturdugunuzda deger atamazsaniz o variable'i "initalize" (baslatmak) etmediniz demektir
    //static variable'lar static block'lar icinde initialize edilirse o classin icinde her seyden once hazir hale getirilmis olur.
    //Bazen main method calistirilmadan once vsriable'larin hazir hale getirilmesi gerekir. Bu yuzden static blocklar kullanilir.

    //NOT1: Static block'lar static variable'lari initialize etmek icin kullainilirlar
    //Static blocklar class icinde her seyden once calistirilirlar.
    static double pi;
    static String shape;

    //staticblocks : main motor çalıştırılmadan önce variable ları hazır hale getirir
    static {
        pi = 3.14;
        System.out.println("Static block 1");

    }

    static {
        shape = "Circle";
        System.out.println("Static block 2");
    }

    public static void main(String[] args) {
        //main icine koydugun her sey static olmali// pi = 3.14;

        System.out.println("Main method");

    }


}
