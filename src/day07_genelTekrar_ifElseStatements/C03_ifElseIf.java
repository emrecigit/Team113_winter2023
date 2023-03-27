package day07_genelTekrar_ifElseStatements;

import java.util.Scanner;

public class C03_ifElseIf {
    public static void main(String[] args) {
        // kullanicidan pozitif bir tamsayi alin
        // sayi 3 ile bolunebiliyorsa "3'un kati"
        // sayi 5 ile bolunebiliyorsa "5'in kati"
        // sayi hem 3 hem de 5 ile bolunebiliyorsa "3 ve 5'in kati"
        // ikisine de bolunemiyorsa "ne 3'un ne de 5'in kati" yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen pozitif bir tamsayi giriniz");
        int sayi= scan.nextInt();
        if (sayi %3==0 && sayi %5==0){System.out.println("3 ve 5'in kati");}
        else if (sayi %3==0){System.out.println("3'un kati");}
        else if (sayi %5==0){System.out.println("5'un kati");}
        else{System.out.println("ne 3'un ne de 5'in kati");}
        // daha fazla sarti olan en yukari yazilmalı cunku java yukardan asagi(bastan sona) calisir
        // eger 3 e bolunebilen uste konsaydi 15 yazdigimizda "3'un kati " mesaji alıp duracakti.
    }
}
