package zoomcalisma.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Interwiev02 {

    /*
INTERWIEW
Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
  0-1-1-2-3-5-8-13-21-34....
*/
    public static void main(String[] args) {
        List<Integer> fibonacci=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi=input.nextInt();
        fibonacci.add(0);
        fibonacci.add(1);

        if (sayi<=1){
            System.out.println("1'den buyuk bir sayi giriniz");
        }else {

            int i=2;
            while ( fibonacci.get(i - 2) + fibonacci.get(i - 1)<sayi){
                fibonacci.add(i,fibonacci.get(i-1)+fibonacci.get(i-2));
                i++;
            }
        }
        System.out.println(fibonacci);

//              Scanner scan = new Scanner(System.in);
//              System.out.print("pozitif bir tamsayı giriniz : ");
//              int sayi1 = scan.nextInt();
//
//              List<Integer> fibo = new ArrayList<>();
//              fibo.add(1);
//              fibo.add(1);
//              System.out.println(fibo);
//
//              for (int i = 2; fibo.get(i - 2) + fibo.get(i - 1) < sayi1; i++) {
//                  fibo.add(fibo.get(i - 2) + fibo.get(i - 1));
//              }
//              System.out.println(fibo);

    }

}
