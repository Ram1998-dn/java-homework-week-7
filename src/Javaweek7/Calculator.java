package Javaweek7;
/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
 * find addition, Subtraction, multiplication and division according to their symbol (using if else)
 */

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Input two numbers from the user
        System.out.println("Enter first number :");
        double num1 = scanner.nextDouble();

        System.out.println("Enter Second number :");
        double num2 = scanner.nextDouble();

        // Input the symbol for the operation (+, -, *, /)
        System.out.println("Enter operator (+,- , *, /):");
        char operator = scanner.next().charAt(0);

        // Perform the corresponding operation using if-else
        if(operator == '+'){
            System.out.println("Result : "+ (num1 + num2));
        } else if (operator == '-') {
            System.out.println("Result :" +(num1 - num2));
        } else if (operator == '*') {
            System.out.println("Result :"+(num1 * num2));
        } else if (operator == '-') {
            if (num2 != 0) {
                System.out.println("Result :" + (num1 / num2));
            }else{
                System.out.println("Division by zero is not allowed");
            }
        } else {
            // Handle invalid operator input

            System.out.println("Invalid operator! Please enter +, -, * or /.");
        }
        // Close the scanner
        scanner.close();
    }
}
