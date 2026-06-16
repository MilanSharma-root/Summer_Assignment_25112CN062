// Java program to remove duplicates from an array

import java.util.ArrayList;
import java.util.Scanner;

public class Q64 {
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

        ArrayList<Integer> result = new ArrayList<>();

        // Store only unique elements
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < result.size(); j++) {
                if (arr[i] == result.get(j)) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                result.add(arr[i]);
            }
        }

        // Display array after removing duplicates
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }

        System.out.println();
        sc.close();
    }
}
