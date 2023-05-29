package day03_memoryKullanimiMethodCreation;
public class Homework {
    public static void main(String[] args) {
       
       
       
        // 1) Dairenin Cevresini hesaplayan methodu int return type ile olusturunuz
        System.out.println(daireninCevresi(5));


        // 2) Dairenin Alanini hesaplayan methodu void return type ile olusturunuz
        daireninAlani(6);



    }//main

    private static void daireninAlani(int r) {
        System.out.println(r*r*314/100);
    }

    private static int daireninCevresi(int r) {

        return 2*314*r/100;
    }
}//class