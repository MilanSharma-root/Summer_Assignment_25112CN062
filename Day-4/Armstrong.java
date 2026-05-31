import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int digitCount = String.valueOf(number).length();

        int sum = 0;

        // Calculate sum of digits raised to power digitCount
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digitCount);
            number /= 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong Number.");
        } else {
            System.out.println(originalNumber + " is NOT an Armstrong Number.");
        }

        sc.close();
    }
}