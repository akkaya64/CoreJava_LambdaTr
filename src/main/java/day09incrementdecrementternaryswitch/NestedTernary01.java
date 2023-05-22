package day09incrementdecrementternaryswitch;

public class NestedTernary01 {

    public static void main(String[] args) {

        //Ex 1: Verilen yılın "Artık Yıl" (Leap Year)olup olmadığını kontrol eden kodu yazınız.
        //                   1) Yıl 100e bölünüyorsa 400e de bölünmelidir. 1600==> leap   1800 ==> leap değildir.
        //                   2) Yıl 100 e bölünmüyorsa 4'e bölünmelidir. 2004==> leap    2005==> leap değildir.

        int year = 1600;
        String resault = year%100==0 ? (year%400==0 ? "Leap" : "Not Leap") : (year%4==0 ? "Leap" : "Not Leap");
        System.out.println(resault);//Leap




    }






}
