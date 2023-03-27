package day14_methodOverloading_whileLoop;

import java.util.Scanner;

public class C02_isAsal {
    public static void main(String[] args) {
        // Verilen 1'den buyuk bir tamsayi icin
        // sayi asal ise true
        // sayi asal degil ise false dönen bir method olusturun

      // System.out.println(isAsal(20)); // false
      // System.out.println(isAsal(43)); // true

        boolean sonuc = isAsal(57); // sonuc variable'ina false degeri atar
        Scanner scan = new Scanner(System.in);
        System.out.println("Asal Sayi Icin Kontrol Etmek Istediginiz Sayiyi Giriniz : ");
        int sayi= scan.nextInt();
        System.out.println("Girmis Oldugunuz Sayi Olan : "+sayi+" Sayisinin"+" Asal Sayi Olma Durumu : "+"\""+isAsal(sayi)+"\"");
    }


    public static boolean isAsal(int sayi){

        int flag=0;

        for (int i = 2; i <sayi ; i++) {

            if(sayi % i == 0){
                flag++;
                break;
            }
        }

        if (sayi == 2){
            return true;
        }else if (flag==0){
            return true;
        }else {
            return false;

        }
    }
}
