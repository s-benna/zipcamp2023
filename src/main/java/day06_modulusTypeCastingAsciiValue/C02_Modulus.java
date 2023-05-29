package day06_modulusTypeCastingAsciiValue;

import java.util.Scanner;

public class C02_Modulus {
    public static void main(String[] args) {

        /*
        Kullanicidan alacaginiz 4 basamakli bir sayinin ilk ve son rakamini toplamini yazdiran kodu olusturunuz.



        INPUT   : 1234          4698
        OUTOUT  : 1+4=5         4+8=12
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli sayi giriniz.");
            int sayi= input.nextInt();

            //1ler basamagini alabilmek icin %10
            int birlerBas=sayi%10;
        System.out.println("birlerBas = " + birlerBas);

            //binler basamagi icin
        int binlerBas=sayi/1000;
        System.out.println("binlerBas = " + binlerBas);

        System.out.println("Toplam: " +(birlerBas+binlerBas));




    }//main
}//class
