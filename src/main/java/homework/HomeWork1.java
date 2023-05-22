package homework;

public class HomeWork1 {
    public static void main(String[] args) {

        int dikdortgenAlan= rectangularArea(5,8);
        System.out.println(dikdortgenAlan);

        int dikdortgenCevre= rectangleCircumference(12,15);
        System.out.println(dikdortgenCevre);

        double daireninCevresi= circumferenceCircle(6);
        System.out.println(daireninCevresi);

        double daireninAlani= areaCircle(8);
        System.out.println(daireninAlani);
    }


    public static int rectangularArea(int a, int b) {

        return a * b;
    }

    public static int rectangleCircumference(int c, int d) {

        return 2 * (c + d);
    }

    public static double circumferenceCircle(double r) {
        double piSayisi = Math.PI;
        return 2 * piSayisi * r;
    }

    protected static double areaCircle(double r) {
        double piSayisi = Math.PI;
        return piSayisi * r * r;
    }








}

