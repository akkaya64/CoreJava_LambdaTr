package day15arrays;

public class C04_Arrays {

    public static void main(String[] args) {

        //Bir array'in icinde herhangi bir elemanin olup olmadigini kontrol eden kac kere tekrarlandigini gosteren
        // kodu yaziniz.

        int arr[] = {5, 1, 5, -3};

        int eleman = 5;

        int counter = 0;

        for (int w : arr) {

            if (w == eleman) {

                counter++;
            }

        }
        if (counter > 0) {
            System.out.println(eleman + " Arrayde " + counter + " defa var.");//5 Arrayde 2 defa var.
        } else
            System.out.println(eleman + " Arrayde yok.");


    }
}
