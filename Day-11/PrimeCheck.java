// Java program to check whether a number is prime using a function

import java.util.Scanner;

public class PrimeCheck {

    // Function to check prime number
    static boolean isPrime(int n) {

        // Numbers less than 2 are not prime
        if (n < 2) {
            return false;
        }

        // Check divisibility from 2 to n/2
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Call the function and display result
        if (isPrime(num)) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is not a Prime Number");
        }

        sc.close();
    }
}
