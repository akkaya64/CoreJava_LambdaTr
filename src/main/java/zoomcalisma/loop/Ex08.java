package zoomcalisma.loop;

public class Ex08 {
    public static void main(String[] args) {

        //20'den 3'e kadar olan tek tamsayıları aynı satırda ardışık olacak şekilde aralarında boşluk
        //bırakarak yazdırmak için gereken kodu yazınız.

        for (int i = 20; i > 2; i--) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

    }
}
