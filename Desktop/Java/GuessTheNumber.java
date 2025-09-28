import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = (int) (Math.random() * 100) + 1;
        int guess = 0;
        
        while (guess != number) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            
            if (guess > number) {
                System.out.println("Too high, try again.");
            } else if (guess < number) {
                System.out.println("Too low, try again.");
            }
        }
        
        System.out.println("Congratulations! You guessed the number.");
        scanner.close();
    }
}
