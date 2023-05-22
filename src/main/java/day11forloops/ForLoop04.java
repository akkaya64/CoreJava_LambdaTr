package day11forloops;

public class ForLoop04 {

    public static void main(String[] args) {

        //Ex 1: 5ten 8e kadar tam sayıların toplamını veren kodu yazınız.
        // 5, 6, 7, 8 ==>26

        int s = 0;
        for (int i =5 ; i <9 ; i++) {
            s+=i;
        }
        System.out.println("Toplam " + s );//26

        //Ex 2: 7'den 9'a kadar tam sayıların çarpımını veren kodu yazınız.
        int t = 1;
        for (int i = 7; i < 10; i++) {
            t*=i;
        }
        System.out.println(t);





    }
}
