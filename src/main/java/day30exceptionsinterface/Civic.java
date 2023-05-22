package day30exceptionsinterface;
/*
    1)Bir interface'i bir class'ın parent'ı yapmak için "implements" keyword'unu kullanırız.
    2)Java parent'lar "Class" olduğunda "multiple parent"a müsaade etmez ama biz bazen "multiple parent"a ihtiyac duyarız
      Bu ihtiyacı gidermek için Java "interface" isimini verdiği yeni bir yapı oluşturdu
      Bu yapı sayesinde bir "Class" için çoklu "interface parent" oluşturabiliriz.
    3)çoklu interface parent'ların içine aynı isimli methodlar koyabiliriz
    Mesela Ac'nin , Engine'nin ve Security'nin her birinin içlerine "run Methodu" koymak gibi
    Child class herhangi birini Override ettiğinde hepsini override etmiş gibi olur sonra da
    body'i child class'ta yazarak uygulamasını yapmış olur
 */
public class Civic implements Ac, Engine, Security {
    @Override
    public void cool() {
        System.out.println("Civic cools purfectly");
    }//bir interface'i parent yapmak için implements yapılır

    public void run(){
        System.out.println("Ac runs perc");
    }


}
