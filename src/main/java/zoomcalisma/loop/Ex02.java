package zoomcalisma.loop;

public class Ex02 {
    public static void main(String[] args) {

        //Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
        //Örneğin; accessories ´ ces

        String str = "accessories";
        String tekrarli = "";

        for (int i = 0; i < str.length(); i++) {

            String harf = str.substring(i, i + 1);
            if (str.indexOf(harf) != str.lastIndexOf(harf)) {
                if (!tekrarli.contains(harf)) {
                    tekrarli = tekrarli + harf;
                }
            }
        }
        System.out.println(tekrarli);   //ces

    }
}
