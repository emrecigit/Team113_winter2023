package day06_bagimiszifcumleleri;

import java.util.Scanner;

public class C03_ifStatements {
    public static void main(String[] args) {
        //Bagimsiz if cumleleri ile butun sartların olmadigini if_else ile sadece bir sartin olmadigini yazdirabiliriz
        /*
        Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
“Eskenar ucgen” yazdirin.

         */

        Scanner scan=new Scanner(System.in) ;

        System.out.println("Lutfen ucgenin  kenar1 uzunlugunu giriniz ve ENTER'a basiniz");
        double kenar1=scan.nextDouble();
        System.out.println("Lutfen ucgenin  kenar2 uzunlugunu giriniz ve ENTER'a basiniz");
        double kenar2=scan.nextDouble();
        System.out.println("Lutfen ucgenin  kenar3 uzunlugunu giriniz ve ENTER'a basiniz");
        double kenar3=scan.nextDouble();


      /* if (kenar1==kenar2==kenar3) seklinde Java'da 3 lu karsilastirma YOKTUR
      onun yerine ikili karsialstirmalar yapip && ile birlestirebiliriz
         */
        if (kenar1==kenar2 && kenar2==kenar3 && kenar1>0){
            System.out.println("Girilen kenarlar bir eskenar ucgen  olusturur");

        }










    }
}
