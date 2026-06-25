import java.util.*;

public class Q101_NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int guess, attempts = 0;
        System.out.println("Guess a number between 1 and 100");
        do {
            System.out.print("Enter guess: ");
            guess = sc.nextInt();
            attempts++;
            if (guess < number) System.out.println("Too low");
            else if (guess > number) System.out.println("Too high");
            else System.out.println("Correct! Attempts: " + attempts);
        } while (guess != number);
    }
}
