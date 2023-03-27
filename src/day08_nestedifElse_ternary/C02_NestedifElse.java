package day08_nestedifElse_ternary;

import java.util.Scanner;

public class C02_NestedifElse {
    public static void main(String[] args) {
        // Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        //yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        //olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
        // hatali giris yapilirsa kullaniciyi uyaralim
        /*
        Birden fazla degiskene bagli if else statement'larini yazarken once degıskenlerden
        birine gore ana yapiyi olusturalim
        bu soruda cinsiyeti ana degisken yapalim
        İkinci degiskeni ana degiskenin her bolumunde ayri ayri degerlendirelim

        (1),(2),(3) Outer ifElse olarak adlandirilir ,kendi iclerinde baglantilidir (if ile baslar ,
        else if ile devam eder , else ile biter)

        Kadin icin olusturulan (a1),(a2) ve (a3) inner ifElse olarak adlandirilir ;
        kendi iclerinde baglantilidir (if ile baslar ,else if ile devam eder , else ile biter)

        Erkek icin olusturulan (b1),(b2) ve (b3) yine inner ifElse olarak adlandirilir ;
        kendi iclerinde baglantilidir (if ile baslar ,else if ile devam eder , else ile biter)

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen Yasinizi Giriniz");
        double yas = scan.nextDouble();
        System.out.println("lutfen Cinsiyetinizi Giriniz..." +
                "\nKadin icin : K , Erkek icin : E Giriniz");
        char cinsiyet = scan.next().charAt(0);

        if (cinsiyet == 'k' || cinsiyet == 'K') {// kadin (1)
            if (yas < 16 || yas > 80) {System.out.println("Gecersiz yas girisi Lutfen tekrar deneyin");} //(a1)
            else if (yas < 60) {System.out.println("Emekli olmak icin daha " + (60 - yas) + " yil daha calismalisin");}//(a2)
            else {System.out.println("Emekli olabilirsin");}//(a3)
        }


        else if (cinsiyet == 'e' || cinsiyet == 'E') {// erkek (2)
            if (yas < 16 || yas > 80) {System.out.println("Gecersiz yas girisi Lutfen tekrar deneyin");}//(b1)
            else if (yas < 65) {System.out.println("Emekli olmak icin daha " + (65 - yas) + " yil daha calismalisin");}//(b2)
            else {System.out.println("Emekli olabilirsin");}//(b3)
        }


        else {System.out.println("Gecersiz cinsiyet girisi Lutfen yeniden deneyin");}// (3)


    }
}
