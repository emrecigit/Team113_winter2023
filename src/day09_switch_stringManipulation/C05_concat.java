package day09_switch_stringManipulation;

public class C05_concat {
    public static void main(String[] args) {
        String str1="Java";
        String str2="Candir";
        String str3=" ";
        //yukaridaki variable lari kullanarak "Java Candir" yazdirin.
        System.out.println(str1+str3+str2); //method la yapmak istersek Concatenation
        System.out.println(str1.concat(str3).concat(str2));

    }
}
