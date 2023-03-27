package day04_dataCasting_wrapperClasses;

public class C04_WrapperClass {
    public static void main(String[] args) {
       /*
        // non-primitive data turlerinin hazir methodları varken
        // primitive data turlerinin hazır metholdarı yoktur
        //Java primitive data turleri icin, kolayca gecis yapabilecekleri
        // non-primitive data turleri olusturmustur.

        int ==> Integer
        byte==> Byte
        char==> Character
        boolean==>Boolean
        short==> Short
        long==> Long
        float==>Float
        double==> Double
         */
        Integer sayi=10;
        // int variable' a atadigimiz degerleri atayabiliyoruz
        //+ olarak hazir method'lari var

        //variable olusturmadan da bazi methodları kullanabiliyoruz

        System.out.println(Integer.MIN_VALUE);// -2147483648 (ezberlemeye gerek yok istedigimizde alabiliyoruz)
        System.out.println(Integer.MAX_VALUE);// 2147483647
 String sonucStr="345";
        System.out.println(sonucStr+10); //34510 sonucunu verir metinde yazan sayıya 10 eklemek istiyoruz.

        // int sonuc=(int)sonucStr; olmuyor
        // bu durumda Wrapper class'lar imdada yetisir

        int sonuc=Integer.parseInt(sonucStr); // 345
        System.out.println(sonuc+10);//355

sonuc=Integer.valueOf(sonucStr); //345
        System.out.println(sonuc+10);//355
        // ikiside sonuc verdi ancak bu methodu ancak String içindeki karakterlerin tamamen sayi olması
        //durumunda kullabiliriz "345a" gibi bir ifade olsaydı sonuc alamazdık



        char krk='3';

        System.out.println(Character.isDigit(krk)); // true (sayi mi sorusu ) verir booleana cevirdi
        System.out.println(Character.isLetter(krk));//false (harf mi sorusu ) verir booleana cevirdi



    }


}
