package day07_genelTekrar_ifElseStatements;

public class C01_DataCasting {
    public static void main(String[] args) {
        //Java da bazı data turleri baska data turlerine cevrilemez
        // String str1=false; kabul edilmez
        // String str2=20; kabul edilmez
        // boolean bl1='a';kabul edilmez
        // int sayi1="merhaba";kabul edilmez

        //ozellikle sayisal data turundeki degerler,
        //baska sayisal data turundeki variable'lara atanabilir.

        double db1 = 23;
        short sh1 = 12;
        int sayi2 = sh1;

// daha dar data turundeki degeri,daha genis data turundeki variable' atamaya auto widening denir ve java bunu otomatik yapar

        sh1 = (short) sayi2;
        sayi2 = (int) db1;
// daha genis data turundeki degeri,daha dar data turundeki variable' atamaya explicit narroving denir ve java bunu otomatik yapmaz
        // bizden onay ister (=parantez içinde variable tipini yazariz)

        sayi2 = 'k'; // itiraz etmez
        if (sayi2 > 'd') {System.out.println("buyuktur");}// itiraz etmez
        // char data turundeki degerler,sayisal islemlerde kullanilabilir
        // bir char matematiksel islemde kullanilirsa ASCII table'daki degeri ile isleme girer.
        System.out.println('k'+1);// 'l' vermez rakam karsiligi 108 verir
        //bu islemin char olarak degerini yazdirmak istersek;
        //sayisal degerler char'a cast edilebilir
        System.out.println((char)('k'+1)); // 'l' verir

        db1=3987876765d;
        int sayi3=(int)db1;
        System.out.println("sayi3 : "+sayi3);//2147483647 verdi int alacagi en buyuk deger
        short sh2=(short)db1;

        System.out.println("sh2 : "+sh2); //-1 verir -128 ile 127 arasindaki degeleri alir

//WrapperClass ile de primitive data turleri ile non_primiitive data turleri arasındaki gecisleri sagliyordu
// ve hazir method'lari kullanabiliyorduk
        Integer sayi=10;
        String str1="123";
        System.out.println(Integer.parseInt(str1)+10); //133 veya
        System.out.println(Integer.valueOf(str1)+10); //133
        System.out.println(Integer.MIN_VALUE);// -2147483648 (ezberlemeye gerek yok istedigimizde alabiliyoruz)(=hazir method)
        // int variable' a atadigimiz degerleri atayabiliyoruz
        //+ olarak hazir method'lari var)

        String str5="112";
        short sh3=Short.parseShort(str5);
        System.out.println("sh3 un iki kati : "+sh3*2);



    }
}