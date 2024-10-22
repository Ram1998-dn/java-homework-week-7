package Javaweek7;
/**
 * Input any alphabet from “A" to “F” and print their city name accordingly
 * switch statement if any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class CityNameSwitch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input an alphabet from A to F
        System.out.println("Enter a Alphabet number 'A' to 'F': ");
        char alphabet = scanner.next().toUpperCase().charAt(0);
        // Switch statement to check the input alphabet and print the corresponding city name
        switch (alphabet){
            case 'A' :
                System.out.println("A - Atlanta");
                break;
            case 'B' :
                System.out.println("B - Boston");
                break;
            case 'C' :
                System.out.println("C - Chicago");
                break;
            case 'D' :
                System.out.println("D - Denver");
                break;
            case 'E' :
                System.out.println("E - El Paso");
                break;
            case 'F' :
                System.out.println("F - Fresno");
            default:
                // Handle invalid entry
                System.out.println("Invalid Entry");

        }
        // Close the scanner
        scanner.close();
    }
}
