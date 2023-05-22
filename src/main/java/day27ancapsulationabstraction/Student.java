package day27ancapsulationabstraction;
//encopsulation: data hiding demektir. data'yı saklamak demektir.
//access modifier'ı "private" yapınca datay'ı saklamış olursun.
//  Encapsulation faydası;
//1. guvenlık..saklamazsak dısardan etkıler data yı bozabılır.
//2. dıkkatı dagılır..odak dagınıklıgının onune gecer

public class Student {

    private String stdId = "AC123";
    private double gpa = 3.99;

    private boolean poor = true;

            //Encapsilation data'yı okuyabilir miyiz?
    //get() method'lar encapsule(saklanmış) edilmiş data'yı okumamıza yarar.
    //get() methodların diğer adı ==> "getter"
    //get() method'lar her zaman "public" olur.
    //get() methodların return type'ı variable'ın data type'ı ile aynı olur. String ise String olcak
    //get() methodların isimleri "get + variable name" şeklinde olur.==> getGpa
    //get() methodların isimleri variable boolean ise "is + variable name" şeklinde olur
    //get() methodlar herhangi bir parametre kullanmazlar. çünkü zaten size var olan datayı olduğu gibi veriyor


    public String getStdId() {//getter methodu saklanmış datayı okumaya yarar.
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isPoor() {
        return poor;
    }

    // getter encapsule edilmiş datayı getiriyor, setter bu veride değişiklik imkanı veriyor

    //Encapsilation yapılmış data'ların değeri değiştirilebilir mi?
    //set() methodlar (setter) encapsule edilmiş data'ların değerlerini değiştirmemize yarar
    //set() methodlar(setter) her zaman public olurlar
    //set() methodların (setter) return type'i her zaman "void" olur.
    //set() methodların (setter) isimleri "set + variable name" şeklinde olur.
    //set() methodlar (setter)  vaariable ile aynı data type'inde parametre kullanırlar
    //set() methodlar objedeki görünümü değiştirir. orjinal hali aynı kalır.
    //Encapsulation faydalarindan biri de tek bir obje olusturup set methodu ile istedigimiz objeye cevirebiliriz
    //Getter ve setter'ların ikisine birden "Java Beans" denir


    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setPoor(boolean poor) {
        this.poor = poor;
    }
}
