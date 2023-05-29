package day08_stringmanipulations;

public class C01_stringmanipulations {
    public static void main(String[] args) {

    // * * * * * * * *  substring() * * * * * * * * * *

        /*
        substrung () iki sekilde kullanilir.
        1-substring(int baslangicIndexi, ont bitisIndexi) baslangic indexi dahil, bitis indexi haric dondurur, yazdirir.

        2-substring( int baslangicIndexi) sadece baslangic indexi yazilir.
        bitis belirtilmedigi icin String'in sonuna kadar tamamini dondurur.
         */
    String str = "Benim Tek rakibim Dunku ben.";
    //Ex: Verilen str data da ki ilk 5 karekteri yazdiriniz.
        System.out.println(str.substring(0,5));// Benim [0,5)
    // Ex: verilen str Datadaki 4. index dahil 7 index haric yazdiran kodu giriniz.
        System.out.println(str.substring(4, 7));//m T
    //Ex: str string deki Datadan "Rakib" kelimesini veren kodu yaziniz.
        System.out.println(str.substring(10, 15));//Rakib

        System.out.println(str.substring(10));//rakibim Dunku ben.
        //Verilen stirng Data daki meyve isimlerini veren kodu olusturunuz.
        String cumle="Ben erik, oglum muz, kizim cilek sever.";//(4,8)+(16,19)+(27,32)
        String erik=cumle.substring(4,8);
        String muz=cumle.substring(16,19);
        String cilek=cumle.substring(27,32);
        System.out.println(erik + " " + cilek + " " + muz);

    }//main
}//class

