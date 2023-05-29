package day06_modulusTypeCastingAsciiValue;

public class C06_AsciiValue {
    public static void main(String[] args) {

    /*
    ASCII == Amerikan Standrt Kodlama Sistemi
    Klavyede kullandigimiz tum karekterlerin ASCII table'de sayisal bir degeri vardir.
    Cunku PC icin yazilim 1 ve 0 dan olusur. Tum karekterleri bu nedenle sayisal bir degeri olsun istenmistir.
    Tum Dunyada ortak olarak bu tablo olusturulmustur-
    Java'da + sembolunun iki degeri vardir.
    1-Sayisal degerler arasinda toplama islemi yapar.
    2-String Data'lar arasindaysa yanyana yazdirma concatiation yapar.

     */

       //'b' harfi ile 20 sayisini toplana bilir mi?

        int sayi = 20;
        char bHarfi='b';
        int toplam=sayi+bHarfi;
        System.out.println("Toplam:" + toplam);//118 - b harfinin ASCII degeri=98

        //Ex char rakam 1='1'
        char rakam1='1';
        char rakam2='2';
        char rakam3='3';
        char rakam4='4';
        System.out.println("rakam1 = " + rakam1);
        System.out.println("rakam2 = " + rakam2);
        System.out.println("rakam3 = " + rakam3);
        System.out.println("rakam4 = " + rakam4);
        System.out.println("Toplam= " +rakam1+rakam2+rakam3+rakam4);
        System.out.println("Toplam= " +(rakam1+rakam2+rakam3+rakam4));






























    }//main
}//class
