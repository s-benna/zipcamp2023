package day05_wrapperClassConcatenationMantikOperatorleri;

public class C01_WrapperClass {


    /*


        Wrapper Class = primitve Data type'lari methodlara sahip olmadigi icin Java ara cozum uretmistir.
                        Icersiinde hem method hemde Data barindirabilen Wrapper Class'lari olusturmustur.
                        Wrapper Class'lar Non-Primitive Data Type'laridir.

            Primitive          WrapperClass
            byte               Byte
            short              Short
            int                Integer***
            long               Long
            float              Float
            double             Double
            boolean            Boolean
            char               Character***

     */
    public static void main(String[] args) {

        byte primitiveByte = 12;
        Byte wrapperByte = 12;
        System.out.println(primitiveByte);


        //Ex: byte Data type'nin max ve min degerlerini ekrana yazdiriniz.

        System.out.println("Byte min: " +Byte.MIN_VALUE);//-128
        System.out.println("Byte max: " +Byte.MAX_VALUE);//+127
        // short - int - long datatype'larinin max ve min ekrana yazdiriniz.
        System.out.println("Short max: " +Short.MAX_VALUE); //32767
        System.out.println("Short min: " +Short.MIN_VALUE); //-32768
        System.out.println("Integer max: " +Integer.MAX_VALUE);//2147483647
        System.out.println("Integer max: " +Integer.MIN_VALUE);//-2147483648
        System.out.println("Long max: " +Long.MAX_VALUE);//9223372036854775807
        System.out.println("Long max: " +Long.MIN_VALUE);//-9223372036854775808


        //******* Autoboxing: Primitive Data Type'larinin Wrapper Class'lara cevirilmesine denir. *******
        float primitiveFloat = 5.68F; // kucuk kutu
        Float wrapperFloat = primitiveFloat; //buyuk kutuya yerlestirildi
        System.out.println(wrapperFloat);

        // * * * Unboxing Wrapper Classlarin Primitive Data Type'lerin cevrilmesine denir. * * *
        Character ch ='A';
        char primitivech = ch;
        System.out.println(primitivech); // Unboxing



        //Ex: Verilen iki String Data'nin kodunuz yaziniz.
        String gomlek1 = "500";
        String gomlek2 = "650";
        System.out.println(gomlek1+gomlek2);//500650 seklinde gorunur yani Concatinatio yapar.

        System.out.println(Integer.valueOf(gomlek1) + Integer.valueOf(gomlek2));


        //Wrapper boolean'i primitive boolean cevirren kodu yaziniz. ==>Unboxing

        Boolean yasliMi = false;
        boolean primitiveBoolean = yasliMi;
        System.out.println(primitiveBoolean);



























    }//main
}//class
