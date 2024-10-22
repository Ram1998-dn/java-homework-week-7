package Javaweek7;
/**
 * Input any alphabet from “A" to “F” and print their city name accordingly
 * (use if else) if any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class CityNameByAlphabet {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Input an alphabet from A to F
        System.out.println("Enter Alphabet number 'A' to 'F' : ");
        char alphabet = scanner.next().toUpperCase().charAt(0);

        // Check the input alphabet and print corresponding city name
        if (alphabet == 'A') {
            System.out.println("A - Atlanta");
        } else if (alphabet == 'B') {
            System.out.println("B - Boston");
        } else if (alphabet == 'C') {
            System.out.println("C - Chicago");
        } else if (alphabet == 'D') {
            System.out.println("D - Denver");
        } else if (alphabet == 'E') {
            System.out.println("E - El Paso");
        } else if (alphabet == 'F') {
            System.out.println("F - Fresno");
        } else {
            // Handle invalid entry
            System.out.println("Invalid entry");
        }

        // Close the scanner
        scanner.close();
    }
}
