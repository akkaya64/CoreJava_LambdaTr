package day31collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    /*
        1)interface'lerden object oluşturulamaz çünkü interface'lerin constructor'ı yoktur.

        2)Abstract class'lardan object oluşturulamaz, constructor'ları vardır ama constructor object
          oluşturmada kullanılamaz

        3)interface'lerin constructor'ları olmadığından collection oluştururken interface isimleri "new" keyword'ünden
          sonra kullanılamaz

        4)*class --> class ==> extends
          class --> interface ==> implements
          *interface --> interface ==> extends
          interface --> class ==> BU MÜMKÜN DEĞİLDİR  (aynı olduklarında extends, farklı olduklarında implement)

        5)ArrayList'ler eleman silme ve eleman eklemede başarısızdırlar. Oyüzden eleman silme ve ekleme işlemleri
          çoklukla yapılacaksa ArrayList kullanmak tavsiye edilmez.

          LINKEDLIST ==> Eleman silme-ekleme cok basarilidir. Index kullanmaz.
          LinkedList index kullanmadığı için eleman ekleme ve çıkarma işlemini oldukça kolay yapar.

          LinkedList'ler index kullanmadıklarından eleman silmede ve eklemede re-index yapılmasına gerek yoktur.
          bu da LinkedList'leri eleman ekleme ve silmede çok başarılı hale getirir. Bu yüzden eleman ekleme ve silmenin
          çok yapılması gereken durumlarda LinkedList kullanmak tavsiye edilir

          ArrayList'lerde "search" işlemi kolay yapılır Cünkü index'ler adres gibidir.

          LinkedList'lerde "search" işlemi zor yapılır. Çünkü LinkedList'ler index kullanmaz. index kullanmayınca
          herhangi bir elemanı bulmak için en baştan bütün elemanlar kontrol edilir. Bu da çok fazla iş demektir.
          ekleme çıkarma linkedlistte başarılı
         */

    public static void main(String[] args) {
        List<String> cityName = new LinkedList<>();//başa list yazarak da yapabilirsin


        LinkedList<String> names = new LinkedList<>();//Aynı arraylist oluşturur gibi.
        names.add("Steve");
        names.add("Ajda");
        names.add("Raj");
        names.add("Megan");
        names.add("Brandon");

        System.out.println(names);//[Steve, Ajda, Raj, Megan, Brandon]

        names.addFirst("Cuneyt");
        System.out.println(names);//[Cuneyt, Steve, Ajda, Raj, Megan, Brandon] cuneyti başa koydu

        names.addLast("Ajda");//This method is equivalent to add. bu method "add()" methoduyla aynı ama kodun okunabilirligi için kullanırız
        System.out.println(names);//[Cuneyt, Steve, Ajda, Raj, Megan, Brandon, Ajda] Ajdayı sona ekledi

        names.add(3, "Suleyman");
        System.out.println(names);//[Cuneyt, Steve, Ajda, Suleyman, Raj, Megan, Brandon, Ajda] 3not ile 4. node arasına süleyman ekkledim

        names.remove("Ajda");
        System.out.println(names);//ilk Ajdayi siler loop'u kırar

        names.remove(4);
        System.out.println(names);//[Cuneyt, Steve, Suleyman, Raj, Brandon, Ajda] megan'ı sildik

        names.add("Suleyman");
        names.add("Suleyman");
        System.out.println(names);

        String r1 = names.remove();//Retrieves and removes the first element of this list.(cut paste)
        System.out.println(r1);//Cuneyt sildiğin elemanı geri verir
        System.out.println(names);//sadece remove() kullandığımızda ilk elemanı siler

        names.removeFirstOccurrence("Suleyman");//okunurluğu attırmak için kullanılıyor yoksa remove() ile aynı
        //removeFirstOccurrence() ==> Belirtilen öğenin bu listedeki ilk örneğini kaldırır.
        System.out.println(names);//[Steve, Raj, Brandon, Ajda, Suleyman,Suleyman] ilk süleyman'ı siler

        names.removeLastOccurrence("Suleyman");
        System.out.println(names);//en sonuncu süleyman'i sildi


        //remove() ile peek() arasındaki fark ==>    remove()->remove siler ve gosterir   peek()-> gosterir silmez
        //peek() ilk elemanı silmeden size verir
        //remove() ilk elemanı siler ve size verir
        String r2 = names.peek();//peek() silmiyor (copy paste)
        System.out.println(r2);//Steve
        System.out.println(names);//[Steve, Raj, Brandon, Ajda, Suleyman]

        names.peekFirst();//peek() ile aynı

       //remove() boş LinkedList'te kullanılırsa "hata" verir, poll() boş LinkedList'te kullanılırsa "null" verir.
        names.poll();//cut paste yapar.

        names.pop();//pop() ile removeFirst() aynı işi görüyor.
    }

}
