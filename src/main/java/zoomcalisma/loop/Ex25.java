package zoomcalisma.loop;

public class Ex25 {

    /*
     Bir sayı, her basamağının küpünün toplamına eşitse Armstrong sayısı olarak adlandırılır.
Örneğin, 153, her basamağın küpüne eşit olan 153= 1 + 125 + 27 olduğundan bir
Armstrong sayısıdır. Verilen numaranın Armstrong sayısı olup olmadığını kontrol etmek
için bir kod yazınız
     */

    public static void main(String[] args) {

        int sayi = 153;
        int sum=0;


        for (int i=sayi; i>0; i/=10){
            sum+=Math.pow(i%10,3);
            System.out.println(sum);

        }
        if (sayi==sum){
            System.out.println("Armstrong");

        }else System.out.println("armstrong değil");
        System.out.println(sum);






    }
}
