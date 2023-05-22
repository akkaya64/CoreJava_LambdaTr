package zoomcalisma.loop;

public class Ex03 {
    public static void main(String[] args) {

        //Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız. Bir String, tersi ile
        //aynıysa, buna palindrom denir. Örneğin; “anna”, “123321” palindromlardır.

        String str = "anna";
        String tersStr = "";

        for (int i = str.length() - 1; i > -1; i--) {
            tersStr = tersStr + str.charAt(i);
        }
        if (str.equals(tersStr)) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Palindrom değil");
        }

    }
}
