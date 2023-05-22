package day36lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {


        List<Double> myList = new ArrayList<>();
        myList.add(12.0);
        myList.add(4.0);
        myList.add(7.0);
        myList.add(3.6);
        myList.add(26.8);
        myList.add(38.4);
        myList.add(26.8);
        List<Double> half = getHalOffElementsGreaterThanFileDistinctReversed(myList);
        System.out.println("half = " + half);//half = [19.2, 13.4, 6.0, 3.5]


        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Jhon");
        list.add("Ajda");
        list.add("Angelina");
        list.add("Tom");
        list.add("Brad");
        list.add("Cuneyt");

        printAllAlphabeticallyUpperDistinct(list);//AJDA ANGELİNA BRAD CUNEYT TOM
        System.out.println();

        terstenKucukHarfAlfabetikTekrarsız(list);//tom cuneyt brad angelina ajda
        System.out.println();

        printAllAlSortWithLengthUpperDistinct(list);//TOM JHON AJDA BRAD CUNEYT ANGELİNA  uzunluklarına göre küçükten büyüğe dizdi
        System.out.println();

        printAllAlSortWithLLastCharUpperDistinct1(list);//
        System.out.println();

        printAllAlSortWithLLastCharUpperDistinct2(list);//CUNEYT JHON TOM BRAD AJDA ANGELİNA son harfe göre tersten sıraladı
        System.out.println();

        printAllSortWithLengthUpperDistinctSameLenghthsInAlphatecalOrder(list);
        System.out.println();

        //System.out.println(removeElementIfTheLengthGreaterThanFive(list));//[Tom, Jhon, Ajda, Tom, Brad]

        //  System.out.println(removeElementIfStartsWithAorEndsWithd(list));//[Tom, Jhon, Tom, Cuneyt]

        System.out.println(printLengthSquare(list));//[9, 16, 16, 64, 9, 16, 36]
        System.out.println();

        System.out.println(printElementsLengthEven(list));//[Jhon, Ajda, Angelina, Brad, Cuneyt]


    }

    //1)Create a method to find the half of the elements greater than 5, distinct, in reverse order in a list
    //elemanların yarısını bul ama bu elemanlar 5ten büyük olcak ve tekrarsız, bu elemanlar büyükten küçüğe sıralanaak sonucu listin içinde olcak
    public static List<Double> getHalOffElementsGreaterThanFileDistinctReversed(List<Double> myList) {
        return myList.stream().
                distinct().
                filter(t -> t > 5).
                map(t -> t / 2).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());//streamdeydi elemanlar onları List'in içine attık collect(Collectors.toList)  akısdan gelen elemanları list'de topladık

    }

    //2)Tüm List elemanlarini büyük harfle alfabetik sirada tekrarsiz olarak yazdırınız
    public static void printAllAlphabeticallyUpperDistinct(List<String> list) {

        list.
                stream().
                distinct().//tekrarlı elemanları bir kere gösterdik
                map(t -> t.toUpperCase()).//elemanları değiştir büyük harf olsun dedi oyüzden elemanları büyük harf yapmak için değişmiş olcak oyüzden map kullanıp toUpperCase ile büyük harf yaptık
                sorted().//sıraladık alfabetik
                forEach(t -> System.out.print(t + " "));//bu elemanları yazdır dedik yan yana "ln"yi silip saldırdık

    }

    //3)Tüm List elemanlarini küçük harfle alfabetik siranın tersinde tekrarsiz olarak yazdırınız
    public static void terstenKucukHarfAlfabetikTekrarsız(List<String> list) {

        list.
                stream().
                distinct().
                map(t -> t.toLowerCase()).//küçük harf
                sorted(Comparator.reverseOrder()).//tersten yazdırdık
                forEach(t -> System.out.print(t + " "));

    }

    //4)Tüm List elemanlarini büyük harfle uzunluklarına göre artan sırada tekrarsiz olarak yazdırınız
    public static void printAllAlSortWithLengthUpperDistinct(List<String> list) {
        list.
                stream().
                distinct().
                map(t -> t.toUpperCase()).
                sorted(Comparator.comparing(t -> t.length())).
                forEach(t -> System.out.print(t + " "));
    }

    //5)Tüm List elemanlarini büyük harfle son harflerine göre artan sırada tekrarsiz olarak yazdırınız
    public static void printAllAlSortWithLLastCharUpperDistinct1(List<String> list) {

        list.
                stream().
                distinct().
                map(t -> t.toUpperCase()).//hepsini büyük harfe çevir dedik önce hepsini büyük yap
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).//sırala son karaktere bakarak dedik
                // t -> t.charAt(t.length() - 1)) bu ifade "lambda expression" olarak adlandırılır.
                        forEach(t -> System.out.print(t + " "));//yazdır dedik

    }

    public static void printAllAlSortWithLLastCharUpperDistinct2(List<String> list) {

        list.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(Utils::getLastChar).reversed()).
                forEach(Utils::printInTheSameLineWithSpace);

    }

    //6)Tüm List elemanlarini büyük harfle uzunluklarına göre artan sırada tekrarsiz olarak yazdırınız
    //uzunlukları aynı olan elemanlar alfabetik sırada olsunlar

    public static void printAllSortWithLengthUpperDistinctSameLenghthsInAlphatecalOrder(List<String> list) {
        list.
                stream().
                distinct().
                map(String::toUpperCase).//String::toUpperCase ==> yapısına "method referance" denir
                sorted(Comparator.comparing(String::length).//uzunluklarına göre hesapla string classa git length methodunu kullan dedik :: ==> şu class'tan length methodunu seç demek (method reference)
                // map(t->t.toUpperCase()) ==> seklinde yazacagina, map(string :: toUpperCase)==> seklinde yazabilirsin. bu su anlama geliyor
                        thenComparing(Comparator.naturalOrder())).
                forEach(System.out::println);//System'e git ordaki println'i kullan dedik

    }

    //7) karakter sayısı 5den fazla olan elemanları siliniz sonucu List olarak yazdırınız
