package day09incrementdecrementternaryswitch;

public class IncrementDecrement01 {

    public static void main(String[] args) {

        int a = 5;
        System.out.println(a);//5

        //Increment 1:
        a = a + 2; //  veya a +=2;
        System.out.println(a);//7

        //Ex 1: bir tane int variable oluşturun ve onu 2 şekilde 5 arttırın
        int c = 8;
        System.out.println(c);//8

        c = c + 5;
        System.out.println(c);//13

        c +=5;
        System.out.println(c);//18

        //Decrement
        int d = 8;
        System.out.println(d);

        d = d-3;//5
        System.out.println(d);

        d -= 3;//2
        System.out.println(d);



        //Increment 2:
        int z = 6;
        System.out.println(z);//6

        z = z*2;
        System.out.println(z);//12

        z *= 2;
        System.out.println(z);//24

        //Decrement 2:
        int e = 24;
        System.out.println(e);//24

        e = e/2;
        System.out.println(e);//12

        e /= 2;
        System.out.println(e);//6


        // "1" ile Increment
        int f = 12;

       // f = f + 1;//üçü aynı anlamda ama 1 ile artırmada sondaki kullanılır.
        //f += 1;
        f++;

        // "1" ile Decrement
        int h = 10;

       // h = h - 1;
       // h -= 1;
        h--;

        //"post-increment" ve "pre-increment"
        int i = 10;
        int k = i++;//post increment çünkü incerement variable'in isminden sonra yazıldı.
        System.out.println(k);//10 ==> "i" artırılmadan "k" ya konulduğu için "k"nin değeri 10 olur.
        System.out.println(i);//11 ==> "i" satır sonunda artırıldığı için "i"nin değeri 11 olur.

        // i++; // önce yazdır sonra arttır yani Post-increment...
        // ++m; //önce arttır sonra yazdır yani pre-increment...


        int m= 15;
        int n =++m;//pre increment çünkü increment variable'nin isminden önce yazıldı.
                   //m nin artırılmış hali n ye konur yani 16 ikisi de.
        System.out.println(m);//16 ==> "m" satir sonunda artırıldığı için "m"nin değeri 16 olur.
        System.out.println(n);//16 ==>"m" artırıldıktan sonra "n"ye konulduğu için "n"nin değeri 16 olur.

        //"post-decrement ve "pre decrement"
        int p = 17;
        int r = p--;
        System.out.println(p);//16
        System.out.println(r);//17

        int s = 20;
        int t = --s;
        System.out.println(s);//19
        System.out.println(t);//19




    }

}
