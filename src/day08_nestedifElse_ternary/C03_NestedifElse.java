package day08_nestedifElse_ternary;

import java.util.Scanner;

public class C03_NestedifElse {
    public static void main(String[] args) {

        // Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        //yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        //olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
        // hatali giris yapilirsa kullaniciyi uyaralim

        /*
        Birden fazla degiskene bagli if else statement'larini yazarken once degıskenlerden
        birine gore ana yapiyi olusturalim
        bu defa ana degısken yas olsun
        İkinci degiskeni ana degiskenin her bolumunde ayri ayri degerlendirelim

        16 oncesi ve 80 yas sonrasini once eleyelim

               ( 4  )       (  1 )    ( 2 )     (   3  )         ( 4)
        <--------------16---------60-------65-----------80------------------->
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen Yasinizi Giriniz");
        double yas = scan.nextDouble();
        System.out.println("lutfen Cinsiyetinizi Giriniz..." +
                "\nKadin icin : K , Erkek icin : E Giriniz");
        char cinsiyet = scan.next().charAt(0);

       if (yas<16 || yas>80){System.out.println("Gecersiz yas girisi Lutfen tekrar deneyin");}//(4)

        else if (yas<60){//(1) 16-60 yas arasi
            if (cinsiyet=='K' || cinsiyet=='k'){System.out.println("Emekli olmak icin "+(60-yas)+" daha calismalisin");}
            else if (cinsiyet=='E' || cinsiyet=='e'){System.out.println("Emekli olmak icin "+(65-yas)+" daha calismalisin");}
            else{System.out.println("Gecersiz cinsiyet girisi");}
                        }


        else if (yas<65){ //(2) 60-65 yas arasi
           if (cinsiyet=='K' || cinsiyet=='k'){System.out.println("Emekli olabilirsin");}
           else if (cinsiyet=='E' || cinsiyet=='e'){System.out.println("Emekli olmak icin "+(65-yas)+" daha calismalisin");}
           else{System.out.println("Gecersiz cinsiyet girisi");}
                        }


        else            { //(3) 65-80 yas arasi
           if (cinsiyet=='E' || cinsiyet=='e'  || cinsiyet=='K'  || cinsiyet=='k'){System.out.println("Emekli olabilirsin");}
           else{System.out.println("Gecersiz cinsiyet girisi");}
                        }



    }
}
