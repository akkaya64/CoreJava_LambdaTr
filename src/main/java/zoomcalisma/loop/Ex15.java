package zoomcalisma.loop;

public class Ex15 {
    public static void main(String[] args) {

        //Do-while döngüsünü kullanarak konsolda 'C' ile 'A' arasındaki karakterleri yazdırmak için
        //kod yazınız.

        char harf = 'C';
        char harf2 = 'A';

        do {
            harf--;
            if (harf == harf2) {
                break;
            }
            System.out.print(harf + " ");

        } while (true);

    }
}
