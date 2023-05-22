package day35lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    /*
        1)Lambda "fuctional programming" dir, diğeri "Structured Programming"tir (yapısal) methodları kullanarak kod yazmak javadaki methodları lego gibi kullanarak kod yazmak
        2) "fuctional programming" "ne yapmak gerekir(What to do)" ile ilgilenir. "nasil yapmak gerekir(How to do)" ile ilgilenmez
        3)"fuctional programming" Collection'lar ve Array'lerde kullanılır. Yani Collection yoksa lambda yok, Array yoksa Lambda yok.
        4)Lambda Java'ya "Java 8" de eklendi.
         "stream()" elemanlari yukardan asagiya dizer."Lambda" list'i "stream" e cevirir öyle calisir.
         "filter()" filtrelemek icin kullanilir.
         "map()" u var olan elemani degistirmek icin kullanilir.
         "distinct()" u tekrarli elemanlari sadece bir kere gosterir ve tekrarsizlari olduklari kadar gosterir.
          Note : Distinct methodu ilk baslara konulursa "Lambda" ya daha az is yaptirmis oluruz.
         "reduce()" u  kullanildiginda cok sayidaki deger bir tane degere donusmus olur.
          Orn; reduce(0,(t,u)->t+u) ==> "t" ilk degeri "sifir" dan alir, daha sonraki degerleri toplamanin sonucundan alir.
         "u" ise degerlerini her zaman "stream" den alir
         get()==> methodu optional data type'ini Integer'a cevirir.

     */
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);


        printElemets1(nums);//12 9 131 14 9 10 4 12 15
        System.out.println();

        printElements2(nums);//functional programming sonucu 12 9 131 14 9 10 4 12 15
        System.out.println();

        printEvenElements(nums);//12 14 10 4 12 sadece çiftleri aldı
        System.out.println();

        printEvenElements2(nums);//12 14 10 4 12
        System.out.println();

        printSquareOfOddElements(nums);//81 17161 81 225 //list'teki tek sayıların kareleri yazıldı
        System.out.println();

        printCubeOfDistinctOddElements(nums);
        System.out.println();

        printSumOfSquaresOfDistinctEvenElements(nums);//456
        System.out.println();

        printProductOfSuquareDistinctEvenElements(nums);
        System.out.println();

        getMaxValue1(nums);
        System.out.println();

        getMaxValue2(nums);
        System.out.println();

        getMinValue1(nums);
        System.out.println();

        getMinValue2(nums);
        System.out.println();

        getMinValue3(nums);
        System.out.println();

        getMinValue4(nums);
        System.out.println();

        getMinGreaterThanSevenEven(nums);

    }

    //1)Create a method to print the list elements on the console in the same line with a space between two consecutive elements.(Structured)
    //Bir list'teki elemanları aynı satırda aralarına boşluk koyarak yazdıran methodu oluşturunuz(Structured)

    public static void printElemets1(List<Integer> nums) {

        for (Integer w : nums) {
            System.out.print(w + " ");
        }

    }


    //2)Create a method to print the list elements on the console in the same line with a space between two consecutive elements.(Functional)
    //Bir list'teki elemanları aynı satırda aralarına boşluk koyarak yazdıran methodu oluşturunuz(Functional)
    public static void printElements2(List<Integer> nums) {

        nums.stream().forEach(t -> System.out.print(t + " "));

    }


    //3)Create a method to print the even list elements on the console in the same line with a space between two consecutive elements.(Structured)
    //Bir list'teki çift elemanları aynı satırda aralarına boşluk koyarak yazdıran methodu oluşturunuz(Structured)
    public static void printEvenElements(List<Integer> nums) {
        for (Integer w : nums) {

            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }

    }


    //4)Create a method to print the even list elements on the console in the same line with a space between two consecutive elements.(Functional)
    //Bir list'teki çift elemanları aynı satırda aralarına boşluk koyarak yazdıran methodu oluşturunuz((Functional)
    public static void printEvenElements2(List<Integer> nums) {

        nums.
                stream().//dikey yazar list'imdeki elemanları
                filter(t -> t % 2 == 0).//filter() dan sonra benim stream() im 12 14 10 4 12 oldu
                forEach(t -> System.out.print(t + " "));//her birini yazdır dedim
    }

    //5)Create a method to print the square of odd list elements on the console in the same line with a space between two consecutive elements.
    //Bir list'teki tek sayı olan elemanların karelerini aynı satırda  aralarına boşluk koyarak yazdıran methodu oluşturun(Functional)
    public static void printSquareOfOddElements(List<Integer> nums) {

        nums.//listtimin ismi içinde sayılar var
                stream().//sayiları dikey şekilde sıraladı
                filter(t -> t % 2 != 0).//streamdeki tek sayı olan elemanları aldık
                map(t -> t * t).//elemani al karesini hesapla dedik map() methodu varolan elemani "update" etmek icin kullanilir
                forEach(t -> System.out.print(t + " "));//for each ile bu elemanları yazdırdık
    }


    //6)Bir list'teki tek sayı olan elemanların küplerini tekrarsız olarak aynı satırda
    // aralarına boşluk koyarak yazdıran methodu oluşturun(Functional)
    public static void printCubeOfDistinctOddElements(List<Integer> nums) {

        nums.
                stream().
                distinct().//streamden sonra distinct kullanınca tekrarsızları silersin daha iyi olur streamden sonra kullanmak yani önce elemeyi yap
                filter(t -> t % 2 != 0).//tek sayıları aldık
                map(t -> t * t * t).//küplerini aldık
                forEach(t -> System.out.print(t + " "));////729 2248091 3375

    }

    //7)Create a method to calculate the "sum" of the "squares" of "distinct" "even" elements
    public static void printSumOfSquaresOfDistinctEvenElements(List<Integer> nums) {

        Integer sum = nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).//saedce çift sayıları aldık
                        map(t -> t * t).//o elemanlarınkarelerini aldık
                        reduce(0, (t, u) -> t + u);//reduce() coklu degerleri azaltmak icin kullanilir. başlangıç değeri 0 gir. iki sayi ver ve onu topla dedik
        //basta toplam=0, "t ve u degeri verecegiz sana java ve sen onlari toplayacaksin."
        System.out.println(sum);
    }

    //8)Create a method to calculate the "product" of the "suquare" of "distinct" "even" elements
    public static void printProductOfSuquareDistinctEvenElements(List<Integer> nums) {

        Integer product = nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                reduce(1, (t, u) -> t * u);//bir cok sayı carparsan tek bir sayı elde edersin yani azaltmış oldun oyüzden reduce() kullandık
        System.out.println(product);//45158400
    }

    //9)Create a method to find the "maximum value" from the list elements
    /*
maximum degeri ararken Integer.MIN_VALUE kullanmak genel pratiktir.
minimum degeri ararken Integer.MAX_VALUE kullanmak genel pratiktir.
 */
    //1.yol
    public static void getMaxValue1(List<Integer> nums) {

        Integer max = nums.
                stream().
                distinct().
                reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);//genel kural max arıyorsan başlangıç değerini min yap, minimum arıyorsan başlangıç değerini max yap
        System.out.println(max);//131
    }

    //2.yol
    public static void getMaxValue2(List<Integer> nums) {

        Integer max = nums.
                stream().
                distinct().
                reduce(nums.get(0), (t, u) -> t > u ? t : u);
        System.out.println(max);
    }

    //3.yol
    //get()==> methodu optional data type'ini Integer'a cevirir.
    public static void getMaxValue3(List<Integer> nums) {
        Integer max = nums.
                stream().
                distinct().
                sorted().//küçükten büyüğe dizdi
                        reduce((t, u) -> u).//bu iki elemanlardan 2.sini al dedik çünkü sıralayınca 2.si büyük olacak
                        get();//data type'ini Integer'a cevirdi
        System.out.println(max);
    }

    //10)Create a method to find the minimum value from the list elements
    //
    //1.yol
    public static void getMinValue1(List<Integer> nums) {
        Integer min = nums.
                stream().
                distinct().
                reduce((t, u) -> t > u ? u : t).
                get();
        System.out.println(min);
    }

    //2.yol
    public static void getMinValue2(List<Integer> nums) {
        Integer min = nums.
                stream().
                distinct().
                sorted(Comparator.reverseOrder()).//ters sıralama yapıp (büyükten küçüğe) 2.yi yazdır dedim çünkü tersten sıralayıp yazdırınca 2. olan küçük olcak
                        reduce((t, u) -> u).
                get();
        System.out.println(min);
    }

    //3.yol
    public static void getMinValue3(List<Integer> nums) {
        Integer min = nums.
                stream().
                distinct().
                sorted().//küçükten büyüğe diz büyüğü seç
                        reduce((t, u) -> t).
                get();
        System.out.println(min);
    }

    //4.yol
    public static void getMinValue4(List<Integer> nums) {
        Integer min = nums.
                stream().
                distinct().
                reduce((t, u) -> Math.min(t, u)).
                get();
        System.out.println(min);
    }

    //11)Create a method to find the minimum value which is greater than 7 and even from the list
    //   12 9 131 14 9 10 4 12 15 ==> 10 <-- 7 den buyuk en kucuk cift sayi

    public static void getMinGreaterThanSevenEven(List<Integer> nums) {

        Integer min = nums.
                stream().
                filter(t -> t > 7 && t % 2 == 0).//7den büyük ve çiftler için çalıştı
                sorted().//sıraladı
                reduce((t, u) -> t).//iki elemandan ilkini seç dedik çünkü ilki küçük olcak sıralandıktan sonra
                get();//Apşınıl olmasın diye get() kullandık Integer'a çevirdik
        System.out.println(min);
    }

}
