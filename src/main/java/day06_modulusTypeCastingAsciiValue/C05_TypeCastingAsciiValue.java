package day06_modulusTypeCastingAsciiValue;

public class C05_TypeCastingAsciiValue {

    /*
    Numeric Data Type'lari birbirine donusturulmesine Type casting denir.
    Numeric Data Type'lari byte< short< int< long< float< double
    Kucuk Data Type'larinin buyuk data type'larina donusturulmesine AutoWidenig(Otomatik Genisletme) denir.
    Buyuk Data Type'larinin kucuk data type'larina donusturlmesini Java ustlenmez.
    Manuel olarak yazanin sorumlulugu almasini ister. Buna da ExplicitNarrowing(Aciktan Daraltma) denir.


     */


    public static void main(String[] args) {

        byte age=23;
        int newAge=age;

        long nufus =1234;
        int yeniNufus= (int) nufus;

        short ogrenciSayisi = 564;
        double yeniOgrenciSayisi= ogrenciSayisi;

        float ucret = 45.99f;
        System.out.println("Deneme: " + ucret);//45.99
        byte yeniucret = (byte) ucret;
        System.out.println("Farki gor: " + yeniucret);//45

        int number = 515;
        byte newNumber= (byte) number;
        System.out.println("newNumber: " + newNumber);//514 3 255

        int sayi = 510;
        byte newSayi = (byte) sayi;
        System.out.println("newSayi: " + newSayi);//-2





    }
}
