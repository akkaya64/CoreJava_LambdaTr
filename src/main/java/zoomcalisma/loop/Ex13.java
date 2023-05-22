package zoomcalisma.loop;

public class Ex13 {

    public static void main(String[] args) {

        //3 ile 14 arasındaki tam sayıların toplamını bulmak için kodu yazınız.

        int toplam = 0;

        for (int i = 3; i < 15; i++) {
            toplam += i;
        }
        System.out.println(toplam);

    }
}
