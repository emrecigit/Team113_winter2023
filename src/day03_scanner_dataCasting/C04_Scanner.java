package day03_scanner_dataCasting;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //Soru 7 - (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).//
// kullanici sayi1=10 , sayi2=20 degeri girdiginde
        // sayi1'in yeni degeri 20 , sayi2'nin yeni degeri 10 olmali
        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen sayi1'i Giriniz (Tamsayi)");
        int sayi1=scan.nextInt();


        System.out.println("Lutfen sayi2'i Giriniz(Tamsayi)");

        int sayi2=scan.nextInt();

       /* System.out.println("Sayi1 Yeni Degeri : "+sayi2+
                "\nSayi2 Yeni Degeri : "+sayi1); (Bu da dogru çalıştı ancak doğrusu bu şekilde olmaz
                cunku sayi2=sayi1 dediğimizde (Ornegin sayi1=10 sayi2=20 girilmis olsun) ,
                Java once esitligin sag tarafini alir ve sayi1 =10 oldugundan sayi2=10 olarak degismis olur
                ancak sayi2 degeri 10 a dondugunden dolayi sayi1 in degerini 20 olarak degistiremeyiz
                bunun icin su dolu ,kum dolu ve bos(=temp) kovası orneginden hareketle cozume gidecegiz
                once temp degerini olusturacagiz

        */
int temp=0;
        // sonrasinda temp kutusunu sırasiyla doldurup diger kutuların swap islemini gerceklestirmis olacagiz

        temp=sayi2;
                sayi2=sayi1;
                        sayi1=temp;
        System.out.println("sayi1 yeni degeri : "+sayi1+
                "\nsayi2 yeni degeri : "+sayi2
        );

    }
}
