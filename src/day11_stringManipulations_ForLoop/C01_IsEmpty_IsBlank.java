package day11_stringManipulations_ForLoop;

public class C01_IsEmpty_IsBlank {
    public static void main(String[] args) {
        String str="Java candir";
        System.out.println(str.isEmpty()); // false
        System.out.println(str.isBlank()); // false


        str="   ";
        System.out.println(str.isEmpty()); // false
        System.out.println(str.isBlank()); // true
        System.out.println(str.length()); // 3

        str="";
        System.out.println(str.isEmpty()); // true
        System.out.println(str.isBlank()); // true  hicligi blank verdi(=bosluk gibi)
        System.out.println(str.length()); // 0
    }}

