package day30exceptionsinterface;

public class HondaRunner {

    public static void main(String[] args) {
        Civic myCivic = new Civic();
        myCivic.cool();//Civic cools purfectly

        System.out.println(Ac.price);//2000
        System.out.println(Engine.price);//3000
        System.out.println(Security.price);//4000

        System.out.println(Ac.model);//Mitsubishi


        Accord myAccord = new Accord();
        myAccord.cool();//accord cools super



    }



}
