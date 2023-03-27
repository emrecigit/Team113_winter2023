package day13_methodOlusturma;

import java.util.Scanner;

public class C04_MethodKullanma {
    public static void main(String[] args) {
        // Kullanicidan iki pozitif tamsayi alip
        // faktoryel degerlerini toplayin

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen faktoryelini bulup toplamini alacagin ilk sayiyi giriniz : ");
        int sayi1= scan.nextInt();
        System.out.print("Lutfen faktoryelini bulup toplamini alacagin ikinci sayiyi giriniz : ");
        int sayi2= scan.nextInt();

        int sonuc = C03_Faktoryel.faktoryelHesapla(sayi1)
                + C03_Faktoryel.faktoryelHesapla(sayi2);

        System.out.println("Girilen iki sayinin faktoryellerinin toplami : "+sonuc);// sonucu verir.
    }
}

