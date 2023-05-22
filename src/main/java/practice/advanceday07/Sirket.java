package practice.advanceday07;

public class Sirket {

    static int kasa;
    int depertmanButcesi;

    int departmaninKazandigiParaToplami;

    public void kasadanParaAl(int alinacakPara) {
        depertmanButcesi += alinacakPara;
        kasa -= alinacakPara;
        System.out.println("Kasadan " + alinacakPara + " lira alındı");
    }


    public void paraKazan(int kazanilanPara) {
        kasa += kazanilanPara;
        departmaninKazandigiParaToplami += kazanilanPara;
        System.out.println(kazanilanPara + " lira kazanildi.");
    }


    public static void kasadanHarca(int harcananPara) {
        kasa -= harcananPara;
        System.out.println("Kasadan " + harcananPara + " lira harcandı ");
    }

    public void depertmanHarcamasi(int harcananPara) {
        depertmanButcesi -= harcananPara;
        System.out.println("Departman bütçesinden" + harcananPara + " lira harcandı");
    }


}
