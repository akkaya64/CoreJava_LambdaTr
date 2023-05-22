package zoomcalisma.loop;

import java.util.Scanner;

public class Ex26 {

    /*

    Kullanıcıdan bir String ve bir karakter alınız.
String'de verilen karakterin ilk olduğu index ile son tekrarlandığı index arasındaki karakter
sayısını sayınız.
Boşluk karakterlerini saymayınız.
Kod, kullanıcının seçtiği karakter String ‘de sadece bir kez varsa konsolda -1,
Kod, kullanıcının seçtiği karakter String ‘de yoksa konsolda -1 döndürsün.
Örneğin; "Java is easy" - 'a' ==> 5
 "Java is easy" - 'w' ==> -1
 "Java is easy" - 'e' ==> -1
     */

    public static void main(String[] args) {
        String str = "Java is easy";
        char ch = 'i';
        String a = str.replaceAll(" ","");
        String b ="";

        int ilkIdx = a.indexOf(ch);
        int sonIdx = a.lastIndexOf(ch);

        if (ilkIdx<0){
            System.out.println("-1");

        } else if (ilkIdx==sonIdx) {
            System.out.println("-1");

        }else {

            for (int i=ilkIdx+1; i<sonIdx; i++){
                b+=a.substring(i,i+1);


            }
            System.out.println(b);
            System.out.println(b.length());
        }












    }
}
