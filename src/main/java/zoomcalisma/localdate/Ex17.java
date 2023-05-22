package zoomcalisma.localdate;

public class Ex17 {
    //Create a function taking a positive integer between 1 and 3999 (both included)
//as its parameter and returning a string containing the Roman Numeral representation of that integer.
//
//Modern Roman numerals are written by expressing each digit separately starting with the left most digit
//and skipping any digit with a value of zero.
//n Roman numerals 1990 is rendered:
//1000=M, 900=CM, 90=XC; resulting in MCMXC. 2008 is written as 2000=MM, 8=VIII; or MMVIII.
//1666 uses each Roman symbol in descending order: MDCLXVI.


    //1 ile 3999 arasında pozitif bir tamsayı alan bir işlev oluşturun (her ikisi de dahil)
// parametresi olarak ve o tamsayının Romen Rakamıyla temsilini içeren bir dize döndürüyor.
//
//Modern Romen rakamları en soldaki rakamdan başlayarak her rakam ayrı ayrı ifade edilerek yazılır.
//ve sıfır değeri olan herhangi bir rakamı atlıyoruz.
//n Romen rakamları 1990 dönüştürülür:
//1000=M, 900=CM, 90=XC; MCMXC ile sonuçlanır. 2008, 2000=MM, 8=VIII olarak yazılır; veya MMVIII.
//1666, her Roma sembolünü azalan sırayla kullanır: MDCLXVI.


    //Symbol    Value
//I          1
//V          5
//X          10
//L          50
//C          100
//D          500
//M          1,000

    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++)
            System.out.println(i + " -> " + romaRakaminaCevir(i));
    }

    public static StringBuilder romaRakaminaCevir(int sayi) {
        StringBuilder sb = new StringBuilder();
        int deger = 0;
        String[] romaRakamlari = new String[]{"I", "IV", "V", "IX", "X",
                "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] ints = new int[]{1, 4, 5, 9, 10, 40,
                50, 90, 100, 400, 500, 900, 1000};

        for (int i = ints.length - 1; i >= 0; i--) {

            deger = sayi / ints[i];


            sayi %= ints[i];

            while (deger > 0) {
                sb.append(romaRakamlari[i]);
                deger--;
            }
        }
        return sb;
    }
}
