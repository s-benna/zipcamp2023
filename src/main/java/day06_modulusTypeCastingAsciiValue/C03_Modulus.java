package day06_modulusTypeCastingAsciiValue;

import java.util.Scanner;

public class C03_Modulus {
    public static void main(String[] args) {
         /*
         INTERWIEW QUESTIONS
         Kullanicidan alcaginiz 5 basamakli sayinin ilk 2 ve son 2 rakamlarinin toplamini hesapkatan kodu yaziniz.

         INPUT:12345
         OUTPUT:1+2+4+5=12
          */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli sayi girin.");
        int nummber = input.nextInt();


        // Son basamagi at
        int birler = nummber%10;
        System.out.println("birler = " + birler);
        //Sayiyi kucult
        nummber=nummber/10;
        System.out.println("Kuculen sayi = " + nummber);//1234

        // * * * * * *

        //Sondan ikinci basamagi at
        int onlarBas = nummber%10;
        //sayiyi kucult
        nummber = nummber/10;//123

        //Sondan ucuncu basamagi al

        int yuzlerBas= nummber%10;

        //Sayiyi kucult
        nummber=nummber/10;//12

        //sondan 4 rakami al
        int binlerBas = nummber%10;

        //sayiyi Kucult
        int onbinlerBas= nummber/10;//1

        System.out.println("Toplam: "+(onbinlerBas+onlarBas+birler+binlerBas));
























    }//main
}//class
