package day30exceptionsinterface;

//multiple inheritance ==> classlar icin mumkun degil, interface olunca mumkun
public class Accord implements Ac, Engine, Security{


    @Override
    public void cool() {
        System.out.println("accord cools super");
    }
    public void run(){
        System.out.println("engine run super");
    }
}
