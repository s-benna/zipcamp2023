package day08_stringmanipulations;

public class C02_StringManipulations {
    public static void main(String[] args) {
        // * * * * * * * * * * * contains() icermek * * * * * * * * * * *

     /*

     String bir Data dabelirli bir karekter ya da karekterlerin olup olmadigini return eder.
     True veya falsa olarak boolean sonuc verir.
     */
     String str="Kara kara Ankara";
        System.out.println(str.contains("kara"));//true
        System.out.println(str.contains("yara"));//false
        System.out.println(str.contains("ak"));//false
        System.out.println(str.contains("a k"));//true

        // * * * * * * * * * *  startsWith()  * * * * * * * * * *
        /*
        Metnin bas kisminin istenilen karakter ya da karekterlele baslayip baslmadigini kontrol eder.
        Bize boolean sonuc dondurur.(true/false)
         */
        //"Kara kara Ankara"
        System.out.println(str.startsWith("kara"));//false Cunku buyuk harf ile baslamiyor
        System.out.println(str.startsWith("Kara"));//true

        //Ex: Universite numaralari yil+bolumKodu+ Bolume kacinci siradan girildigi olarak duzenlenen bir okulda ogrenci
        //Esra'nin Hukuk Fakultesine gidip gitmedigini gosteren kodu yaziniz.
        /*
        Sinif Ogretmenligi: 22
        Kimya:33
        Hukuk: 44
        Tip:55
        Esra StudentId:20085506
         */

        String str2="20085506";
        System.out.println(str2.startsWith ( "44", 4));//false
        String str3="20204401";
        System.out.println(str3.startsWith("44", 4));//true
        /*
        prefix:baslangic demek, offset at gitsin ilk 4 karekterden sonra "44" ile basliyor mu diye bakildi
       */


        // * * * ** * * * endsWith() * * **  **

        /*
        Metnin son kisminin istenilen karakter ya da karakterlerle bitip bitmedigini kontrol eder.
        true veya false sekilinde bize boolean sonuc dondurur.
       */
        String cumle="Learn Java earn money";


































    }//main
}//class

