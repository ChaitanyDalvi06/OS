import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the student's score (0-100): ");
        int score = scanner.nextInt();
        
        char grade;
        
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        switch (grade) {
            case 'A':
                System.out.println("Grade: A");
                break;
            case 'B':
                System.out.println("Grade: B");
                break;
            case 'C':
                System.out.println("Grade: C");
                break;
            case 'D':
                System.out.println("Grade: D");
                break;
            case 'F':
                System.out.println("Grade: F");
                break;
        }
        
        scanner.close();
    }
}
