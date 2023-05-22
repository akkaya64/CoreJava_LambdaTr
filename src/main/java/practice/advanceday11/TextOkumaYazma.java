package practice.advanceday11;

import java.io.*;

public class TextOkumaYazma {
    //Bir text dosyasındaki her satırın kelime sayısını o dosyada her satırın sonun yazdıran bir kod yazınız.

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\Lenovo\\Desktop\\HelloWorld.txt");//tek tek okumak için filereader   satır satır okumak için filebuffer

        BufferedReader br = new BufferedReader(fr);
        String satir = br.readLine();
        String yeniDosya = "";
       while (satir!=null) {

           yeniDosya += satir+"==>Satır kelime sayısı: "+satir.split(" ").length+"\n";//satırları yazarak yeni dosyaya ekledik

           satir = br.readLine();//her defasında bir alt satıra gecicek. yani oku alt satıra gec

       }
        System.out.println("yeniDosya = " + yeniDosya);
       br.close();

        FileWriter writer = new FileWriter("C:\\Users\\Lenovo\\Desktop\\HelloWorld.txt");
        writer.write(yeniDosya);
        writer.close();




    }












}
