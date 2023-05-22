package day19listsvarargs;

public class C06_Varargs {
    public static void main(String[] args) {

        ikiSayiyiTopla(2, 3);
        ucSayiyiTopla(6, 8, 14);
        dortSayiyiTopla(56, 96, 40, 30);


    }

    private static int dortSayiyiTopla(int i, int i1, int i2, int i3) {
        return i + i1 + i2 + i3;
    }

    private static int ucSayiyiTopla(int i, int i1, int i2) {
        return i + i1 + i2;
    }

    private static int ikiSayiyiTopla(int i, int i1) {
        return i + i1;
    }


    /*
        Farkli sayida datalar ile calisabilmek icin varargslar olusturulmustur.
        Farkli parametrelerle calisabilen methotlar olusturmak icin varargs'lar kullanilir.

        Varargs'larin arka tarafinda Array'ler calisir

        Varargs nasil olusturulur (data tipi +... + varargs ismi) veya  (data tipi +  ...+ varargs ismi)

       ***** Varargs en sonda olmak sartiyla bir method olusturulurken farkli data tipleri kullanilabilir***

       Varargs'lar bir methodda birden fazla kullanilamaz ==> unreachable code olur

       Bır methotta bırden fazla varargs parametre kullanılamaz cunku ıkıncısı unreachable kod olur



    */
    private static int add(String str, int... a) {//sonsuza kadar istedigin datayi ekleyebilirsin
        int sum = 0;                               //  int... a,String str unreachable code == ulasilamaz kod
        for (int w : a) {
            sum = sum + w;
        }
        return sum;
    }


}
