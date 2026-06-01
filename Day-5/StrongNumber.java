import java.util.Scanner;

public class StrongNumber {

    // Method to calculate factorial
    static int factorial(int digit) {
        int fact = 1;

        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int factorialSum = 0;

        while (number > 0) {
            int digit = number % 10;
            factorialSum += factorial(digit);
            number /= 10;
        }

        if (factorialSum == originalNumber) {
            System.out.println(originalNumber + " is a Strong Number.");
        } else {
            System.out.println(originalNumber + " is NOT a Strong Number.");
        }

        sc.close();
    }
}
