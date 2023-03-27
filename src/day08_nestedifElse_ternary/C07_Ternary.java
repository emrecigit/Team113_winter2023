package day08_nestedifElse_ternary;

import java.util.Scanner;

public class C07_Ternary {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Ucgenin sirasiyla a , b , c kenar uzunluklarini giriniz");
        int a= scan.nextInt();
        int b= scan.nextInt();
        int c= scan.nextInt();
        System.out.println(a==b && b==c && a>0 ?"Eskenar Ucgen" : "Eskenar Ucgen Degil");

        String sonuc= a==b && b==c && a>0 ? "Eskenar Ucgen" : "Eskenar Ucgen Degil";
    }
}
