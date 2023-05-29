package day01_variables;

public class C01_Variables {

    // Variable Nasil Olusturulur?
    /*
    1) Access       2) Data Type    3)Variable  4) Assigment   5) Deger  6) Turkcedeki .
      Modifier                          ismi        Operator                  ;

      public            int             yas           =          28          ;

        Javada esittir ==>  == cift assigment operatorudur
        Turkcedeki cumle Javada statement . ==> ; ile bitirilir

     */
    public static void main(String[] args, String bursa) {

        int age = 28 ;
       /*
       Variable Declaration ==Reserved Area  hafizada bir yer ayrilmasi

       1)Access Modifiers   2) Data Type  3) Variable ismi  4) =  5)Deger  6);
        */

        /*
                    DATA TYPE
                    1) primitive data type
                    i) char ==>tek karakter bulundurur.Tek tirnak icersinde yazilir.2 byte yer kaplar
                    ii) boolean ==> true yada false degerini donduren primitive data type.1 byte yer kaplar
                    iii) byte==> -128 den baslar +127 ye kadar devam eder.Memoryde 1 byte yer kaplar
                    iv) short ==>-32000 baslar +32000 ye kadar olan araliktaki degerleri alir.
                                  2 byte memoryde yer kaplar
                    v) int ==>-2,147,483,648 baslar +2,147,483,648 arasindaki degerleri yerlestirebilirsiniz.
                                 il nufusu; ulke nufusu. Memoryde 4 byte yer kapliyor
                    vi) long ==> -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki degerleri alir.
                                Memoryde 8 byte yer kaplar
                    vii) float ==> Ondalikli Sayilar icindir.Memoryde 4 byte yer kaplar
                                floatta virgulden sonra 7 basamak ilerler
                    viii) double ==> ondalikli Sayilar icin kullanilir.Memoryde 8 byte yer kaplar
                                float'a gore daha hassastir.virgulden sonra 16 basamak ilerleyebilir


                                NUMERIC DATA TYPES ==> INTEGER =>byte<short<int<long<float<double
                                                        CHARACTER=>char
                                NUMERIC OLMAYAN DATA TYPE => blooean

                    2) non_primitive data type
                    String : Non primitive data type olmasina ragmen Java
                             tarafindan olusturlan istisnai tek Data Type'dir.
                             Array,Object,Classes...

                           Interwiew Sorusu :primitive data type ile non primitive data type'ler
                                             arasindaki farklar nelerdir?
                                           1) primitve data type'lari kucuk harfle yazilir
                                              non_primitive data type'leri buyuk harfle yazilir.
                                           2) primitve data type'lari sadece icerisine yerlestirdigimiz
                                              degerleri barindirir
                                              non_primiyive data type'lari ise deger + method barindirir.
                                           3) primitve data type'lari Java uretmistir.
                                              non_primitve data type'larini Java+Developerlar ve bizler olustururuz.
                                           4) primitve data type'larinin sayisi 8 tanedir
                                              non_primitve data type'larinin sayisi sonsuz sayidadir denilebilir.
                                           5) primitve data type'lari memoryde kapladigi yer degisirken
                                              non_primitve data type'larinin memoryde kapladigi alan aynidir.
                                           6)primitive data typelari renkli
                                             non prinitive data typleri siyahtir


         */


        String isim="Muhsin Bodur";
        int boy=185;
        short kilo=65;
        double hucreSayisi = 5.55454;
        boolean emekliMi= true;


    }//main
}//class