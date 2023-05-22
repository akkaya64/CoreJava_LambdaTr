package day28exceptions;

public class Exceptions02 {

    public static void main(String[] args) {

        String s = "1234";
        convertStringToInt(s);

        String t = "1a2b";
        convertStringToInt(t);



    }
    //İcinde rakamlar dışında karakter olan bir String'i sayıya çevirmek isterseniz Java "NumberFormatException" atar
    public static void convertStringToInt(String s){

        int intS =0;
        try {

             intS = Integer.valueOf(s);

        }catch (NumberFormatException e){
            System.out.println("Bir String'in sayıya dönüştürülebilmesi için rakam dışı karakter içermemesi gerekir");
            System.out.println(e.getMessage());//Java'nın teknik mesajını almış olursun getMessage() ile
        }

        System.out.println(intS + 1);

    }
}
