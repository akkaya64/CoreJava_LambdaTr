package practice.advanceday11.abstruction_alan_hesaplama;

public class AbstrctionRunner {

    //Dikdörtgen ve üçgenin alanlarını hesaplayan bir kod yazınız.(abstraction kullanın)

    public static void main(String[] args) {
        Dikdortgen dikdortgen = new Dikdortgen();
        System.out.println(dikdortgen.alanHesapla(5, 4));//20.0

        Ucgen ucgen = new Ucgen();
        System.out.println(ucgen.alanHesapla(5, 4));//10.0


    }



}
