package day06_modulusTypeCastingAsciiValue;

import java.util.Scanner;

public class C01_modulus {
    public static void main(String[] args) {
        /*
           Kullanicidan 3 basmakli bir sayi alin sayinin birler, onlar ve yuzler basanagini yazdirin.
           INPUT: 568
           OUTPUT: Birler basamagi 8
                   Onlar  basamagi 6
                   Yuzler basamagi 5
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli sayi giriniz.");
        int nummber = input.nextInt();

        //1 ler basamagindaki sayiyi elde etmek icin
        int birlerBas = nummber%10;
        System.out.println("birlerBas = " + birlerBas);

        // Sayiyi kucult onlar basamagina ilerlemek icin
        nummber = nummber/10;
        System.out.println("kuculen number = " + nummber);//56

        // * * * * * * * * * * * * * * * * * * *

        //10 ler basamagindaki sayiyi elde etmek icin
        int onlarBas = nummber%10;
        System.out.println("onlarBas = " + onlarBas);//6

        // Sayiyi kucult yuzler basamagina ilerlemek icin
        nummber = nummber/10;
        System.out.println("kuculen number = " + nummber);//5

        // 100ler basamaginda ki sayiyi elde etmek icin
        int yuzlerBas = nummber%10;
        System.out.println("yuzlerBas = " + yuzlerBas);





    }
}
