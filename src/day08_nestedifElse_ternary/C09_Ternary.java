package day08_nestedifElse_ternary;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C09_Ternary {
    public static void main(String[] args) {
       //Soru 5- Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sirasiyla iki sayi giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();
        System.out.println(sayi1 > sayi2 ?"Kucuk Olan sayi : "+sayi2 +" dir": "Kucuk olan sayi : "+sayi1+" dir");

    }
}
