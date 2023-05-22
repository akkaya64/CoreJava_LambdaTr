package day05typecastingstringmanipulations;

public class StringManipulations02 {

    public static void main(String[] args) {

        String s = "Learn Java earn money";

        //Example 1: "s" Stringi'nin "money" ile bitip bitmediğini kontrol ediniz?
        boolean isEnd = s.endsWith("money"); // s stringi money ile biter diyoruz bu kodda, çoklu karakterlerle ve tekli karakterlerle de kullanılabilir. "y" koysak bile true olur sonuc
        System.out.println(isEnd);

        //Example 2: "s" Stringi'ndeki "money" kelimesini "dolar" kelimesine çeviriniz?*** bir şeyin yerine bir şeyi eklemiş olursun
        String newS1 = s.replace("money","dollar");
        System.out.println(newS1);

        //Example 3: "s" Stringi'ndeki "earn" kelimesini "win" kelimesine çeviriniz?
        String newS2 = s.replace("earn","win");
        System.out.println(newS2);// lwin java win money

        //Example 4: "s" Stringi'ndeki "a" kelimesini "*" kelimesine çeviriniz?

        //NOTE: Replace methodunda çoklu karakter ile çalışırsanız mecbur çift tırnak kullanacaksınız
        //      Ama tek karakterle çalışırsanız çift tırnak veya tek tırnak kullanabilirsiniz.
        String newS3= s.replace("a","*");
        System.out.println(newS3);//Le*rn J*v* e*rn money

        //NOTE: Ama ya ikisi de çitf tırnak olmalıdır ya da ikisi de tek tırnak olmalıdır.
        //Example 5: "s" String'indeki "n" harflerini "XXX" a çeviriniz?
        String newS4 = s.replace("n","XXX");
        System.out.println(newS4);

        //Example 6: "s" String'indeki bütün "e" harflerini siliniz?
        //NOTE: "Hiçbir şey" char data type'inde yok bu yüzden replace() methodu kullanarak silme işlemi yaparsanız mutlaka çift tırnak kullanınız.
        String newS5 = s.replace("e","");
        System.out.println(newS5);

        String t = "Ali 13 yasindadir!...";
        //Example 7: "t" String'indeki tüm rakamları(0,1,2,3,4,5,6,7,8,9) "*"a çeviriniz?
        //NOTE: Bir grup datayı değiştirmek için replaceAll() kullanılır.
        //NOTE: Bir grup datayı ifade etmek için "Regular Expressions" (Regex) kullanırız.
        String t1 = t.replaceAll("[0-9]","*");
        System.out.println(t1);

        /*

                           Meşhur Regex'ler
        1) Tüm rakamlar ==> [0-9]
        2) Tüm kücük harfler ==> [a-z]
        3) Tüm büyük harfler ==> [A-Z]
        4) Tüm kücük harfler ve büyük harfler ==> [a-zA-Z]
        5) Tüm harfler ve rakamlar ==> [a-zA-Z0-9] araya "-" koyarsan a dan z ye kadar ama hiçbir şey koymazsan ordan oraya kadar olur.
        6) Tüm noktalama işaretleri ==> \\p{Punct}
        7) Tüm sesli harfler ==> [aeiouAEIOU]
            x, q, w harfleri ==> [xqw]

        8) Kücük harflerden farklı tüm karakterler ==> [^a-z] (den farklı deniyor. kücük harflerden farklı)
        9) tüm harflerden farklı tüm karakterler ==> [^a-zA-Z]

        10) Space dışındaki tüm karakterler ==> \\S

         */

        //Example 8: "t" String'indeki tüm rakamları ve harfleri "!"a çeviriniz?
        String t2 = t.replaceAll("[a-zA-Z0-9]","!");
        System.out.println(t2);

        //Example 9: "t" String'indeki tüm sesli harfleri "?"a çeviriniz?
        String t3 = t.replaceAll("[AaEeIiOoUu]","?");
        System.out.println(t3);

        //Example 10: "t" String'indeki kücük harfler dışındaki tüm karakterleri "<>"a çeviriniz?
        String t4 = t.replaceAll("[^a-z]", "<>");
        System.out.println(t4);

        //Example 11: "t" String'indeki tüm harfler dışındaki tüm karakterleri "+"a çeviriniz?
        String t5 = t.replaceAll("[^a-zA-Z]","+");
        System.out.println(t5);

        //Example 12: "t" String'indeki space'ler dışındaki  tüm karakterleri "+"a çeviriniz?
        String t6 = t.replaceAll("[^ ]", "+");
        System.out.println(t6);

        //Example 12: "t" String'indeki sesli harfler  dışındaki  tüm karakterleri "&"a çeviriniz?
        String t7 = t.replaceAll("[^aeiouAEIOU]","&");
        System.out.println(t7);












    }
}
