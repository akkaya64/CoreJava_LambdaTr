package day10switchloops;

public class Loops02 {


    public static void main(String[] args) {

        //Ex 1: 21den 180e kadar hem 4 hem de 6 ile bölünebilen tüm tam sayıları ekrana yazdıran kodu yazınız
        for(int i=21; i<181; i++){
            if(i%4==0 && i%6==0){
                System.out.print(i + " ");
            }
        }

        System.out.println();

        //Ex 2: Size verilen küçük harfle yazılmış Stringin index'i cift sayı olan karakterlerini büyük harf yapınız
        //      ankara ==> AnKaRa
        //NOT: Yazdığınız kod belli senaryolar için çalışıyor tüm senaryolar için çalışmıyorsa, bu koda "Hard cod" denir.
        // hard kod yanlış yazılmış koddur. Mutlaka düzeltilmelidir.


        //note: Bir String'te son index = length()-1
        String s = "ankara";
        String t ="";

        for(int i=0  ; i<s.length(); i++  ){

            String ch = s.substring(i,i+1);


            if(i%2==0){
                System.out.println(ch.toUpperCase());
            }

        }













    }


}