//    public static List<String> removeElementIfTheLengthGreaterThanFive(List<String> list) {
//        list.removeIf(t -> t.length() > 5);//bazen stream() kullanmayabiliriz stream()den sonra removeIf() methodu yok. stream yapmadan cıkıyor
//        return list;
//    }

    //8) "A" ile başlayan veya "D" ile biten elemanları siliniz
//    public static List<String> removeElementIfStartsWithAorEndsWithd(List<String> list){
//        list.removeIf(t->t.startsWith("A") || t.endsWith("d"));//eğer sil a ile başlıyorsa d ile başlıyorsa

//        //Bazen "stream()" methodu bize lazim olan methodlara ulasmamiza engel olur. Bu yüzden "stream()" methodunu kullanmayız
//        //"removeIf()" methodunda olduğu gibi.
//
//        //Fakat "stream()" methodunu daha sonradan kullanmamız gerekibilir. Bu durumda "stream()" methodunu kullanarak istediğimiz methodlara
//        //ulasiriz, distinct() methoduna ulaştığımız gibi.
//
//        //Sonuc bize list olarak lazımsa "collect(Collectors.toList()" ile sonucu List'e ceviririz
//        return list.stream().distinct().collect(Collectors.toList());
//    }

    //9)List elemanlarının karakter sayilarının karelerini alınız ve bir List olarak ekrana yazdırınız
    public static List<Integer> printLengthSquare(List<String> list) {
        return list.
                stream().
                map(Utils::getLengthSquare).//oluşturduğum Utils class'ına git getLengthSquare methodunu kullan dedim (functional programming)
                // bu methodlar Javadan da gelebilir sizin oluşturduğunuz methodlardan da gelebilir
                        collect(Collectors.toList());
    }

    //10)List elemanlarından karakter sayısı cift sayi olanları bir List içinde ekrana yazdırınız
    public static List<String> printElementsLengthEven(List<String> list) {
        return list.
                stream().
                filter(Utils::isLengthEven).//Utils'e git orda benim oluşturduğum methodu kullan çift sayı olanları al dedim
                        collect(Collectors.toList());
    }



}