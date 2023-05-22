package day30exceptionsinterface;
/*
    1)Kendi application'ınıza özel kurallar oluşturmak için kendi Exceptions Class'larınızı oluşturabilirsiniz.
    2)Oluşturduğunuz Exceptions Class'lar i)Compile Time Exception ii)Run Time Exception olabilir
    3)Compile Time Exception oluşturmak için class'ınızın parent'ı "Exceptions class" olmalıdır.
    4)Run Time Exception oluşturmak için class'ınızın parent'i "Run Time Exception" olmalıdır.
    5)Kendi oluşturduğunuz Exception Class'lara "Custom Exceptions Class"(kişiye özel) denir.
     */

public class InvalidStudentGradeExceptions extends Exception {

    public InvalidStudentGradeExceptions(String message){

        super(message);

    }



}
