package day04memorykullanimwrapperclassascii;

public class C04_WrapperClass {

    /*
    *** Non-primitive data türleri sadece data barındırmak için değil, aynı zamanda methodlarda barındırır.
    *** Primitive data türleri ise sadece. Değer saklar, methodu yoktur.
    *** Java bu duruma bir çözüm üretmiştir. Her primitive data türünü non- primitive olarak kullanabilmek için
    özel classlar oluşturmuştur.
    *** Oracle firmasının ürünü olan Java Primitive'lere method ekleyerek oluşturdukları bu yeni yapıya Wrapper (dürüm,sarmalayan)
    class adını vermiştir.

   Primitive            Wrapper
    bye        ====>     Byte
    short      ====>     Short
    int        ====>     Integer
    long       ====>     Long
    float      ====>     Float
    double     ====>     Double
    boolean    ====>     Boolean
    char       ====>     Character
    */

    public static void main(String[] args) {

        byte primitiveByte= 12;  //primitive data type'larında nokta koyduğumuzda hicbir method gelmez, çünkü primitivelerin methodu yoktur

        Byte WrapperByte= 12;  // wrapper classlarda nokta koyduğumuzda bir çok method kullanabiliriz.

        //Ex:  byte data type'inin en küçük ve en büyük değerini ekrana yazdırın?

        System.out.println(Byte.MIN_VALUE); //-128
        System.out.println(Byte.MAX_VALUE); //127

        //Ex: short, int, long data type'larının max ve min değerlerini hesaplatan kodu yazınız?
        short maxShort= Short.MAX_VALUE;
        short minShort= Short.MIN_VALUE;
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        //örnek1: int data tipinin minimum değeri ile byte data tipinin maximum değerinin toplamını bulunuz?
        int minInt= Integer.MIN_VALUE;
        byte maxByte= Byte.MAX_VALUE;
        System.out.println("min ve max toplam " +(minInt+maxByte));

        //***** WRAPPER'I PRİMİTİVE, PRİMİTİVE'İ WRAPPER'A ÇEVİRME ÖRNEKLERİ:
        //örnek2:  primitive int'i Wrapper Integer'a ceviriniz?
        int num= 22;
        Integer wrapperNum= num; //22

        //örnek3: Wrapper Byte'i primitive byte'a ceviriniz?
        Byte k= 43;
        byte primitiveK= k;
        System.out.println(k);

        //Primitive char'ı Wrapper Character'e çeviriniz?
        char ch= 'T';
        Character wrapperch= ch;
        System.out.println(ch);

        // Wrapper Boolean'ı primitive boolean'a ceviriniz?
        Boolean isOld= true;
        boolean primitiveB= isOld;


        // Size String olan verilen iki fiyatın toplamını ekrana yazdırın?
        String shirt = "2300";
        String shoes= "5200";
        //Java'da "+" sembolü iki sayı arasında kullanılırsa "toplama işlemi" olur.
        //Java'da "+" sembolü iki String arasında veya bir String ve bir sayı arasında kullanılırsa "Concatenation işlemi (birleştirme) olur.
        //Concatenation işlemlerinde Java matematikteki işlem önceliği kurallarını kullanır.
        //İşlem önceliği kuralları: 1-önce üslü sayılar 2- parantez içi işlemler yapılır 3- çarpma ve bölme 4- toplama ve çıkarma


        System.out.println(shirt+shoes);//23005200

        int toplamFiyat =Integer.valueOf(shirt) + Integer.valueOf(shoes);
        System.out.println(toplamFiyat);//7500

        //soru 6: size String olarak verilen iki fiyatın toplamını ekrana yazdırınız?
        //valueOf() methodu tüm karakterleri rakam olan String'leri sayılara çevirir,
        //valueOf() methodu kullanırken String'in içine rakam olmayan bir karakter koyarsanız hata alırsınız,
        //Bu hatayı düzeltmeyi ileride öğreneceğiz.
        String tv= "$11000";
        String radio= "$3000";
        System.out.println(tv+radio);
        int totalPrice= Integer.valueOf(tv) + Integer.valueOf(radio);





        //****** Primitive'ler Wrapper class'lara nasıl çevrilir; (Autoboxing) ile

        float f1= 13.99F; //küçük kutu primitive
        Float wrapperF1 = f1;

        //****** Wrapper classlari Primitive data type'larına nasıl çevrilir; (Unboxing) ile

        Character w1 = 's';
        char primitiveW1= w1;
        //NOT; Autoboxing ve Unboxing Java tarafından otomatik yapılır.
        // Ekstra kod yazmaya gerek yoktur.

        //Ex:Verilen ik String data toplamını veren kodu yazınız?
        String str1= "12345";
        String str2= "6789";

        System.out.println(str1+str2);// sonuç yan yana çıkar, resim gibi

        System.out.println(Integer.valueOf(str1)+Integer.valueOf(str2));


















    }



}
