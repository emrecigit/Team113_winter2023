package day09_switch_stringManipulation;

import java.util.Scanner;

public class C02_Switch {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan ay numarasini alip mevsimi yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen mevsimini yazdirmak istediginiz ayın numarasini giriniz");
        int ayNo= scan.nextInt();

        switch (ayNo){
            case 1:
            case 2:
            case 12:
                System.out.println("Kıs");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Ilkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar");
                break;

            default:
                System.out.println("Gecersiz giris tekrar deneyin");
        }
        System.out.println("==================================================");
        System.out.println("==================================================");
        System.out.println("==================================================");

        //Soru 2- Kullanicidan 2 basamakli bir sayi alip, girilen sayiyi yazi ile yazdirin


        System.out.println("Lutfen 2 basamakli pozitif bir tamsayi giriniz");
        int girilensayi= scan.nextInt();// ornek 90 olsun

        int bb= girilensayi %10; // birler basamagi ornege göre 0
        int ob= girilensayi-bb; // kalan sayi ornege ore 90
        System.out.print("Girmis oldugunuz sayi : "+girilensayi+" olup "+"yazilisi : ");
        switch(ob){
            case 90:
                System.out.print("doksan");
                break;
            case 80:
                System.out.print("seksen");
                break;
            case 70:
                System.out.print("yetmis");
                break;
            case 60:
                System.out.println("altmis");
                break;
            case 50:
                System.out.print("elli");
                break;
            case 40:
                System.out.print("kirk");
                break;
            case 30:
                System.out.print("otuz");
                break;
            case 20:
                System.out.print("yirmi");
                break;
            case 10:
                System.out.print("on");
                break;
        }
        switch (bb){
                case 0:
                System.out.print("");
                break;
            case 1:
                System.out.print("bir");
                break;
            case 2:
                System.out.print("iki");
                break;
            case 3:
                System.out.print("uc");
                break;
            case 4:
                System.out.print("dort");
                break;
            case 5:
                System.out.print("bes");
                break;
            case 6:
                System.out.print("alti");
                break;
            case 7:
                System.out.print("yedi");
                break;
            case 8:
                System.out.print("sekiz");
                break;
            case 9:
                System.out.print("dokuz");
                break;}
        System.out.print(" ' dir");


    }
}
