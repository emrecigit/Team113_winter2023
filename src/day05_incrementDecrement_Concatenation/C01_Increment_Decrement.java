package day05_incrementDecrement_Concatenation;

public class C01_Increment_Decrement {
    public static void main(String[] args) {
        int a=20;

        //a'nin degerini 3 arttirin ve yeni degerini olusturacaginiz b variable'ina atayin

       //a=a+3; a+3 yani 23 olur

        a+=3; // a+3 yani yine 23 olur veya  a*=3;// a*3 olyani 60 olur

         /*
         a++; a+1 demek
         a++; tekrar 1 arttı
         a++; tekrar 1 arttı ve a+3 olmus oldu

          */
      int b=a;

        System.out.println("a :"+a+", b :"+b); //a :23 , b :23

                a=20;
        // a'nin degerini b ye atayin , sonra a'nin degerinin 3 arttirin

        b=a;
        a+=3;

        System.out.println("a :"+a+", b :"+b); //a :23 , b :20

        a=20;

        //a'nin degerini yazdirin ve sonr a'yi 5 arttirin

        System.out.println("a :"+a); //20 yazacak java yukardan asagiya calisir.

        a+=5;
        System.out.println("a :"+a); //25 yazacak java yukardan asagiya calisir.


        System.out.println("===============");

        //a nin degerini 2 azaltin ve sonra a'nin degerini yazdirin
        a=20;
        a-=2;
        System.out.println("a :"+a); //18 yazacak

    }
}
