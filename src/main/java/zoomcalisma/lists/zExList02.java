package zoomcalisma.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class zExList02 {
    public static void main(String[] args) {
        //12) Verilen herhangi bir arrayin Mountain Array olup olmadığını kontrol etmek için bir kod
        //yazınız.
        //Not:
        //Mountain Array ==> [0, 2, 5, 3, 1]
        //Bir array elemanları en büyük değerine kadar sürekli artan, en büyük değerinden sonra sürekli azalan değer alıyorsa Mauntain Array' dir.
        //Mountain Array Değil ==> [5, 2, 7, 1, 4]
        //Bir array elemanları en büyük değerine kadar sürekli azalan, en büyük değerinden sonra sürekli artan değer alıyorsa Mauntain Array değildir.

        int arr[] = {0, 2, 5, 8, 4, 3, 2, 1};

        List<Integer> list = new ArrayList<>();

        for (Integer w : arr) {
            list.add(w);
        }
        System.out.println(list);//[0, 2, 5, 8, 4, 2, 1]

        //0,2,5,8,4,2,1

        //0,2,5   //8,4,2,1 orj
        //0,2,5   //1,2,4,8
        //0,2,5   //8,4,2,1 kopya

        int maxEleman = list.get(0);

        for (Integer w : list) {
            maxEleman = Math.max(maxEleman, w);
        }
        System.out.println(maxEleman);//8

        List<Integer> list1 = new ArrayList<>();
        for (Integer w : list) {
            if (w == maxEleman) {
                break;
            } else {
                list1.add(w);
            }
        }
        System.out.println(list1);//[0, 2, 5]

        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.indexOf(maxEleman) <= i) {
                System.out.println(i);//3,4,5,6
                list2.add(list.get(i));
            }
        }
        System.out.println(list2);//[8, 4, 2, 1]

        List<Integer> list1Kopya = new ArrayList<>();
        list1Kopya.addAll(list1);//[0,2,5]

        List<Integer> list2Kopya = new ArrayList<>();
        list2Kopya.addAll(list2);//[8,4,2,1]

        Collections.sort(list1Kopya);
        System.out.println(list1Kopya);//[0, 2, 5]

        Collections.sort(list2Kopya);
        System.out.println(list2Kopya);//[1, 2, 4, 8]

        Collections.reverse(list2Kopya);
        System.out.println(list2Kopya);//[8, 4, 2, 1]

        if (list1.equals(list1Kopya) && list2.equals(list2Kopya)) {
            System.out.println("mountain");
        } else {
            System.out.println("mountain degildir");
        }

    }

}
