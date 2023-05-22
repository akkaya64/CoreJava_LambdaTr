package day04memorykullanimwrapperclassascii;

public class C02_AsciiDegerleri {
    /*
    ASCII= amerikan standart kodlama sistemi uluslararası kabul görmüş değerlerdir.
    Klavyemizde kullandığımız  harf ve sembollerin matematiksel karşılığı char data türünde işleme alınırsa o char değerinin
    Ascii Table'daki karşılığını işleme alır.
    Harf ve sembollere değer atar.
    Karakterlerin cebirsel karşılığını bulmak için ortaya çıkmıştır. Çünkü bilgisayarda her şey 1001010101'den oluşur. Bu
    yapıya çevirebilmek için Ascii Table oluşturulmuştur.
    Büyük harflerin Ascii değeri kücük harflerin Ascii değerinden daha küçüktür.

   */

    public static void main(String[] args) {

        // Bir tam sayı ile bir harfi toplayınız?
        int deger = 20;

        char harf='a';

        //1.yol
        int sum=deger+harf;
        System.out.println("Bir tam sayı ile harfin toplamı "+ sum);

        //2.yol
         char rakam1='1';
         System.out.println("2.yol toplam= " + rakam1); //2

        char rakam2= '2';
        System.out.println("rakam2 = " + rakam2); //2

        char rakam3= '3';
        System.out.println("rakam3 = " + rakam3); //3

        char rakam4='4';
        System.out.println("rakam4 = " + rakam4); //4

        System.out.println("rakam1+ rakam2+ rakam3+ rakam4 =" +rakam1+rakam2+rakam3+rakam4); //1234  //parantez koymadığımız için rakamları toplamadı yan yana yazdı.

        System.out.println("rakam1+ rakam2+ rakam3+ rakam4 =" +(rakam1+rakam2+rakam3+rakam4)); //202 ascii değerleriyle yazdı, data tipi olara char ve değeri tek tırnak içine yazarsan onun ascii değerini alır.

        char kh= 'a';
        char bh= 'A';
        System.out.println("a'nın Ascii degeri=" + (kh+0));//0 ile toplaynıca değerini direkt ekrana yazdırıyoruz görüyoruz.
        System.out.println("A'nın Ascii degeri=" + (bh+0));

        System.out.println("kh > bh ==> " + (kh>bh)); //true // karşılaştırma işlemlerinin sonucu true ya da false döner.

        //Herhangi bir karakterin Ascii değerini hesaplatalım?

        //1.yol
        char space = ' ';
        System.out.println("space'in Ascii degeri= " +(space+0));

        //2.yol
        int hrf= 'm';
        System.out.println("int harfin Ascii degeri= " +hrf);
        //** char data type'larında Java karaktere int degerde atanabilir.
        //** Çünkü char data type'nin bir resim değeri bir de Ascii'den gelen int değeri vardır.
        //** Bu şekilde de Ascii degerini bulabiliriz.

        ////*****Ascii değerlerinden yararlanarak karşılaştırma yapabiliriz********

        byte b= 123;
        float f= 2.6452458f;
        long l= 5456874565446547L;
        char ch= 'h';
        System.out.println(l>ch);  // long char değerinden büyüktür sonucunu verdi
        System.out.println(b<f);   // byte float değerinden büyüktür sonucunu verdi
        System.out.println(b<ch);  // byte char değerinden büyüktür değerini verdi
















    }






}
