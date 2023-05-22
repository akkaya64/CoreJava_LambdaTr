package day16multidimentionalarrays;

public class C04_MultidimensionalArrays {

    public static void main(String[] args) {

        //Bir multidimensional array deki
        // en buyuk ve en kucuk elemanin
        // toplamini veren kodu yaziniz

        int arr[][] = {{2, 5, 1}, {83, 75}};

        int maxElement = arr[0][0]; //2
        int minElement = arr[0][0];
        for (int[] w : arr) {

            for (int k : w) {

                maxElement = Math.max(maxElement, k);
                minElement = Math.min(minElement, k);

            }

        }
        System.out.println("maxElement = " + maxElement);//83
        System.out.println("minElement = " + minElement);//1

        System.out.println("toplam = " + (maxElement + minElement));//84


    }
}
