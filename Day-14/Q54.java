// Java program to find the frequency of an element in an array

import java.util.Scanner;

public class Q54 {
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

        // Input element whose frequency is to be found
        System.out.print("Enter the element to find frequency: ");
        int key = sc.nextInt();

        int count = 0;

        // Count frequency
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                count++;
            }
        }

        // Display result
        System.out.println("Frequency of " + key + " = " + count);

        sc.close();
    }
}
