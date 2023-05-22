package zoomcalisma.loop;

public class Ex14 {

    public static void main(String[] args) {

        //3 ile 9 arasındaki tam sayıların çarpımını bulmak için kodu yazınız.

        int multi = 1;

        for (int i = 3; i < 10; i++) {
            multi *= i;
        }
        System.out.println(multi);  //181440

    }
}
