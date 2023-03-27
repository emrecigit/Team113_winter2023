package day08_nestedifElse_ternary;

import java.util.Scanner;

public class C10_NestedTernary {
    public static void main(String[] args) {
        /*
        Ornek : Kullanicidan bir tamsayi alin.
Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin
Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden uygun olani yazdirin

                            sayi %2 == 0 ? "cift sayi" :"cift sayi degil" :     sayi <-100 && sayi>-1000 ? "3 basamakli":"3 basamakli degil"
System.out.println(sayi>0 ? Sayi pozitifse calisacak kod                  :       sayi pozitif degils calisacak kod);

         */



        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        double sayi= scan.nextDouble();

        System.out.println(sayi>0                  ?
                           sayi %2==0              ? "Cift sayi"        :"Cift sayi degil"
                                                                        :
                           sayi<-99 && sayi >-1000 ? "Sayi 3 basamakli" :"Sayi 3 basamaklı degil");

    }
}
