import java.util.Scanner;

public class SumAndAverageArray {
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

        // Calculate sum
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        // Calculate average
        double average = (double) sum / n;

        // Display results
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        sc.close();
    }
}
