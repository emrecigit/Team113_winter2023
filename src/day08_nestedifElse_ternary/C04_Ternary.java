package day08_nestedifElse_ternary;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class C04_Ternary {
    public static void main(String[] args) {
        //kullanicidan pozitif bir tamsayi alin
        // sayi icft ise "sayi cift"
        // degilse "sayi tek" yazdirin.
// Ternary basit ifElse uygulamalarinda kullanilir
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        double sayi= scan.nextDouble();

        if (sayi %2==0){System.out.println("sayi cift");}
        else           {System.out.println("sayi tek");}

        System.out.println(sayi %2==0 ? "sayi cift":"sayi tek");


    }
}
