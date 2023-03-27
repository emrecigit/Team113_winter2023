package day11_stringManipulations_ForLoop;

public class C05_replaceAll {
    public static void main(String[] args) {

        String str = "    J&ava54 C+an01dir,,,     ";
        // str'i Java Candir haline getirin
        str= str.trim();
        str= str.replaceAll("\\d",""); // J&ava C+andir,,,
        str= str.replaceAll(" ","5"); // J&ava5C+andir,,,
        str= str.replaceAll("\\W",""); // Java5Candir
        str= str.replaceAll("5"," "); // Java Candir
        System.out.println(str);
        // replaceAll char karakteri degistirmez
         /*
        Regex (Regular Expressions)
        \\s : space                         \\S : space olmayan hersey
        \\s+ : yanyana birden fazla space
        \\d : digits                        \\D : digit olmayan hersey
        \\w : harf , rakam ve _           \\W : harf rakam ve _ olmayan hersey
         */
    }
}


