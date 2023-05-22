package practice.advanceday09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04_Manav {
    /*
     Basit bir 5 ürünlü manav alışveriş programı yazınız.

 * 1. Adim : Ürün ve fiyat listesi oluştur.
 * 2. Adim : Ürün listesinden kod ile ürün seçtir ve kaç kilo olduğunu sor.
 * 3. Adim : Müşteri her ürün seçtiğinde, aldığı ürünün fiyatını toplam fiyata ekle.
 * 4. Adim : Alisveris bitince ödemesi gereken tutari göster.
 * 5. Adim : Başka bir ürün almak isteyip istemediğini sor.
 *            istemiyorsa ödenecek tutarı göster, istiyorsa tekrar ürün sectir.
 *            Bu işlemi alışveriş bitene kadar tekrarla.

 */

    static List<String> urunlistesi = new ArrayList<>();
    static double toplamOdeme;

    public static void main(String[] args) {
        urunlistesi.add("Domates - Ürün Kodu: 1 - Fiyatı: 20");
        urunlistesi.add("Biber - Ürün Kodu: 2 - Fiyatı: 25");
        urunlistesi.add("Patates - Ürün Kodu: 3 - Fiyatı: 9");
        urunlistesi.add("Elma - Ürün Kodu: 4 - Fiyatı: 15");
        urunlistesi.add("Muz - Ürün Kodu: 5 - Fiyatı: 30");

        System.out.println("urunlistesi = " + urunlistesi);
        System.out.println("toplamOdeme = " + toplamOdeme);
        musteriSeccimi();

    }

    public static void musteriSeccimi() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ürün kodunu giriniz");
        int kod = scanner.nextInt();

        System.out.println("Kiloyu giriniz");
        double kilo = scanner.nextInt();

        System.out.println(kilo + " kilo " + urunlistesi.get(kod - 1).substring(0, urunlistesi.get(kod - 1).indexOf(" ")) + ": " +
                Double.parseDouble(urunlistesi.get(kod - 1).substring(urunlistesi.get(kod - 1).lastIndexOf(" ") + 1)) * kilo);

        toplamOdeme += Double.parseDouble(urunlistesi.get(kod - 1).substring(urunlistesi.get(kod - 1).lastIndexOf(" ") + 1)) * kilo;

        System.out.println("toplamOdeme = " + toplamOdeme);

        System.out.println("Devam etmek için D, kasa için herhangi bir karakter giriniz");
        String karar = scanner.next();

        if (karar.equalsIgnoreCase("d")) {

            musteriSeccimi();

        } else {

            System.out.println("toplamOdeme = " + toplamOdeme);
            System.out.println("Güle güle, yine bekleriz...");
        }
    }


}
