package day33maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMaps02 {


        public static void main(String[] args) {

            //Example 1: Size verilen bir cumledeki herbir kelimenin kacar kere kullanildigini gosteren kodu yaziniz.
            //           "Java is easy. Java is OOP. OOP makes Java easy." ==> Java=3, is=2, easy=2, OOP=2, makes=1
            //Map kullanıp kullanmama kararını verilen çıktıya göre karar ver. bu soruda verilen çıktı String ve Integer yani (key value) olunca Map kullanılacak

            HashMap<String, Integer> wordsMap = new HashMap<>();

            String sentence = "Java is easy. Java is OOP. OOP makes Java easy.";

            sentence = sentence.replaceAll("\\p{Punct}", "");//noktalama ve karakterleri değiştirdim "hicbir şey" ile ve orjinal haşine tekrar atadım orjinal hali degisti
            System.out.println(sentence);// Java is easy Java is OOP OOP makes Java easy

            String[] wordsArray = sentence.split(" ");//spilt methodu array veriyordu Array'in içine attım
            System.out.println(Arrays.toString(wordsArray));// [Java, is, easy, Java, is, OOP, OOP, makes, Java, easy]
            // [Java, is, easy, Java, is, OOP, OOP, makes, Java, easy]
            //arraylerde for each loop kullanabiliyorum oyuzden for each kullandım
            for(String w : wordsArray){

                Integer numOfOccurrence = wordsMap.get(w);

                if(numOfOccurrence==null){
                    wordsMap.put(w, 1);
                }else{
                    wordsMap.replace(w, numOfOccurrence+1);
                }

            }
            System.out.println(wordsMap);//{Java=3, OOP=2, makes=1, is=2, easy=2}

        }


    }


