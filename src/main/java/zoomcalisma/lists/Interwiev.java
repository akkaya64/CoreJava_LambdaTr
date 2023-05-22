package zoomcalisma.lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Interwiev {
     /*
        Example 1: Bir tane Integer List olusturunuz.
                 Bu list'te birbirne en yakin iki tamsayiyi yaziniz.
           [12,23,9,11,35] ==> 12,11
     */

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(35, 23, 9, 11, 12);
        Collections.sort(nums);
        int minFark = nums.get(1) - nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            minFark = Math.min(minFark, nums.get(i) - nums.get(i - 1));
        }
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) - nums.get(i - 1) == minFark) {
                System.out.println(nums.get(i) + "-" + nums.get(i - 1));
            }
        }
    }

}
