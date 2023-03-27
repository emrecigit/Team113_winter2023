package day08_nestedifElse_ternary;

import java.util.Scanner;

public class C05_Ternary {
    public static void main(String[] args) {

        //kullanicidan bir tamsayi alip mutlak degerine cevirin ve yazdirin
        // Ternary basit ifElse uygulamalarinda kullanilir
        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz");
        double sayi= scan.nextDouble();

        if (sayi>=0){System.out.println(sayi);}
        else{sayi=(-1)*sayi;}
        System.out.println(sayi);

        sayi = sayi>=0 ? sayi : (-1)*sayi;

        System.out.println(sayi);

    }
}
