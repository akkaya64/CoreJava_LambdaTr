package day25inheritance;

public class Vehicle {

    /*
   1)Child Class'dan bir object oluşturduğunuzda Constructor'lar en üstteki
      Parent Class'tan başlatılarak alta doğru çalıştırılır.
   2)Child Class'taki constructor'dan Parent Class'taki constructor'a gidebilmek için
      "super()" kullanılır.
   3)Parent Class'ta birden fazla constructor varsa istenilen constructor, super() ifadesinin parantezi
      içine yazılan parametreler yardımı ile seçilebilir
   4)Ayni class icindeki constructor'lari secmek icin "this()" kullanilir.
     Ayni Class'da birden fazla constructor varsa istenilen constructor,"this()" ifadesinin icine yazilan
     parametreler yardimi ile secilebilir.
   5)"super()" ifadesini yazmak istege baglidir, yazmasaniz da Java sanki "super()" varmis gibi davranir.
      Ama kodunuzu daha okunur kilmak icin yazmaniz tavsiye edilir.
   6)"super()" ve "this()" ifadeleri constructor içinde her zaman ilk satırda olmalıdır
  *****7)Bir constructor içinde "super()" ve "this()" ifadeleri sadece bir kez kullanilabilir. Bakiniz 6. kural.
  *****8)Inheritance'da variable'lari ve methotları cağırmak için "this" veya "super" kullanılır.
         "this" aynı class içindeki variable'lari ve methodları çağırmak için kullanılır.
         "super" Parent class içindeki variable'lari ve methodları çağırmak için kullanılır.
  9)Inheritance'da object kullanarak variable cağırırsanız. objectin data tipini temsil eden class'tan
  variable'yi aramaya başlayınız. O class'ta yoksa Parent'lara bakınız
  10)Inheritance'da object kullanarak method cağırırsanız, object constructor'ını temsil eden class'dan methodu aramaya
  başlayınız. 0 class'da yoksa parent'lara bakınız.

  OOP Principals:
  i)Inheritance
  ii)Polymorphism: Method Overloading + Method Overriding
  iii)Encapsulation -
  iv)Abstraction -

     */
    public int price = 12000;

    public void engine(){
        System.out.println("Vehicle engine..");
    }

    public Vehicle() {
        System.out.println("Vehicle 1");
    }

    public Vehicle(int price) {
        System.out.println("Vehicle 2: " + price);
    }


}
