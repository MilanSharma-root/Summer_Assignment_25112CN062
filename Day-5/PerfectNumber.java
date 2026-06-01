import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int divisorSum = 0;

        // Find sum of proper divisors
        for (int divisor = 1; divisor < number; divisor++) {
            if (number % divisor == 0) {
                divisorSum += divisor;
            }
        }

        if (divisorSum == number) {
            System.out.println(number + " is a Perfect Number.");
        } else {
            System.out.println(number + " is NOT a Perfect Number.");
        }

        sc.close();
    }
}