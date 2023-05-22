package zoomcalisma.loop;

public class Ex10 {
    public static void main(String[] args) {

        //Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
        //işaretiyle yazdırmak için gereken kodu yazınız.
        //Örneğin; 75.4238 ´ *4*2*3*8

        double sayi = 75.4238;
        String str = String.valueOf(sayi);

        str = str.split("\\.")[1];


        for (int i = 0; i < str.length(); i++) {
            System.out.print("*" + str.charAt(i));  //*4*2*3*8
        }

//        for (int i = str.indexOf(".")+1; i < str.length(); i++) {
//            System.out.print("*" + str.substring(i,i+1));   //*4*2*3*8
//        }

    }
}
