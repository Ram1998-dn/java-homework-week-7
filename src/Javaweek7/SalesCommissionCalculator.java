package Javaweek7;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class SalesCommissionCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Input sales ID, seller's name, sales amount, and basic salary
        System.out.print("Enter Sales ID: ");
        int salesId = scanner.nextInt();

        System.out.print("Enter Seller's Name: ");
        scanner.nextLine(); // To consume the newline left by nextInt()
        String sellerName = scanner.nextLine();

        System.out.print("Enter Sales Amount: ");
        double salesAmount = scanner.nextDouble();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        // Initialize commission percentage
        double commissionPercentage = 0.0;

        // Determine commission based on sales amount
        if (salesAmount >= 50000) {
            commissionPercentage = 0.35;
        } else if (salesAmount >= 30000) {
            commissionPercentage = 0.20;
        } else if (salesAmount >= 20000) {
            commissionPercentage = 0.10;
        } else if (salesAmount >= 10000) {
            commissionPercentage = 0.05;
        } else {
            commissionPercentage = 0.02;
        }

        // Calculate commission
        double commission = salesAmount * commissionPercentage;

        // Print the output in the desired format
        System.out.println("_______________________________");
        System.out.println("|        Sales Commission      |");
        System.out.println("|______________________________|");
        System.out.printf("| Sales ID      : %-12d |\n", salesId);
        System.out.printf("| Seller's Name : %-12s |\n", sellerName);
        System.out.printf("| Sales Amount  : %-12.2f |\n", salesAmount);
        System.out.printf("| Basic Salary  : %-12.2f |\n", basicSalary);
        System.out.printf("| Commission    : %-12.2f |\n", commission);
        System.out.println("|______________________________|");

        // Close the scanner
        scanner.close();

    }
}
