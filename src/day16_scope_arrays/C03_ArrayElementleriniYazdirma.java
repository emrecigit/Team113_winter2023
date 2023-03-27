package day16_scope_arrays;

import java.util.Arrays;

public class C03_ArrayElementleriniYazdirma {
    public static void main(String[] args) {
        int[] arr={3,5,6,7,8,1,2};

        //Tum array'i yazdiralim.
        System.out.println(Arrays.toString(arr)); // [3, 5, 6, 7, 8, 1, 2] bu yazilan array

        // Array'in tum elementlerini yanyana aralarinda bir bosluk olacak sekilde yazdirin.

        for (int i = 0; i < arr.length; i++) {
      //for (int i = 0; i <= arr.length-1; i++) { // seklinde de olur
            System.out.print(arr[i]+ " "); // 3 5 6 7 8 1 2 bu yazilan array'in elementleri

        }

        }












    }
