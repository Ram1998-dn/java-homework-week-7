package Javaweek7;
/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

import java.util.Scanner;

public class OddEvenChecker {

    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        // Use the ternary operator to check if the number is odd or even
        String result = (number % 2 ==0)? "Even" : "Odd";
        // Use for print statement
        System.out.println("The Number " +number+ " is "+result);

        // Close the scanner
        scanner.close();


    }

}

