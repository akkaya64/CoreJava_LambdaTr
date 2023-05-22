package day18arraylists;

import java.util.ArrayList;
import java.util.List;

public class Lists03 {
    public static void main(String[] args) {

        //Ex2: Bir Integer List'teki 7 haric tüm elemanların değerlerini 3 artırınız
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(7);
        nums.add(12);
        nums.add(11);


        //1.YOL for each
        for (Integer w : nums) {
            if (w == 7) {
                continue;
            }
            nums.set(nums.indexOf(w), w + 3);
        }

        System.out.println("nums = " + nums);//nums = [15, 26, 7, 15, 14]


        //2.YOL for loop
        for (int i = 0; i < nums.size(); i++) {

            int eleman = nums.get(i);//ekmek almaya gittik poşete koyduk örnegiyle. bakkala gittik elemanı poşete koyduk
            // get elemanı getirir, seçer

            if (nums.get(i) == 7) {
                continue;
            }
            nums.set(i, eleman + 3);//set elemanı değiştirir. update eder
        }
        System.out.println(nums);//[18, 29, 7, 18, 17] 1. yoldan dolayı tekrar artırdı

        /*
        NOT: nums.indexOf(w) ilk görünümün indeşx'ini verir. List tekrarlı elemana sahip ise
             nums.indexOf(w) kullanımı risk oluşturabilir. Bu yüzden bu soruda en güvenli yol "for loop"tur.
        */


    }
}
