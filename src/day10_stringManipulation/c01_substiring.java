package day10_stringManipulation;

public class c01_substiring {
    public static void main(String[] args) {

        // substring 2 farkli sekilde kullanilabilir
        //1- tek parametre olursa , o index ten baslar sonuna kadar yazdirir

        String str="Java ne kadar guzel";
        System.out.println(str.substring(8)); //kadar guzel
        System.out.println(str.substring(0)); // Java ne kadar guzel
        System.out.println(str.substring(str.length() - 3)); // zel
        System.out.println(str.substring(str.length())); // hiclik
        // System.out.println(str.charAt(str.length())); str'in uzunlugu 19,
        // son harfin index'i 18 ve 19.index de karakter yok dolayısıyla charAt() hata veriyor.

        //2-iki parametre girilirse baslangic Index inden (dahil) baslar bitis Index ine kadar(haric) kadar olan bolumu yazdirir

        System.out.println(str.substring(5, 7)); // ne
        System.out.println(str.substring(3, 4)); // a
        System.out.println(str.substring(0, 1)); // j

        // str in 5. index deki karakterini yazdirin.

        System.out.println(str.charAt(5)); //n
        System.out.println(str.substring(5, 6)); //n

        System.out.println(str.substring(2, 2)); // hiclik
       // System.out.println(str.substring(5, 1)); // Run Time Error  ( RTE )hata verir
    }
}
