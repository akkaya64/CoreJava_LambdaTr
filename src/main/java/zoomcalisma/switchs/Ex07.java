package zoomcalisma.switchs;

public class Ex07 {

    //Switch ifadesini kullanarak, mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir
    //dönüştürücü oluşturmak için kod yazınız. Google'dan dönüşümler için formülleri bulunuz.
    //a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde, konsolda kodunuz "16 km" yazmalıdır (sayı dinamik olacak)
    //b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde, konsolda
    //kodunuz "2" yazmalıdır (sayı dinamik olacak)
    //c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdanSantigarata olarak girdiğinde, konsolda kodunuz "28.3333 santigrat" yazmalıdır (sayı dinamik olacak)
    //d) Kullanıcı mildenKmye, saniyedenSaate, fahrenaytdanSantigarata ‘dan farklı bir işlem girdiğinde, kodunuz "Bu operatör, o dönüştürücü için tanımlanmadı" yazmalıdır.

    public static void main(String[] args) {
        double mil = 10.0;
        double saniye = 7200;
        double fahrenheit = 83;

        String operator = "saniyedenSaate";

        switch (operator) {

            case "mildenKmye":
                System.out.println(mil * 1.609344 + "km");
                break;
            case "saniyedenSaate":
                System.out.println(saniye / 3600 + "saat");
                break;
            case "fahrenaytdanSantigarata":
                System.out.println((fahrenheit - 32) * 5 / 9 + "santigrat");
                break;
            default:
                System.out.println("Geçersiz işlem");
        }

    }

}
