package day29exceptions;

public class Exceptions02 {
    /*
    "thorw" ile "thorws" keyword'leri arasındaki fark nedir?
    1)"throw" method body'si içinde, "throws" method body parantezinden hemen sonra kullanılır
    2)"throw" method body'si içinde istenilen yerde istenildiği kadar kullanılır,
    "throws" ise method parantezinden hemen sonra bir kere kullanılabilir
    3)"throw"dan sonra "new" keyword ve constructor kullanılarak object oluşturulur
       "throws"dan sonra sadece Exceptions Class ismi yazılır
    4)"throw" belli şartlar için Exception atmada kullanılır, "throws" ise application'ı Exception attıktan sonra durdurur.
     */

    public static void main(String[] args) throws IllegalArgumentException, ArithmeticException{//thorws'tan sonra çoklu Exception yazabilirsin

        try {
            printAge(-18);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());//benim verdiğim mesajı teknik mesaj gibi verdi
        }

//        try {
//            getMark(-35);// benim verdiğim mesajı teknik mesaj gibi verdi ==> "Marks cannot be less than zero" yazdırdı
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }

        getMark(-90);


    }


    //"throw" keyword bir method'un body'si içinde istediğimiz yerde, istediğimiz koşullar, istediğiniz kadar icin Exception atmamızı sağlar.
    //"throw" keyword yazıldıktan sonra bir Exception Class Object'i oluşturulur.
    //Exception Class constructor'ının parantezi içine istediğiniz Exception Mesajını yazabilirsiniz.

    /*
      Belli sartlar altinda biz kendimi exception throw edebiliriz.
      Mesela kullanici negatif yas girerse java hata vermeyecegi icin
      exception throw etmesini biz javaya soylemis oluruz.

      Java gercek hayati bilmez. Biz burada tabiri caizse Java'ya age'in negatif olmayacagini soyledik.
                                                        "IllegalArgumentException"
    */

    public static void printAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("yaş negatif olamaz");//belli şartlar altında siz kendiniz exceptions atabilirsiniz
            //teknik mesaj ekleyemezsin çünkü parantezin içindekini normalde vermiyordu o mesajı ben oluşturdum

        } else {
            System.out.println(age);
        }
    }


    //Ögrenci notları girişi yapan ve notu konsola yazdıran bir method oluşturunuz
    public static void getMark(double d) {

        if (d < 0) {
            throw new IllegalArgumentException("Marks cannot be less than zero");//istediğim yerde exçeptions atabilirim
        } else if (d > 100) {
            throw new IllegalArgumentException("Marks cannot be greater than hundred");
        } else {
            System.out.println(d);
        }

    }


}
