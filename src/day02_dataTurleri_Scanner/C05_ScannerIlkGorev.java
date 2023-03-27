package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C05_ScannerIlkGorev {
    public static void main(String[] args) {
        //kullanıcıdan bir sayi alin ve sayinin karesini yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println(" lütfen bir sayı giriniz");
        double  girilensayi= scan.nextDouble();
        System.out.println(" Girilen Sayının Karesi : " + girilensayi*girilensayi);
    }
}
