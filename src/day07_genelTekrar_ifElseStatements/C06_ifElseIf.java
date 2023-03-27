package day07_genelTekrar_ifElseStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C06_ifElseIf {
    public static void main(String[] args) {
       /* Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
        hesaplayin (kilo*10000 / (boy *boy))
         vucut kitle endeksi 30’dan buyukse obez,
         25-30 arasi ise kilolu,
         20-25 arasi ise normal,
         20’den kucukse zayif yazdirin */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen Kilonuzu Kg Cinsinden Giriniz");
        double kilo=scan.nextDouble();
        System.out.println("lutfen Boyunuzu Cm Cinsinden Giriniz");
        double boy=scan.nextDouble();
        double kitleEndeksi = (kilo*10000/(boy*boy));
        System.out.println("Vucut Kitle Endeksiniz : "+kitleEndeksi);
        if (kilo<=0 || boy<=0 || boy>=300 || kilo>=500 ){System.out.println("Yanlis Giris Yaptiniz, Tekrar Deneyin");}
        else if (kitleEndeksi>30){System.out.println("Malesef obezsiniz");}
        else if (kitleEndeksi>25){System.out.println("Malesef kilolusunuz");}
        else if (kitleEndeksi>20){System.out.println("Tebrikler kilonuz ideal kiloda olup kilonuz normal");}
        else {System.out.println("Kilonuz İdeal kilonun altinda olup zayifsiniz ");}


    }
}
