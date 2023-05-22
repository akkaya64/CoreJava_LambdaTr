package day20pasbyvalueowerloading;

public class C06_PassByValue {

    public static void main(String[] args) {
        //100tl ye satılan bir ürün için 2 farklı indirim uygulayan iki method oluşturunuz

        int fiyat = 100;

        indirimYap25(fiyat);
        System.out.println("main içinde methodtan sonra fiyat = " + fiyat);//100 indirimli filattan sonra değerini korudu

        fiyat = indirimYap10(fiyat);
        System.out.println("Main içinde methodtan sonra fiyat = " + fiyat);//100 çünkü atama yapmadık atama yapıp yazdırırsak 90 olur
        //fiyat= indirimyap10 yapınca sonuç 90 olur


    }//main

    private static int indirimYap10(int fiyat) {

        fiyat *= 0.9;
        return fiyat;


    }

    private static void indirimYap25(int fiyat) {

        fiyat *= 0.75;
        System.out.println("%25 indirimli fiyat = " + fiyat);//75
    }
}
