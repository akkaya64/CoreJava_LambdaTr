package day15arrays;

public class Arrays04 {

    public static void main(String[] args) {

        // Bir Arrayin icinde herhangi bir elemanin olup olmadigini
        // kontrol eden ve kac kere tekrarlandigini gosteren kodu yaziniz

        int a[] = {0, 2, 3, 0, 12, 0};

        int num = 15;

        int counter = 0;
        for (int w : a) {

            if (w == num) {

                counter++;
            }

        }
        if (counter > 0) {
            System.out.println(num + " array'de " + counter + " defa var");//3 array'de 1 defa var
        } else
            System.out.println(num + " array'de yok");

    }
}
