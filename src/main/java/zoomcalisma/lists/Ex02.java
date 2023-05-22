package zoomcalisma.lists;

import java.util.Arrays;
import java.util.List;

public class Ex02 {
    //Example 1: Verilen bir String List'teki elemanlarin toplam karakter sayisini bulan kodu yaziniz.
    public static void main(String[] args) {
        List<String> animals= Arrays.asList("cat","dog","bird","monkey");
        int sum=0;
        for (String w : animals) {
            sum+=w.length();
        }
        System.out.println(sum);
    }

}
