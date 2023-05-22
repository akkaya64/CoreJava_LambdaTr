package day02datatypesmethodcreation;

public class Variables02 {
    /*
    Non-primitive data type: String bir non- primitive type'dır. bunlar sınırsızdır.
                             üretilen her class aynı zamanda bir "non-primitive data type'dır
                             bu yüzden "non-primitive data type"lar sınırsız sayıdadır denebilir.
                             non-primitive data type'ların isimleri büyük harfle başlar
                             non-primitive data typeların tamamı için java memoryde aynı miktarda yer ayırır.

         İnterview Sorusu: "primitive " ve "non primitive" data typelrarı arasındaki fark nedir?
                           1) "primitive"ler sadece bizim atadığımız değeri içerir
                              "non primitive"ler bizim atadığımız değer ve methodlar içerir.
                           2)  "primitive"ler kücük harfle başlar, "non primitive"ler büyük harfle başlar
                           3) "primitive"leri Java üretmiştir ve 8 tanedir
                              "non primitive"leri Java ve developerlar üretebilir, sınırsız sayıdadır.
                           4) "primitive"ler memoryde data type'ına göre yer kaplar,
                           5) "non primitive"ler için Java memoryde hep aynı büyüklükte yer alır.

       */
    public static void main(String[] args) {
        //örnek; şehir ismi için bir variable oluşturun ve bir değer atayıp onu ekrana yazdırın
        String cityName = "Miami";

        System.out.println(cityName);


    }


}
