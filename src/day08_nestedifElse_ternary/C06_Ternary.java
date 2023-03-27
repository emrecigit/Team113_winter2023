package day08_nestedifElse_ternary;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {
        //Ternary operatoru ya direk sout icersinde kullanilir
        //ya da bir degiskene atama yapilacak sekilde yazilir

        int sayi=20;
       // sayi %2==0 ? "sayi cift" : "sayi tek" ; bu sekilde yazilirse java hata verir , asagidaki sekillerde olabilir
        System.out.println(sayi %2==0 ? "sayi cift" : "sayi tek"); // seklinde olur ya da
        String sonuc = sayi %2==0 ? "cift sayi" : "tek sayi"; // seklinde olur

        // eger true oldugundaki sonuc ile false oldugundaki sonuc farkli data turlerinde olursa;
        // sout icersinde kullanilabilir (=yazdirilabilir) ancak atama yapilamaz.

        // Ornegin sayi cift ise "Sayi cift" yazdirin
        // degilse sayinin 2 katini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        sayi= scan.nextInt();
        System.out.println(sayi %2==0 ? "Sayi cift" : sayi*2);
        // String sonuc2 = sayi %2==0 ? "sayi cift" : sayi*2; bu olmaz integer kismi hata verir
        // int    sonuc2 = sayi %2==0 ? "sayi cift" : sayi*2; bu da olmaz String kismi hata verir


    }
}
