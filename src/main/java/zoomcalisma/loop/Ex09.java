package zoomcalisma.loop;

public class Ex09 {
    public static void main(String[] args) {

        //String içindeki tüm küçük harfleri yıldız işaretiyle yazdırmak için gereken kodu yazınız.
        //Örneğin; 'Ali Can?' ==> l*i*a*n*

        String isim = "Ali Can?";

        isim = isim.replaceAll("[^a-z]", "");
        System.out.println(isim);   //lian

        for (int i = 0; i < isim.length(); i++) {

            System.out.print(isim.substring(i, i + 1) + "*");
        }

    }
}
