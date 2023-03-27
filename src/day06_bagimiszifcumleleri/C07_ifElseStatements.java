package day06_bagimiszifcumleleri;

import java.util.Scanner;

public class C07_ifElseStatements {
    public static void main(String[] args) {
        //Bagimsiz if cumleleri ile butun sartların olmadigini if_else ile sadece bir sartin olmadigini yazdirabiliriz
        /*
        Soru 4- Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf
olup olmadigini yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");

        char krk=scan.next().charAt(0);
        // r==> A ile Z arasinda mi?
        if ('A'<=krk && krk<='Z'){
            System.out.println("Girilen karakter buyuk harftir");}
        else{System.out.println("Girilen karakter buyuk harf degildir");}

        /*   1                 2  =&&              3     (1 ile 3 yani aralik disi istenirse ||)
        <--------------A---------------------Z---------->
        Sorumuzda aralık istenmekte yani 2.bolge burda && islemi ,
        aralık dışı yani 1 ve 3 bolgeleri istenirse || islemi kullanilir.
         */
    }
}
