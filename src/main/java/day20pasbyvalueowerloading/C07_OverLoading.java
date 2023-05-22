package day20pasbyvalueowerloading;

public class C07_OverLoading {

    public static void main(String[] args) {

          /*
        AYNI ISIMDE AYNI CLASSTA BIRDEN FAZLA METHOD OLUSTURABILIRMIYIZ?

        Java ayni ismde ayni class'ta birden fazla method oldugunda
        icerisindeki Data type'ina , data sayisina ya da yerlerine gore
        en uygun olani secer.eger bir classta isimleri ayni data typelari
        farkli metodlar olusturusak buna Method Overloading denir.
        Java hangi methodu kullanacagina karar verirken optimizasyona gider .
        En uygun olani en az AutoWidinig gerektireni secer




         */
        String str = "Java ile guzel Dunya";
        System.out.println(str.substring(2));//va ile guzel Dunya
        System.out.println(str.replace("Java", "*"));//* ile guzel Dunya
        System.out.println(str.replace('J', '*'));//*ava ile guzel Dunya

        topla(3, 5);
        topla(8.6, 5);
        topla(2.4, 6.8);


    }//main

    private static void topla(double a, double b) {
        System.out.println(a + b);

    }

    private static void topla(double a, int b) {
        System.out.println(a + b);

    }

    private static void topla(int a, int b) {
        int toplam = a + b;

    }


}
