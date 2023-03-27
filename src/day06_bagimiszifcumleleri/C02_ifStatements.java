package day06_bagimiszifcumleleri;

import java.util.Scanner;

public class C02_ifStatements {

    public static void main(String[] args) {
        //Bagimsiz if cumleleri ile butun sartların olmadigini if_else ile sadece bir sartin olmadigini yazdirabiliriz
         /*
        Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        “Sayi 5’in tam kati” yazdirin.
      */

        Scanner scan=new Scanner(System.in)  ;
        System.out.println("lutfen pozitif bir tamsayi giriniz");
        int sayi= scan.nextInt();
        if (sayi%5==0){
            System.out.println("Sayi 5'in tam kati");
        }
/*   Soru 3- Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen
    sayi”, 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

 */

        if (sayi%5==0) {
            System.out.println("5 ile bolunebilen sayi");
        }
        if (sayi%3==0) {
            System.out.println("3 ile bolunebilen sayi");
        }





    }
}
