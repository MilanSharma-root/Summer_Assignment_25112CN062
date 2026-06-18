// Java Program for Binary Search

import java.util.Scanner;

public class Q71 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input sorted array elements
        System.out.println("Enter the elements in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input element to search
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        int low = 0;
        int high = n - 1;
        int found = -1;

        // Binary Search
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                found = mid;
                break;
            } 
            else if (arr[mid] < key) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        // Display result
        if (found != -1) {
            System.out.println("Element found at index " + found);
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
