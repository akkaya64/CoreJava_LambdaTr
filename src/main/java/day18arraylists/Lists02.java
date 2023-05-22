package day18arraylists;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists02 {
    public static void main(String[] args) {

        //Ex1: Bir tane Integer List oluşturunuz
        //     bu List'te birbirine en yakın iki tam sayıyı yazınız
        //     [12,23,9,11,35]  ==> 12,11

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(9);
        nums.add(11);
        nums.add(35);

        Collections.sort(nums);//sort methodu elemanları küçükten büyüğe dizicek ama Collections.sort olarak yazdır Listler öyle sıralanıyor
        System.out.println("nums = " + nums);//nums = [9, 11, 12, 23, 35]

        int minDiff = nums.get(1) - nums.get(0);//birinci index'ten ikinci index'i cıkarıp aradaki farkı bulduk
        // sonra farkları karşılaştırma yapıp küçüğünü seciçez yani loop

        for (int i = 1; i < nums.size(); i++) { //normalde 0 yaparız ama biz farkı bulmak için ikinci elemandan birinci elemanı çıkarıyoruz yani 1.indexten başlıyoruz oyüzden 1 yapıyoruz

            minDiff = Math.min(minDiff, nums.get(i) - nums.get(i - 1)); //bir sonrakinden bir öncekini çıkarmak

        }
        System.out.println("minDiff = " + minDiff);//minDiff = 1 minimum fark ==>1

        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) - nums.get(i - 1) == minDiff) {//eğer iki elemanın farkı mindiff'e eşitse o elemanları yazdır
                System.out.println(nums.get(i) + " and " + nums.get(i - 1)); //12 and 11 önce büyüğü yazdırdın sonra küçüğü
            }
        }


    }
}
