package zoomcalisma.localdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex08 {
    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan aşağıysa o günleri return yap.
     * */

    public static void main(String[] args) {
        List<String> gunler = new ArrayList<>();
        gunler.add("Pazartesi");
        gunler.add("Sali");
        gunler.add("Carsamba");
        gunler.add("Persembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");

        List<Integer> gunlukKazanc = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i < 7) {

            System.out.println(gunler.get(i) + " gununun kazancını giriniz");
            int kazanc = input.nextInt();
            gunlukKazanc.add(kazanc);


            i++;
        }

        double b = ortalamaKazanc(gunlukKazanc);
        System.out.println(b);
        System.out.println(getOrtalamaninAltindakiKazancGunleri(gunler, gunlukKazanc, b));
        System.out.println(getOrtalamaninUstundeKazancGunleri(gunler, gunlukKazanc, b));

    }

    public static double ortalamaKazanc(List<Integer> arr) {

        double toplamKazanc = 0;
        double ortKazanc = 0;
        for (Integer w : arr) {
            toplamKazanc += w;
        }

        ortKazanc = toplamKazanc / arr.size();
        return ortKazanc;
    }

    public static List<String> getOrtalamaninUstundeKazancGunleri(List<String> brr, List<Integer> crr, double a) {

        List<String> drr = new ArrayList<>();

        for (int i = 0; i < crr.size(); i++) {

            if (crr.get(i) > a) {
                drr.add(brr.get(i));
            }
        }
        return drr;
    }


    public static List<String> getOrtalamaninAltindakiKazancGunleri(List<String> brr, List<Integer> crr, double a) {

        List<String> drr = new ArrayList<>();

        for (int i = 0; i < crr.size(); i++) {

            if (crr.get(i) < a) {
                drr.add(brr.get(i));
            }
        }
        return drr;
    }
}






