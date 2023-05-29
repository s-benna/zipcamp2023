package day04_objectCreationScanner;

import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {

         /*
        Kullanicidan 2 sayi alip 4 islem yaptiran ve ekrana bastiran
        basit bir hesap makinasi kodu yaziniz.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen rakamlari giriniz");
        double sayi1= input.nextDouble();
        double sayi2= input.nextDouble();

        System.out.println(sayi1+sayi2);
        System.out.println(sayi1-sayi2);
        System.out.println(sayi1*sayi2);
        System.out.println(sayi1/sayi2);



    }
}
