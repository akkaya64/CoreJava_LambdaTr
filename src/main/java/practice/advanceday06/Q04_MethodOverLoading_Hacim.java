package practice.advanceday06;

public class Q04_MethodOverLoading_Hacim {

    public static void main(String[] args) {
        //Küp, kare prizma ve dikdörtgen prizmanın hacmini
        // hesaplayan bir kod yaziniz.(Method overloading kullanınız).
        //Her class bir data tipidir ama her data tipi bir class degildir.

        Hacim obje = new Hacim();
        int kupunHacmi = obje.hacimHesapla(5);
        System.out.println("kupunHacmi = " + kupunHacmi);//kupunHacmi = 125

        int karePrizmaHacmi = obje.hacimHesapla(4, 8);
        System.out.println("karePrizmaHacmi = " + karePrizmaHacmi);//karePrizmaHacmi = 128

        int dikdorgenHacmi = obje.hacimHesapla(3, 6, 7);
        System.out.println("dikdorgenHacmi = " + dikdorgenHacmi);//dikdorgenHacmi = 126


    }
}
