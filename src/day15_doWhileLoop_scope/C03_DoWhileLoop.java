package day15_doWhileLoop_scope;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        /*
               While loop'da bitis sarti kontrolu her zaman body'den bir fazla calisir
               while loop'da kullanicidan alacagimiz degerlere once bizim deger atamamiz gerekir
               bu da bazan hatalara sebep olur
         */
        //while loop ta body calışma sayisindan 1 fazla kontrol olur
        // do while loop ta ise önce calisir kontrolu sonra yapar body calistigi sayida islem yaoar
        //do while loop 'un dezanvati ise while satri sağlanmasa da birkez mutlaka calisir.

        int sayi = -10;
        int toplam = 0;

        while (sayi>0){

            toplam += sayi*sayi;
            sayi--;
        }

        System.out.println("while toplam : " + toplam);

        sayi= -10;
        toplam = 0;

        do {
            toplam += sayi*sayi;
            sayi--;

        }while(sayi>0);

        System.out.println("do while toplam : " + toplam);
    }
}