package zoomcalisma.loop;

public class Ex05 {
    public static void main(String[] args) {

        //Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        //A A A A A
        //A A A A A
        //A A A A A

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("A ");
            }
            System.out.println();
        }

    }
}
