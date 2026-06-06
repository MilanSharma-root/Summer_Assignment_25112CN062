import java.util.Scanner;

public class Q27 {

    // Recursive method to find sum of digits
    static int sumOfDigits(int n) {
        if (n == 0) { // Base case
            return 0;
        }

        return (n % 10) + sumOfDigits(n / 10); // Recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Sum of digits = " + sumOfDigits(n));
    }
}