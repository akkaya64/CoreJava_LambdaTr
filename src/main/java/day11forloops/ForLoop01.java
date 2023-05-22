package day11forloops;

public class ForLoop01 {
    public static void main(String[] args) {

        //Ex 1: Verilen bir String'te  ilk 'a' harfinden önceki tüm karakterleri ekrana yazdırınız.
        // "I love Java" ==> 'I love J"

        String s = "I love Java";

        for (int i = 0; i < s.length(); i++) {
         if(s.charAt(i) =='a'){
                break;
         }
         System.out.print(s.charAt(i)); //I love J
        }
        System.out.println();

        //Ex 2: Verilen bir String'te son 'a'dan sonraki tüm karakterleri yazdırın.
        //  "Germany" ==> yn
        String t = "Germany";
        for (int i = t.length()-1; i>=0; i-- ){//length()-1 son index. son indexe gitmek için 1 az olmak gerekir.
            if(t.charAt(i)== 'a'){
                break;
            }
            System.out.print(t.charAt(i));//yn
        }
















    }





}
