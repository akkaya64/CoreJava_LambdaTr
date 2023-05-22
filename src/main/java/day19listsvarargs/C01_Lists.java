package day19listsvarargs;

import java.util.ArrayList;
import java.util.List;

public class C01_Lists {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Hakan");
        names.add("Yunus");
        names.add("Ayse");
        names.add("Zisan");
        names.add("Sevcan");
        names.add("Omer");

        List<String> males = new ArrayList<>();
        males.add("Hakan");
        males.add("Yunus");
        males.add("Ali");
        names.retainAll(males);//ortak elemani bulmak icin retainAll

        System.out.println("names = " + names);//names = [Hakan, Yunus] namesin icerisinde ortak eleman olmayanlar siliniyor
        System.out.println("males = " + males);//males = [Hakan, Yunus, Ali] degismez aynen kalir

        //Listeden belirli bir araliktaki datalari getirme subList()  methodu
        //substring'te oldugu gibi aralik gir ilk yazdigin dahil son yazdigin haric

        List<String> sanatci = new ArrayList<>();
        sanatci.add("Ajda");
        sanatci.add("Cuneyt");
        sanatci.add("Mahsun");
        sanatci.add("Muslum");
        sanatci.add("Orhan");
        sanatci.subList(1, 3);
        System.out.println(sanatci.subList(1, 3)); //[Cuneyt, Mahsun]  subList'i soutun icinde yazdir ya da atama yapip konteynirin adi yazdirilabilir


    }
}
