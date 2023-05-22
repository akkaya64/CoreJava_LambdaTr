package day09incrementdecrementternaryswitch;

public class Ternary01 {

    public static void main(String[] args) {

        //Ex 1:

        int a = 10;
        int b = 20;

        int r1 = a < b ? a++ : ++b;

        System.out.println(r1);//10
        System.out.println(a);//11
        System.out.println(b);//20

        /*
            int r1 = a<7 ? a++ : ++b;
            System.out.println(r1);//21
            System.out.println(a);//10
            System.out.println(b);//21
        */

        //Ex 2: Verilen bir sayının mutlak değerini hesaplayan kodu yazınız.
        //      -4 ==> -1*-4       4 ==> 4      0 ==> 0

        int c = -4;

        int r2 = c<0 ? -1*c : c;
        System.out.println(r2);//4

        //Ex 3: İki sayının işareti aynı ise bu sayıları çarpan, işaretleri farklı ise "Farklı işaretli sayıları çarpamıyorum..."
        //      mesajı veren kodu yazınız.
        int m = 5;
        int n = -6;

        // "Object" Javada bütün "Non-primitive data tiplerinin" ortak "Parent" (Baba) idir.
        // "Object"in "Parenti" yoktur
        // Farklı data tipleri için ortak bir variable oluşturmak istediğinizde, data tipi olarak Object kullanabilirsiniz.
        // Java'da "Object", insanlık aleminde "Hz.Adem"e benzer.
        //Farklı data tipleri geldiğinde object kullan. bunda int ve string oldu oyüzden kullandık.
        Object r3 = (m>0 && n>0) || (m<0 && n<0) ? m*n : "Farklı işaretli sayıları çarpamıyorum..";
        System.out.println(r3);//30

        //Ex 4: Size verilen sayının 3 basamaklı olup olmadığını kontrol eden kodu yazınız.

        int k = -436;
        int r = Math.abs(k);//farklı variable içine koyduk çünkü "-" bir sayı girdiğimde gözükmesini istiyorum.


        String r4 = (r>99 && r<1000) || (r<-99 && r>-1000) ? k + " Sayısı 3 basamaklı..." : k + " Sayısı 3 basamaklı değildir...";
        System.out.println(r4);









    }


}
