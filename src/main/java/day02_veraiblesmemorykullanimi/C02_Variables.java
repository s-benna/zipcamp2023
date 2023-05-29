package day02_veraiblesmemorykullanimi;

public class C02_Variables {

    public static void main(String[] args) {

        //Ex-1 Dunya nufusunu icine yerlestireceginiz bir variable olusturunuz.

        long wordofPopulation = 9000000000L;
        long sayfaSayisi = 2354;

        //Not long data type'ini Java Integer kabul etme egilimindedir.
        //Biz israr edersek L veya l sayinin sonuna eklemeliyiz.

        //Ex-2: char data type'inde ilk ismin ilk harfi seklinde bir variable olusturunuz.
        char initialize='F';
        char space =' ';
        char sembol ='*';
        //char hiclik = ''; char data type inin icine mutlaka 1 karekter yerlestirilmeli.
        //Ne hiclik ne de 1 den fazla karakter yerlestirilmez.

        // Ex 3 : boolean data type'inda emeklimisin variable olusturup false atayalim.

        boolean emeklimisin = false ;


        //Ex 4: Site icin bir variable olusturup deger atayalim.

        short yildizsiteNufusu=1200 ;

        //Ex 5 Gomlek ve ayakkabi icin 2 tane variable olusturup toplam fiyati ekrana yazdiriniz.

        float gomlek = 1498.95609F;
        float ayakkabi = 599.99120F;

        System.out.println(gomlek+ayakkabi);




    }//main
}
