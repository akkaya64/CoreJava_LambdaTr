package zoomcalisma.switchs;

public class Ex09 {
    //Adı 'Seasons' olan bir Enum oluşturun ve Enum da switch-on deyimini kullanarak
    //aşağıdakileri yazdırınız.
    //Kış için 'Snowboard yapmak'
    //Yaz ve bahar için 'Balık tutmak'
    //Sonbahar için 'Doğa yürüyüşü yapmak'

    public enum Seasons {
        WINTER, SUMMER, FALL, SPRING
    }

    public static void main(String[] args) {

        String browser = Seasons.FALL.toString();

        switch (browser) {
            case "Kis":
                System.out.println("Snowboard yapmak");
                break;
            case "Yaz":
            case "Bahar":
                System.out.println("Balik tutmak'");
                break;
            case "Sonbahar":
                System.out.println("Doga yuruyusu yapmak'");
                break;
            default:
                System.out.println("Gecersiz data");
        }

    }


}
