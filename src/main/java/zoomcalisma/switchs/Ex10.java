package zoomcalisma.switchs;

public class Ex10 {
    //myClass isminde bir class oluşturunuz, class'ta size rastgele bir alfabetik karakter veren bir
    //yöntem oluşturun ve ardından yöntemi kullanarak aşağıdakileri yazdırınız.
    //'A' ve 'a' için "İlk Karakter" yazdırınız.
    //'B' ve 'b' için "İkinci Karakter" yazdırınız.
    //'C' ve 'c' için "Üçüncü Karakter" yazdırınız.
    //'D' ve 'd' için "Dördüncü Karakter" yazdırınız.
    //Diğerleri için "Diğer Karakterleri" yazdırınız.

    //

    public static void main(String[] args) {

        String alfabe = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        // 0 <= x < 1 ==>   0 <= 20x < 20

        int index = alfabe.length();

        char harf = alfabe.toLowerCase().charAt((int) (Math.random() * index));

        switch (harf) {
            case 'a':
                System.out.println(harf + "İlk karakter");
                break;
            case 'b':
                System.out.println(harf + "İkinci karakter");
                break;
            case 'c':
                System.out.println(harf + "Üçüncü karakter");
                break;
            case 'd':
                System.out.println(harf + "Dördüncü karakter");
                break;
            default:
                System.out.println(harf + "Diğer karakterler");

        }

    }


}
