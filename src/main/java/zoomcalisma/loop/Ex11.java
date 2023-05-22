package zoomcalisma.loop;

public class Ex11 {
    public static void main(String[] args) {

        //Bir String’ i tersine çevirmek için kod yazınız. Örnek; Mark ==> kraM

        String str = "Mark";
        String bosStr = "";


        for (int i = str.length() - 1; i > -1; i--) {
            bosStr = bosStr + str.charAt(i);
        }
        System.out.println(bosStr);     //kraM


        //2.Yol
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);     //kraM

    }
}
