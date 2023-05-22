package practice.advanceday10.okul;

import java.util.ArrayList;
import java.util.List;

public class Okul {

    private String okulAdi;
    private int maxOgrenciSayisi;
    private List<Ogrenci> ogrenciListesi = new ArrayList<>();//Her class bir data type'idir ama her data type'i bir class degildir.
    //Ogrenci class'indan bir List olusturuldugundan data type'ina onu yazdik
    //List'in data type'i object ile ayni olursa farkli data type'lari icine koyabiliriz.


    public Okul(String okulAdi, int maxOgrenciSayisi, List<Ogrenci> ogrenciListesi) {
        this.okulAdi = okulAdi;
        this.maxOgrenciSayisi = maxOgrenciSayisi;
        this.ogrenciListesi = ogrenciListesi;
    }

    public Okul() {
    }

    public String getOkulAdi() {
        return okulAdi;
    }

    public void setOkulAdi(String okulAdi) {
        this.okulAdi = okulAdi;
    }

    public int getMaxOgrenciSayisi() {
        return maxOgrenciSayisi;
    }

    public void setMaxOgrenciSayisi(int maxOgrenciSayisi) {
        this.maxOgrenciSayisi = maxOgrenciSayisi;
    }

    public List<Ogrenci> getOgrenciListesi() {
        return ogrenciListesi;
    }

    public void setOgrenciListesi(List<Ogrenci> ogrenciListesi) {
        this.ogrenciListesi = ogrenciListesi;
    }

    public void addOgrenciToList(Ogrenci ogrenci){
        this.ogrenciListesi.add(ogrenci);
    }

    @Override
    public String toString() {
        return "Okul{" +
                "okulAdi='" + okulAdi + '\'' +
                ", maxOgrenciSayisi=" + maxOgrenciSayisi +
                ", ogrenciListesi=" + ogrenciListesi +
                '}';
    }


}
