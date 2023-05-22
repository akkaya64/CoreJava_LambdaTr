package practice.advanceday12;

public class Q01_Recursive_Faktoriyel {
    //Faktoriyel hesaplayan bir method yazınız.(Loop kullanmayınız.)
    public static void main(String[] args) {
        System.out.println(faktoryel(3));
    }

    public static int faktoryel(int sayi) {

        if (sayi >= 0) {
            if (sayi == 0 || sayi == 1) {
                return 1;
            } else {
                return sayi * faktoryel(sayi - 1);
            }
        } else
            throw new ArithmeticException("sayi sifirdan kucuk olamaz");

    }

}
