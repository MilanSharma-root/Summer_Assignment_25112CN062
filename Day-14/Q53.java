// Java program to perform Linear Search

import java.util.Scanner;

public class Q53 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input element to search
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        boolean found = false;

        // Linear Search
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at position: " + (i + 1));
                found = true;
                break; // Stop searching once element is found
            }
        }

        // If element is not found
        if (!found) {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
}
