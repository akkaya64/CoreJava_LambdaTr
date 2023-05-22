package zoomcalisma.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex03 {

    //Example 2: Bir Integer List'teki 7 haric tum elemanlarin degerlerini 3 arttirinz
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 2, 5, 6, 7, 9);

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == 7) {
                continue;
            } else nums.set(i, nums.get(i) + 3);
        }
        System.out.println(nums);

        //Example 3: Verilen bir List'teki elemanlari tekrarsiz olarak yazdiriniz

        //[2,3,2,2,3,5]==>[2,3,5]

        List<Integer> nums1 = Arrays.asList(2, 3, 2, 2, 3, 5);
        List<Integer> nums2 = new ArrayList<>();
        for (int i = 0; i < nums1.size(); i++) {
            if (!nums2.contains(nums1.get(i))) {
                nums2.add(nums1.get(i));
            }

        }
        System.out.println(nums2);

    }
}
