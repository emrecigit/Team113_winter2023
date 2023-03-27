package day11_stringManipulations_ForLoop;

import java.util.Locale;

public class C00_RepeatTrim {
    public static void main(String[] args) {
        String str = "Java Candir.";
        System.out.println(str.repeat(4)); // 4 kere yazdirir

        String str2 = "   Java Candir.   ";
        System.out.println(str2.trim()); // varsa basta ve sondaki space leri kaldirir
    }
}
