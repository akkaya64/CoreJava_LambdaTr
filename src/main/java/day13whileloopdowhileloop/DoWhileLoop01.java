package day13whileloopdowhileloop;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        //1)while-loop
        int i = 1;

        while (i<1){
            System.out.println("Sen bir while loopsun...");
            i++;
        }
        //NOT: while body hiç çalışmadı. while loopta zero execution mümkündür.
        // önce şartı kontrol eder öyle çalışıp çalışmayacağına karar verir
        //önce düşünür sonra hareket eder.


        //2) do-while loop
        int k = 1;

        do{
            System.out.println("Sen bir do-while loopsun...");
            k++;
        }while (k<1);
        //NOT: do-while body çalıştı. do while kullandığınızda loop body en az bir kere calışır.
        //     do-while'da zero execution mümkün değildir.
        // do-while loop hareket eder sonra düşünür.











    }
}
