package day11forloops;

public class C04_ForLoops {

    public static void main(String[] args) {

        //Ex 1: 1'den 100'e kadar 6 ile bölünenler hariç tüm tam sayıları ekrana yazdırınız.
        for (int i = 1; i <101 ; i++) {

            if (i%6==0){
                continue;//boşver demek, es geç. break'in tam tersi. soruya göre 6ya bölünen sayıları es gecip öbürlerini yazdıracak.
            }
            System.out.println(i + " ");
        }

        System.out.println();
        //****İnterwiew sorusu*****
        //Ex 2: Size verilen bir String'i ters çeviren kodu yazınız.(Revorse order)
        String str = "Zisan";//nasiZ

        String ters = "";//yeni bir conteyner oluşturduk

        for (int i = str.length()-1; i > -1; i--) {
            char harf = str.charAt(i);
           //ters=ters+harf;
            ters+=harf;

        }
        System.out.println(ters);
















    }


}
