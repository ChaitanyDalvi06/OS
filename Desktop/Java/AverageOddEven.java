import java.util.Scanner;

public class AverageOddEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        
        System.out.print("Enter 1 for odd numbers or 2 for even numbers: ");
        int choice = scanner.nextInt();
        
        if (N <= 0) {
            System.out.println("N must be positive.");
            return;
        }
        
        int sum = 0;
        if (choice == 1) {
            for (int i = 0; i < N; i++) {
                sum += 2 * i + 1;
            }
        } else if (choice == 2) {
            for (int i = 0; i < N; i++) {
                sum += 2 * i + 2;
            }
        } else {
            System.out.println("Invalid choice.");
            return;
        }
        
        double average = (double) sum / N;
        System.out.println("The average is: " + average);
    }
}
