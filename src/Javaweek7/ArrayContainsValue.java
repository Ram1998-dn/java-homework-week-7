package Javaweek7;
/**
 * Write a Java program to test if an array contains a specific value.
 */

import java.util.Arrays;
import java.util.Scanner;

public class ArrayContainsValue {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Example array
        String[] values = {"apple", "banana", "orange", "grape", "mango"};

        // Prompt user to enter a value to search
        System.out.print("Enter a value to search in the array: ");
        String searchValue = scanner.nextLine();

        // Check if the array contains the specified value
        boolean containsValue = containsValue(values, searchValue);

        // Print the result using if-else
        if (containsValue) {
            System.out.println("The array contains the value: " + searchValue);
        } else {
            System.out.println("The array does not contain the value: " + searchValue);
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if the array contains a specific value
    public static boolean containsValue(String[] array, String value) {
        return Arrays.stream(array).anyMatch(value::equals);
    }
}
