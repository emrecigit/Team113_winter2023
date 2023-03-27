package day06_bagimiszifcumleleri;

import java.util.Scanner;

public class C05_ifElseStatements {
    public static void main(String[] args) {
        //Bagimsiz if cumleleri ile butun sartların olmadigini if_else ile sadece bir sartin olmadigini yazdirabiliriz
        /* Eger bir olay icin sadece 2 olasilik varsa ve bu olasiliklardan
        birisi mutlaka calisacaksa
        o zaman if Else Statemnets kullaniriz.
        if Else Statements'da if body'si veya else body'si mutlaka calisir
        ikisinin birden calisma ihtimali YOKTUR
        ikisinin de birden calismama ihtimali YOKTUR

         */
/*
Soru 5- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
kucukse “Maalesef kaldin” yazdirin.
 */

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen notunuzu giriniz");
        double not= scan.nextDouble();
        if (not>=50 && not<=100){System.out.println("Sinifi gectin");}

        else {System.out.println("Malesef kaldın");   }


    /*Ek soru 1 Kullanicidan pozitif bir tamsayi alin
        sayinin tek veya cift sayi oldugunu yazdirin.
         */

        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi= scan.nextInt();

        if (sayi%2==0){System.out.println("Sayi cift sayidir");}
        else {System.out.println("Sayi tek sayidir");}




        /*Ek soru 2 Kullanicidan pozitif bir tamsayi alin
        sayinin 5 ile bolunup bolunmedigini yazdirin.
         */
        if (sayi%5==0){System.out.println("Sayi 5 ile tam bolunebilir");}
        else {System.out.println("Sayi 5 ile tam bolunemez");}


    }
}
