package day24accessmodifiersinheritance;

public class Vehicle {

    /*
    1)Child Class'dan bir object oluşturduğunuzda Constructor'lar en üstteki
    Parent Class'tan başlatılarak alta doğru çalıştırılır.
     */
    public Vehicle(){
        System.out.println("Vehicle 1");
    }

}
