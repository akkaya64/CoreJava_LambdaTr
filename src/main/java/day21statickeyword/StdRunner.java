package day21statickeyword;

import java.util.List;

public class StdRunner {

    public static void main(String[] args) {
        //stdName static oldugundan ona ulasmak icin obje olusturmadim sadece class ismini kullanmak yeterlidir.
        System.out.println(Student.stdName);//Tom Hanks  bir class member static ise ona sadece class ismini yazarak olusturabilirsin obje olusturmana gerek yok

        //age non-static oldugundan ona ulasmak icin obje olusturmak zorundayiz
        //obur classta static yazmadik oyuzden nonstatic, normalde her sey non statictir static yazinca static olur
        Student std1 = new Student();
        System.out.println(std1.age);//13 non static variable obje olusturarak ulastik

        String initials = Student.getInitials("Tom Cruise");
        System.out.println(initials);//TC bas harflerini verdi

        int vowels = std1.countVowels("Tom Cruise");
        System.out.println(vowels);//4 sesli harfleri verdi diger classtan yaptiklarimizla cagirdik

        //static olanlari object ile cagirmak tavsiye edilmez.
        String s = std1.getInitials("Ali Can");
        System.out.println(s);

        //List olusturmada yeni bir isilti  of() methodu ile
        List<String> names = List.of("Ali","Can","Kemal");
        System.out.println(names);//[Ali, Can, Kemal]




    }
}
