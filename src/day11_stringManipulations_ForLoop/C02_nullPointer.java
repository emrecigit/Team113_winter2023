package day11_stringManipulations_ForLoop;

public class C02_nullPointer {
    public static void main(String[] args) {
        // null bir deger degildir
        // bull bir pointer'dir.
        //yanina yazildigi non-primitive variable'a deger atanmadigini isaret eder.


        String str; // str olusturuldu ama deger atanmadi

        // Java method icersinde deger atamadan variable oluturmasina izin verir
        // ama deger atamadan kullanilmasina izin vermez.
        // System.out.println(str); CTE (Compile time error)
        // str.concat("Java") ; CTE

        // Bazen variable'lar olusturulur ama
        //daha sonra deger atanacagi icin deger atamasi yapilmaz
        //deger atamasi yapilmadan listeleme bile CTE verdigi icin
        //deger verilmedigini isaretleyecek ama CTE olusmasini engelleyecek
        // bir cozum olarak null pointer olusturulmustur.

         str=null;  // str="null" degil
                    // null olarak isaretlenmis, ancak degeri null degil
        System.out.println(str); //null

        // System.out.println(str.concat("Java")); // RTE (Run Time Error)---- NullPointerException
        // System.out.println(str.length()); // RTE (Run Time Error)---- NullPointerException
        System.out.println((str + "Java")); // nullJava
        String str2=str+"Java";
        System.out.println("str2 :"+str2); // str2 : nullJava

        // int sayi = null; // primitive variable'lara null degeri olmaz
        Integer sayi = null;

        // biz genelde String bie ifade olusturup,sonra deger atayacaksak
        // hiclik degeri atariz

        String str3=""; // str3 e deger atanmistir (=atanan deger hicliktir)
        System.out.println(str3.concat("Java")); // Java
       //  System.out.println(str.isEmpty()); // NullPointerException

        // null pointer ile isaretlenen bir String sadece yazdirilabilir veya + ile kullanilabilir
        // ancak HICBIR MRTHOD ile kullanilamaz
        System.out.println(str3.isEmpty()); // true


    }
}
