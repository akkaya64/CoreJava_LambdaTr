package day15arrays;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {


        // [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz.
        // [2,3,13,0,0,0]


        int a[] = {0, 2, 3, 0, 12, 0};// [2,3,13,0,0,0] bunu goruruz bu kodda.

        int b[] = new int[a.length];// [0,0,0,0,0,0]
        // a'nin uzunlugu(length'i) kadar Arry olsun dedik.


        int idx = 0;

        for (int w : a) {//a'dan w'ya elemani koy

            if (w != 0) {
                b[idx] = w;

                idx++;

            }

        }
        System.out.println(Arrays.toString(b));// [2, 3, 12, 0, 0, 0]


    }
}
