package day02datatypesmethodcreation;

public class MethodCreation01 {

    /*
       Javada method nasıl oluşturulur?

       1) main methodun dışında oluşturulur
       2) access modifier + return type + method ismi + () + {}

       Oluşturulan methodlar nasıl kullanılır?
       1) main methodu içinden kullanılır
       2) methodun ismini yazın + () yazın
       3) işlem yapacağınız sayıları parantezi içine koyun
  */

    public static void main(String[] args) {

       int sonuc= add(30,50);
        System.out.println(sonuc);

       long carpmaSonucu =  multiply(3,6);
        System.out.println(carpmaSonucu);

        int ucluSonuc = firstTwoMultiplyThirdAdd(2,5,8);
        System.out.println(ucluSonuc);

        double kup = getCube(5);
        System.out.println(kup);

    }

    public static int add(int a,int b){
        return a+b;
    }
    protected static long multiply (long a,int b) {
        return a*b;
    }
    //örnek1; verilen üç sayıdan ilk ikisini çarpan ve sonucu üçüncü ile toplayan methodu oluşturunuz ve kullanınız?
    private static int firstTwoMultiplyThirdAdd(int a, int b, int c){
        return a*b+c;
    }
    //örnek2; verilen bir ondalık sayının küpünü hesaplayan methodu oluşturp kullanınız?
    //NOTE:  access modifier ı default yapmak için access modifieri yazmayınız
     static double getCube(double a){
        return a*a*a;
    }

    //dikdörtgenin alanını hesaplayan methodu oluşturunuz ve kullanınız
    //  dikdörtgenin çevresini
    //  dairenin çevresini hesaplayan
    // dairenin alanı 








}
