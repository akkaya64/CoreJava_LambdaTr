package day28exceptions;

public class Exceptions01 {
    /*
    1)Exception demek beklenmekdik problem demektir. Seyehatte benzinin bitmesi arabanın bozulması gibi...

    2)Gerçek hayatta karşılaştığımız beklenmedik problemler için çözüm yollarımız vardır. Mesela benzin bitince
    yol yardımı ararız.
     Application'larda da beklenmedik problemler için çözüm yolları üretmeliyiz, bu işleme "Exception Handling" denir.

    3)Exception'lar temel olarak ikiye ayrılırlar
                        i)Compile Time Exception:  Siz kod yazarken fark edilir ve yazdığınız kodun altı
                                                   kırmızı çizgi ile çizilir
                        ii)Run Time Exception:    Siz code yazarken farkedilmez ama kod'u çalıştırdığınızda
                                                  konsolda hata alırsınız

    4)Exception'lar dışında "Error" diye adlandırdığımız "Handle" (çözüm) edilemeyen problemler vardır.
      Gerçek hayatta şöförün ölmesi gibi, handle edilemeyecek durumlar "Error"dur
      Application'larda "Memory"nin dolması "Error"dur.
      Iki tür memory var i)Stack Memory dolarsa "StackOverFlow Error" alırsınız.
                         ii)Heap Memory dolarsa "OutOfMemory Error" alırsınız.
    5)Yazdiginiz kod calismadiginda problemi bulmak icin "Log" lara bakariz.
    6)Neden if-else kullanmak yerine try-catch kullanıyoruz?
       if else kullanirsak olusabilecek her problemi spesifik olarak if parantezinin içine yazmamız gerekir.
       Bu da ciddi bir matematik bilgisi gerektirir ve yazacağımız kod'u çok uzatır
       Ama try catch'te Java ilgili Excaption'la alakalı oluşabilecek bütün problemleri yakalar.
     */

    public static void main(String[] args) {

        int a = 12;
        int b = 0;

        divide(a, b);

        divide2(a, b);


    }


    //ArithmeticExcaption yazdığınız kod'dan matematiksel işlem kullanıyorsanız alınabilecek bir Exception'dir
    //Nasıl Handle edileceğini aşağıda yazdık
    public static void divide(int a, int b) {

        try {

            System.out.println(a / b);
            System.out.println("I am here");

        } catch (ArithmeticException e) {

            System.out.println("Do not divide by zero");
        }

        System.out.println("You are here");//handle'dan sonra he şey çalışır

    }

    //"Exception Handlin" de if-else kullanılmaz Bakınız 6.madde
    public static void divide2(int a, int b) {

        if (b == 0) {

            System.out.println("Dont divide by zero");

        } else {

            System.out.println(a / b);
        }

    }

}
