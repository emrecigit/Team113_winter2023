package day02_dataTurleri_Scanner;

public class C02_DataTurleri {
    public static void main(String[] args) {
        char ilkharf= 'g' ;
        System.out.println(ilkharf);// tek karakter space dahil yapılabilir

        byte ogryasi1=15; // en doğru kullanım bu olur, hafıza biçimini optimize etmek için bu yeterlidir
        //boolean smantiksal_sinama=true veya false
        //char (2 bit) ' tek karakter'
        //byte( 8 bit ) -2^7-2^7-1 (-128 ile 127 arasinda)
        //short (16 bit) -2^15-2^15-1 (-32768 ile 32767 arasinda)
        //int (32 bit) -2^31-2^31-1 (-2.147.483.648 ile -2.147.483.648 arasinda)
        //long (64 bit) -2^63-2^63-1 (-9.223.372.036.854.755.808 ile 9.223.372.036.854.755.807 arasinda)
        //float (ondalik 32 bit) +- 3.40282347E+38F ondalik basamak sayısı 6-7 basamak
        //double (ondalik 64 bit) +- 1.79769313486231570E+380 ondalik basamak sayısı 15-16 basamak
        // (çok küçük saylara indiği için ondalik kısmın sonunda hatalar olabilir)


                short ogryasi2=16;
                int ogryasi3=14;
                long ogryasi4=14;

        System.out.println(ogryasi4);
double sayi1=3.123456789;
        System.out.println(sayi1);
float sayi2=45.2345556666666666666F;//float sayi tanımladığımızda double'dan farklı olduğunu belirtmek için
        //sonuna f veya F yazmak zorundayız
        System.out.println(sayi2);


        //biz dersler boyunca hafıza önemli olmadığı için tam sayılar için int;
        //ondalıklı sayılar için double kullanacağız
    }

}
