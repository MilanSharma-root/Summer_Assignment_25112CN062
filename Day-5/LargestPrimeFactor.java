import java.util.Scanner;

public class LargestPrimeFactor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        long largestPrimeFactor = -1;

        // Remove factors of 2
        while (number % 2 == 0) {
            largestPrimeFactor = 2;
            number /= 2;
        }

        // Check odd factors
        for (long factor = 3; factor * factor <= number; factor += 2) {
            while (number % factor == 0) {
                largestPrimeFactor = factor;
                number /= factor;
            }
        }

        // Remaining number itself is prime
        if (number > 2) {
            largestPrimeFactor = number;
        }

        System.out.println("Largest Prime Factor = " + largestPrimeFactor);

        sc.close();
    }
}