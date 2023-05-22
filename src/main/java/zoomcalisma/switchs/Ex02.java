package zoomcalisma.switchs;

public class Ex02 {

    public static void main(String[] args) {


        //2) Ayın numarasını girdiğinizde ayın adını yazdırmak için bir switch ifadesi kullanınız.
        //Örneğin;
        //kullanıcı 1 girerse kodunuz "Ocak" yazmalıdır,
        //kullanıcı 2 girerse kodunuz "Şubat" yazmalıdır vb.
        //Kullanıcı geçersiz ay numarası girerse kodunuz "Geçersiz numara" yazmalıdır.

        int no = 1;

        switch (no) {
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Subat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayis");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Agustos");
                break;
            case 9:
                System.out.println("Eylul");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasim");
                break;
            case 12:
                System.out.println("Aralik");
                break;
            default:
                System.out.println("gecersiz numara");

        }
    }
}



