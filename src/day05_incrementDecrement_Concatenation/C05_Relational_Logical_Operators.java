package day05_incrementDecrement_Concatenation;

public class C05_Relational_Logical_Operators {
    public static void main(String[] args) {
   //Relational ( Karsilastirma) == Esittir veya mi anlamina gelir dogruysa True yanlissa False

   int a=10;
   int b=15;

        System.out.println(a==b);// a b'ye esit olmadigi icin false yazdirir
        System.out.println(a==b-5); // true eşitlik anlamında oldugu için b-5=10 olur ve true yazdirir
        // a'da 10 oldugu icin sonuc True yazdirir
        boolean c;

        System.out.println(c=15==b); // 15 b ye esit mi sonuc true oldugundan c'ye true atanmis olur ve true yazdirir.

        c=15*a==10*b;//10*15(b) ve 15*10(a) 150 ve esit oldugundan c/ye true atanmis olur
        System.out.println(c); // c true oldugundan true yazdirir.

        System.out.println("=============="+"\n=============="+"\n=============="+"\n==============");

        // Relational ( Karsialstirma) != esit degildir veya esit degil mi anlamina gelir
        // Java'da herhangi bir mantiksal degerin basina konulan !,o mantiksal ifadenin degerini tersine cevirir

       /* !true->false
          !(5==5)->false
          5!=5->false
        */

        a=10;
        b=15;

        System.out.println(a!=b); //a b' ye esit degil midir true yazdirir
        System.out.println(a!=b-5); // b-5= 10'dur a esit degidir b ifadesi yanlis olur false yazdirir
        c=c;
        System.out.println(c=15!=b);//15 esit degildir b ifadesi false olup c'ye false atanir ve false yazdirir.
        c= 15*a!=10*b; // 10*b(15) ve 15*10(a) esit ve 150 oldugundan esit degidir ifadesi false olur
        // ve c'ye false atanmis olur
        System.out.println(c); // c false oldugundan false yazdirir.

        System.out.println("=============="+"\n=============="+"\n=============="+"\n==============");

        // < , <= , > , >= ifadeleri de logical ( Mantiksal) Operators


        System.out.println("=============="+"\n=============="+"\n=============="+"\n==============");

        // And (&& , &)(=mükemmelliyetçidir)(İki turlu de yazilabilir kucuk bir ic isleyis ve hız bakimindan nuans farki mevcut ,
        // && bir false gorunce islemi keser hemen false yapar ,& sonuna kadar bakar
        // dolayisiyla && daha hizlidir) Operators

        //&& operatoru birlestirdigi 2 boolean ifadenin ikiside true ise sonucu true yapar
        // ,bunun disindaki butun durumlarda false yapar (&& operatoru mukemmeliyetcidir)

        a=10;
        b=15;

        System.out.println(a>b && b>0);//b>0 true , a>b false ikisi de true olmadigi icin false yazdirir
        System.out.println(a<=b-5 && a>b-8); //b-8=7 , a=10 ve a>b-8 (10>7) oldugundan bu ifade true,
        // b-5=10 ve a(10) <= b-5(10) true oldugundan ve ikisi de true oldugundan true yazdirir.

        c=c;
        System.out.println(c=15>=b && a<0);// a<0 false ,bir ifade false oldugundan and islemi false sonucunu verir
        // ve c'ye false atanmis ve false yazdirir.

        c=a>=b && 3*a<4*b; // 4*b(15)=60 ve 3*a(10)=30 30<60 oldugundan true ,
        // a>=b false oldugundan and islemi false verir ve c ye false atanmis olur
        System.out.println(c);// c false oldugundan false yazdirir.

        System.out.println("=============="+"\n=============="+"\n=============="+"\n==============");

        // or (||) (=veya) Operator (&& - & ifadesinin tersidir iyimser) ve mantiksal or ile ayni kullanilir.

        //Birlestirdigi tum boolean ifadelerin hepsi false ise sonucu false yapar
        // kalan durumlarda true yapar( or || opeartoru iyimserdir)

     a=10;
     b=15;

        System.out.println(a>b || b>0);// b(15)>0 oldugundan true yazdirir.
        System.out.println(a<=b-5 || a>b-8 ); // a(10) <= b-5(10) true oldugundan true yazdirir

        c=c;
        System.out.println(c=15>=b || a<0);//15>= b(15) true oldugundan true yazdirir

        c=a>=b || 3*a<4*b; // 3*a(10)(=30)<4*(15)(=60) true oldugundan c'ye true atanir
        System.out.println(c); // c true oldugundan true yazdirir.


    }


}
