import java.util.Scanner;

public class array_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Subjects array
        String[] subjects = {"Maths", "Physics", "Chemistry", "English", "Computer"};
        int totalMarks = 0;
        
        System.out.println("Enter marks out of 100:");

        // Loop to take marks input
        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Marks in " + subjects[i] + ": ");
            int marks;
            while (true) {
                marks = sc.nextInt();
                if (marks >= 0 && marks <= 100) break;
                System.out.println("Invalid marks! Please enter marks between 0 and 100.");
            }
            totalMarks += marks;
        }

        // Calculate percentage
        float percentage = (float) totalMarks / subjects.length;
        
        // Determine grade
        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "Fail";
        }
        
        // Display result
        System.out.println("\n----- Marksheet -----");
        System.out.println("Total Marks: " + totalMarks + "/500");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        
        sc.close();
    }
}
