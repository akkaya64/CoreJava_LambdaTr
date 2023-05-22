package day05typecastingstringmanipulations;

public class TypeCasting01 {
    /*
    Nümeric primitive data type'larinin birbirine dönüştürülmesine "Type Casting" denir.

    Nümeric (sayısal) Data Type'lar:  byte - short - int - long - float - double

    NOTE: Küçük data type'larını büyük data type'larına çevirmeyi Java otomatik olarak yapabilir.
          Bu işleme "AutoWidening" (otomatik genişletme) denir.

    NOTE2: Büyük data type'lerini küçük data type'lerine çevirmek riskli bir iştir,Java bu riskli işi otomatik olarak yapmaz.
           Bu işlemi kod yazanlar yapar.
           Bu işleme "ExplicitNorrowing" (Açıktan daraltma) denir.
*/
    public static void main(String[] args) {

        //byte data type'ini int data type'ine çeviriniz?
        byte age = 13;
        int ageInt= age;// AutoWidening

        //long data type'ini short data type'ine çeviriniz?
        long weight = 234;
        short weightInt =(short) weight;//büyük kutuyu kücük kutuya koyma riski olduğu için hata vermişti, biz parantez içine short yazdık o riski ben üstlendim dedik.

        //int data type'ini float data type'ine ceviriniz?
        int population= 700000;
        System.out.println(population);

        float populationInt= (float) population;
        System.out.println(populationInt);

        //double data type'ini short data type'ine çeviriniz?
        double num1 = 12.554;
        System.out.println(num1);//12.554

        short numS= (short) num1;
        System.out.println(numS);//12

        //DİKKAT!
        // Dönüşüm yaptığınız sayı(260), dönüşeceğiniz data type'İhih sınırları dışında ise,Java kullandığınız sayı ile "mod" işlemi yapar
        // ve mod işleminin sonucu sizin yeni değeriniz olur.
        //Example 1:
        short num= 260;
        System.out.println(num);//260

        byte numByte = (byte) num;
        System.out.println(numByte );//4

        //Example 2:
        short n = 1023;
        System.out.println(n);

        byte nByte = (byte)n;
        System.out.println(nByte);








    }
}
