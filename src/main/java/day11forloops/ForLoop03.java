package day11forloops;

public class ForLoop03 {

    public static void main(String[] args) {

        //Ex 1: Size verilen bir String'i tersten yazdırınız.
        //"Germany" ==> ynamreG
        String s ="Germany";

        String t = "";

        for (int i = s.length()-1; i>=0 ; i--) {
          t+=s.charAt(i); // t = t+s.charAt(i);

        }
        System.out.println(t);//ynamreG

        //Ex 2: size verilen String'in Palindrome olup olmadığını kontrol eden kodu yazınız.
        //   civic , nalan, küçük, 11211==> Palindrome

        //Logic: String'i ters çevir sonda da düz hali ile ters halini karşılaştır, aynı ise "Palidrome" de.

        String duz = "civic";
        String ters = "";//yeni yazılan için oluşturulan data

        for(int i=duz.length()-1; i>=0 ; i--){

            ters+=duz.charAt(i);

        }
        if(duz.equalsIgnoreCase(ters)){
            System.out.println(duz + " :Palindrome'dur");

        }else{
            System.out.println(duz + " :Bu String Palindrome değildir");
        }











    }
}
