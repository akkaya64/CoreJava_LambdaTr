package day02datatypesmethodcreation;

import java.sql.SQLOutput;

public class Variables01 {

    //primitive data types---> char, boolean, byte, short, int, long, float, double
    //float: virgüllü sayılar için kullanılır, ondalık sayılar (decimal numbers), memoryde daha az yer kaplar virgülden sonrası (ücretlerde fiyatlandırmalarda kullanılır 12.99)
    //double: virgüllü sayılar için kullanılır, ondalık sayılar (decimal numbers) daha fazla yer kaplar. virgülden sonrası (bir hücrenin ağırlığı: 0,000000)

    // NOTE 1: primitive data type'lerını java oluşturmuştur, biz oluşturamayız
    // NOTE 2: primitive data type'larının isimlerinde küçük harf kullanılır
    // NOTE 3: primitive datalar data typle'lara göre farklı farklı yer kaplarlar
    // NOTE4 : primitive datalar içlerinde sadece sizin atadığınız değeri barındırırlar

    public static void main(String[] args) {

        // örnek: gömlek ve ayakkabı fiyatları için iki tane variable oluşturup toplam fiyatı ekrana yazdırınız?
        // java ondalık sayıyı otomatik olarak "double" kabul eder.
        //float olmasında ısrar ediyorsanız "F" ya da "f" koymalısnız.
        //float memoryde 4 byte yer kaplar, double 8 byte yer kaplar.
        float shirtPrice= 12.99F;
        float shoesPrice = 15.89F;
        //System.out.println() ekrana yazdırı ve "pointer" i bir sonraki satıra koyar
        //System.out.print() ekrana yazdırı ve " pointer" i aynı satırda tutar

        System.out.println(shirtPrice + shoesPrice);
        System.out.print(shirtPrice);
        System.out.println();

        //örnek2: hücre ağırlığı ve amipin ağırlığı için iki tane variable oluşturun ve ağırlıkları farkını ekrana yazdırın?
        double weightCell = 0.0000000112;
        double weightAmip = 0.00000000023;
        System.out.println(weightAmip - weightCell);//-1.097E-8 E ni anlamı "1.9 çarpı 10 üzeri -8" "E ==>Exponent"



    }

}
