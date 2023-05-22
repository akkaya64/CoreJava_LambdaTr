package day16multidimentionalarrays;

import java.util.Arrays;

public class C01_MultidimensionalArrays {

    public static void main(String[] args) {

        /*
        Bir Array'in içindeki data yine bir Array ise buna multidimensional Array denir.


         */

        //Multidimensional Arrayler nasıl oluşturulur?
        int arr[][] = new int[3][2];//auter array(dış array)apartmanda kaç tane kat olduğu gösterir aklında böyle kalsın ==> 3
        // inner array (iç) apartmanın içinde her katta kaç daire olduğunu gösterir ==> 2
        //Bu yöntemle inner array'ler sabit olmak zorunda
        System.out.println(Arrays.toString(arr));//[[I@19dfb72a, [I@17c68925, [I@7e0ea639]
        //içindeki data non-primitive olduğu için adresleri görürüm

        System.out.println(Arrays.toString(arr[1]));//[0, 0]
        System.out.println(Arrays.toString(arr[2]));//[0, 0]

        System.out.println(Arrays.deepToString(arr));//[[0, 0], [0, 0], [0, 0]] multidimensional array'ler bu şekilde yazdırılır. deepToString methodu.

        //Array'lere eleman eklemenin 2.Yöntemi ile
        //Hem declare edip hem de değer atama yöntemi

        int arr2[][] = {{2, 3}, {9}, {78, 6, 4, 5}};
        System.out.println("hem declare hem de değer ataması ile " + Arrays.deepToString(arr2));//hem declare hem de değer ataması ile [[2, 3], [9], [78, 6, 4, 5]]


        //mutlidimensional Array'lere eleman nasıl eklenir?
        arr[1][0] = 6;
        arr[0][0] = 3;
        arr[0][1] = -4;
        arr[1][1] = 18;
        arr[2][0] = -7;
        arr[2][1] = 0;
        System.out.println(Arrays.deepToString(arr));//[[3, -4], [6, 18], [-7, 0]]  ==> deeptosting ile hepsini yazdırıyoruz. deepToStirng multidimensional array yazdırma kodu.
        //toString ile normal array yazdırılıyor.
        System.out.println(Arrays.toString(arr[1]));//[6, 18] tostring ile bir kısmını
        System.out.println(arr[1][0]);//6 arr ve kat daireyi girince o daireye hangisini atadığımızı görürürz cıktı olarak

        //Note: Arraylere non-primitive data konulamaz
        //arraylere primitive data veya referance konulur.
        //ama siz bir array'i yazdırmak istediğinizde Java adresler yardımıyla non-primitive dataya ulaşır ve o non primitive datayı sanki
        //array'in içindeymiş gibi gösterir.

        //Ex : String bir multidimensional Array oluşturun. içerisine dataları ekleyin .
        //      toplam eleman sayısını ekrana yazdırın.

        String brr[][] = new String[3][2];
        brr[0][0] = "a";
        brr[0][1] = "b";

        brr[1][0] = "c";
        brr[1][1] = "d";

        brr[2][0] = "e";
        brr[2][1] = "f";
        System.out.println(Arrays.deepToString(brr));//[[a, b], [c, d], [e, f]]

        int sum = 0;//toplam kac daire olduğu bilgisi burada

        for (String[] w : brr) {//w==> yerine "each" de yazılabiliyor
            sum = sum + w.length;

        }
        System.out.println("toplam " + sum + " daire var.");//toplam 6 daire var.


    }
}
