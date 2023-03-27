package day13_methodOlusturma;

import java.util.Scanner;

public class C02_IkiSayiToplamaMethodu {
    public static void main(String[] args) {


        // kullanicidan 2 sayi alip
        // toplamlari yazdiran bir method olusturun


        ikiSayiTopla(); // kac kere cagrilirsa  okadar calisir method lar cagrilmadan calismaz
                        // class in icinde ve main method un disinda olmali
        ikiSayiTopla(); // kac kere yazildiysa islemi o kadar yapar
    }


    public static void ikiSayiTopla(){  // void sadece bir işlem yapacak veya yazdiracaksa
        Scanner scan = new Scanner(System.in);
        System.out.println("Toplamak uzere 2 sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        System.out.println("Iki sayinin toplami : " + (sayi1+sayi2));
    }
}