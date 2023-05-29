package day07_incrementDecrementStringManipulations;

public class C02_IncrementDecrement {
    public static void main(String[] args) {


        int a= 12;
        int b= a++; //Post Increment Artirma Post= sonradan
        System.out.println(b);//12
        System.out.println(a);//13
        // * * * * * * * * * * * *
        int x = 15;
        int y = x--; //Post Decrement
        System.out.println(x);//14
        System.out.println(y);//15
        // * * * * * * * * * * * *
        int m = 21;
        int n = ++m; //Pre Increment
        System.out.println(m);//22
        System.out.println(n);//22
        // * * * * * * * * * * * *
        int t=32;
        int u=--t; //Pre Decrement
        System.out.println(t); //31
        System.out.println(u); //31
        // * * * * * * * * * * * *

        int sayi =10;
        sayi++;
        System.out.println(sayi);//11
        sayi++;
        System.out.println("pre- increment once" + sayi);//12
        System.out.println("pre-increment satirinda " + ++sayi);//13
        System.out.println("pre-incrementden sonra" +sayi);//13

        System.out.println("post-increment satirinda" + sayi++);//13
        System.out.println("post-increnebtden sonra " + sayi);//14
        System.out.println(9f / 2f);//4.5
        System.out.println(9 / 2);//4



        int num = 15;
        int num2 = num++;
        System.out.println(num2);
        System.out.println(num);

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;

        sayi2 = sayi1++;
        System.out.println(sayi1 + "," + sayi2 + "," + sayi3);//11,10,13

        sayi3=++sayi1;
        System.out.println(sayi1 + "," + sayi2 + "," + sayi3);//12,10,12

        System.out.println(sayi3++);//12

        System.out.println(--sayi2);//9

        System.out.println(sayi3++);//13

        System.out.println(sayi3);//14

        int c = 5;
        System.out.println(c);//5

        //Increment 1:
        c = c + 2;
        System.out.println(c);//7

        //Ex-1: Bir tane integer variable olusturun ve onu iki sekilde 5 artirin.
        int d = 10;
        System.out.println(d);//10
        //1. yontem
        d = d + 5;
        System.out.println(d);//15
        //2. yontem Recomnded Tercih edilen Az Code cok is Clean code onemlidir.
        d += 5;
        System.out.println(d);//20

        //Decrement
        int e = 8;
        System.out.println(e);//8

        e=e-3;
        System.out.println(e);//5

        e-=3;
        System.out.println(e);//2

        //Increment-2:
        int f=6;
        System.out.println(f);

        f=f*2;
        System.out.println(f);//12

        f *=2;
        System.out.println(f);//24

        //Decrement-2:
        int g=24;
        System.out.println(g);//24

        g=g/2;
        System.out.println(g);//12

        g /=2;
        System.out.println(g);//6

        //"1" ile Increment (Artirma)
        int h= 12;


        //"1" ile Decrement (Azaltma)
        int j=10;



        //"Post-increment (Sonradan Artirma)" ve "Pre-increment (Onceden Artirma)"
        int i=10;
        int k=i++;

        System.out.println(k);//10
        System.out.println(i);//11

        int p=15;
        System.out.println(p);//15
        int r=++p;

        System.out.println(p);//16
        System.out.println(r);//16

        //"Post-Decrement" ve "Pre-Decrement"
        int number=17;
        int v = number--;
        System.out.println(number);//16
        System.out.println(v);//17

        int s=20;
        int finish= --s;
        System.out.println(s);//19
        System.out.println(finish);//19




















    }
}
