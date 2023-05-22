package day11forloops;

public class C03_ForLoops {

    public static void main(String[] args) {

        //İNTERWİEW QUESTİONS
        //String karakterleri harf harf yazdıran,
        // eğer 'a' karakterini görürse yazdırmayı durduran kodu yazınız

        String cumle = "Öğrenmek yaşamın tek kanıtıdır";
        for (int i = 0; i < cumle.length() ; i++) {
            if(cumle.charAt(i) == 'a'){
                break;//durdurma kodu olduğu için kullandık, sadece switchlere özgü değil.
            }



            System.out.print(cumle.charAt(i)+ " ");
        }











    }
}
