package day10_stringManipulation;

import java.util.Scanner;

public class C05_IndexOf {
    public static void main(String[] args) {
        String str="Java cok ama cok guzel";

        System.out.println(str.indexOf("c")); // 5
        System.out.println(str.indexOf("a")); // 1 birden fazla ise ilk buldugunu verir
        System.out.println(str.indexOf("cok")); // 5
        System.out.println(str.indexOf("cok", 6)); // 13
        System.out.println(str.indexOf("cok", 5)); // 5
        System.out.println(str.indexOf("java"));  // -1 aranan String olmadiginda hep -1 doner
        System.out.println("===============");
        System.out.println("===============");
        // verilen bir cumlede istenen bir String icin
        // asagidaki cumlelerden uygun olani yazdirin
        //1- aradiginiz kelime cumlede 1 kere kullanilmis
        //2- aradiginiz kelime cumlede 2 kere kullanilmis
        //3- aradiginiz kelime cumlede 2'den fazla kullanilmis
        //4- aradiginiz kelime cumlede hic kullanilmamis

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen kelime aratmak istediginiz cumleyi yaziniz");
        String cumle = scan.nextLine();
        System.out.println("Lutfen cumlede aratmak istediginiz kelimeyi yaziniz");
        String kelime = scan.nextLine();

       // String cumle= "Yasasin java, iyi ki java ogreniyorum";
       // String kelime= "java";


          if (cumle.indexOf(kelime) == (-1)){  //4- aradiginiz kelime cumlede hic kullanilmamis
            System.out.println("aradiginiz kelime cumlede hic kullanilmamis");
          } else { // kwsinlikle kelime cumlede var ama kac tane var bilmiyoruz.?
                int IlkkelimeIndex= cumle.indexOf(kelime); // 8
                if (cumle.indexOf(kelime,(IlkkelimeIndex+1))==(-1)){  //(IlkKelimeIndex+1)=9 demek /1- aradiginiz kelime cumlede 1 kere kullanilmis
                System.out.println("aradiginiz kelime cumlede 1 kere kullanilmis");
                }else {
                      int ikinciKelimeIndex=cumle.indexOf(kelime,(IlkkelimeIndex+1)); //18
                      if (cumle.indexOf(kelime,(ikinciKelimeIndex+1))==(-1)){  // / 2- aradiginiz kelime cumlede 2 kere kullanilmis
                      System.out.println("aradiginiz kelime cumlede 2 kere kullanilmis");
                      }else{
                     System.out.println("aradiginiz kelime cumlede 2'den fazla kullanilmis");  //3- aradiginiz kelime cumlede 2'den fazla kullanilmis
                           }
                     }

                }

    }
}