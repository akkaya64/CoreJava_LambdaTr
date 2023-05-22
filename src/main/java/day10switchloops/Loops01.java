package day10switchloops;

public class Loops01 {
    /*
    Code Standart:
    1) Tekrar(Repetition) olmamalıdır.
    2) Dinamik olmalıdır.
    3) Tamir (fix) ve update (geliştirme) kolay yapılabilmelidir.
     */

    public static void main(String[] args) {

        //Ex 1: Ekrana 5 kere "Hi" yazdırınız.
        //1. Yol tavsiye edilmez
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //2. Yol:
        //Aynı adımlar tekrar tekrar yapılması gerektiğinde "loop"lar kullanılır.
        //Dört tane loop var. 1) for-loop 2)while-loop 3)do-while-loop 4)for-each-loop

        //1)****** for-loop ******
        //  başlangıç değeri  loop'un çalışma şartı, ne zamana kadar çalışcak  Increment/Decrement
        for(int i=1         ;   i<6                                          ;   i++               ){
            System.out.println("Hi");
        }

        //Ex 2: 11'den 44e kadar tüm tam sayıları ekrana yazdıran kodu yazınız.
        for (int i=11 ; i<45 ; i++ ){
            System.out.println(i);
        }

        //Ex 3: 40dan 23 e kadar tüm çift sayıların ekrana yazdıran kodu yazınız,
        for (int i=40 ; i>22 ; i--){
            if(i%2==0){
                System.out.println(i);
            }


        }

        //Ex 4: 18den 56 ya kadar tüm tek sayıları ekrana yazdıran kodu yazınız
        for (int i=18 ; i<57; i++){
            if(i%2 !=0){
                System.out.print(i + " ");//şart veriyor bize tek sayılar olursa yazdır diyo. oyüzden if kullandık
                                          // çift tırnak ile okununca aralarında boşluk oldu. "ln"i kaldırıp yan yana yazdırdık
            }
        }
















    }



}
