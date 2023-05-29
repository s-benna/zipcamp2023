package day04_objectCreationScanner;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {



        //Kullanicidan Data alabilmek icin
        // 1) input object olustururuz
        Scanner input = new Scanner(System.in);//Cihan
        /*


        2)Kullaniciyi yonlendirmeliyiz
        System.out.println("Lutfen adinizi giriniz");

        3) Kullanicidan alinan datanin yapisina ve buyuklugune gore bir veriable secilir
        String name=input.next();
        4) Kullanicinin verdigi bilgileri teyit icin ekrana yazdiriniz
        System.out.println(name);


        Kullaniciya adini, cinsiyetini, memlektini, yasini, boyunu,
        emekli olup-olmadigini, maasini soran kodu yaziniz
        */

        // 2)Kullaniciyi yonlendirmeliyiz
        System.out.println("Lutfen adinizi giriniz");

        // 3) Kullanicidan alinan datanin yapisina ve buyuklugune gore bir veriable secilir

        String ad=input.next();     //nextLine(Tum satiri alir) ve next(ilk ismi alir)
        System.out.println("Luften cinsiyetinizi giriniz Kadin icin \nK, Erkek icin E giriniz");
        char cinsiyet=input.next().charAt(0);
        System.out.println("Lutfen memleketinizi giriniz");
        String memleket = input.next();
        System.out.println("Lutfen yasinizi giriniz");
        byte yas = input.nextByte();
        System.out.println("Lutfen boyunuzu giriniz");
        double boy = input.nextDouble();
        System.out.println("Emekli misin? \nEvetse True \nHayirsa False");
        boolean emekliMi = input.nextBoolean();

        /*
        System.out.println("Lutfen maasinizi giriniz");
        long maas = input.nextLong();  (+" maas : "+maas)*/

        System.out.println("****** Benna Sozen ******");
        System.out.println(" ad : "+ad+" cinsiyet : "+cinsiyet+" memleket : "+memleket+" yas :"+yas+" boy :"+boy+
                " emekliMi "+emekliMi);


    }//main
}//class
