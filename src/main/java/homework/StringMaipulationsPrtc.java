package homework;

import java.util.Scanner;

public class StringMaipulationsPrtc {

    public static void main(String[] args) {

        //Example 3: Verilen ismin ilk isminin ilk harfini ve soyisminin ilk harfini ekrana yazdırınız?
        //           "Ali Can"  ===> AC

        String name = "   ali cAN  ";
        char name1 = name.trim().toUpperCase().charAt(0);
        System.out.println(name1);

        char name2 = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(name2);

        System.out.println("" + name1 + name2);//AC

        //Example 11: Sayı -1 ile 10 arasında ise ekrana "Rakam" yazdırın

        int num = 2;
        if(num > -1 && num <10){

            System.out.println("Rakam ");//rakam
        }


        Scanner scan = new Scanner(System.in);
        System.out.println("Bir pozitif inteğer giriniz");
        int a = scan.nextInt();

        if(a>9 && a<100) {
            System.out.println("Elma");
        }
        if(a>99 && a<1000) {
            System.out.println("Armut");
        }
        if(!(a>99 && a<1000) && !(a>9 && a<100)) {
            System.out.println("Karpuz");
        }



    }
}
