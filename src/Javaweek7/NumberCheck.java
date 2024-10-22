package Javaweek7;
/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
 */

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number :");
        double number = scanner.nextDouble();

        if (number > 0){
            System.out.println("The Number is Positive.");
        }else if (number < 0){
            System.out.println("The number is Negative.");
        }
        else {
            System.out.println("The number is Zero.");
        }
        scanner.close();
    }
}
