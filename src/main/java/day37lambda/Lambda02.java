package day37lambda;

import day36lambda.Utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Lambda02 {

    /*
    AnyMath: Vereceğimiz şarta bağlı olarak Stream içerisinde gezinir ve
herhangi bir elemanla eşleşme durumunda true dönecektir.


AllMatch: Verilen şarta göre Stream içerisindeki tüm elemanların
bu şarta uyması durumunda true dönecektir.


NoneMatch: Şarta göre Stream içindeki hiç bir
elemanın şartı sağlamaması durumunda true dönecektir.
     */

    public static void main(String[] args) throws IOException {

        //1)LambdaTextFile dosyasi içindeki metni konsola yazdıran kodu yaziniz
        Files.lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).forEach(System.out::println);

        //lines() ==> verdiğiniz adresteki dosyaya gidip ordaki satirlari stream() olarak veriyor

        //2)LambdaTextFile dosyasi içindeki her karakteri uppercase yapınız
        Files.lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(String::toUpperCase).//String cllas'ına git harfleri uppercase yap
                forEach(System.out::println);


        //3)Lambda File dosyası içinde herhangi bir kelimenin var olup olmadığını gösteren kodu yazınız
        boolean result1 = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).//bu method stream() vericek bu stream()'in içinde file icindeki 4 tane line var
                        map(t -> t.split(" ")).//her bir line'daki stream()'i boşluklardan böl dedik arrayler elde ederek
                        flatMap(Arrays::stream).//array'ler kırılarak dümdüz yaptım ve kalan malzemeyi stream()e cevir dedim
                        anyMatch(t -> t.contains("Java"));//yapAnyMatch: Vereceğimiz şarta bağlı olarak Stream içerisinde gezinir ve
        //herhangi bir elemanla eşleşme durumunda true dönecektir.
        System.out.println(result1);//true


        //4)LambdaTextFile dosyasi icindeki her kelimenin "a" icerip icermedigini gosteren kodu yaziniz
        boolean result2 = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                allMatch(t -> t.contains("a"));//Her kelime a harfini icerirse sonuc true olur aksi halde false olur.
        System.out.println(result2);


        //5) LambdaTextFile dosyasi icindeki hicbir kelimenin "x" icermedigini gosteren kodu yaziniz
        boolean result3 = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                noneMatch(t -> t.contains("x"));
        System.out.println(result3);


        //6) LambdaTextFile dosyasi icinde "r" ile biten kelimeleri sayan kodu yaziniz
        //1.yol
        long result4 = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                filter(t -> t.endsWith("r")).
                count();
        System.out.println(result4);

        //2.yol: Tavsiye edilmez
        int result5 = Files.
                lines(Paths.get("src/main/java/day37lambda/LambdaTextFile.txt")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                filter(t -> t.endsWith("r")).
                collect(Collectors.toList()).size();//sonucu list'in içine koyup listin size()'ine baktım

        System.out.println(result5);


    }


}
