package day03_scanner_dataCasting;

public class C06_ExplicitNarroving {
    public static void main(String[] args) {
        double db1=45.32;
       // int in1=db1;  // int<====double sigmama ihtimali var ;cunku buyuk kova java uyarir ancak degerin basina (Yani db1
        // donusturmek istedigimiz variable 'i () icinde yazarsak sorumlulugu ustumuze almis oluruz ve java bu durumda kabul eder
        // zorlayarak datayi donusturmus oluruz(Explicit Narroving =guc kullanarak daraltma)

        int in1=(int)db1;

        System.out.println(in1);// 45 ondalikli kismi atti
        db1=3987876765d;//d yazmadan java kabul etmedi double oldugundan emin olmak icin sayinin yanina d yaziliyor java kabul ediyor

        in1=(int)db1; // int<====double () içine int yazarak yine de çevir diyoruz.

        System.out.println(in1); //   2147483647


        in1=34;

        byte by1=(byte)in1; // short<====int (byte) Explicit Narroving yapidi (byte -128 ---- 127)


        System.out.println(by1);  //34

in1=130;

        by1=(byte)in1;
        System.out.println(by1); // -126 (cunku 127 den sonra -128 e gider ,130 sayisi 127 yi 3 gectigi icin -128 den geri sayar ve -126 degerini alir
    }
}
