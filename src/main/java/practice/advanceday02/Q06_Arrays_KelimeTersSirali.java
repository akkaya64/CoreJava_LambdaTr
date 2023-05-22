package practice.advanceday02;

import java.util.Arrays;

public class Q06_Arrays_KelimeTersSirali {
    public static void main(String[] args) {

            /*
INTERWIEW QUESTIONS
 Kullanicidan bir String aliniz.
 String'de var olan her character'in sayisini ekrana yazdiriniz.
 Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
        abaa   ==> a=3  b=1
*/






            /*
            Her girdi satırı, tek boşluklarla ayrılmış bir veya birkaç sözcük içerir.
            Sözcükler değişmeden,her giriş satırındaki sözcüklerin sırasını
            tersine çevirmek için kod yazınız.
            Çıktınızın satırlarında sonunda veya başında boşluk olmamalıdır.
            Örnek; Kemal Can Kuzu, Kuzu Can Kemal'e dönüşecektir
        */

        String str = "Kemal Can Kuzu";

        String aarr[] = str.split(" ");//kelimeleri bozmamak icin bosluktan kesmemiz lazim
        System.out.println(Arrays.toString(aarr));//[Kemal, Can, Kuzu]








    }
}
