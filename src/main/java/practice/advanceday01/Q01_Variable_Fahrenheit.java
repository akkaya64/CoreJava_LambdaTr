package practice.advanceday01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q01_Variable_Fahrenheit {

    public static void main(String[] args) {

        // Fahrenheit değeri, Celsius değere çeviren kod yazınız.
        // formül: c = (f-32)*5/9

        Scanner input = new Scanner(System.in);
        System.out.println("Fahrenheit degeri giriniz!");
        double f = input.nextDouble();

        double c = (f-32)*5/9;

        System.out.println("Celcius: "+ c);//-12.222222222222221

        DecimalFormat format = new DecimalFormat("0.00");//basamak sayisi 1 veya 2 tane olsun diye DecimalFormat kullandik.
        String formattedCelcius = format.format(c);
        System.out.println("formattedCelcius: " +formattedCelcius);//-12,22
        System.out.printf("%.2f",c);//-12,22
        System.out.println();
        System.out.printf("Formatli: " + "%.2f",c);//Formatli: -12,22

    }
}
