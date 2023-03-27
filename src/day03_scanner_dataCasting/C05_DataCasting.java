package day03_scanner_dataCasting;

public class C05_DataCasting {
    public static void main(String[] args) {
      /*
      Bazi primitve data turleri baska hicbir data turunden deger kabul etmez
      Bazi primitive data turleri ozel sartlar ile baska turdeki datalari deger olarak kabul eder

       */

        boolean bl=false;
        bl=true;
    //    bl="true";
   //  bl=20  ;
  // bl='a';
        char ch='t';
        ch='%';
        ch=' ';
        ch=99;


        int sayi1=20;
        short sayi2=15;
        double sayi3=24;

        sayi1=sayi2;// int<==== short kucuk kovayi  buyuk kovaya bosaltabilirim
       // sayi1=sayi3; int<====double buyuk kovayi kucuge bosaltamam
       // sayi2=sayi1; short<===int buyuk kovayi kucuge bosaltamam
       // sayi2=sayi3; short<===double buyuk kovayi kucuge bosaltamam
        sayi3=sayi1; //double<====int kucuk kovayi  buyuk kovaya bosaltabilirim
        sayi3=sayi2; // double<=====short kucuk kovayi  buyuk kovaya bosaltabilirim

        //boolean smantiksal_sinama=true veya false
        //char (2 bit) ' tek karakter'
        //byte( 8 bit ) -2^7-2^7-1
        //short (16 bit) -2^15-2^15-1
        //int (32 bit) -2^31-2^31-1
        //long (64 bit) -2^63-2^63-1
        //float (ondalik 32 bit) +- 3.40282347E+38F ondalik basamak sayısı 6-7 basamak
        //double (ondalik 64 bit) +- 1.79769313486231570E+380 ondalik basamak sayısı 15-16 basamak
        // (çok küçük saylara indiği için ondalik kısmın sonunda hatalar olabilir)


        sayi1=ch;
        //sayi2=ch;
        sayi3=ch;






    }
}
