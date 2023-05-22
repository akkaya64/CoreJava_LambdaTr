package practice.advanceday06;

public class Hacim {

    //methodoverloaing ayni isimdeki methodlari farkli parametrelerde yazdik

    public int hacimHesapla(int a) {
        return a * a * a;

    }

    public int hacimHesapla(int a, int b) {
        return a * a * b;

    }

    public int hacimHesapla(int a, int b, int c) {
        return a * b * c;

    }


}
