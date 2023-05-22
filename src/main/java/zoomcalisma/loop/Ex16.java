package zoomcalisma.loop;

public class Ex16 {
    public static void main(String[] args) {

        //Bir String de, ilk 'm' karakterinden önceki tüm karakterleri yazınız.
        String s = "Christmasmgdsh";
        String yeni = "";

        for (int i = 0; i < s.length(); i++) {
            String a = s.substring(i, i + 1);
            if (a.equals("m")) {
                break;
            }
            yeni += a;
        }
        System.out.println(yeni);   //Christ

    }
}
