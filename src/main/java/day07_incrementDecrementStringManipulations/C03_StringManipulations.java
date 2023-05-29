package day07_incrementDecrementStringManipulations;

import java.io.OutputStream;
import java.util.Scanner;

public class C03_StringManipulations {

    public static void main(String[] args) {

        // * * * * * * * * * * * toUpper() Tum harfleri buyuk harf yapar * * * * * * * * * * *

        String isimUpper = "Emin";
        System.out.println("Upper case ornegi: " + isimUpper.toUpperCase());//EMIN


        // * * * * * * * * * * * toLowerCase() Tum harfleri kucuk harf yapar * * * * * * * * * * *
        String cumle="Tek RAKIBIM Dunku Ben";
        System.out.println("Lower case ornegi: " + cumle.toLowerCase());

        // * * * * * * * * * * * lenght() uzunluk karakter sayisini verir lenght methodu 1'den baslar * * * * * * * * *
        String kitap="bazi seyler deneme yanilma ile bulunur.";
        System.out.println("Karekter sayisi: " + kitap.length());//39
        /*
        lenght () space, sembol, rakam, vb. tum karekterleri hesap eder.
         */

        // * * * * * * * * * * * charAt() * * * * * * * * * * * * *
        //Kullanician aldiginiz ismin ilk ve son harfini ekrana yazdiriniz.
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz.");
        String isim=input.next();
        char ilkHarf = isim.charAt(0);
        System.out.println("Isminizin ilk harfi: " + ilkHarf);
        char sonHarf = isim.charAt(isim.length()-1);
        System.out.println("Isminizin son harfi: " + sonHarf);
        //Bastan ve Sondan ikinci karekteri yazdiriniz.
        //String kitap = "bazi seyler deneme yanilma ile bulunur"
        //OutPut==>ar
        char bastanIkinci = kitap.charAt(1);
        char sondanIkinci = kitap.charAt(kitap.length()-2);
        System.out.println("Bastan ve Sondan 2 karekter: " +bastanIkinci+sondanIkinci);

































    }//main
}//class
