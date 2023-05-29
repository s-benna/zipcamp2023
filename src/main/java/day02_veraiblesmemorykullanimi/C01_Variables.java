package day02_veraiblesmemorykullanimi;

public class C01_Variables {

    public static void main(String[] args) {


        //Ex 1: Dunya nufusunu icine yerlestirecegimiz bir variable olusturunuz.

        long worldofPopulation=8465474987L;

        //Not long data type'ini Integer kabul etme egilimindedir.
        //Biz israr edersek L veya l harfini sayinin sonuna eklemeliyiz.

        //Ex 2: Char data type de ilk ismin ilk harfi seklinde bir variable olusturunuz.
        char initalize='F';
        char space =' ';
        char sembol ='*';
        char hiclik = ' '; //char data type nin icine mutlaka 1 karekter yerlestirilmeli.
        // Ne hiclik ne de 1 den fazla karakter yerlestirilmez.

        //Ex 3: boolean data type inde emeklimisin variable olustuurp false atayalim

        boolean emekliMisin = false;


        //Ex 4: Site nufusu icin bir variable olusturun.

        short siteNufusu = 1290;
        //Ex 5: Gomlek ve ayakkabi fiyatlari icin 2 tane variable olusturup toplam fiyati ekrana yazdiriniz.


        float gomlek=555.68987F;
        float ayakkabi=6663.4678F;

        System.out.println("gomlek+ayakkabi fiyati : "+(gomlek+ayakkabi));
        System.out.print("gomlek fiyati : "+gomlek);
        System.out.println("ayakkabi fiyati : "+ayakkabi);
        System.out.println("Bugra");
        System.out.println("********");
        System.out.println("emekliMisin : "+emekliMisin);
        System.out.println("space : "+space+"space yazdirdimi?");




    }//main
}
