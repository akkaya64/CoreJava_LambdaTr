package day27ancapsulationabstraction;

public abstract class Courses {

    // Bir method Abstract ise o methodu tum child'ler kullanmak zorundadir

    /*
    1)Bazen method body'sini yazmak gerekmez. bu durumlarda body'siz method oluşturmak gerekir.
      Body'si olmayan method'lara "abstract methodlar" denir.

    2)"abstract methodlar" child class'lar tarafından "override" edilmek zorundadirlar
        Buyüzden, eğer bir fonksiyonun child class'lar tarafından kullanılmasını mecbur kılmak isterseniz
       o methodu abtract yapmak gerekir

    3)Bir methodun body'sini silmek o methodun abstract olması için yeterli değildir.
      "Access modifier" ile return type arasına "abstract" keyword koymak gerekir.

    4)"abstract method"lar sıradan class'ların içine yazılamazlar, "abstract method"ların içine yazıldıkları class'larda
      abstract olmak zorundadirlar.

    5)"abstract class"larda hem "abstract method"lar hemde "concrete method"lar kullanılabilir

    6)"concrete class"lar "abstract class"ların child'ı olabilirler.
      "abstract method"ların override edilme zorunluluğu concrete class'lar içindir.




 */
    public abstract void math();

    public void art(){
        System.out.println("Painting...");
    }
    //final methodlar "override" edilemezler, halbuki "abstract" methodlar override edilmek için oluşturulurlar.
    //Bu çelişkidir, bu yüzden Java abstract methodların final olmasına müsaade etmez.
   // public abstract void science();

    //Concrete Class'lar "final" olduğunda Child Class'a sahip olamazlar.
    //Ama "Abstract Class"lar için Child class olmalıdır.
    // Çünkü child class'lar abstract parent class'taki abstract method'ları kullanırlar
    //Bu yüzden Java "abstract class"ların final olmasına müsaade etmez


    //"Abstract method"lar private olamazlar Çünkü child class'lar abstract method'ları kullanırlar,
    // private yapınca kullanıma kapalı olur.
    //Bu çelişkidir. Bu yüzden Java abstract methodların private olmasına müsaade etmez.

    //"abstract method"lar "static" olamazlar çünkü static methodlar override edilemez,
    // halbuki abstract method'lar override edilmek için oluşturulmuştur


}
