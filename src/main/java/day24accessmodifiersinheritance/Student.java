package day24accessmodifiersinheritance;

public class Student {

    public String name = "Tom Hanks";//
    String stdId = "TH2023HU12001";//acccesmodifier yazmazsan o default olur, studenId okul yönetimindeki insanlar tarafından bilinebilir,
                                    // oyüzden default yaptım
    protected int accountNum = 7612345;//çocuklar da bilecek protected. ben esim ve cocuklerım tarafından bilinebilir oyczden protected yaptım
    private int balance = 123000;//hesabımdaki para miktarı sadece benim tarafımdan bilinmelidir. bu yüzden private yaptım.

    /*
        myStd.stdId      default olan variable'lar ayni "Package" adindan ulasilabilir oldugundan bu class da gorulebilir
        myStd.accountNumber  ayni package ile bir grup ve cocuklari tarafindan gorulebilir oldugu icin gorulur
        "balance" Private oldugundan baska class da gorulemez .Student classin icindeki balance variable a bu class dan ulasamayiz.
     */

    //default aynı package de olduğunz zaman gözükür ama obje day23te variable day24te
    // farklı packagelerde olduğu için gözükmez
    // protected aynı package ve cocukları görebilir. day23teki runnerda gözükmez


     /*
         1)Access modifier'lar genis'den dara; public > protected > default > private
         2)Class'lar protected ve private olamazlar, sadece public ve default olabilirler
         3)Access Modifier'lar ne ise yarar?
           Variablelara methodlara classlara ulasmayi duzenler.
         4)Kac tane access modifier var ?
        public > protected > default > private
            i) "public"ler icin hicbir sinirlama yoktur projenin her yerinden ulasilabilir
            ii) "protected" ayni package'in icinden ya da farkli packagelarda o packagedeki cocuklar ulasabilir.
            iii) "default" sadece ayni packageden ulasilabilir. Bu yuzden "default"larin diger adi "package private"dir
            iv) "private"  sadece class icinden ulasilabilir, class disina cikildiginda ulasilamaz
            v) "protected" ile "default"un farki nedir ?
           Package disina ciktigimizda childlardan "protected"lara ulasabiliriz. "default"lara ulasamayiz.
      */





}
