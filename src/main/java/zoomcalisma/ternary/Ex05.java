package zoomcalisma.ternary;

public class Ex05 {
    public static void main(String[] args) {
        //5) Nested Ternary kullanarak;
        //Şifreyi kontrol etmek için kodu yazınız.
        //8'den fazla karakter içeriyorsa, baş harfi 'i' olmalıdır.
        //8 karakterden fazla içermiyorsa, baş harfi 'K' olmalıdır.


        String str = "aad";

        String sonuc = str.length() >= 8 ? str.substring(0, 1).equals("i") ? "gecerli" : "gecersiz" : ((str.substring(0, 1).equals("K") ? "gecerli" : "gecersiz"));
        System.out.println(sonuc);

//2.yol
        String sifre = "i4cjn342342";

        String sonuc1 = sifre.length() >= 8 ? (sifre.charAt(0) == 'i' ? "Geçerli" : "Geçersiz") : (sifre.charAt(0) == 'K' ? "Geçerli" : "Geçersiz");
        System.out.println(sonuc1);


    }
}
