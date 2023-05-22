package day15arrays;

import java.util.Arrays;

public class C03_Arrays {

    public static void main(String[] args) {

        //********Interwiev Questions********
        // [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz.
        // [2,3,13,0,0,0]

        int original[] = {0, 2, 3, 0, 12, 0};

        int yeni[] = new int[original.length];//[0,0,0,0,0,0]

        int idx = 0;
        for (int i = 0; i < original.length; i++) {//orjinal array icin calisti

            if (original[i] != 0) {

                yeni[idx] = original[i];


                idx++;//bir sonraki index"e gecer

            }
        }

        System.out.println(Arrays.toString(yeni));//[2, 3, 12, 0, 0, 0]


    }
}
