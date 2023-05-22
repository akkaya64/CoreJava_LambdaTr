package day01variables;

public class Variables01 {
    public static void main(String[] args) {
        //Variable oluşturmak
        // Java cümlesi = Statement
        //Javada eşittir demek iki tane eşittir "==" demek yani matematik de (=)
        //Javada "=" assiagment operatör"dir. Sağdaki değeri alır soldaki kutuya koyar.
        //Access modifier yazmazsanız access modifier default demektir.
        //Data Type + Variable Name ==> Variable Declaration
        //Assiagment Operatör (atama operatörü) + Veriable değeri ==> assiagment
        // Eğer Variable Declaration yapar, Assiagment yapmazsanız Java kendi değerlerini (default) koyar
        // Default değerler sayılar için sıfırdır
        //Stringlere verilen değerler çift tırnak içinde olmalıdır
        // Data type'ını yazınız   Variable ismini yazınız    Assigment (atama) Operatörü    Veriable değeri   İngilizce nokta gibi
               int                        age                     =                              13              ;}


     //Öğrenci ismi için Veriable  oluşturup değer olarak Ali Can atayını
         //Stringler için "default value" "null"dür.
         String studentName = "Ali Can";

        /*
        Javada temelde iki data vardır;
         1) Pirimitive data type
                  char:    tek karakterler için kullanılan data tipi. A,x,?,5,
                  boolean: booleanlar sadece iki farklı değer alabilir; true(doğru) veya false(yanlış)
                  byte:   -128den +127 ye kadar tamsayı değerleri için kullanılır (1byte)
                  short:  -32768 ile 32767 arasındaki tam sayılar için kullanılır (2byte)
                  int:    -2milyar ile +2 milyar arasındaki rakamlar için (4byte)
                  long:   -9 katrilyon  +887 katrilyon arasındaki sayılar için kullanılır (8byte)
                  float:
                  double:
         2) non-primitive data type
         */


       //örnek2, char data tipinde type'inde ilk ismin ilk harfi olarak bir variable oluşturunuz ve bir değer atayınız.
       //char data tipinde değerler tek tırnak içinde konulabilir.
         char isminIlkHarfi = 'A';

       //örnek3,  boolean data type'inde emekli misin için bir variable oluşturun ve false değerini atayın.
          boolean emekliMisin = false;

           //örnek4,  byte type'inda  öğrenci yaşı için bir variable oluşturunuz ve değer atayınız
          byte studentAge = 23;

          //örnek5, site nüfusu için bir variable oluşturun değer atayınız
          short siteNufusu = 1200;

          //örnek6,  ülke nufusları için bir variable oluşturup değer ataması yapınız
          int countryPopulation = 186435213;

          //örnek7,  insan vücudundaki hücre sayısı için variable oluşturup değer ataması yapınız
          //Note: bir değer long ise sonuna "L" veya "l" konulur
           long insanVucuduHucreSayisi = 1000000000000L;

           // long a atadığınız değer int lerin aralığında ise sonuna L koymaya gerek yok. ne zaman long kullanacaksan L kullan
           long weitghtOfSun = 1234567;






}
