package day03_scanner_dataCasting;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan ismini,soyismini ve yasini alip,asagidaki formatta yazdirin.
        // İsminiz : Joe
        // Soyisminiz : Doe
        // Yasiniz : 44
        // Kaydiniz Basariyla tamamlanmistir.
      Scanner scan=new Scanner(System.in);
       System.out.println("Lütfen isminizi Giriniz");
        String isim=scan.nextLine();
        System.out.println("Lütfen Soyismnizi Giriniz");
        String soyisim=scan.nextLine();
        System.out.println("Lütfen Yaşınızı Giriniz");
        double yas=scan.nextDouble();


      /*  System.out.println("İsminiz : "+isim);
        System.out.println("Soysminiz : "+soyisim);
        System.out.println("Yasiniz : "+yas);
        System.out.println("Kaydiniz bsariyla tamamlanmistir.");*/

     /*   System.out.print("İsminiz : "+isim);
        System.out.print("Soysminiz : "+soyisim);
        System.out.print("Yasiniz : "+yas);
        System.out.print("Kaydiniz bsariyla tamamlanmistir."); */
                  //System.out.println deki ln yazdirma islemini yaptiktan sonra alt satira gecmesini saglar
             //     println yerine print yazarsak
                //  yazdirdigimiz seyler yanyana yazdirilir

        /* tek bir system.out.println ile birden fazla sayida satir yazdirmak isterseniz String bir ifadenin içinde
         (Yani "" içinde string bir ifade olmasada sadece "\n" yazdırarak ) istediğimiz yere \n yazabilirsiniz
         */
                  System.out.println("İsminiz : "+isim+
       "\nSoysminiz : "+soyisim+
       "\nYasiniz : "+yas+
        "\nKaydiniz bsariyla tamamlanmistir.");



// kullanici istedigimiz data turunde bilgi girisi yapmazsa
        // kodumuzda hata olusur ve calisma durur
        // ilerde kullanici hatalrina karsi nasil tedbirler alacagimizi ogrenecegiz
        // SIMDILIK kullanici biz ne diyorsak onu tam yapiyor kabul edelim
    }
}
