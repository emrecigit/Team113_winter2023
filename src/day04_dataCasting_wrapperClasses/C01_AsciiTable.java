package day04_dataCasting_wrapperClasses;

import java.util.Scanner;

public class C01_AsciiTable {
    public static void main(String[] args) {

        /*
        24==>11000
        a==>97==>10100010
        b==>98
        ahmet  // ayrı ayrı harfler halinde tutulur

         */

        // char data turundeki variable ve degerler
        // sayisal data turundeki datalarla isleme sokulursa
        // ASCII table'daki degerleri ile isleme girer.

        System.out.println(5+'a'); // 5+97=102 verir

            char ilkharf=101;
        System.out.println(ilkharf);//e

        //kullanicinin verdigi harften bir sonraki harfi yazdirin.

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir harf giriniz");

        char harf = scan.next().charAt(0);

        System.out.println("Bir sonraki harf : "+(char)(harf+1));



        char girilenChar='f';

        System.out.println(girilenChar+1); //102+1=103 verir

        // biz 103'u degil 103'un karsiligi olan char ifadeyi yazdrimak istersek explicit casting yapariz

        System.out.println("Girilen harfin bir sonrasi : "+(char)(girilenChar+1));

        // verilen bir harften 2 onceki harfi yazdirin

        girilenChar='M';

        System.out.println("Girilen harften iki onceki harf : "+ (girilenChar-2));//77-2=75 sonucunu verir.
        System.out.println("Girilen harften iki onceki harf : "+ (char)(girilenChar-2));//K sonucunu verir




    }
}
