package zoomcalisma.ternary;

public class Ex09 {
    public static void main(String[] args) {
        //9) Ternary kullanarak; konsolda tek sayılar için “Tek” , çift sayılar için “Çift” yazdırınız.

        int a = 7;

        String sonuc = a % 2 == 0 ? "cift" : "tek";
        System.out.println(sonuc);

    }
}
