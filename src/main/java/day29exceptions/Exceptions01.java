package day29exceptions;

public class Exceptions01 {

    public static void main(String[] args) {

        Object obj = 70;
        String str = "";
        try {
            str = (String) obj;
            System.out.println(str);

        } catch (ClassCastException e) {

            System.out.println("her data tipi her data type'ine cevrilmez");
        }

        //Birbirine dönüştürülemeyecek data type'lerini dönüştürmekte ısrar ederseniz
        //Java "ClassCastException" atar

        //Java byte, short, int, long, float, and double (primitive'ler arasinda) arasinda casting yapabilir.
        // Ama Non-primitivleri ceviremez.
        //Bunu yapmaya calisirsaniz ClassCastException (Run Time Exception) alirsiniz.

    }

}
