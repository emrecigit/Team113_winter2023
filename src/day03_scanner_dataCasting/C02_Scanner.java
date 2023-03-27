package day03_scanner_dataCasting;

import java.util.Scanner;

public class C02_Scanner {

    public static void main(String[] args) {
        // Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        // Girilen bilgiler : J Doe, 44
        Scanner scan=new Scanner(System.in);
        // isterseniz tek bir açıklama ile 3 bilgiyi de alabilirsiniz

        System.out.println("Lütfen isminizi,soyisminizi ve yasinizi giriniz"+
                "\nHer bilgiden sonra Enter'a basiniz");
        char isimIlkHarf=scan.nextLine().charAt(0);
        /*
        Scanner method'larında nextChar() yok
        bunun icin once kullanicinin girisine gore next() veya nextline() yazip
        sonra .charArt(0) yazariz
        parantez içindeki 0 almak istediğimiz char'in index'idir.
        ve java'da index 0'dan baslar.(ilk harf 0 ,2.harf için 1 diye sırasıyla ilerler.

         */
        String soyisim=scan.nextLine();
        double yas=scan.nextDouble();
        System.out.println("Girilen bilgiler : "+isimIlkHarf+" "+soyisim+","+" "+yas);
    }
}
