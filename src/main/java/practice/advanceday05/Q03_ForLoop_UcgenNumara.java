package practice.advanceday05;


public class Q03_ForLoop_UcgenNumara {
    public static void main(String[] args) {

       /*
       Şekli Yazdırınız:
          1 2 3 4 5 6
           2 3 4 5 6
            3 4 5 6
             4 5 6
              5 6
               6
        */

        for (int i = 1; i <= 6; i++) {

            for (int bosluk = 1; bosluk < i; bosluk++) {//Boşluk Kontrolü
                System.out.print(" ");
            }

            for (int j = i; j <= 6; j++) {//Sütun Kontrolü
                System.out.print(j + " ");
            }

            System.out.println();//Satır Kontrolü
        }


    }
}
