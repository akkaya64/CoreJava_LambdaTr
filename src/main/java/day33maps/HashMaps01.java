package day33maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps01 {

    /* sozluk yapisi map'a benzer
     solda kelime, sagda aciklamasi vardir
     soldakiler tekrarli olamaz sagda tekrar olabilir
     map te boyledir soldakiler Unique (yunik) olacak sag taraf tekrarli olabilir de olmayapilir repeatedly (tekrarli) olabilir
             cat = evcil hayvan
             dog = evcil hayvan
             crocodile = timsah
     tiger = kaplan
     solda data sagda data
     map deyince sozluk akla gelsin
     sola unique lere key tekrarli olabilen sagdaki data lara value denir

     map te bir data stractir dir
     depolarken bu yapiya ihtiyac varsa map kullaniriz
     mesela ulkeler ve nufuslarini depolamamiz lazim burda sol unique sag tekrarli olabilir burda map kullaniriz
     mesela okul app imiz var ogrencilerin karne ort ni depolayacagiz sol unique sa[ tekrarli olabilir burda map kullanilmalidir

     */
    public static void main(String[] args) {

        /*
        1)Map'lerde "USA" = 400,000,000 şeklinde data depolamamız gerektiğinde kullanılır.
        2)Map'lerde "USA" = 400,000,000 datasının "USA" kısmı ==> key olarak adlandırılır ve "key"ler "unique"dir
        3)Map'lerde "USA" = 400,000,000 datasının   400,000,000 kısmı "value" olarak adlandırılır ve value ler tekrarlı olabilir
        4)Map'lerde depoladığınız her bir data'ya "Entry" denir, "eleman" denmez
        5)"HashMap"ler çok hızlıdır çünkü "HashMap"ler sıralama ile uğraşmazlar
        6)"Entry"ler "unique"dir çünkü "key" kısımları "unique" olduğundan her bir "entry" diğerlerinden farklıdır.
        7)"HashMap"ler çok hızlıdır çünkü "HashMap"ler "entry"leri sıralamak ile uğraşmazlar
        7)"HashMap"lerde bir tane "key"i "null" yapabilirsiniz
        8)"HashMap"lerde birden fazla "value"yu "null" yapabilirsiniz
        9)"HashMap"ler "multi thread" için kullanılamaz ve "synchronization"(mantıklı sıraya koyma) yoktur.

     */
        //HashMap nasıl oluşturulur?
        HashMap<String, Integer> hm = new HashMap<>();//iki tane data tipi yazıyorsun Integer Integer , String String da olabilir
        // çünkü entry'ler de iki bölüm var oyüzden iki tane yaz
        //primitive kullanma. sağ tarafa yazınca soluk renk oluyor yani yazmasan da olabilir.
        System.out.println("hm = " + hm);//hm = {} boş map

        //HashMap'lere nasıl entry eklenir?
        hm.put("USA", 400000000);
        hm.put("Gearmany", 850000000);
        //Aynı key i kullanarak yeni bir entry eklerseniz var olan value'u  update edersiniz
        hm.put("Albania", 280000000);
        hm.put(null, 1200000000);
        hm.put(null, 1800000000);
        hm.put("Myanmar", null);
        hm.put("Bhuthan", null);

        System.out.println("hm = " + hm);//hm = {null=1800000000, Myanmar=null, USA=400000000, Gearmany=850000000, Bruthan=null, Albania=280000000}
        // bu yapıya entry deniyor

        //HashMap'lerde sadece "key"leri almak istiyorum
        Set<String> hmKeys = hm.keySet();//method isimleri o methodun yaptığı işi özetler. yani key'leri bana set olarak vericek
        System.out.println("hmKeys = " + hmKeys);//hmKeys = [null, Myanmar, USA, Gearmany, Bruthan, Albania]

        //HashMap'lerde sadece "value"lari almak istiyorum
        //Ex 1: hm Map'indeki ulkelerin toplam nüfusunu bulunuz.
        Collection<Integer> hmValues = hm.values();
        int sum = 0;
        for (Integer w : hmValues) {
            if (w != null) {
                sum = sum + w;
            }

        }
        System.out.println("sum = " + sum);

        //"HashMap"lerde belirli bir "key"nin value'sunu nasıl alabiliriz
        Integer usaPopulation = hm.get("USA");
        System.out.println("usaPopulation = " + usaPopulation);//usaPopulation = 400000000

        //HashMap'lerde replace() methodu var olan bir "key" nin "value"sunu değiştirmek için kullanılır
        hm.replace("Bhuthan", 35000000);
        System.out.println("hm = " + hm);//hm = {null=1800000000, Myanmar=null, USA=400000000, Gearmany=850000000, Bhuthan=35000000, Albania=280000000}

        hm.putIfAbsent("USA", 700000000);//benim map'inde usa yoksa 700000 olanı koycak, varsa hiç değişmicek
        System.out.println("hm = " + hm);//USA=400000000 değişmedi

        hm.putIfAbsent("India", 700000000);
        System.out.println("hm = " + hm);//hm = {null=1800000000, Myanmar=null, USA=400000000, Gearmany=850000000, Bhuthan=35000000, Albania=280000000, India=700000000}
        //ındia map'te hiç olmadığı için ekledi o değeri ona ekledi

        //Ex 2: Yeni öğretmenin maaşı standart ücretten 1000 tl fazla, eski öğretmenin maaşı standart ücretten 2000tl fazla olsun
        HashMap<String, Integer> salaries = new HashMap<>();
        salaries.put("Ali", 8000);
        salaries.put("Ayse", 5000);
        salaries.put("Veli", 9000);
        salaries.put("Tom", 9900);

        String teacherName = "Kemal";
        if (salaries.keySet().contains(teacherName)) {
            salaries.put(teacherName, 12000);
        } else{
            salaries.putIfAbsent(teacherName, 11000);
        }
        System.out.println("salaries = " + salaries);//salaries = {Tom=9900, Veli=9000, Ayse=5000, Kemal=11000, Ali=8000}

        //replace ("USA",400000000,500000000) methodu key USA ve value 400000000 is value 500000000) yapar
        hm.replace("USA",400000000,500000000);//eski değeri değiştircek yenisiyle
        System.out.println("hm = " + hm);

        ////getOrDefault() olan key'lerin degerini verir, olmayan key'ler icin de sizin ikinci parametreye yazdiginiz degeri verir
        Integer r = hm.getOrDefault("Bhuthan",0);//get yapıcak veya default'u vericek. bhuthan varsa bana onun nufüsunu vericek eğer yoksa 0 vericek
        System.out.println("r = " + r);//r = 35000000  getOrDefault yani olmayan key'ler için 0 ver olan key'ler için onun değerini verir. 0 verdiğim için 0 verdi 100 versem 100 vercekti

        //entrySet() map'i entrySet kullanarak set'e cevirdik.
        //entrySet(); methodu "Map"i "Set"e cevirir.
        // Setlerin methodlarini kullanabilmek icin entrySet() kullanarak map'i Set'e cevirebiliriz
        //Map'i Set'e çevirdiğimizde Set'in bütün özelliklerini kullanabiliriz. Mesela loop gibi.
        //entrySet() methodunu kullandığınzda elde ettiğiniz Set'in elemanları "<Map.Entry<String,Integer>" şeklinde bir Map olur. Bu yüzden
        //elemanlar için Map methodları kullanılabilir
        Set<Map.Entry<String,Integer>> myEntries =  hm.entrySet();
        System.out.println("myEntries = " + myEntries);//myEntries = [null=1800000000, Myanmar=null, USA=500000000, Gearmany=850000000, Bhuthan=35000000, Albania=280000000, India=700000000]
                                                         //bütün entry'leri setin içnide yazdırdı

        //Ex 3: Ulke ismindeki karakter sayısını ulke nüfusuna ekleyen ve sonucu konsola yazdıran kodu yazınız
        for (Map.Entry<String,Integer> w : myEntries){

            if (w.getValue()!=null && w.getKey()!=null){
                int toplam= w.getValue() + w.getKey().length();
                System.out.println("toplam = " + toplam);
            }


        }

    }
}