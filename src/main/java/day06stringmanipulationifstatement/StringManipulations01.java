package day06stringmanipulationifstatement;

public class StringManipulations01 {

    public static void main(String[] args) {

        //Example 1: Bir String'in baş ve sonunda space karakteri varsa siliniz. (aradaki spacelere dokunmaz)
        //           "  Ali Can  "   ===>  "Ali Can"

        String s = "   Ali Can  ";
        System.out.println(s);

        //**** trim() methodu bir String'in baş ve sonundaki space karakterlerini siler, aradaki spacelere dokunmaz.
        String sTrimmed = s.trim();//"Ali Can"
        System.out.println(sTrimmed);

        //Example 2: Aşağıda fiyatları verilen ürünlerin toplam fiyatını bulunuz?
        //           String tv = "$456,99";  String laptop = "$875,99"; ====> 456,99 + 875,99 = 1332,98
        String tv1 = "$456.99";
        String laptop1 = "$875.99";

        String tv2 = tv1.replace("$",""); //dolar işaretini sil demek bu kod
        System.out.println(tv2); //456,99  ondalık sayılar javada otomatik olarak double kabul edilir.

        String laptop2 = laptop1.replace("$","");
        System.out.println(laptop2); //875.99

        Double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2);

        System.out.println(totalPrice);//1332.98

        //Example 3: Verilen ismin ilk isminin ilk harfini ve soyisminin ilk harfini ekrana yazdırınız?
        //           "Ali Can"  ===> AC
        String name = "   ali cAN  ";
        char first = name.trim().toUpperCase().charAt(0); //trim ile baştaki "space"leri kestik, uppercase ile tüm harfleri büyük yaptık, charAt ile ilk harfi "A"yı aldık
        System.out.println(first);

        char second = name.trim().toUpperCase().split(" ")[1].charAt(0); //tekrar en baştan yazıp, trim ile baştaki ve sondaki spaceleri silecek
        System.out.println(second);                                            //uppercase ile tüm harfleri büyük harf yapıcaz

        System.out.println("" + first + second );                             // split space ile ALİ CAN ın arasındaki boşluğu kesiyoruz, yani boşluğu kesince yok olur.
                                                                              // ALİ CAN ayrı ayrı olacağı için ALİ ilk index onu çpe atıyoruz "[1]" CAN ikinci index olur.
                                                                              // Biz CAN ı istediğimiz icin ikinci kelimenin ilk harfini aldık char(0)
                                                                              //"trim()" başta ki ve sonda ki spaceleri kaldırdık. "toUpperCase()" yazıları büyüttük.
                                                                              //"split(" ")[1]" ile boşluktan parçala ve 1. kelimeyi çöpe at emri verdik ."charAt(0);" ikinci kelimenin ilk harfi aldık.

        //Example 4: Bir Stringin hic karakter içermediğini (boş String) kontrol eden kodunu yazınız.
        String str = "";

        //1.Yol: length() kullan
        boolean result1 = str.length()==0; //length methodu String'te karakter sayısını verdiği için kullandık çünkü boşlukta bir karakter.
        System.out.println("String boş mu " + result1);//true

        //2.Yol: isEmpty() kullan. Java bir konuda method üretmişse o methodu kullanmak en iyisidir.
        boolean result2 = str.isEmpty();//Stringte boşluk var mı yok mu onu kontrol etmek için isEmpty kullandık. bunu kullanmak daha mantıklı.
        System.out.println("String boş mu " + result2);//true

        //Example 5: Bir String'in hiçbir karakter içermediğini kontrol ederek yazınız.

        String t = "       a ";

        //1.Yol:                                                          //replace ile boşluğu hiçbir şey yap dedik
        boolean resault3 = t.replace(" ","").length()==0;//replace ile spaceyi yok ettik ilk virgülde boşluk koyarak bütün spaceleri silcek
        System.out.println("Sadece spaeve mi var " + resault3);           // length methodu ile karakter sayısını vercek bu da 0. oyuzden 0==0 yazdık hiçbir şey kalmazsa true vercek sonuç

        //2.Yol:
        boolean resault4 = t.replace(" ","").isEmpty();
        System.out.println(resault4);

