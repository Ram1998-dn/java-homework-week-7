package Javaweek7;
/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */

import java.util.Scanner;

public class CharacterTypeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a character
        System.out.print("Enter a single character: ");
        char input = scanner.next().charAt(0);  // Read the first character of the input

        // Check if the input is a digit, alphabet, or symbol
        if (Character.isDigit(input)) {
            System.out.println("The input is a number.");
        } else if (Character.isLetter(input)) {
            System.out.println("The input is an alphabet.");
        } else {
            System.out.println("The input is a symbol.");
        }

        // Close the scanner
        scanner.close();
    }
}
