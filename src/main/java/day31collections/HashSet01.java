package day31collections;

import java.util.HashSet;

public class HashSet01 {

    public static void main(String[] args) {

       /*
            1)"Hash" bir tekniktir, Java bu teknigi kullanarak benzersiz datalar uretir.
            2)"Set" tekrarsiz data depolamak icin kullanilam bir Collection'dir.
            3)Set tekrar kabul etmez. Yani;tekrarsiz verileri depolamak icin kullanilir.

            "Set" ler 3'e ayrilir;
                 i)HashSet: a)Super hizlidir,cunku HashSet'ler verdiginiz elemanlari siralamak icin zaman kaybetmez
                              yani; HashSet'lere eklenen elemanlar rastgele siralanirlar.
                            b)HashSet'ler tekrarlı elemana müsaade etmezler
                            c)HashSet'ler sadece bir tane "null"ı eleman olarak kabul ederler

                ii)LinkedHashSet:  a)LinkedHashSet elemanları "insertion order"a göre dizer
                                   b)LinkedHashSet elemanları sıralamakta zaman kaybettiği için, HashSet'e göre yavaştır

                iii)TreeSet: a)TreeSet elemanları "natural order" (küçükten büyüyge veya alfabetik sıra) a göre dizer
                             b)TreeSet "natural order" yaparken çok zaman harcar oyüzden en yavaş "Set"tir
                             c)TreeSet'ler tekrarlı elemana müsaade etmezler

                 */
        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(234);
        hs.add(78);
        hs.add(5);
        System.out.println(hs);//[5, 234, 12, 78] ==> gördüğünüz gibi elemanlar rastgele sıralandı.

        int hc = hs.hashCode();
        System.out.println(hc);//329





    }
}
