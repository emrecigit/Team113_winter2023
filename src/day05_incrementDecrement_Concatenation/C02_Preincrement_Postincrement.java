package day05_incrementDecrement_Concatenation;

public class C02_Preincrement_Postincrement {
    public static void main(String[] args) {

        /*
        Eger sayinin degeri SADECE 1 artacak veya azalacaksa
        arttirip sonra yazdirma / atama
        yazdirip sonra arttirma / atama
         */
        //a'nin degerini 1 arttirin ve yeni degerini olusturacaginiz b variable'ina atayin

       int a=20;

       int b=++a; // önce arttırır sonra atama yapar
/*
       a++;

       int b=a;


 */

        System.out.println("a :"+ a +", b :"+b); //a :21 , b :21

        System.out.println("======================");
        // a'nin degerini b ye atayin , sonra a'nin degerinin 1 arttirin



        a=20;

        b=a++;  //once atama yapar sonra degerini arttırır
/*
        b=a;

        a++;
*/
        System.out.println("a :"+a+", b :"+b); //a :21 , b :20



// Bu islemleri istersek tek satirda yapabiliriz.



        //a'nin degerini yazdirin ve sonr a'yi 1 arttirin

a=20;

        System.out.println("a :"+a); //a : 20 yazdirir

        a++;

        System.out.println("========");
a=20;
        System.out.println("a :"+ a++); //a : 20 yazdirir

        System.out.println("Bir sonraki satirda a :"+a); // Bir sonraki satirda a : 21 yazdirir.


        System.out.println("============");
        //a nin degerini 1 azaltin ve sonra a'nin degerini yazdirin
a=20;
        System.out.println("a'nin azaltilmis degeri :"+ --a); //a : 19
        System.out.println("Bir sonraki satirda a :"+a); // Bir sonraki satirda a : 19 yazdirir.

        System.out.println("=============="+"\n==============");

        int sayi=10;
        System.out.println(sayi++);//10 yazdirir
        System.out.println(sayi);// 11 yazdirir

        System.out.println("=============="+"\n=============="+"\n==============");
        sayi=10;
        System.out.println(++sayi);//11 yazdirir
        System.out.println(sayi);// 11 yazdirir

        System.out.println("=============="+"\n=============="+"\n==============");

        a =10;

        b=a++;

        System.out.println("a : "+a); //a 11 yazdırır
        System.out.println("b : "+b); //b ye önce arttırılmadan a atandigi icin degeri 10 olarak cikar.

        System.out.println("=============="+"\n=============="+"\n==============");

        a=10;
        b=++a;

        System.out.println("a : "+a); //a 11 yazdırır
        System.out.println("b : "+b); //b ye atanmadan once  a arttirilir ve
        // bu sekilde atandigi icin degeri 11 olarak cikar.

        System.out.println("=============="+"\n=============="+"\n=============="+"\n==============");

        a=10; // a : 10

        System.out.println("a'nin degeri : "+ ++a); // once a'yi 1 arttir sonra yaz pre increment a : 11

        b = a++; // once b'ye a'yi ata sonra a'yi 1 arttir b:11 ; a:12 post increment

        System.out.println("b'nin degeri :" +b); // b: 11
        int c= b++ + a; // c ye once b+a 'yi ata sonra b'yi 1 arttir c: 23 , b: 12 ; a:12

        System.out.println("Son Toplam :"+(a+b+c)); // Son Toplam : 47


    }
}
