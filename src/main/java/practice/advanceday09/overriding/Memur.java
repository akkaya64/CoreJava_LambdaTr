package practice.advanceday09.overriding;

public class Memur extends Banka{

    @Override
    public double faizHesapla(double alinacakKredi) {
        return alinacakKredi*0.1;
    }


}
