package day37lambda;

import day36lambda.Utils;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

//Note: Her zaman bize verilen list ile islem yapamayabiliriz
//      Bunun icin IntStream methodunu kullaniriz.
//      rangeClosed(startInclusive, endInclusive) methodu bize
//      baslangıc ve bitis degeri kapsayan degiskenlerle islem yapmamızı saglar
public class Lambda01 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        myList.add(12);
        myList.add(8);
        myList.add(23);
        myList.add(10);
        myList.add(7);
        System.out.println(getSumOfAllElements(myList));//60
        System.out.println();

        System.out.println(getSumFromSevenToSeventy());//2464
        System.out.println();

        System.out.println(getMultiplicationFromThreeToNine1());//181440
        System.out.println();

        System.out.println(getMultiplicationFromThreeToNine2());//181440
        System.out.println();

        System.out.println(getFaktoriyel(5));//120
        System.out.println();

        System.out.println(getSumOfEvensBetweenTwoInt(15, 4));//50
        System.out.println();

        System.out.println(getSumOfDigitsBetweenTwoInts(12, 18));//30
        System.out.println();



    }


    //1)Verilen List'teki tüm sayıların toplamını veren methodu oluşturunuz.
    public static int getSumOfAllElements(List<Integer> myList) {
        return myList.
                stream().
                reduce(Math::addExact).//Math::addExact :Matematik Class'ina git,topla tam olarak
                        get();
    }


    //2)7den 70e kadar tüm tamsayiların toplamini veren kodu yazınız
    public static int getSumFromSevenToSeventy() {

        return IntStream.rangeClosed(7, 70).//bize başlangıç ve bitiş değeri verirse IntStream kullan.
                reduce(Math::addExact).
                getAsInt();//intStream ile kullanırsan getAsInt kullan. int ile kullanınca get() kullanıyorduk o gibi aynı
    }

    //3) 3den 9a kadar tüm tamsayiların carpımını veren methodu oluşturunuz
    public static int getMultiplicationFromThreeToNine1() {

        return IntStream.rangeClosed(3, 9).//bana list vermediği aralık verdiği için kullandık. rangeClased() ==> [ ] demek
                reduce(Math::multiplyExact).//matematik class'Ina git carpma methodunu kullan
                getAsInt();
    }

    public static int getMultiplicationFromThreeToNine2() {

        return IntStream.range(3, 10).// range() birincisi dahil 2.si hariç yapmak için ikincisini bir fazlası yap range() ==> [ ) demek
                //range(a,b)==> a dahil,b dahil degil
                        reduce(Math::multiplyExact).
                getAsInt();
    }

    //4)Size verilen sayinin faktöriyelini hesaplayan kodu yaziniz.
    public static int getFaktoriyel(int x) {
        if (x == 0) {

            return 1;

        } else if (x < 0) {

            System.out.println("Faktoriyel islemi negatif sayilarla yapilamaz");
            return -1;

        } else {

            return IntStream.rangeClosed(1, x).reduce(Math::multiplyExact).getAsInt();
        }

    }

    //5)Size verilen iki tam sayi arasındaki tüm çift sayiların toplamini veren kodu yaziniz
    public static int getSumOfEvensBetweenTwoInt(int a, int b) {
        if(a>b){
            int temp = a;
            a=b;
            b=temp;
        }

        return IntStream.range(a + 1, b).filter(Utils::isNumberEven).sum();
    }


    //6)size verilen 2tam sayi arasındaki tüm sayilarin rakamlari toplamini veren kodu yaziniz
    //12 ve 18 ==> 13 14 15 16 17 ==>4 + 5 + 6 + 7 + 8 ==> 30
    public static int getSumOfDigitsBetweenTwoInts(int a, int b){
        if(a>b){
            int temp = a;
            a=b;
            b=temp;
        }
      return   IntStream.range(a+1,b).map(Utils::getSumOfDigits).sum();
    }
}


