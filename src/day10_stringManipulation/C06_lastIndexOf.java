package day10_stringManipulation;

import java.util.Scanner;

public class C06_lastIndexOf {
    public static void main(String[] args) {
        String str ="Java bazen beyin yakar";
        System.out.println(str.indexOf("a"));  //1
        System.out.println(str.lastIndexOf("a")); //20 / Aranan degeri sondan aramaya baslar ve index'ini dondurur.
        System.out.println(str.indexOf("a",2)); //3
        System.out.println(str.lastIndexOf("a",19)); //18
        System.out.println(str.indexOf("a", 4)); //6
        System.out.println(str.lastIndexOf("a", 17)); //6

        System.out.println(str.indexOf('e')); // 8
        System.out.println(str.lastIndexOf('e')); //12
        System.out.println(str.lastIndexOf("Mustafa")); //-1
        System.out.println(str.indexOf("")); //0 donduruyor.


        System.out.println("---------------------------");
        System.out.println("---------------------------");

// Verilen bir cumlede, istenen bir String icin
        // asagidaki cumlelerden uygun olani yazdirin
        // 1- aradiginiz kelime cumlede 1 kere kullanilmis
        // 2- aradiginiz kelime cumlede 1'den fazla kullanilmis
        // 3- aradiginiz kelime cumlede hic kullanilmamis

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen aratmak istediginiz kelime icin bir cumle yaziniz");
        String cumle = scan.nextLine();
        System.out.println("Lutfen aratmak istediginiz kelimeyi giriniz");
        String kelime =scan.next();
        // String cumle= "Yasasin java, iyi ki java ogreniyorum";
        // String kelime= "Yasasin";

        int ilkIndex= cumle.indexOf(kelime);
        int lastIndex= cumle.lastIndexOf(kelime);

        if (ilkIndex == (-1)){
            System.out.println("Aradiginiz kelime cumlede hic kullanilmamis");
        } else if (ilkIndex == lastIndex) {
            System.out.println("Aradiginiz kelime cumlede 1 kere kullanilmis");
        }else{
            System.out.println("Aradiginiz kelime cumlede 1'den fazla kullanilmis");
        }
    }
}