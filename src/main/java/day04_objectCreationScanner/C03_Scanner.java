package day04_objectCreationScanner;

import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {
    //Kullanicidan aldiginiz sekil ile asagidaki gibi bir gorunum elde ediniz.
    //sout kullaniniz
        /*
                A
               A A
              A A A
     */
        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen bir karekter giriniz");
        char ch = input.next().charAt(0);
        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println(ch+" "+ch+" "+ch);
    }
}
