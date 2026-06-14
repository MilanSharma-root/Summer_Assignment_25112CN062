import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        // Declare array
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Variables to count even and odd elements
        int evenCount = 0;
        int oddCount = 0;

        // Count even and odd numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Display results
        System.out.println("Number of even elements = " + evenCount);
        System.out.println("Number of odd elements = " + oddCount);

        sc.close();
    }
}
