package day10_stringManipulation;

import java.util.Scanner;

public class C04_endsWith {
    public static void main(String[] args) {
        /*
        SORU : kullanicidan bir mail alin
        - mail @ icermiyorsa "gecersiz mail"
        - mail @gmail.com icermiyorsa, "mail gmail olmali"
        - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"
        yazdirin
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen mail adresinizi giriniz");

        String mail= scan.nextLine();
        if (!mail.contains("@")){  //- mail @ icermiyorsa "gecersiz mail"
            System.out.println("Gecersiz mail");
        }else if (!mail.contains("@gmail")){  // - mail @gmail.com icermiyorsa, "mail gmail olmali"
            System.out.println("Mail Gmail Olmali");
        } else if (!mail.endsWith("@gmail.com")) { // - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"
            System.out.println("Mailde yazim hatasi var");
        } else {
            System.out.println("Mail adresi gecerlidir"); // istenmiyordu kendim ekledim.(=Ancak yapilmamali)
        }
        // Eger 3 hatanin da yazilmasini istersek 3 bagimsiz if cumlesi yazmaliyiz if_else kullaniminda sadece bir hata yazdirir.
    }

    }

