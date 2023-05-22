package day08nestedifternary;

import java.util.Scanner;

public class NestedIf01 {

    /*
    Java "Nested İf"leri çalıştırırken çok zamana ihtiyaç duyar.(Time Consuming) zaman emici
    Bu yüzden biz, mümkün olduğu kadar "Nested If " kullanmamaya çalışırız.
     */

    public static void main(String[] args) {

      /*
      Example 1: Kullanicidan 3 tane sayi aliniz.
          Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
          Eger ucgen ise "eskenar"
          Ucgen olma durumunu
          kontrol ediniz.
          INFO :
          Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
                           herhangi iki kenar farki ucuncu kenardan kucuk olmali
           a+b>c>a-b
           a+c>b>a-c
           b+c>a>b-c
           a=b=c ise eskenar ucgen
   */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen üçgenin kenarları için 3 tane uzunluk giriniz...");

        //Kullanici yanlislikla negatif sayi girdi ise kod asagidaki gibi yazilabilir.
//        double a = Math.abs(input.nextDouble()); //inputları math.abs nin içine atarak.
//        double b = Math.abs(input.nextDouble());
//        double c = Math.abs(input.nextDouble());


        //kullanıcı yanlışlıkla negatif sayı girdi ise kod aşağıdaki gibi yazılabilir.
        double a  = input.nextDouble();//3 uzunluk dediği için
        double b  = input.nextDouble();
        double c  = input.nextDouble();//kullanıcı bilgisiz olduğu için eksi sayı verebilir oyüzden bunları math.abs yaptık.
        boolean ucgenMi= (a+b>c && c>Math.abs(a-b)) && (a+c>b && b>Math.abs(a-c)) && (b+c>a && a>Math.abs(b-c));//uzun kod yazmamak için ilk if'in içine buna çevirdik.


        //kullanıcıdan negatif sayı girmesini affetmiyorum. önceden bunu bilgilendirip önlüyorum.
        if(a<=0 || b<=0 || c<=0){
            System.out.println("Üçgenin kenarları negatif olamaz");//negatif olmayı en başta inceliyorum. negatif ise üçgen olmaya bakmaya gerek yok.

        }else if(ucgenMi){

            if(a==b && b==c && a==c){
                System.out.println("Ucgen hem de eşkenar üçgen...");

            }else{
                System.out.println("üçgen ama eşkenar değil...");
            }

        }else{
            System.out.println("Sen ucgen değilsin...");
        }

















    }








}
