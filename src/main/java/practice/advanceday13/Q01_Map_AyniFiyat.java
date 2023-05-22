package practice.advanceday13;

import java.util.HashMap;
import java.util.Map;

public class Q01_Map_AyniFiyat {
    //Aşağıda verilen fiyat listesinden fiyatı 29.99 olan ürünlerin adlarını yazdırınız.

    public static void main(String[] args) {
        Map<String, Double> urunler = new HashMap<>();
        urunler.put("Kemer", 19.99);
        urunler.put("Gomlek", 29.99);
        urunler.put("Kazak", 24.99);
        urunler.put("Pijama", 29.99);
        urunler.put("Ayakkabi", 89.99);
        urunler.put("Kravat", 19.99);
        urunler.put("Terlik", 29.99);

        System.out.println("urunler = " + urunler);//{Kemer=19.99, Kazak=24.99, Kravat=19.99, Gömlek=29.99, Terlik=29.99, Pijama=29.99, Ayakkabı=89.99}

        for (Map.Entry<String, Double> w : urunler.entrySet()) {

            if (w.getValue() == 29.99) {

                System.out.println(w.getKey() + "-->" + w.getValue());

            }

        }


    }


}

