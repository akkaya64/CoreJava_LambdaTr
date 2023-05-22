package day13whileloopdowhileloop;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        int a = 12;//Bu yapının içinde sadece bir tane data depolanabilir.
        // Ama biz kod yazarken bir yapının içinde çoklu data depolama ihtiyacı hissederiz.
        // Bir yapının içinde çoklu data depolayabilme için Java "Array " yapısını oluşturmuştur

        //Array nasıl oluşturulur?
        //Array oluşturmak için "Array elemanlarının data tipi" ve "eleman sayısı" mutlaka yazılmalıdır.
        String stdNames[] = new String[5];

        //Array konsola nasıl yazdırılır?
        //String methodunu kullanmadan sadece Array ismi ile yazdırırsanız Java o Array'in adresini yazdırır.
        System.out.println(Arrays.toString(stdNames));//toString methodu ==> adrese gelir adresten array'i bulur ve bunu konsola yazdırır.

        //Array'e eleman ekleme nasıl yapılır?
        stdNames[2] = "Ajda";
        ;//[null, null, Ajda, null, null]
        stdNames[0] = "Cuneyt";
        stdNames[1] = "Kemal";
        stdNames[3] = "Ezel";
        stdNames[4] = "Beşir";
        System.out.println(Arrays.toString(stdNames));

        //Array'dan specific bir elemanı almak
        System.out.println(stdNames[2]);//Ajda

        //Ex 1: Array'deki her elemanı sonuna "!" işareti koyarak ekrana yazdırınız.
        for(int i=0; i<stdNames.length; i++ ){

            System.out.println(stdNames[i] + "!" );


        }









    }
}
