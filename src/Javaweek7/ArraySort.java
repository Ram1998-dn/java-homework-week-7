package Javaweek7;
/**
 * Write a Java program to sort a numeric array and a string array.
 */

import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {
        //   // Numeric array
        int[] numericArray = {5, 3, 8, 1, 2, 7, 4, 6};
        System.out.println("Original Numeric Array: " + Arrays.toString(numericArray));

        // Sort the numeric array
        Arrays.sort(numericArray);
        System.out.println("Sorted Numeric Array: " + Arrays.toString(numericArray));

        // String array
        String[] stringArray = {"Banana", "Apple", "Orange", "Mango", "Grapes"};
        System.out.println("Original String Array: " + Arrays.toString(stringArray));

        // Sort the string array
        Arrays.sort(stringArray);
        System.out.println("Sorted String Array: " + Arrays.toString(stringArray));
    }
}
