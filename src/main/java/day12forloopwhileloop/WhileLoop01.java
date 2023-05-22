package day12forloopwhileloop;

public class WhileLoop01 {

    public static void main(String[] args) {

        //Ex 1: 3'ten 6'ya kadar tam sayıları konsola yazdırınız.

        //1.YOL: for-loop
        for (int i=3; i<7; i++){
            System.out.print(i+ " ");
        }

        System.out.println();


        //2.YOL: while-loop
        int i = 3;

        while (i<7){

            System.out.print(i+ " ");

            i++;

        }

        System.out.println();


        //Ex 2: 23'ten 12'ye kadar çift tam sayıları konsola yazdırınız.
        int s = 23;
        while (s>11){
            if(s%2==0){
                System.out.print(s + " ");
            }

            s--;
        }


        System.out.println();


        //Ex 3: Verilen bir tam sayının rakamları toplamını konsola yazdıran kodu yazınız.

        //1.YOL : while loop
        int num = 578;
        num = Math.abs(num);
        int sum = 0;

        while (num>0){

            sum = sum + num%10;
            num/=10;

        }
        System.out.print(sum);//20

        System.out.println();

        //2. YOL: for loop
        int a = 6841;
        int toplam = 0;//yeniyi eklemek için bunu oluşturduk

        for (int m=a ; m>0; m/=10){

           toplam = toplam + m%10;

        }
        System.out.print(toplam);//19













    }
}
