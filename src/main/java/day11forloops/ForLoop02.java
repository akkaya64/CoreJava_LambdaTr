package day11forloops;

public class ForLoop02 {

    public static void main(String[] args) {

        //Ex 1: Verilen bir String'te 'a' karakteri hariç tüm karakterleri yazdırınız.
        // "Madagaskar" ==> Mdgskr

      //1.Yol:
        String s = "Madagaskar";
        String t = s.replace("a","");
        System.out.println(t);//Mdgskr
        
        //2.yol:
        for (int i = 0; i<s.length() ; i++) {
            char ch = s.charAt(i);

            if(ch !='a'){
                System.out.print(ch);//Mdgskr
            }
        }

        System.out.println();

        //3. Yol:
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);

            if(ch == 'a'){
                continue;//Continue keyword'u bazı şartlar için loop'un adımlarını atlamamıza sağlar.
            }
            System.out.print(ch);
        }





    }
}
