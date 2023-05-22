package day04memorykullanimwrapperclassascii;

public class Operators01 {
    /*
    NOT1: int / int ==> int olur
    NOT2: double / double ==> double olur. Çünkü Java'da matematiksel işlemlerde farklı data type'ları kullanılırsa sonuç büyük data type'inda olur.

    NOTE3: Javada "Logial öperatörler" vardır And ve Or işlemleri "logial operatör"lardır.
           AND (&&) işleminden "true" alabilmek için her şey true olmalıdır  "&&" ==> sembolü
           AND işlemi "perfectionist"tir (mükemmelliyetci)
           AND işleminde bir tane false sonucu false yapar

           OR (||) işleminde bir tane "true" sonucu "true" yapmaya yeter  "||" ==> sembolü
           OR işleminde sonucun "false" olması için her şey "false" olmalıdır.
           OR işlemi "polyanna" gibidir

           NOT (!) Operatörü true olanı false, false olanı true yapar
           !true = false
           !false = true
           !!true= true

    NOTE4: Comparasion (karşılaştırma) Operatörleri
           <, >, <=, >=, ==, !=
    NOTE: karşılaştırma operatörlerini kullandığınızda kesinlikle boolean (true veya false) alırsınız.

    NOTE: Biz AND işlemi için "&&" kullanırız ama "&" kullanımda geçerlidir.
          Farkları nedir?
          "&&" kullanım ilk ifade "false" olduğunda diğerlerini kontrol etmez. dolayısıyla hızlı çalışır.
          "&" kullanım ilk ifade ne olursa olsun diğerlerini kontrol eder dolayısıyla yavaş çalışır.
          Bu yüzden biz hep "&&" kullanırız.

  */

    public static void main(String[] args) {

        boolean first = 3<5;
        boolean second = 2+3 != 5;
        boolean third = 2+3*5 >= 19;

        System.out.println(first + " - " + second + " - " + third);//true - false - false
        System.out.println(first && second); //false
        System.out.println(first || second || third);// true








    }
}
