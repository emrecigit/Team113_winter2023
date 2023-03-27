package day07_genelTekrar_ifElseStatements;

import java.util.Scanner;

public class C07_ifElseIf_Ornek_Sorular {
    public static void main(String[] args) {
           /*  Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
      kullaniciya musteri karti olup olmadigini sorun.
      Musteri karti varsa
      10 urunden fazla alirsa %20,
      yoksa %15 indirim yapin,
      Musteri karti yoksa 10 urunden fazla alirsa %15,
      yoksa %10 indirim yapin */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen aldiginiz urun adetini giriniz");
        int adet = scan.nextInt();
        System.out.println("Lutfen aldiginiz urun liste fiyatini giriniz");
        double fiyat = scan.nextDouble();
        System.out.println("Lutfen musteri karti varsa : E yoksa : H giriniz");
        char kart = scan.next().charAt(0);
        if (kart=='E' && adet>=10 ){System.out.println("Liste Fiyatiniz : "+fiyat+" TL olup"+
                "\nMusteri kartiniz oldugu ayrica Toplam 10 veya 10 urunden fazla urun aldiginiz icin %20 indirim kazandiniz"+
                "\n Kazandiginiz indirim tutariniz :"+(fiyat*0.2)+" TL olup"+
                "\nİndirimli tutariniz ise : "+(fiyat-(fiyat*0.2))+" TL dir");}
        else if (kart=='E'){System.out.println("Liste Fiyatiniz : "+fiyat+" TL olup"+
                "\nMusteri kartiniz oldugu  icin %15 indirim kazandiniz"+
                "\nKazandiginiz indirim tutariniz :"+(fiyat*0.15)+" TL olup"+
                "\nİndirimli tutariniz ise : "+(fiyat-(fiyat*0.15))+" TL dir");}
        else if (kart=='H' && adet>=10 ){System.out.println("Liste Fiyatiniz : "+fiyat+" TL olup"+
                "\nMusteri kartiniz olmadigi ancak 10 veya 10 urunden fazla urun aldiginiz icin %15 indirim kazandiniz"+
                "\nKazandiginiz indirim tutariniz :"+(fiyat*0.15)+" TL olup"+
                "\nİndirimli tutariniz ise : "+(fiyat-(fiyat*0.15))+" TL dir");}

        else {System.out.println("Liste Fiyatiniz : "+fiyat+" TL olup"+
                "\nMusteri kartiniz olmadigi ve 10 urunden az urun aldiginiz icin sadece %10 indirim kazandiniz"+
                "\nKazandiginiz indirim tutariniz :"+(fiyat*0.10)+" TL olup"+
                "\nİndirimli tutariniz ise : "+(fiyat-(fiyat*0.10))+" TL dir");}

        System.out.println("======================================");
        System.out.println("======================================");
        System.out.println("======================================");

       /* Soru 4- Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi sorun,
       istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
        “istediginiz birim sisteme kayitli degil” yazdirin.*/


        System.out.println("Lutfen mesafeyi kilometre olarak giriniz");

        double msf = scan.nextDouble();

        System.out.println("Lutfen cevirmek istediginiz birimi metre (=m) veya santimetre (=cm) olarak yazınız");
        char  brm= scan.next().charAt(0);
        brm=Character.toLowerCase(brm);

        if (brm=='m'){System.out.println("Girdiginiz mesafenin Metre cinsinden degeri : "+(msf*1000)+" m'dir");}
       else if (brm=='c'){System.out.println("Girdiginiz mesafenin Santimetre cinsinden degeri : "+(msf*100000)+" cm'dir");}
       else {System.out.println("İstediginiz birim sisteme kayitli degil");}





    }
}
