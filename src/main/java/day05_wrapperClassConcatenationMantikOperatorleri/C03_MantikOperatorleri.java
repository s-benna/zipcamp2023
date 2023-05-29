package day05_wrapperClassConcatenationMantikOperatorleri;

public class C03_MantikOperatorleri {
    /*
    1) Dort islem Java'da Matematikte oldugu gibi kullanilir.
       int / int ==> int
       double * int ==>buyuk olan data type'i sonucun Data Type olarak kabul edilir.
     2) Logical Operatorler
        2<5<10 Matematikte uclu kiyas yapilir ancak Java 3lu kiyas yapamaz.
        Bunun yerine 2li karsilastirma yapip Logical Operatorler ile birlestirme yapar.

            a) AND 'Ve' (&& veya &)  Mukemmelliyetci bir yapidadir.
                               True almanin tek yolu sartlarin True olmasidir.

                               Cay   AND(&&)   Limon
                                +     &&         +  ==> true
                                +     &&         -  ==> false
                                -     &&         +  ==> false
                                -     &&         -  ==> false

     (5>3 && 8<9 && -11>5 && 6==6) ==> false * * * Cift AND (&&) hizli calisir. Ilk false satirin devamini okumaz.
     (5>3 & 8<9 & -11>5 & 6==6)    ==> false * * * Tek AND (&) yavas calisir. Cunku tum satiri okur

            b) OR 'Veya' (||)  operatoru en ufak bir True' da True ile doldurur.
                                Cay   OR(||)   Limon
                                +     ||         +  ==> true
                                +     ||         -  ==> true
                                -     ||         +  ==> true
                                -     ||         -  ==> false

            c) NOT 'Degil' (!)  True olan sonucu False, False olan sonucu True dondurur.
                !true  = false
                !false = true
                !!true = true

    3) Karsilastrima  Operatorleri

    Kucuktur <, Buyuktur >, Kucuk esittir<=, Buyuk esittir >=, Esittir ==, Esit Degildir !=



    */
    public static void main(String[] args) {

        boolean sonuc = 5>4 && 7<9 && 6+3 == 9 && 5 + 2 !=8;
        System.out.println("Sonuc1: " +sonuc);//true
        boolean sonuc2 = 5>4 && 7>9 && 6+3 == 9 && 5+2 !=8;
        System.out.println("Sonuc2: " +sonuc2);//false
        boolean sonuc3 = 5>4 & 7>9 & 6+3 == 9 & 5+2 != 8;
        System.out.println("Sonuc3: "+sonuc3);//false
        int sayi1 = 15;
        System.out.println("Sonuc4: "+(10 < sayi1 && sayi1 <20));//true

        int sayi2 = 5;
        //Sayi2 10 ile 20 arasinda olmadigini true diyerek donduren bir kod yaziniz.
        System.out.println("5 Rakami: 10 ile 20 arasinda degildir: "+(sayi2<10 || sayi2>20));

    }//main

}//class
