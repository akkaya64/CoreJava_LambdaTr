package zoomcalisma.loop;

public class Ex17 {
    public static void main(String[] args) {

        //Bir tamsayıdaki rakamların toplamını bulmak için kodu yazınız.

        int sayi = 1234;
        int toplam = 0;

        for (int i = sayi; i > 0; i = i / 10) { //123  12 1
            toplam += i % 10;  //4 + 3 +2 + 1
        }
        System.out.println(toplam);     //10

    }
}
