package zoomcalisma.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex01 {

      /*
    1) ArrayList(List)'ler coklu data depolamak icin kullanilir.
    2) ArrayList(List)'ler non-primitive data type'inda ki coklu datalari depolamak icin kullanilir.
       List'ler "non-primitive" data kabul ederler, "Array" ler ise "primitive" data veya reference kabul eder.
    3) ArrayList(List)'leri olustururken icine koyacaginiz eleman sayisini basta soylemeye gerek yoktur.
       List'ler eleman sayisinda "flexible" dirlar ama "Array"ler "flexible" degildirler.
    4) Madem "Array" ler eleman sayisinda flexible degil nicin Java "Array" leri iptal etmedi?
         i) Eleman sayisi belli olan data'lari depolamak icin Array'ler tercih edilir.
         ii) Array'ler cok hizli calisir.
         iii) Array'ler memory'de cok az yer kaplar.
   */


    //List nasil olusturulur ?
    public static void main(String[] args) {

//        list.add(5);
//        list.add(8);
//        list.add(7);
//        list.add(9);
//        list.add(1,10);
//        List<String> list1=new ArrayList<>();
//        list1.add("ali");
//        list1.add("veli");
//        list1.add("ayse");
//        list1.add("ali");
//        list1.add("veli");
//        System.out.println(list);
        // boolean num=  list.remove((Integer) 2);

//        System.out.println(list);
//        List<String>list2=List.of("ali","veli");
//
//       list1.removeAll(list2);
//        System.out.println(list1);
//        list2.remove(0);
//        System.out.println(list2);
//        List<String> list3 = new ArrayList<>(Arrays.asList("ali", "veli", "ahmet", "mehmet"));
//        System.out.println(list3.remove(1));
//        System.out.println(list3);
//        List<String> list4 = List.of("ali","veli");
//        list3.removeAll(list4);
//        System.out.println(list3);
        List<Integer> list=new ArrayList<>(Arrays.asList(6,7,5));
        List<Integer>list1= Arrays.asList(5,6,7);
        boolean a=list.equals(list1);
        System.out.println(a);
        System.out.println(list.indexOf(7));
        System.out.println(list.size());
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        // list.clear();
        System.out.println(list);
        System.out.println(list.subList(1,2));
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.isEmpty());
        Object[] arr = list.toArray();
        System.out.println(Arrays.toString(arr));

    }

}
