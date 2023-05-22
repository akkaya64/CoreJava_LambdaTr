package day28exceptions;

public class Exceptions05 {

    public static void main(String[] args) {

        int a = 16;
        int b = 5;

        String s = "My Java";
        getCharFromString(s,a,b);
    }

    //try kısmında birden fazla Exception oluşturma ihtimali olan kod varsa, çoklu "catch" kullanabilirsiniz

    //Coklu "catch" kullandığınızda Exception Class'larda arasında "parent - child" ilişkisi yoksa, catch'lerin sırası
    //önemli değildir. Ama koddaki sıralamaya uymak tavsiye edilir

    //Coklu "catch" kullandığınızda Exception Class'larda arasında "parent - child" ilişkisi varsa, catch'lerin sırası
    //önemlidir. child olan class üstte olmalıdır.

    //Exception Class'larda arasında "parent - child" ilişkisi varsa, ya child class'ı üste yazarak ve parent class'lar
    //icin özelleştirilmiş kodlar yazarsınız (hırsız için 155, hasta için 112 gibi)
    //veya child'i hiç kullanmaz sadece parent ile exception'ları handle etmeye çalışırsınız.(hırsız için 911, hasta için 911 gibi)
    public static void getCharFromString(String s, int a, int b) {
        try {//trydan sonra birden fazla catch kullanabilirsin

            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);

        }catch (ArithmeticException e){

            System.out.println("do not divide by zero");//bölmedeki tehlike burda halledildi

        }catch (StringIndexOutOfBoundsException e){

            System.out.println("Olmayan index kullandınız");//index'teki tehlike burda halledildi
        }

    }

}