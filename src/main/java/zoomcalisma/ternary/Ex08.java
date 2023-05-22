package zoomcalisma.ternary;

public class Ex08 {
    public static void main(String[] args) {
        //8) Sayı 3 basamaklı ise konsolda kodunuz "Bu sayı 3 basamaklıdır" olacaktır. Aksi takdirde,
        //kodunuz " Bu sayı 3 basamaklı değildir" olacaktır.

        int a = -123;
        a = Math.abs(a);
        String sonuc = a > 99 && a < 1000 ? "bu sayi 3 basamaklidir" : "bu sayi 3 basamakli degildir";
        System.out.println(sonuc);
    }
}
