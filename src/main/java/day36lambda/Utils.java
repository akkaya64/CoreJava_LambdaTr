package day36lambda;



public class Utils {

    //Utils = Kullanilacak Seyler Demek = Bu classin icine tekrar tekrar lazim olacak methodlari koyariz
    //UtilsClass tekrar tekrar kullanilacak methodlarda kullanilir tek sefer kullanilacak methodlarda kullanmamiza gerek yoktur.

    public static int getLengthSquare(String s){
        return s.length()*s.length();
    }

    public static boolean isLengthEven(String s){
        return s.length()%2==0;
    }

    public static String getLastChar(String s){
        return s.substring(s.length()-1);
    }

    public static void printInTheSameLineWithSpace(Object obj){
        System.out.println(obj+ " ");
    }

    public static boolean isNumberEven(int x){
        return x%2==0;
    }

    public static int getSumOfDigits (int x){
       int sum = 0;
       while (x!=0){
           sum = sum + x%10;
           x = x/10;
       }
        return sum;
    }



}
