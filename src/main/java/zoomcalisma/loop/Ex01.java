package zoomcalisma.loop;

public class Ex01 {
    public static void main(String[] args) {

        //120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
        //ardışık tam sayı arasında boşluk bırakarak yazınız.

        for (int i = 120; i > 10; i--) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        int j = 120;

        while (j > 10) {
            if (j % 4 == 0 && j % 6 == 0) {
                System.out.print(j + " ");
            }
            j--;
        }
        System.out.println();

        int e = 120;

        do {

            if (e % 4 == 0 && e % 6 == 0) {
                System.out.print(e + " ");
            }
            e--;

        } while (e > 10);

    }
}
