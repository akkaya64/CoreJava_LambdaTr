package practice.advanceday02;

public class Q04_RandomMethod_RastgeleHarf {

    public static void main(String[] args) {
        /*
        Rastgele bir harf veren bir method oluşturun ve ardından methodu kullanarak aşağıdakileri yazdırınız.
        ‘A’ ve ‘a’ için “İlk Karakter” yazdırınız.
        ‘B’ ve ‘b’ için “İkinci Karakter” yazdırınız.
        ‘C’ ve ‘c’ için “Üçüncü Karakter” yazdırınız.
        ‘D’ ve ‘d’ için “Dördüncü Karakter” yazdırınız.
        Diğerleri için “Diğer Karakterleri” yazdırınız.

        */
        String rastgeleHarf = rastgeleHarf().toLowerCase();

        switch (rastgeleHarf) {
            case "a":
                System.out.println("İlk karakter");
                break;
            case "b":
                System.out.println("İkinci karakter");
                break;
            case "c":
                System.out.println("Üçüncü karakter");
                break;
            case "d":
                System.out.println("Dördüncü karakter");
                break;
            default:
                System.out.println("Diğer karakterler");

        }
    }

    public static String rastgeleHarf(){
        String alfabe = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int maxIndex = alfabe.length();

        int rastgeleIndex =(int) (Math.random()*maxIndex);


        return alfabe.substring(rastgeleIndex, rastgeleIndex+1);



    }





}
