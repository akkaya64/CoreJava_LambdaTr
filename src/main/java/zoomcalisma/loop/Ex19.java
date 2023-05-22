package zoomcalisma.loop;

public class Ex19 {
    public static void main(String[] args) {

        //Bir String’ deki boşluk ve noktalama işaretleri dışındaki toplam karakter sayısını bulunuz.

        String str = "Java is a strongly typed, object-oriented programming language.";

        int uzunluk = str.replaceAll("[\\p{Punct} ]", "").length();
        System.out.println(uzunluk);    //53

    }
}
