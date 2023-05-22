package day14arraysforeachloop;

public class Arrays04 {
    public static void main(String[] args) {

        //Ex 1: String bir Array oluşturunuz. 6 eleman ekleyiniz. Yellow'dan önceki elemanları yazdırınız.
        String colors [] = new String[6];

        colors[0]= "Red";
        colors[1]= "Orange";
        colors[2]= "Blue";
        colors[3]= "Yellow";
        colors[4]= "Green";
        colors[5]= "Brown";

        for(String w : colors) {


            if (w.equals("Yellow")) {
                break;
            }

            System.out.println(w);
        }
        System.out.println();



        //Ex 2: String bir Array oluşturunuz. 6 eleman ekleyiniz. Yellow'dan sonraki elemanları yazdırınız.

        //Bazen kitleniriz ve  for- each-loop kullanamayiz.Bu soruda tersten baslamaliyiz
        // halbu ki  for- each-loop her zaman bastan baslar.O yüzden burda for-loop
        // kullanmak zorundayiz.

        String color [] = new String[6];

        color[0]= "Red";
        color[1]= "Orange";
        color[2]= "Blue";
        color[3]= "Yellow";
        color[4]= "Green";
        color[5]= "Brown";
        /*
        NOT: Elemanları almaya son elemandan başlayacağım için for-each loop kullanamam bu yüzden for-loop kullandım.
         */

        //1.YOL:
       for (int i=colors.length-1; i>=0; i--){//for loop kullandık çünkü sondan başa doğru gidecek, for each kullanmadık çünkü o hep en baştan başlar sondan değil.

           if(colors[i].equals("Yellow")){
              break;
           }
           System.out.print(colors[i] + " ");//Brown Green
       }



       //2.YOL:
       // Yellow elemanının index'ini bul ve o index'ten daha büyük index'e sahip olan elemanları yazdır.

        int counter = 0;

       for (String w : color){//for-each loop


           if (w.equals("Yellow")){
               break;
           }

           counter++;
       }
        for (int i=counter+1; i<color.length; i++ ){//for loop

            System.out.println(color[i]);

        }



    }
}
