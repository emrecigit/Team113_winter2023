package day06_bagimiszifcumleleri;

import java.util.Scanner;

public class C08_ifElseStatements {
    public static void main(String[] args) {
        //Bagimsiz if cumleleri ile butun sartların olmadigini if_else ile sadece bir sartin olmadigini yazdirabiliriz
       /*
       Soru 5- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
olarak yazdirin, yoksa girilen harfi yazdirin
        */


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");

        char harf=scan.next().charAt(0);

        if (harf>='a'&& harf<='z'){
            System.out.println("Girilen harf: "+Character.toUpperCase(harf));}
        else{System.out.println("Girilen harf: "+harf);}

    }
}