        //3.Yol:
        //isBlank() methodu sadece space içeren String'ler için true verir, space dışında bir karakter içerirse false verir.
        //isBlank() methodu boş String'ler içinde true verir.
        //isBlank() ==> space + hiçbir şey için true verir                isEmpty ==> sadece hiçbir şey için true verir.
        boolean resault5 = t.isBlank();//sadece space var mı yok diye kontrol eder.
        System.out.println(resault5);

        //Example 6: Br String'te indexi a, i, e karakterlerinin ilk görünümlerinin indexleri toplamını ekrana yazdırınız ( index dediği için harfleri 0 dan saymaya başla)
        //          "Java is easy to learn" ==> 1 + 5 + 8 = 14

        String r = "Java is easy to learn";

        int idAx = r.indexOf('a');//1
        System.out.println(idAx);

        int idxI = r.indexOf('i');//5  indexOf "i"  nin ilk görünümünü vericek
        System.out.println(idxI);

        int idxE = r.indexOf('e');//8
        System.out.println(idxE);

        System.out.println("Indexler toplamı "+ (idAx + idxI + idxE));//14

        //Example 7: Bir String'te "java" kelimesinin kaçıncı indexlerde kullanıldığını gösteren kodu yazınız
        //           "Ah Java vah Java sensiz olmuyor Java." ==>3

        // indexOf ("Java") kullanımında siz "Java" kelimesinin ilk görünümündeki ilk harfin (yani J nin) index'ini almış olursunuz.
        String u = "Ah Java vah Java sensiz olmuyor Java.";
        int idxJava = u.indexOf("Java");
        System.out.println(idxJava);//3

        //indexOf() methodu olmayan karakterler için kullanılırsa her zaman "-1" verir.
        int idxOfxyz = u.indexOf("xyz");
        System.out.println(idxOfxyz);//-1

        //Example 8: Bir String'de a, e, i karakterlerinin "son" görünümlerinin indexlerinin toplamını ekrana yazdırınız.
        //          // "Java is easy to learn" ==> 18 + 5 + 17 = 40

        String v = "Java is easy to learn";
        int idxOfA = v.lastIndexOf('a');
        System.out.println(idxOfA);//18

        int idxOfE = v.lastIndexOf('e');
        System.out.println(idxOfE);//17

        int idxOfI = v.lastIndexOf('i');
        System.out.println(idxOfI);//5

        System.out.println("toplam " + (idxOfA + idxOfE + idxOfI));//40

        //NOT; lastIndexOf() String'te olmayan bir karakter için kullanılır her zaman "-1" verir.

        //****Example 9: Bir String'teki tekrarsız karakterleri ekrana yazdırınız?
        //               abbcccdc ===> ad

        String y = "abb";

        char ch1 = y.charAt(0);

        if(y.indexOf(ch1)==y.lastIndexOf(ch1)){
            System.out.println(ch1);
        }

        char ch2 = y.charAt(1);

        if(y.indexOf(ch2)==y.lastIndexOf(ch2)){
            System.out.println(ch2);

        }

        char ch3 = y.charAt(2);

        if (y.indexOf(ch3)==y.lastIndexOf(ch3)){
            System.out.println(ch3);
        }



        //NOT: Bazı kodların bazı şartlara bağlı olarak çalışması gerekir.
        //     Bazı kodları bazı şartlara aktive etmek için "if statement" kullanılır.
        // if you study hard, you will learn Java.

        //Example 10: Sayı pozitif ise ekrana çift yazdırın

        int num = 12;
        if(num>0){
            System.out.println("Pozitif ");
        }

        //Example 11: Sayı -1 ile 10 arasında ise ekrana "Rakam" yazdırın
        int number = 30;
        if(number> -1 && number<10){
            System.out.println("Rakam ");

        }

        //Example 12: Sayı üç basamaklı ise ekrana "Woow!" yazdırın

        int n = -123;

        n = Math.abs(n);//mutlak değer alıyoruz eksi olan sayının onu pozitife çeviriyor.


        if(n>99 && n<1000){
            System.out.println("Woow! ");
        }



















    }
}
