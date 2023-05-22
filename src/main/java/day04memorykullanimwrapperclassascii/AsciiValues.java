package day04memorykullanimwrapperclassascii;

public class AsciiValues {

    //Java'da her karakterin sayısal bir değeri vardır.
    // Bu değerler Ascii değerler olarak adlandırılır
    // Bu değerlerin tamamının bulunduğu tabloya Ascii Table denir.

    public static void main(String[] args) {

        //Herhangi bir karakterin Ascii değerini bulmak için o karakteri "int" data type'inda bir variable'in içine koyunuz.
        int ch = 'A';
        System.out.println(ch);//65

        int unlem= '!';
        System.out.println(unlem);//33

        char c1 = 'K';
        char c2 = '?';
        //Java'da char'ları matematiksel işlemlerde kullanırsanız, Java o char'ların Ascii değerlerini kullanır.
        System.out.println(c1 + c2);//138




    }
}
