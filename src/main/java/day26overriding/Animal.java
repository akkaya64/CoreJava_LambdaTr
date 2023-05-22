package day26overriding;

/*
  1)Parent class'taki methodu Child class içinde özelleştirerek kullanmaya "Overriding" yapmak denir
  2)Overriding'te methodun parantezine, methodun ismine dokunulmaz. Methodun body'si değiştirilir.
  3)@Override ==> Override Animation Override kurallarının Java tarafından kontrol edilmesini sağlar
  4)Overriding'te Parent Class'taki methoda "Overridden Method" denir. child class'taki method'a ise " Overriding Method" denir.
  5)Private method'lar Override edilemezler.
  6)child class'taki Override edilmiş method(Overriding Method)'un access modifier'ı Parent class'taki
  override edilmiş method(Overriden Method)'un access modifier'ından dar olamaz.
  7)child class'taki Override edilen method'un (Overriding Method) return type'ı methodun return ettiği data type'inin aynısı veya
    o data type'inin parent'ı olarak seçilebilir.
  8)Method'un return type'i "primitive" ise Overriding yaparken return type değiştirilemez, çünkü; return type ya aynı olur veya
    parent'tan seçilir ama primitive'ler arasında "parent-child ilişkisi" olmadığından parent'tan seçmek mevzu bahis olamaz.
    o zaman tek seçenek aynısı olmalıdır. primitve ise return type ı değiştirme
  9) Method'un return type'ı "Wrapper Class" ise, Overriding yaparken return type değiştirilemez. Çünkü return type ya aynı olur
     veya parent'tan seçilir. ama Java bir wrapper class'ı diğerinin parent'i yapamadığından parent'dan seçme ihtimali
     yoktur, geriye sadece aynısı olma ihtimali kalır
  10)Methodun return type'ı void ise "Overriding" yaparken return type değiştirilemez.

  Overriden Method ==> protected ise Overriding Method ==> protected + public
  Overriden Method ==> default ise Overriding Method ==> default + protected +  public
  Overriden Method ==> private ise Overriding Method ==> override olmaz ki access modifier'ı olsun. Bkz 5. Kural

  *****sokrative notları*****
11) Final kelimesini "Variable"larda kullanabilirsiniz.
                    ->final variable ise
                    i) mutlaka değer atanmalıdır
                    ii) ilk atanan değer değiştirilemez

 12)Final kelimesini "Method" larda kullanabilirsiniz.
                     ->method final ise;
                      i)methodun body'si değiştirilemez
                      ii)method body'si değiştirilemeyince override yapmak mümkün olmaz

 13)Final kelimesini "Class"larda kullanabilirsiniz.
                     ->class final ise;
                       i)o class'ın child'ı olamaz
    Static method'lar override yapilamazlar.


  14)"final" methodlar ve "static" methodlar "override" edilemezler, yani main method'ta override edilemez çünkü "static"
  15)"Override" yapabilmek için "inheritance" şarttır. Başka bir ifadeyle; "Parent-child" ilişkisi şarttır.
  16)Method Overloading "Compile Time Polymorpihsm"dir. Method Overriding "Run Time Polymorpihsm"dir
     public int add(int a, int b){}; polimorf==> çoklu görünüm oyüzden overloadinge polimorpihsm denir.
  17)Method Overloading "static Polymorpihsm"dir. Method Overriding "dynamic Polymorpihsm"dir


 */

public class Animal {
    //parent classta overridden olur

    //Overriding'de methodun parantezine , ismine dokunulmaz sadece body'sinde değişiklik olur
    public void eat() {//Parent'taki Override edilmiş eat() methoduna "Overriden Method" denir.
        System.out.println("Animals eat..");
    }


    public void drink() {
        System.out.println("Animals drink..");
    }

    public Animal create() {
        return new Animal();
    }


    public int add(int a, int b) {
        return a + b;
    }

    public Integer multiply(int a, int b) {
        return a * b;
    }


}
