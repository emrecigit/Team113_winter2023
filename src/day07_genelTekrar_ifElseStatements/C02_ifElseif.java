package day07_genelTekrar_ifElseStatements;

import java.util.Scanner;

public class C02_ifElseif {
    public static void main(String[] args) {
        //Bagimsiz if cumleleri ile butun sartların olmadigini if_else ile sadece bir sartin olmadigini yazdirabiliriz
        /*
        Bazen karsilastigimiz bir durumda secenek sayisi 2’den fazla olur. Bu durumda bir
     tane if else cumlesi sorunu cozmez.
     Ornek :
     Ogrencinin notu 85 ve ustu ise AA,
     (85 ve ustu degilse) 65 ve ustu ise BB,
     (65 ve ustu de degilse) 50 ve ustu ise CC,
     (geriye kalanlar) DD

     else if ifadesi geriye kalanlardan bu sarti saglayanlar anlamina gelir.
     else ise geriye kalanlarin hepsi anlamina gelir.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Donem Sonu Notunuzu Giriniz :");
        double not = scan.nextDouble();
        if (not>100 || not<0){System.out.println("Notunuzu Yanlis Girdiniz.Lutfen Tekrar Giriniz");}
        else if (not>=85){System.out.println("Tebrikler AA ile Gectiniz");}
        else if (not>=65) {System.out.println("Tebrikler BB ile Gectiniz");}
        else if (not>=50) {System.out.println("CC ile Gectiniz");}
        else{System.out.println("DD -> Malesef Dersten Kaldiniz");}
    }
}
