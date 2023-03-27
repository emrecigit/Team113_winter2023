package day06_bagimiszifcumleleri;

import java.util.Scanner;

public class C06_ifElseStatements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //Bagimsiz if cumleleri ile butun sartların olmadigini if_else ile sadece bir sartin olmadigini yazdirabiliriz
        /*
        Soru 3- Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin”
yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.
         */
        System.out.println("Lütfen yasinizi giriniz");
        double yas= scan.nextDouble();
        if (yas>=65){System.out.println("Emekli olabilirsin");}
            else{System.out.println("Emekli olabilmek icin daha "+(65-yas)+" yil daha calısmalisiniz");}




        }
}
