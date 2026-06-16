// Java program to find the element with maximum frequency in an array

import java.util.Scanner;

public class Q62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        // Input size of array
        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxFreq = 0;
        int maxElement = arr[0];

        // Find frequency of each element
        for (int i = 0; i < n; i++) {
            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // Update maximum frequency and element
            if (count > maxFreq) {
                maxFreq = count;
                maxElement = arr[i];
            }
        }

        System.out.println("Element with maximum frequency: " + maxElement);
        System.out.println("Frequency: " + maxFreq);

        sc.close();
    }
}
