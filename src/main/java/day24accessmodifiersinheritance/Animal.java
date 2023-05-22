package day24accessmodifiersinheritance;

public class Animal {

    /*
    Inheritance'in faydaları;
        1)Code standardında tekrar iyi değildir.
        2)Code değişime açık olmalıdır. Hatayı düzeltmek kolay olmalı
        3)Gelişime update'e açık olmalıdır
        4)code atomic yapıda olmalı.
        NOT1: Parent class(super class)(ortak özellikleri içerir) -child class(sub class)(class'a özel özellikleri içerir)
        5)Parent class'ta yalnızca ortak özellikler bulunur. Yazılan fonksiyonlar tüm child class'lar için ortak fonksiyonlar içerir.
        Spesifik özellikler child class'ta yer alır
        NOT2: bir parent class'a bağlı child class'ı belirtmek için "extends" keyword kullanırız
        NOT3: "public" methodlar child class'lar tarafından kullanılabilir.
              "child class'lar tarafından kullanılabilir." demek "inherit edilebilir" demektir.
        NOT4: "protected" methodlar "inherit edilebilir"
               Çünkü protected olan method ve variable'lar child'lar tarafından kullanılır.
        NOT5: "default" methodlar obje ile aynı package'de oldukları sürece "inherit edilebilir"
              Ama default method ile objenin üretildiği class farklı package'lerde ise "inherit edilemezler"
        NOT6: "private" methodlar "inherit edilemezler".
        NOT7: Java birden fazla parent'i (multiple inheritance Java tarafından desteklenmez) onaylamaz.( bir child'a birden fazla parent gelmez.
        NOT8: Child==>Parent==>Grand Pranet ==> Grand Grand Parent .... şeklinde ilerleyen inheritance'lara "Multi level interihance" denir
        NOT9: Java'da object class tüm Java class'ların ortak parentidir.
        NOT10: Java'da object class haric tüm class'ların parent'i vardır. Javada parent'i olmayan tek class object classtır
        NOT11: Java'da "parent"dan "child"a olan ilişkilere "HAS-A" Relationship denir.
               Java'da child'tan parent'a olan ilişkilere ise "IS-A" Relationship denir.
        NOT12: Java'da her class'in bir tane default constructor'ı vardır.
               Bu default constructor class'ın içinde görünmez çünkü default constructor "object class" içindedir.
               Bizim class'ımız default constructor'a ihtiyaç duyduğunda parent olan "object class"a gider ve oradaki constructor'ı kullanır
     */

    protected void eat(){
        System.out.println("Animals eat...");
    }

     public void drink(){
        System.out.println("Animals drink...");
    }


}
