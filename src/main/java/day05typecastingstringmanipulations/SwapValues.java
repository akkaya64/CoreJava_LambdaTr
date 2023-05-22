package day05typecastingstringmanipulations;

public class SwapValues {
    //Swap: Yer değiştirmek. 1.kap:Patates 2.kap:Domates ==> 1.kap:Domates 2.kap:Patates

    public static void main(String[] args) {
        int a= 12;
        int b= 5; // Swapten sonra ====>  a=5 b=12
        int temp = 0;

        System.out.println("a: " + a);//12
        System.out.println("b: " + b);//5

        //1.YOL:
        //I.Adım:
        temp = a;

        //II.Adım:
        a = b;

        //III.Adım:
        b = temp;

        System.out.println("a: " + a);//5
        System.out.println("b: " + b);//12

        //2.YOL:
        int x = 12;
        int y = 5;

        x = x+y; //x=17 geldi

        y = x-y; //y=12 geldi

        x = x-y; //x=5 geldi












    }
}
