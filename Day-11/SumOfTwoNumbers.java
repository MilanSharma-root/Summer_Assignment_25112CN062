// Java program to find the sum of two numbers using a function

import java.util.Scanner;

public class SumOfTwoNumbers {

    // Function to calculate sum
    static int findSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Call the function
        int sum = findSum(num1, num2);

        // Display the result
        System.out.println("Sum = " + sum);

        sc.close();
    }
}

