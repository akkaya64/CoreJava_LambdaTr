package zoomcalisma.switchs;

public class Ex04 {
    public static void main(String[] args) {

        //4) Cinsiyet "Erkek" ise "Erkek" yazdırınız.
        //Cinsiyet "Kadın" ise "Kadin" yazdırınız.
        //Cinsiyet "Erkek" ve "Kadın"dan farklıysa "Diğerleri" yazdırınız.
        //Not : Bu seçenekler dışındakilerini yoksayınız.

        String cinsiyet = "Erkeka";
        switch (cinsiyet.toLowerCase()) {
            case "erkek":
                System.out.println("erkek");
                break;
            case "kadin":
                System.out.println("kadin");
                break;
            default:
                System.out.println("digerleri");
        }


    }
}
