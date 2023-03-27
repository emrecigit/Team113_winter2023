package day07_genelTekrar_ifElseStatements;

import java.util.Scanner;

public class C05_ifElseIf {
    public static void main(String[] args) {
        // Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        //yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        //olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen Yasinizi Giriniz");
        double yas=scan.nextDouble();
        System.out.println("lutfen Cinsiyetinizi Giriniz..."+
                "\nKadin icin : K , Erkek icin : E Giriniz");
     char cinsiyet = scan.next().charAt(0);

        if ((cinsiyet =='K' && yas>=60) || (cinsiyet =='E' && yas>=65 )){System.out.println("Emekli olabilirsin");}
        else if (cinsiyet =='K' ){System.out.println("Emekli olmak icin "+(60-yas)+" yil daha calisman gerekir");}
        else if (cinsiyet =='E' ){System.out.println("Emekli olmak icin "+(65-yas)+" yil daha calisman gerekir");}
    }
}