package day30exceptionsinterface;

public interface Ac {

    //interface'lerin icine "concrete" method konulamaz. (süslü parantezli yazma). çünkü "concrete" methodlarda body vardır
    //body o methodun işin nasıl yapacağını belirtir. Işin nasıl yapılacağı bir çok detay içerir ve bu child class'larda
    //kafa karışıklığına sebep ollur. Halbuki sadece yapılması gereken işi söyleyip nasıl yapılacağını child'a bırakırsanız
    //Child class'ın kafa karışıklığını engellemiş olursunuz.
    //Java çoklu parent yaptığında sadece methodun ne yapılması gerektiğini ister oyuzden body koydurtmaz

    //"interface"ler "concrete method" içermezler, dolayısıyla interface'in içindeki hiçbir şey istege bağlı değildir.
    //her şey child class'lar için mecburidir. Bu yüzden interface'lere "to-do list" de denir.

    //interface'lerdeki tüm methodlar otomatik olarak "public"tir, "abstract"tir, "static" değildir.

    //interface'lerdeki variable'lar otomatik olarak "public"tir, "static"tir, "finally"dir.

    void cool();
    void run();

     int price = 2000;
     String model = "Mitsubishi";
}
