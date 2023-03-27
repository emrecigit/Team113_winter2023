package day09_switch_stringManipulation;

public class C06_charAt {
    public static void main(String[] args) {
        String str="Java Candir";
        System.out.println(str.charAt(0)); // J
        // bastan 6. harfi yazdirin dersek
        System.out.println(str.charAt(5)); // C

        // sondan ikinci harfi yazdirin
        System.out.println(str.charAt(11-2));//i

        // son harfi yazdirin
        System.out.println(str.charAt(11-1));//r

        // peki direk 11.karakteri yazdir dersek
        // System.out.println(str.charAt(11));// hata verir (StringIndexOutOfBoundsException)
        // System.out.println(str.charAt(15));// ayni hatayi verir (StringIndexOutOfBoundsException)

        /*
        Java'da 2 turlu hata ile karsilasabiliriz.
        1-syntax olarak hatali yazilan kodlari Java compile ederken anlar ve altini kirmizi cizer
        String str=23; String bir variable'a int bir deger atanamayacagini bilir ve altini kirmizi cizer.
        CompileTimeError (CTE) diyoruz

        2- Bazen de syntax'de hata olmaz
        Java sorunu calismaya basladiktan sonra farkeder
        str.charAt(15) : burada verilen str'dan bir karakter isteniyor
        compile time'da str'in uzunlugunu Java anlamaz
        ama calisinca 15. index'in olmadigini farkeder ve exception firlatir.
        RunTimeError (RTE) deriz.

         */

    }
}
