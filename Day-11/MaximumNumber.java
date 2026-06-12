// Java program to find the maximum of two numbers using a function

import java.util.Scanner;

public class MaximumNumber {

    // Function to find maximum
    static int findMaximum(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Call the function
        int max = findMaximum(num1, num2);

        // Display the result
        System.out.println("Maximum number = " + max);

        sc.close();
    }
}
