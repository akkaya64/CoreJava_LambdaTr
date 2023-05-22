package zoomcalisma.loop;

public class Ex04 {
    public static void main(String[] args) {

        //Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız.
        //Örnek; 223878 ´ 37

        String str = "223878";
        String a = "";

        for (int i = 0; i < str.length(); i++) {
            String b = str.substring(i, i + 1);
            if (str.indexOf(b) == str.lastIndexOf(b)) {
                a = a + b;
            }
        }
        System.out.println(a);  //37

    }
}
