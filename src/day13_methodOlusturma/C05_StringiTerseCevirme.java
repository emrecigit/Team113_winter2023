package day13_methodOlusturma;

import java.util.Scanner;

public class C05_StringiTerseCevirme {
    public static void main(String[] args) {
        // Verilen bir String'i tersine cevirip
        // bize donduren bir method olusturun

      // System.out.println(stringTersineCevir("Java Candir")); // ridnaC avaJ
      // System.out.println(stringTersineCevir("Anlasildi mi?")); // ?im idlisalnA
      // System.out.println(stringTersineCevir("Soyle Omer")); // remO elyoS
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen terse cevrilecek metni giriniz : ");
        String metin = scan.nextLine();
        System.out.print("Girmis oldugunuz metin : "+"\""+metin+"\""+" olup , "+"\nGirilen metnin tersi : "+stringTersineCevir(metin));
    }


    public static String stringTersineCevir(String metin){ // Java

        String tersMetin=""; // avaJ

        for (int i = metin.length()-1 ; i >=0 ; i--) {

            tersMetin += metin.charAt(i);
        }

        return tersMetin;
    }
}