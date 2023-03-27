package day06_bagimiszifcumleleri;

import java.util.Scanner;

public class C04_ifStatements {
    public static void main(String[] args) {
        //Bagimsiz if cumleleri ile butun sartların olmadigini if_else ile sadece bir sartin olmadigini yazdirabiliriz
        /*
        Soru 5- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
kucukse “Maalesef kaldin” yazdirin.
         */


        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen notunuzu giriniz");
        double not= scan.nextDouble();
        if (not>=50 && not<=100){
            System.out.println("Sinifi gectin");
        }
        System.out.println("Kontrol1");//ilk ;'den sonra oldugu icin otomatik calisir
        System.out.println("Kontrol2");//ilk ;'den sonra oldugu icin otomatik calisir
        System.out.println("Kontrol3");//ilk ;'den sonra oldugu icin otomatik calisir
           if (not<50){
               System.out.println("Malesef kaldın");
           }

           /*
           if statements'da sart parantezinden sonra {} kullanmazsak
           Java ilk ; 'e kadar olan kismi if body olarak kabul eder,
           if body zaten bir satir ise bu bir soru olmaz ama if body 1 satirdan coksa, ilk
           satirdan sonrasi her durumfa calisir
            */
    }
}
