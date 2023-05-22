package day03scanner;

public class Car {

      //class==> variable (pasif özellikler)==> object
               //method (aktif özellikler)
    public String model= "Corolla";//pasif özellikler (variable)
    public int fiyat= 200000;



    public static void main(String[] args) {
        // obje oluşturma: class isminin yazın==> objeye isim verin =  new keywordunun kullanın==> class ismini parantez ile kullanın
        //nerde new görüyorsan orda yeni oluşturma vardır. new sıfırdan yaratma.
        // iki türlü yaratma vardır 1- yoktan var etmek (new kullandığında), 2- dönüştürerek var etmek
        // class ismi     object ismi      atama operatörü   "new" keyword   constructor
               Car          myCorolla          =               new              Car();

        System.out.println(myCorolla.fiyat);
        System.out.println(myCorolla.model);
        myCorolla.hareket(); //sout içine yazmadık zaten onu methodta soutlamıştık
        myCorolla.dur();     //sout içine yazmadık zaten onu methodta soutlamıştık



    }//main'in bodysi

    //return type void olduğunda method içinde return kelimesi kullanılmaz.

    public void hareket() {

        System.out.println("toyota hızlı hareket eder...");
    }

    public void dur(){
        System.out.println("toyota güvenle durur...");
    }







}//class bodysi
