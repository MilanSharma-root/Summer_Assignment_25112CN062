// Java program to find the missing number in an array
// The array contains numbers from 1 to n with one number missing

import java.util.Scanner;

public class Q61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        // Input the value of n
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();

        int[] arr = new int[n - 1];

        // Input array elements
        System.out.print("Enter " + (n - 1) + " elements: ");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate expected sum of numbers from 1 to n
        int totalSum = n * (n + 1) / 2;

        // Calculate actual sum of array elements
        int arraySum = 0;
        for (int i = 0; i < n - 1; i++) {
            arraySum += arr[i];
        }

        // Missing number
        int missingNumber = totalSum - arraySum;

        System.out.println("Missing number is: " + missingNumber);

        sc.close();
    }
}
