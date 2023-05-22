package day30exceptionsinterface;

public class CastumException01 {

    public static void main(String[] args) {

        getStudentGrade(87);
        getTheNumberOfStudents(-24);


    }

    public static void getStudentGrade(int grade){

        if (grade<0 || grade>100){
            try {
                throw new InvalidStudentGradeExceptions("Students grades can not be less than zero or greater than 100");
            } catch (InvalidStudentGradeExceptions e) {
                e.printStackTrace();
            }
        }else {
            System.out.println(grade);
        }
        /*
            Bazen kendi exception'imizi kendimiz uretiriz.
            Neden oyle bir seye ihtiyac duyariz?
            Normalde Java kendisi bir suru "exception" uretmistir. Java kurallari bildigi icin, olabilecek hatalarla
            ilgili exception uremistir.
            Java bu noktada hata yapmamizi engelliyor.
            Exceptionslar kirimizi isiklar gibidir java kurallar kurar o kurallar disina cikmamizi engeller.

            Ama kendimiz app olustururken javanin uretttiginin disinda kurallara ihtiyacimiz olabilir.
            (Okul app deki double note gibi negatif ve >100 olmamamli)
            Bu durumlar icin biz kendimiz exception olustururuz.

        */
    }

    //Urettigimiz exception'i run time exception olmasini istiyorsak parent'i RunTimeException yap
    //Urettigimiz exception'i compile time exception olmasini istiyorsak parent'i exception yap.
    public static void getTheNumberOfStudents(int numOfStudents){
        if (numOfStudents<0){
            try {
                throw new InvalidNumberException("Student number can not be negative");
            }catch ( InvalidNumberException e){
                System.err.println(e.getMessage());//err konsolda hata yazısını kırmızı yapıp görünür yapar.
            }

        }else {
            System.out.println(numOfStudents);
        }
    }



}
