package practice.advanceday04;

public class Q01_Arrays_OrtalamadanBuyuk {
    public static void main(String[] args) {

        //Verilen bir Array'in
        // elementlerinin ortalamasından büyük elementleri yazdıran bir kod yazınız.

        int[] arr = {5, 9, 15, 1, 0, 11, 3};
        double toplam = 0;

        for (int w : arr) {
            toplam += w;
        }
        System.out.println("toplam = " + toplam);//toplam = 44.0

        double ortalama = toplam / arr.length;
        System.out.println("ortalama = " + ortalama);//ortalama = 6.285714285714286

        System.out.print("ortalamadan büyük elemanlar ");
        for (int w : arr) {

            if (w > ortalama) {
                System.out.print(w + " ");//ortalamadan büyük elemanlar 9 15 11

            }

        }


    }
}
