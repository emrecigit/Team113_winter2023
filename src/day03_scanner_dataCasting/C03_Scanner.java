package day03_scanner_dataCasting;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Çemberin yarrıçapını giriniz"+
                "\nENTER'a basiniz");

        // kullanicinin girdigi bilgiyi kaydedebilecek data turunde bir variable olusturun
        // kullanicidan bilgiyi almak icin scan objesini ve ilgili next methodunu kullanin

        double yaricap= scan.nextDouble();

        System.out.println("Cemberin cevresi : "+2*3.14*yaricap+
                "\nDairenin alanı : "+3.14*yaricap*yaricap);
    }
}
