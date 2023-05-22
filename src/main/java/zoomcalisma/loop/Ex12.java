package zoomcalisma.loop;

public class Ex12 {
    public static void main(String[] args) {

        //Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        //A A A A A A A A
        //A X X X X X X A
        //A X X X X X X A
        //A X X X X X X A


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {

                if (i == 0) {
                    System.out.print("A ");
                } else if (j == 0 || j == 7) {
                    System.out.print("A ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }

/*
        for (int i = 0; i < 8; i++) {
            System.out.print("A ");
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                if(j==0 || j==7){
                    System.out.print("A ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
*/

    }
}
