package Javaweek7;
/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and English marks
 * (marks is between 0 to 100 and if it is out of range print error message “Invalid Input,
 * Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them
 * grade if %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */

import java.util.Scanner;

public class MarkSheet {
    // Method to calculate total
    public static int calculateTotalmark(int math, int sceince, int english){
        return math + sceince + english;
    }
    // Method to calculate percentage
    public static float calculatePercentage(int total, int maxMarks) {
        return (total * 100.0f) / maxMarks;
    }
    // Method to determine the result (Pass/Fail)
    public static String getResult(float percentage) {
        return (percentage >= 35) ? "Pass" : "Fail";
    }
    // Method to determine the grade
    public static String getGrade(float percentage) {
        if (percentage >= 80) {
            return "A+";
        } else if (percentage >= 60) {
            return "A";
        } else if (percentage >= 50) {
            return "B";
        } else if (percentage >= 35) {
            return "C";
        } else {
            return "F";
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input student details
        System.out.println("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Roll Number: ");
        int rollNo = scanner.nextInt();

        // Input marks and validate
        int math, science , english;

        System.out.print("Enter Math marks (0-100): ");
        math = scanner.nextInt();
        if (math < 0 || math > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            return;
        }

        System.out.print("Enter Science marks (0-100): ");
        science = scanner.nextInt();
        if (science < 0 || science > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            return;
        }

        System.out.print("Enter English marks (0-100): ");
        english = scanner.nextInt();
        if (english < 0 || english > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
            return;
        }
        // Calculate total, percentage, result, and grade
        int total = calculateTotalmark(math, science, english);
        float percentage = calculatePercentage(total, 300);  // Total max marks = 300
        String result = getResult(percentage);
        String grade = getGrade(percentage);

        // Print the Mark Sheet
        System.out.println("_______________________________");
        System.out.println("|                             |");
        System.out.println("|         Mark Sheet          |");
        System.out.println("|_____________________________|");
        System.out.printf(" |Name     :%-18s|\n", name);
        System.out.printf(" |Roll No  :%-18d|\n", rollNo);
        System.out.println("|_____________________________|");
        System.out.println("| Subjects  :     Marks       |");
        System.out.println("|_____________________________|");
        System.out.printf("| Math       :    %-12d|\n", math);
        System.out.printf("| Science    :    %-12d|\n", science);
        System.out.printf("| English    :    %-12d|\n", english);
        System.out.println("|_____________________________|");
        System.out.printf("|Total      :     %-12d|\n", total);
        System.out.println("|_____________________________|");
        System.out.printf("| Percentage :     %-12.1f|\n", percentage);
        System.out.printf("| Result     :     %-12s|\n", result);
        System.out.printf("| Grade      :     %-12s|\n", grade);
        System.out.println("|______________________________|");

        scanner.close();

    }
}
