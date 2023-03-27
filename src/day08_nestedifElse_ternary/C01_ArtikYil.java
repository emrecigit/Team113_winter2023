package day08_nestedifElse_ternary;

import java.util.Scanner;

public class C01_ArtikYil {
    public static void main(String[] args) {

           /*  Soru ) Interview Question
    Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin.
Kural 1: 4 ile bolunemeyen yillar artik yil degildir
Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
Kural 3: 4’un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400’un kati olan yillar artik yildir
https://app.diagrams.net/  */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sorgulamak istediginiz yılı giriniz");

        int yil= scan.nextInt();

        if (yil %4!=0){System.out.println("Girmis oldugunuz yil olan "+yil+" yili artik yil degildir");}
        else if (yil %100!=0){System.out.println("Girmis oldugunuz yil olan "+yil+" yili artik yildir");}
        else if ( yil%400==0){System.out.println("Girmis oldugunuz yil olan "+yil+" yili artik yildir");}
        else {System.out.println("Girmis oldugunuz yil olan "+yil+" yili artik yil degildir");}
    }
}
