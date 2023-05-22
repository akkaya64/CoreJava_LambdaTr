package day22staticblocksconstructors;

/*
   Constructor nedir?
   Class'tan obje uretmemize yarayan kod block'laridir.

   Class olusturdugumuzda Java bize otomatik olarak bir constructor verir.
   Ama bu constructor gozle gorulmez, gozle gorulmeyen otomatik olarak Jav tarafindan verilen bu constructur'lara
   "default constructor" denir.

   Default constructor'lar "Car() { } " seklindedir ==> class ismi + () + {} parantez ismi ve suslunun icinde hicbir sey yoktur

   Siz kendi constructor'unuzu olusturdugunuzda Java default constructor'u siler.

   Bir Class'ta farkli parametreler kullanarak istediginiz kadar constructor olusturabilirsiniz

   Farkli constructor'ler sayesinde bir class'tan farkli farkli objeler olusturabiliriz.

   ****INTERVIEW SORUSU*****
   Method ile constructor'in farki var midir, varsa nedir?
   CEVAP: Method ile constructor farkli yapilardir
          iki farki var  1- method'larda return type vardir ama constructor'larda return type yoktur.
                         2- method'larin ismi yaptiklari ise gore developer'lar tarafindan belirlenir
                            constructor'larin ismi ise her zaman class ismiyle ayni olmalidir.

    */
public class Car {

    String make = "Honda";
    String model = "Accord";
    int year = 2023;
    boolean hybrid = true;

    public Car(String make, String model, int year, boolean hybrid) {
        this.make = make; //this.make bu class'taki make'yi benim verdigim make yap diyoruz
        this.model = model;
        this.year = year;
        this.hybrid = hybrid;


    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        if (year == 2023) {
            this.year = 0;
        }

        if (hybrid == true) {
            this.hybrid = false;
        }
    }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
