package day05_incrementDecrement_Concatenation;

public class C03_Concetenation {
    public static void main(String[] args) {

        // Bir string baska bir String veya baska data turunden bir variable ile
        //+ isareti ile birlestirilebilir.

        String a="Java";
        String b="Guzeldir";

        System.out.println(a+" "+b);

        int c= 10;
        int d=20;

        System.out.println(a+c+d);// sonuc Java1020

        // Eger Stirng ile baska data turundeki deger toplanirsa Java sonucu String yapar
        // (islem onceligi once sol taraf)

        System.out.println(a+(c+d));// sonuc Java30

        System.out.println(a+c*d);// sonuc Java200

        System.out.println(d+c+a);// sonuc 30Java

        // String ile sadece + isleme izin verilir (* - veya / olmaz hata verir)







    }
}
