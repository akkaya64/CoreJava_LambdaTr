package day15arrays;

import java.util.Arrays;
import java.util.Comparator;

public class C05_Arrays {

    public static void main(String[] args) {

        //Arama motorunda güzel isimler adlı bir aplikasyon için isimleri küçükten büyüğe sıralayan kodu yazınız.

        String arr[] = {"Abdurrahman", "Akın", "Asan", "Emre", "Yunus", "Ali", "Can", "Veli", "Mehmet"};
        System.out.println(Arrays.toString(arr));//[Abdurrahman, Emre, Yunus, Ali, Mehmet]

        Arrays.sort(arr, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(arr));//[Ali, Can, Akın, Asan, Emre, Veli, Yunus, Mehmet, Abdurrahman] karakter sayısına göre küçükten büyüğü sıraladık Comparator.comparingInt methodu ile

        //String Array elemanlarını karakter sayısına göre ve aynı karakter sayısında olanları büyükten küçüğe sıralayınız.
        //Natural Order(alfabetik sıra)'ya göre.
        String brr[] = {"Abdurrahman", "Akın", "Asan", "Emre", "Yunus", "Ali", "Can", "Veli", "Mehmet"};

        Arrays.sort(brr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(brr));//[Abdurrahman, Mehmet, Yunus, Akın, Asan, Emre, Veli, Ali, Can]// karakter sayısına göre büyükten küçüğe sıraladık daha sonra aynı karakter
        //                                                                                                          sayısında olanları da alfabetik sıraladık


    }
}
