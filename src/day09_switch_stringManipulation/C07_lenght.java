package day09_switch_stringManipulation;

public class C07_lenght {
    public static void main(String[] args) {
        String str="Java gun gectikce guzellesiyor";// bu cumledeki karakter sayisini yazdirin
        System.out.println(str.length()); //30
        //bu cumledeki son karakteri yazdirin
        System.out.println(str.charAt(29)); //r
        System.out.println(str.charAt(str.length()-1)); //r
        // sondan 3'uncu karakteri yazdirin
        System.out.println(str.charAt(str.length()-3)); //y
    }
}
