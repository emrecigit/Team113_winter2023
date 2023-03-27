package day04_dataCasting_wrapperClasses;

import java.util.Scanner;

public class C05_SayininRakamlarToplaminiBulma {
    public static void main(String[] args) {


//Java da modulus islemi bize bir bolme islemindeki kalan sayiyi verir.
        /*
        Cift sayilar (sayi %2)
        Bir sayinin birler basamagibi bulma ( sayi %10)
        Bir sayi (ornegin 5 sayisi) ile tam bolunebilen sayilari bulma ( sayi %5)
        mumkun olmaktadir.

         */
        //Kullaniciden 3 basamakli bir sayi alin
        //ve sayinin rakamlar toplamini yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen 3 basamakli pozitif bir tamsayi giriniz :");

        int girilenSayi= scan.nextInt(); //135

        int rakam=girilenSayi % 10; //135/10==>5
        int rakamlarToplami=rakam; //5
        //==================(Rakamlar toplamına birler basamagindaki 5 i aldık

        girilenSayi=girilenSayi/10; //135/10==>13
        rakam=girilenSayi%10; //13/10==>3
        rakamlarToplami=rakamlarToplami+rakam; // 8

        //================(Rakamlar toplamina birler basamagindaki 3 u aldik

        girilenSayi=girilenSayi/10;//13/10==>1
        rakam=girilenSayi%10;//1/10==> 1 (kalan sayi 1)
        rakamlarToplami=rakamlarToplami+rakam; // 9


        System.out.println("Grilen sayinin rakamlar toplami : "+rakamlarToplami);





    }
}
