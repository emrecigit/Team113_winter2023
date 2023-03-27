package day06_bagimiszifcumleleri;

import java.util.Scanner;

public class C01_ifStatements {

    public static void main(String[] args) {
        /*
        int a=10;
        int b=20;

        if (a>b) {System.out.println("a b'den buyuktur");} // a>b false'tir , calisir ancak false oldugu icin
        // yazdirmaz alt satira gecer
       */
/*
    Buradaki sartlar birbirinden bagimsizdir
    uygun sartlar olursa 3 if body'si de calisabilir
    bazen de hic bir if body'si devreye girmeyebilir.
    kodumuz konsolde hicbirsey yazdrımadi
    ancak
    Process finished with exit code 0
    yazmasindan kodun sorunsuz calistigini anliyoruz
    sadece degerler sartlari saglamadigi icin konsolde birsey yazdirilmadi
 */
        //Bagimsiz if cumleleri ile butun sartların olmadigini if_else ile sadece bir sartin olmadigini yazdirabiliriz
        int a=13;
        int b=55;
        if (a>b){
            System.out.println("a b'den buyuktur");
        }

        if (a%2==0) {
            System.out.println("a cift sayidir");
        }

        if (b>100){
            System.out.println("b 100'den buyuktur");
        }

boolean sonuc=a*7>b;

        /*
        bazen if statement'da direk boolean bir deger sart olarak yazilabilir
        bu durumda boolean variable degeri true ise if body calisir
        false ise if body calismaz
         */
        if (sonuc){
            System.out.println("istenen sart saglandi");
        }






    }
}
