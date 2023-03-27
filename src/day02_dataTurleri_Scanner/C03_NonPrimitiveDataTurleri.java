package day02_dataTurleri_Scanner;

public class C03_NonPrimitiveDataTurleri {
    public static void main(String[] args) {
        String isim = "Ali Can";
        String ilkharf="K";
        char ilkharf2='m';
        // tek bir karakter kullanacaksak ikisinde kullanabiliriz.
        System.out.println(ilkharf.toLowerCase());//k

        //primitve data turundeki variable'lar sadece DEĞER taşıyabilir
        //non-primitive data türündeki variable'ların hem değer hem de methodları olur K yı k yazdırmada olduğu gibi
        System.out.println(ilkharf2);
String metin="45t5ytrhfgfnfgnbvbn" +
        "bnnbnvbnvbbv" +
        "nvbnbnbvnbn" +
        "nbvnvbnbnvbn" +
        "vbbbbnb";
        System.out.println(metin);
    String not="not";
    String Not="Variable isimlerin büyük harf ile başlaması tqvsiye edilmez ama java kabul eder";
    String nOT="Bir kere deklare edilen variable tekrar deklare edilmez";
    String noT="ama isimler farklı şekilde yazıldığı için java bunları farklı variable olarak kabul eder";
        System.out.println(not);
        System.out.println(Not);
        System.out.println(nOT);
        System.out.println(noT);

        /*
         camelCase:küçük harfle başlar sonraki kelimeler bitişik yazılır ve ilk harfi büyük olur
        ilkHarf , ogrenciNo , okulDefteriDolabı
         buna naming conventtion (isimlendirme geleneği) denir
        */


    }
}
