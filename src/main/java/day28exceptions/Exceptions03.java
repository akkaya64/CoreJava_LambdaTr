package day28exceptions;

public class Exceptions03 {
    public static void main(String[] args) {

        String s = "Java";

        getCharFromString(s, 2);
        getCharFromString(s, 4);


    }


    // StringIndexOutOfBoundsException ==> String de indeks kullanırken sınırların dısına cıkma hatası
    //StringIndexOutOfBoundsException String'lerde var olmayan index'ler kullanıldığında Java StringIndexOutOfBoundsException atar.
    public static void getCharFromString(String s, int idx) {


        try {

            char ch = s.charAt(idx);
            System.out.println(ch);

        } catch (StringIndexOutOfBoundsException e) {

            System.out.println("Olmayan index kullanma hatası yaptınız... " + e.getMessage());
            System.out.println(e.getCause());//hatanın sebebini söyler kendi yazdırmadığı için sout içinde yaz//null
            e.printStackTrace();//handle etmeden önce aldığınız mesajı yazar
        }


    }


}
