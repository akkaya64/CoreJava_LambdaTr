package zoomcalisma.ternary;

public class Ex06 {
    public static void main(String[] args) {
        //6) Bir sayının mutlak değerini hesaplamak için kodu yazınız.
        //Pozitif sayılar ve sıfır mutlak değer için sayı ile aynıdır.
        //Negatif sayıların mutlak değerini bulmak için sayıyı -1 ile çarpınız.

        int sayi = 5;

        int a = sayi > 0 ? sayi : sayi * -1;
        System.out.println(a);

    }
}
