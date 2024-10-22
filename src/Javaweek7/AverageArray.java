package Javaweek7;
/**
 * Write a Java program to calculate the average value of array elements
 */

import java.util.Arrays;

public class AverageArray {
    public static void main(String[] args) {
        // Example array
        double[] number = {10.5, 20.0, 30.0, 40.5, 50.0 };


        // Calculate the average using Arrays.stream
        double average = Arrays.stream(number).average().orElse(0.0);
        // Print the result
        System.out.println("Average value of array elements: " + average);
        }
    }

