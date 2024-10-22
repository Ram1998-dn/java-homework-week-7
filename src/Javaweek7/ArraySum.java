package Javaweek7;

/**
 * Write a Java program to sum values of an array.
 */
public class ArraySum {
    public static void main(String[] args) {
        // Initialize the array
        int[] numbers = {10, 20, 30, 40, 50};
        // Call the method to calculate the sum
        int sum = calculateSum(numbers);

        // Print the result
        System.out.println("The sum of the array values is: " + sum);
    }
    public static int calculateSum(int[] array) {
        int sum = 0; // Initialize sum to 0

        // Loop through the array and accumulate the sum
        for (int number : array) {
            sum =+ number; // Add each element to sum
        }

        return sum; // Return the total sum
    }
}
