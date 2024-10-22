package Javaweek7;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007)
 * and find out if it is leap year or not?
 */
public class LeapYearChecker {
    // Method to check if the given year is a leap year
    public static boolean isLeapYear(int year){
        // A year is a leap year if:
        // 1. It is divisible by 4.
        // 2. It is not divisible by 100 unless it is also divisible by 400.
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        // Create scanner object to get input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Year : ");
        int year = scanner.nextInt();

        //Call the isLeapYear method and store the result
        boolean isLeap = isLeapYear(year);

         // Print the result
        if(isLeap){
            System.out.println(year + " is a leap year");
        }else {
            System.out.println(year+ " is not a leap year");
        }
        // Close the scanner
        scanner.close();
    }
}
