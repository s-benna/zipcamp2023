package day04_objectCreationScanner;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

        /*
        Kullanicidan bir dikdortgenin uzun ve kisa kenarlarini isteyip
        Dikdortgenin cevre ve Alan hesabi yapan kodu yazdiriniz
        Cevre = 2*(Kisa+Uzun)
        Alan = kisa*uzun
        */

        Scanner input = new Scanner(System.in);//BennaSozen
        System.out.println("Lutfen kisa kenar uzunlugunu giriniz");//4
        int kisa = input.nextInt();
        System.out.println("Lutfen uzun kenar uzunlugunu giriniz");//8
        int uzun = input.nextInt();

        System.out.println("dikdortgenin Cevresi : "+(2*kisa+2*uzun));
        System.out.println("Dikdortgenin Alani: "+ kisa*uzun);

        /*
        Kullanicidan alacaginiz data ile ucgenin cevresini hesaplatan kodu yaziniz
        UcgenCevre=a+b+c
         */
        Scanner input2=new Scanner(System.in);//Ucgen
        System.out.println("Ucgenin 1. kenari : a");
        int a = input2.nextInt();
        System.out.println("Ucgenin 2. kenari : b");
        int b = input2.nextInt();
        System.out.println("Ucgenin 3. kenari : c");
        int c = input2.nextInt();

        System.out.println("Ucgenin Cevresi : "+(a+b+c));

    }//main
}//class
