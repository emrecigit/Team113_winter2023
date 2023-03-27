package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {
        //1.adım : Scanner objesi oluşturun
        Scanner scan = new Scanner(System.in);//data türü (Scanner) büyük harle başladığı için non-primitive
        // 2.adım : Kullancıya ne istediğinizi soyleyin

        System.out.println("Lütfen isminizi giriniz");
        // 3. adım : girilen bilgiyi içine koyabileceğiniz bir variable oluşturun(=İsim olduğu için String)
        // oluşturduğumuz scanner objesi ile uygun method'u kullanarak bilgiyi alın (=Scanner a verilen obje ismi =scan)
        String kullaniciIsmi = scan.next(); // scan non-primitive olduğu için . ya basabiliriz ve data ile uyumlu methodu seçebiliriz
        System.out.println( " Girilen isim : " + kullaniciIsmi );
    }
}
