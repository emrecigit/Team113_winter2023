package day08_nestedifElse_ternary;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C11_SwitchStatements {
    public static void main(String[] args) {

        //Kullanicidan bir harf isteyin
        //O harf ile baslayan gun ismi varsa yazdirin
        //yoksa "gecersiz harf" yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");

        char harf= scan.next().charAt(0);
        harf = Character.toUpperCase(harf);//harf karmaşası biter buyuk yada kucuk olsa da buyuk olana bakacagiz
        if (harf == 'P' ) {
            System.out.println("Pazar , Pazartesi ya da Persembe");
        }else if (harf== 'S'){
                System.out.println("Sali");
        }else if (harf== 'C'){
            System.out.println("Carsamba, Cuma ya da Cumartesi");
        }else{
            System.out.println("Gecersiz Harf");
        }
        System.out.println("========================================================");

        // Daha duzenli ve kullanisli yolu mevcut switch keys veya switch Statements kullanabiliriz
        //switch statements , switch'in oununde yazilan degiskene esit olan case'i calistirir
        //calismaya basladiktan sonra break gorunceye kadar veya switch 'in sonuna kadar calisir

        //Switch olustururken dikkat edilecek hususlar;
        //Switch parantezinde long , ,float ,double  ve boolean calismaz
        //Switch Statement te switch parantezine uygun case calisir ve break goruceye veya switch case bitinceye kadar calismaya devam eder
        //Switch parantezine yazilan deger hicbir case ile uyusmazsa default(=else gibi) satiri devreye girer.
        switch (harf){
            case 'S':
                System.out.println("Sali");
                break;
            case 'P':
                System.out.println("Pazar , Pazartesi ya da Persembe");
                break;
            case 'C':
                System.out.println("Carsamba, Cuma ya da Cumartesi");
                break;

            default :
                System.out.println("Gecersiz Harf");
        }
    }
}
