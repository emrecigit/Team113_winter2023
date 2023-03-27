package day05_incrementDecrement_Concatenation;

public class C04_StringıntGecisler {
    public static void main(String[] args) {

        String s1="423";

       // s1'i int'a cevirmek isterse (parseInt veya Value of

        int sayi=Integer.parseInt(s1); //423 sayiya cevirir

        System.out.println(sayi); //423 yazdirir

        sayi=Integer.valueOf(s1);//423 sayiya cevirir

        System.out.println(sayi); //423 yazdirir
        System.out.println(sayi++); //423 yazdirir sonra sayi'yi 1 arttirip 424 yapar.

int a=20;
int b=40;

// bu iki sayiyi  kullanarak 2040 yazdirin.


        System.out.println(""+a+b);//2040 "" ile String ifade ekleyip hepsini String e cevirdik (Hiclik)

        System.out.println(a+""+b);//2040

        System.out.println(a+b+"");//60 sonucunu verir

    }







}
