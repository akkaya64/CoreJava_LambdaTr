package zoomcalisma.switchs;

public class Ex05 {
    public static void main(String[] args) {
        //5) Belirli bir yılın belirli bir ayındaki gün sayısını görüntülemek için bir kod yazınız.
        //Örnek: 2000 yılının Şubat ayında gün sayısı 29.

        int ay = 2;
        int yil = 2023;

        switch (ay) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Ay sayısı 31 gün");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Ay sayısı 30 gün");
                break;
            case 2:
                if (yil % 4 == 0 && yil % 100 != 0 || yil % 400 == 0) {
                    System.out.println("Ay sayısı 29 gün");
                } else {
                    System.out.println("Ay sayısı 28 gün");
                }
                break;
            default:
                System.out.println("Geçerli ay giriniz!");
                break;
        }

    }
}
