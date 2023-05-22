package day23datetimestringbuilder;

public class StringBuilder01 {

    /*
    Java'da String, String class kullanilarak veya String Builder class kullanilarak olusturulabilir
    "String Class" kullanarak urettiginiz Stringler "Immutable (degistirilemez)"dir.
    "String Builder  Class" kullanarak urettiginiz Stringler "Mutable (degistirilebilir)"dir.

   */
    public static void main(String[] args) {
        //inmutable
        String s = "Java";
        String t = s + "!";
        String w = t + "?";

        //String'i degistirdikten sonra ayni String'e assaigne (atarsaniz) ederseniz Java yine yeni bir konteynir olusturur,
        // degismis degeri bu yeni konteynirin icine koyar ve
        //eski konteyniri gosteren oku yeni konteynira yonlendirir
        //dolayisiyla eski konteynir adressiz kalir ve garbage collector adressiz olan konteynirlari siler
        String a = "Money";
        a = a + "More";

        //mutable (degistirilebilir)
        //STRING BUILDER KULLANARAK STRING URETMENIN 1. Yolu
        StringBuilder sb1 = new StringBuilder("Python");
        sb1.append("!");//Java yeni konteynir olusturmaz bunu kullaninca ayni kabin icindeki degeri degistirdi
        //append String'i stringe yapistiriyor , concat gibi

        sb1.append("!").append("?").append(".");
        System.out.println(sb1);//Python!!?.  arka arkaya bu sekilde yazabiliyoruz

        //STRING BUILDER KULLANARAK STRING URETMENIN 2. Yolu
        StringBuilder sb2 = new StringBuilder();//parantezin icine yazmayip sonra icine ekliyorsun
        System.out.println(sb2.length());//0 en basta hic karakter olmadigi icin 0 dedi
        //String Builder kullandiginizda baslangic kapasitesi 16'dir.
        //Capacity asimlarinda capacity var olanin iki katinin iki fazlasina cikar
        // 16 ==> 16*2+2     -     34 ==> 34*2+2
        System.out.println(sb2.capacity());//16

        sb2.append("Java");// 4 karakter ekledigimiz icin 4 dedi
        System.out.println(sb2.length());//4
        System.out.println(sb2.capacity());//16

        sb2.append("xxxxxxxxxxxxxxx");
        System.out.println(sb2.length());//19
        System.out.println(sb2.capacity());//34 2.kapasite ekleniyor +2 tane daha bonus kutu 34

        sb2.append("yyyyyyyyyyyyyyyy");
        System.out.println(sb2.length());//35
        System.out.println(sb2.capacity());//70 var olanin 2 kati + 2


        //STRING BUILDER KULLANARAK STRING URETMENIN 3. Yolu
        StringBuilder sb3 = new StringBuilder(2);//constuctorun icine tam sayi koyarsan o kapasiteyi verir.
        sb3.append("flo");
        System.out.println(sb3.length());//3
        System.out.println(sb3.capacity());//6

        sb3.insert(2, "xxxxx");//ilk iki karakteri es gec sonra arasina x koy
        //ofsett gordugunde kac karakteri es gececegini dusun
        //insert() methodu verilen sayi karakteri kadar es gecip istenen characteri eklemeye yarar.
        //insert() methodu append() gibi StringBuilder'i direkt degistirir
        System.out.println(sb3);//flxxxxxo

        //toString methodu String builder'i String'e cevirir
        //String Class'ta var olan ama String builder class'ta var olmayan split() methot gibi
        //methotlara ihtiyac duydugumuzda toString() methodunu kullanarak String class'a gecer ve o methotlari
        //kullaniriz
        sb3.toString().split("l");

        //Stringin tekrar String builder'a cevirebilirsiniz
        StringBuilder sb4 = new StringBuilder(sb3);

        //reverse() methodu String'leri ters cevirir
        sb3.reverse();
        System.out.println(sb3);//oxxxxxlf terse cevirdi reverse()

        sb3.deleteCharAt(1);//index 1 deki karakteri sil
        System.out.println(sb3);//oxxxxlf

        //delete(1,6)index 1'deki karakterden index 5teki (6 dahil olmadigi icin 5 yazdim )
        // karaktere kadar tum karakterleri siler
        sb3.delete(1, 6);
        System.out.println(sb3);

        StringBuilder sb5 = new StringBuilder("Kava");
        StringBuilder sb6 = new StringBuilder("Java");
        //compareTo() alfabatik olarak siralar ascii degerler kullanilir
        //compareTo(sb6) methodu sb5 ile sb6yi alfabetik olarak karsilastirir
        //sb5 alfabetik siralamada once ise sonuc negatif olur, sonra ise sonuc pozitif olur
        // -1 verir. Yani alfabetik sira olarak J harfi, K harfinden 1 oncedir
        // compare (ENG) == karsilastirma (TR)
        System.out.println(sb5.compareTo(sb6));//-1  ilki ikincisinden bir geri demek

        //index 2deki karakteri m ye cevirir
        sb6.setCharAt(2, 'm'); //2. indextekini m ile degistir
        System.out.println(sb6);//Jama

        sb6.replace(1, 3, "xyz");
        System.out.println(sb6);//Jxyza

        /*
        substring() methodu String Class metodudur. String return eder. StringBuilder'in orjinal degerini degistiremez.
        Java data tipleri uyusmadigindan dolayi degisimi kabul etmez.
        */
        // Stringbuilder Class'da kullanmamiza izin verilen substring() method gibi bazi String Class methodlari vardir,
        //Bu method'lari StringBuilder ustunde kullaninca StringBuilder'in orijinal degeri degismez
        String s7 = sb6.substring(1, 3);
        System.out.println(s7);//xy
        System.out.println(sb6);//Jxyza


    }
}
