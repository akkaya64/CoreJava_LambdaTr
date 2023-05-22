package day18arraylists;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {
    public static void main(String[] args) {

        //Ex: Integer bir List oluşturunuz.
        //    Liste 5 tane eleman ekleyiniz
        //   bu elemanlardan 12yi siliniz.

        List<Integer> ages = new ArrayList<>();
        ages.add(10);
        ages.add(25);
        ages.add(12);
        ages.add(8);
        ages.add(12);

        //not: siz Java'da tam sayı yazdığınızda Java o tam sayının data tipini otomatik olarak "primitive int" kabul eder.
        //     Bu yüzden remove() methodunun içine yazdığınız tam sayı eleman olarak değil index olarak kabul edilir.
        //     Tam sayıyı eleman olarak göstermenin bir kaç yolu vardır.

        //1.YOL:
        // Integer nonPrimitive = 12;
        //ages.remove(nonPrimitive); **** yeni variable kullandık ****
        // System.out.println("ages = " + ages);//ages = [10, 25, 8, 40] 12yi sildik


        //2.YOL
        //ages.remove((Integer) 12);  ****ne iki method ne de memoryde yeni variable oluşturup yer kullandık oyuzden bu tavsiye edilen******
        //System.out.println("ages = " + ages);//ages = [10, 25, 8, 40] 12yi sildik

        //3.YOL
        //ages.remove(Integer.valueOf(12));  *****iki method kullanıldı*****
        // System.out.println("ages = " + ages);//ages = [10, 25, 8, 40]

        //4.YOL
        // ages.remove(ages.indexOf(12));//   *****2 method kullanıldı******
        //ilk 12nin indexini vereceği için ındexOf ilk gördüğü 12yi silecek
        System.out.println("ages = " + ages);//ages = [10, 25, 8, 40]


        //Ex2: Integer bir List oluşturunuz.
        //            Liste 5 tane eleman ekleyiniz
        //           bu elemanlardan tüm 12leri siliniz.
        //
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(25);
        nums.add(12);
        nums.add(8);
        nums.add(12);
        List<Integer> silenecekler = new ArrayList<>();
        silenecekler.add(12);
        silenecekler.add(25);
        nums.removeAll(silenecekler);
        System.out.println("nums = " + nums);//nums = [10, 8]

        //removeAll methodu List ile çalışır
        //removeAll methodu bir veya birden fazla elemanın tüm görünümlerini silmek için kullanılır
        //remove methodu sadeve ilk görünümü siler
        //removeAll tüm elemanı sildi
        // *****bir elemanın tüm görünümünü silmek için removeAll kullan ama yeni list oluşturup onu içine ekle******
        // yeni bir list oluşturup hepsini silmeyi düşündüğünüz elemanı içine koymanız lazım


    }
}
