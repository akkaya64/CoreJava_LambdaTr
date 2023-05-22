package day04memorykullanimwrapperclassascii;

public class C03_MantikOperatorleri {

    // 10< sayi MantikOperatörü sayı< 20;
    // == Eşittir için çift eşittir kullanılır  = tek eşittir atama (assiagment) yapar

    /*
    Java üçlü karşılaştırma kabul etmez
    ikili karşılaştırmalar yapıp mantık Operatörleriyle birleştirmeliyiz


    && ==> ve and,  || or operatörü "veya" demek

    "&&"  ve operatörü mükemmeliyetçidir. doğru olması için hepsinin true olması gerekir;

    Cay  ve    Limon
    +    &&     +      = true
    +    &&     -      = false
    -    &&     +      = false
    -    &&     -      = false

    ***  && ile & farkı;
                        &&'de bollean sonuçta bir tane false bulunca durur
                        & 'de ise tüm satırı tarar sonra durur.
                        buda &&'in &'den daha hızlı çalışmasını sağlar.

   "||" veya operatörü Polyannacıdır. En ufak bir pozitiflikten true döner;

   Cay     veya      Limon
    +       ||         +     = true
    +       ||         -     = true
    -       ||         +     = true
    -       ||         -     = false
*/

    public static void main(String[] args) {

        System.out.println(5+2 == 8); // false cevabını aldık konsolda çünkü sonuç 7

        boolean sonuc1 = 5>4 && 7<9 && 6+3 ==9  && 5+2 !=8;
        System.out.println(sonuc1); //true

        boolean sonuc2= 5>4 && 7>9 && 6+3 ==9 && 5+2==7;
        System.out.println(sonuc2);//false çünkü mükemmelliyetçi ve'yi sectiğimiz için tek bir hata olunca sonuc false olur.

        int sayi1= 15;
        System.out.println(10 < sayi1 && sayi1 < 20 ); //true

        int sayi2= 5;
        System.out.println(sayi2<10 || sayi2>20); // çünkü "||" operatöründe tek bir hata olsa bile true olarak kabul eder çünkü polyannaydı, mükemmelliyetçi değildi.










    }








}
