package Javaweek7;
/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
 * HRA = basic salary 10% DA = Basic salary 8% TA = Basic salary 9% PF= Basic salary 20% Gross salary = basic salary + HRA + TA + DA –PF
 */

import java.util.Scanner;

public class SalarySlip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input employee details
        System.out.print("Enter Employee ID: ");
        int employeeId = scanner.nextInt();

        System.out.print("Enter Employee Name: ");
        scanner.nextLine();  // Consume the newline character
        String employeeName = scanner.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        // Calculate HRA, TA, DA, PF
        double hra = basicSalary * 0.10;  // 10% of Basic Salary
        double ta = basicSalary * 0.08;   // 8% of Basic Salary
        double da = basicSalary * 0.09;   // 9% of Basic Salary
        double pf = basicSalary * 0.20;   // 20% of Basic Salary

        double grossSalary = basicSalary + hra + ta + da - pf;
        // Print Salary Slip in the desired format
        System.out.println("_______________________________");
        System.out.println("|         Salary Slip          |");
        System.out.println("|______________________________|");
        System.out.printf("| Employee Id   : %-12d |\n", employeeId);
        System.out.printf("| Employee Name : %-12s |\n", employeeName);
        System.out.println("|______________________________|");
        System.out.printf("| Basic Salary  : %-12.2f |\n", basicSalary);
        System.out.printf("| HRA 10%%       : %-12.2f |\n", hra);
        System.out.printf("| TA 8%%        : %-12.2f  |\n", ta);
        System.out.printf("| DA 9%%        : %-12.2f  |\n", da);
        System.out.printf("| PF - 20%%     : %-12.2f  |\n", pf);
        System.out.println("|______________________________|");
        System.out.printf("| Gross Salary  : %-12.2f |\n", grossSalary);
        System.out.println("|==============================|");

        scanner.close();

    }
}
