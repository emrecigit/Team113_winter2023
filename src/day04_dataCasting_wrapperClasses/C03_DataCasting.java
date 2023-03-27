package day04_dataCasting_wrapperClasses;

public class C03_DataCasting {
    public static void main(String[] args) {

        int a=20;
                int b=6;

        System.out.println(a/b);// normalde 3.33333 bekleriz ancak java bolunen iki sayi tamsayi ise sonucun

       // da tamsayi kismini verir sonuc 3

        double c=6;
        System.out.println(a/c);  //20/6 =3.3333333333333333335
        // int / double ===> double
        // bolunen sayilarin data turleri farkli ise
        //sonucu daha genis olanin cinsinden verir.

        float d=6f;// float ise yanina kucuk ya da buyuk F yazmak zorundayiz

        System.out.println(a/d); // 20/6=3.3333333 float oldugu icin virgulden sonra 6-7 basamak yazar.

// a/b isleminin sonucunu nasıl ondalikli olarak yazdırabiliriz.
        System.out.println((double)a/b);// (a/b) parantez ici bolme olsaydı o zaman
        //islem onceligi (a/b) ' dedir
        // java oncelikle (a/b) islemini yapar ve sonucu 3 bulur
        // sonra (double) oldugundan 3'u double'a cast eder ve 3.0 bulur
        // bolme ısleminin sonucunun double olması için isleme girenlerden birisi double olmalidir
        // System.out.println((double)a/b); bu da olabilir
        //System.out.println(a/(double)b); bu da olabilir

        int e=1467;
        System.out.println(e=e/10); // sonucun 146 çıkması gerekir

        System.out.println(e); // son e degerini alir ve sonuc yine 146 olur

        e=e/10;
        System.out.println(e); // 14 olarak verir.

        e=e/10;
        System.out.println(e); // 1 olarak verir.

        e=e/10;
        System.out.println(e); // 0 olarak verir.(kusuratı,ondaligi atar)



    }
}
