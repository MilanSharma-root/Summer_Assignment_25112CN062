// Java program to find factorial using a function

import java.util.Scanner;

public class FactorialProgram {

    // Function to calculate factorial
    static long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Call the function
        long result = factorial(num);

        // Display result
        System.out.println("Factorial of " + num + " = " + result);

        sc.close();
    }
}
