package day21statickeyword;

public class Student {
    /*
    1) static variable veya static method'lar (class member) tum object'ler icin ortak elemandir.
    2) static class memberlar uzerinde yapilan tum degisiklikler tum object'leri etkiler.
    3) static class member'lar Class'a, non-static class member'lar Object'lere monte edilir.
       mesela bir class'tan 100 tane object olusturdugunuzda non-static olanlar 100 kere olusturulur(insan kafasi gibi)
       ama static olanlar object sayisindan bagimsiz olarak 1 kere olusturulur
    4) static class member'lara ulasmak icin  object olusturmaya gerek duyulmaz,ama non-static class member'lara
    ulasmak icin object olusturmak sarttir.
    5) static variable'larin diger adi "Class variable"dir cunku Classlara yapistirilir
       non-static variablelarin diger adi "Instance variable (gorunum)" veya "Object variable"'dir
    */
   //stdName statıc oldugundan ona ulasmak ıcın obje olusturmadım,
   //Sadece class ısmı kullanmak yeterlıdır
    public static String stdName = "Tom Hanks";//static
    //age non-statıc oldugundan object olusturmak zorundayız
    public int age = 13;//non-static

    // ogrenci isminin ilk harflerini veren methodu olusturunuz
    public static String getInitials(String name) {

        String first = name.substring(0, 1);
        String second = name.split(" ")[1].substring(0, 1);
        return first + second;
        // kestikten sonra birinci index'teki
        //soyadi aldi, [1]==> bunu 1. index'teki soyadi alabilmek icin yazdi
        // ve onun 0'inci degerini alabilmek icin substring(0, 1) yazdi "C" yi almak icin yazdi
        // "first" ==> "A" , "second"==> "C" oluyor

    }

    //ogrenci ismindeki sesli harfleri sayan bir method olusturun
    public int countVowels(String name) {
        int counter = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.toLowerCase().charAt(i);
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    counter++;
                    break;
            }
        }

        return counter;

    }


}
