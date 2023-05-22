package practice.advanceday09.overriding;

public class Isci extends Banka{
    @Override
    public double faizHesapla(double alinacakKredi) {
        return alinacakKredi*15/100;
    }
}
